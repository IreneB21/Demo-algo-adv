package fr.eql.ai116.algo.adv.tp.astronomy;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CelestialObjectProcessor {

    public static void main(String[] args) {
        List<CelestialObject> celestialObjects = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("celestial_objects.txt"))) {

            String line = "";
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parameters = line.split("\\*");

                if (parameters.length == 4) {
                    CelestialObject celestialObject = new CelestialObject(parameters[0].trim(),
                            Integer.parseInt(parameters[1].trim()), parameters[2].trim(), parameters[3].trim());
                    celestialObjects.add(celestialObject);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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
    }
}
