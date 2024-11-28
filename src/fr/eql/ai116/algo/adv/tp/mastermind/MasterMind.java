package fr.eql.ai116.algo.adv.tp.mastermind;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MasterMind {

    private String[] colors = {"bleu", "jaune", "vert", "rouge", "marron", "noir"};
    private int maxRounds = 3;
    int wellPlaced = 0;
    private List<String> secretCombination = new ArrayList<>();
    private List<String> history = new ArrayList<>();

    public void enterGame() {
        JOptionPane.showMessageDialog(null,"Bienvenue dans MasterMind !");
        startGame();
    }

    private void startGame() {
        String colorsList = "";
        List<String> userColors = new ArrayList<>();
        int round = 0;

        for (int i = 0; i < colors.length; i++) {
            colorsList += colors[i] + " / ";
        }

        generateRandomColorsList();

        do {
            round++;
            makeUserGuess(userColors, colorsList);
        } while (round < maxRounds || wellPlaced == 4);

        String newGame;

        if (wellPlaced == 4) {
            newGame = JOptionPane.showInputDialog("Bravo, vous avez gagné !\r\n Voulez-vous commencer une nouvelle partie ? oui / non");
        } else {
            newGame = JOptionPane.showInputDialog("Dommage, vous avez perdu...\r\n Voulez-vous commencer une nouvelle partie ? oui / non");
        }

        wellPlaced = 0;

        if (newGame.equals("oui")) {
            startGame();
        } else {
            JOptionPane.showMessageDialog(null, "A bientôt !");
        }
    }

    private void generateRandomColorsList() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            secretCombination.add(colors[random.nextInt(colors.length)]);
        }
        System.out.println(secretCombination);
    }

    private void makeUserGuess(List<String> userColors, String colorsList) {
        String color1 = JOptionPane.showInputDialog("Choisissez une première couleur parmi les suivantes : " + colorsList);
        String color2 = JOptionPane.showInputDialog("Choisissez une deuxième couleur parmi les suivantes : " + colorsList);
        String color3 = JOptionPane.showInputDialog("Choisissez une troisième couleur parmi les suivantes : " + colorsList);
        String color4 = JOptionPane.showInputDialog("Choisissez une quatrième couleur parmi les suivantes : " + colorsList);

        Collections.addAll(userColors, color1, color2, color3, color4);

        compareResults(userColors);
        JOptionPane.showMessageDialog(null, history);
        history.clear();
    }

    private void compareResults(List<String> userColors) {
        boolean doesContain;
        int index = 0;
        boolean isAtTheRightPlace;
        for (String color : secretCombination) {
            doesContain = userColors.contains(color);
            if (doesContain) {
                isAtTheRightPlace = checkThePosition(index, color, userColors);
                if (isAtTheRightPlace) {
                    history.add("b");
                    wellPlaced++;
                } else {
                    history.add("m");
                }
            }
            index++;
        }
    }

    private boolean checkThePosition(int index, String color, List<String> userColors) {
        int position = 0;
        for (String c : userColors) {
            if (c.equals(color) && index == position) {
                return true;
            }
            position++;
        }
        return false;
    }
}
