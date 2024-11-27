package fr.eql.ai116.algo.adv.tp.justification;

import java.util.ArrayList;
import java.util.List;

public class Justification {

    private int pageWidth = 80;
    private int marginLeft;
    private int marginRight;

    public Justification(int marginLeft, int marginRight) {
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
    }

    public String justifyText(String sentence) {
        int textWidth = pageWidth - (marginLeft + marginRight);

        // 1 : Nettoyer les espaces superflus et coller signes de ponctuation au mot précédent
        String cleanedSentence = sentence.trim().replaceAll("\\s+", " ");
        String[] words = cleanedSentence.split(" ");

        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[.,;:!?]")) {
                // Si le mot est une ponctuation, le fusionner avec le mot précédent
                if (!wordsList.isEmpty()) {
                    String lastWord = wordsList.remove(wordsList.size() - 1);
                    wordsList.add(lastWord + words[i]);
                }
            } else {
                wordsList.add(words[i]);
            }
        }

        // 2 : Calculer les espaces nécessaires
        int totalSpace = textWidth - cleanedSentence.replaceAll(" ", "").length();
        int intervals = words.length - 1;
        int spaceForAnInterval = totalSpace / intervals;
        int remainingSpace = totalSpace % intervals;

        // 3 : Construire la ligne justifiée
        StringBuilder justifiedText = new StringBuilder(" ".repeat(marginLeft));

        for (int i = 0; i < words.length; i++) {
            justifiedText.append(words[i]);
            if (i < intervals) {
                int space = spaceForAnInterval + (remainingSpace-- > 0 ? 1 : 0);
                justifiedText.append(" ".repeat(space));
            }
        }
        justifiedText.append(" ".repeat(marginRight));

        return justifiedText.toString();
    }

    public static void main(String[] args) {

        Justification justification = new Justification(2, 2);
        String sentence = "Bonjour, je m'appelle Irène";
        System.out.println(justification.justifyText(sentence));
    }
}
