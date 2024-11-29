package fr.eql.ai116.algo.adv.tp.astronomy;

import javax.swing.JOptionPane;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CelestialObjectBinarySearch {

    public static void main(String[] args) {

        List<CelestialObject> celestialObjects = new ArrayList<>();

        // Étape 1 : charger les données depuis le fichier binaire.
        try (DataInputStream input = new DataInputStream(new FileInputStream("celestial_objects.bin"))) {
            // Lire les données en format binaire.
            while(true) {
                try {
                    String name = input.readUTF();
                    int diameter = input.readInt();
                    String type = input.readUTF();
                    String orbit = input.readUTF();

                    // Ajouter l'objet lu à la liste.
                    celestialObjects.add(new CelestialObject(name, diameter, type, orbit));
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Étape 2 : demander à l'utilisateur le nom à rechercher.
        String userInput = JOptionPane.showInputDialog("Entre le nom de l'astre à rechercher : ");

        // Étape 3 : effectuer la recherche dichotomique.
        CelestialObject result = binarySearch(userInput, celestialObjects);

        // Étape 4 : afficher le résultat.
        if (result != null) {
            JOptionPane.showMessageDialog(null, "Voici les infos de l'astre que vous cherchiez : "
                                                    + "\r\nnom : " + result.getName()
                                                    + "\r\ndiamètre : " + result.getDiameter()
                                                    + "\r\ntype : " + result.getType()
                                                    + "\r\norbite : " + result.getOrbit());
        } else {
            JOptionPane.showMessageDialog(null, "Astre non trouvé.");
        }
    }

    private static CelestialObject binarySearch(String userInput, List<CelestialObject> celestialObjects) {
        int start = 0;
        int end = celestialObjects.size() - 1;

        while (start < end) {
            int middle = (start + end) / 2;
            CelestialObject midObject = celestialObjects.get(middle);
            int comparaison = userInput.compareToIgnoreCase(midObject.getName());

            if (comparaison == 0) {
                return midObject;
            } else if (comparaison < 0) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return null;
    }
}
