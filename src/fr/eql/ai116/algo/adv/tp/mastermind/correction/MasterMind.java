package fr.eql.ai116.algo.adv.tp.mastermind.correction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MasterMind {
    // Déclaration des couleurs disponibles
    static String[] couleurs = {"BLEU", "JAUNE", "VERT", "ROUGE", "MARRON", "NOIR"};
    static List<String> combinaisonSecrete = genererCombinaisonAleatoire(couleurs);

    // Génération d'une combinaison aléatoire
    public static List<String> genererCombinaisonAleatoire(String[] couleurs) {
        List<String> combinaison = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            combinaison.add(couleurs[random.nextInt(couleurs.length)]);
        }
        return combinaison;
    }

    // Calcul des couleurs bien placées
    public static int compterBienPlaces(List<String> secret, List<String> joueur) {
        int bienPlaces = 0;
        for (int i = 0; i < 4; i++) {
            if (secret.get(i).equals(joueur.get(i))) {
                bienPlaces++;
            }
        }
        return bienPlaces;
    }

    // Calcul des couleurs mal placées
    public static int compterMalPlaces(List<String> secret, List<String> joueur) {
        int malPlaces = 0;
        List<String> copieSecret = new ArrayList<>(secret);
        List<String> copieJoueur = new ArrayList<>(joueur);

        for (int i = 0; i < 4; i++) {
            if (copieSecret.get(i).equals(copieJoueur.get(i))) {
                copieSecret.set(i, null);
                copieJoueur.set(i, null);
            }
        }

        for (String couleur : copieJoueur) {
            if (couleur != null && copieSecret.contains(couleur)) {
                malPlaces++;
                copieSecret.remove(couleur);
            }
        }

        return malPlaces;
    }

    public static void main(String[] args) {
        // Initialisation de la partie
        int essaisMax = 3;
        List<String> historique = new ArrayList<>();

        // Lancement de la boucle principale
        Scanner scanner = new Scanner(System.in);
        boolean gagne = false;

        for (int essai = 1; essai <= essaisMax; essai++) {
            System.out.println("Essai " + essai + ": Entrez une combinaison de 4 couleurs séparées par des espaces:");
            String[] entree = scanner.nextLine().toUpperCase().split(" ");
            List<String> combinaisonJoueur = Arrays.asList(entree);

            // Comparaison des couleurs
            int bienPlaces = compterBienPlaces(combinaisonSecrete, combinaisonJoueur);
            int malPlaces = compterMalPlaces(combinaisonSecrete, combinaisonJoueur);

            // Ajout à l'historique
            historique.add(combinaisonJoueur + " >> " + bienPlaces + " placés et " + malPlaces + " trouvés");

            // Affichage de l'historique
            historique.forEach(System.out::println);

            // Vérification de la victoire
            if (bienPlaces == 4) {
                System.out.println("Vous avez gagné en " + essai + " essais !");
                gagne = true;
                break;
            }
        }

        // Fin de la partie
        if (!gagne) {
            System.out.println("Vous avez perdu. La combinaison était : " + combinaisonSecrete);
        }

        // Proposition de rejouer
        System.out.println("Voulez-vous jouer une nouvelle partie ? (oui/non)");
        String reponse = scanner.nextLine().toLowerCase();
        if (reponse.equals("oui")) {
            main(null); // Relancer le jeu
        } else {
            System.out.println("Merci d'avoir joué !");
        }
    }
}
