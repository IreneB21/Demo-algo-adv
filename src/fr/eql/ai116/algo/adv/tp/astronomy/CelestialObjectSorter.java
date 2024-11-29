package fr.eql.ai116.algo.adv.tp.astronomy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CelestialObjectSorter {

    public static void main(String[] args) {

        List<CelestialObject> celestialObjects = new ArrayList<>();

        // Étape 1 : lire le fichier binaire.
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

        // Étape 2 : trier les données en mémoire par nom.
        Collections.sort(celestialObjects, Comparator.comparing(obj -> obj.getName()));

        // Étape 3 : réécrire les données triées dans le fichier binaire.
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("celestial_objects.bin"))) {
            for (CelestialObject object : celestialObjects) {
                output.writeUTF(object.getName());
                output.writeInt(object.getDiameter());
                output.writeUTF(object.getType());
                output.writeUTF(object.getOrbit());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Étape 4 : afficher les données triées.
        System.out.println("Données triées :");
        for (CelestialObject obj : celestialObjects) {
            System.out.print("\r\nNom : " + obj.getName());
            System.out.print(" - Diamètre : " + obj.getDiameter());
            System.out.print(" - Type : " + obj.getType());
            System.out.print(" - Orbite : " + obj.getOrbit());
        }

        System.out.println("\r\n*** Afficher juste le nom ***");
        celestialObjects.forEach(obj -> System.out.println(obj.getName()));
    }
}
