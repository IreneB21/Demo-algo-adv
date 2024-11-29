package fr.eql.ai116.algo.adv.demo.hash;

public class Application {

    private static final int TABLE_LENGTH = 101;

    private static final String[] WORDS = {
            "joie", "luminosité", "inspiration", "félicité", "zenith", "méditation", "rhapsodie", "émeraude", "océan",
            "chaleur", "douceur", "xylophone", "ubiquité", "passion", "yoga", "fantôme", "vérité", "abondance","vie",
            "orage", "parfum", "chrysalide", "poésie", "vagabond", "bien-être", "pensée", "quintessence", "montagne",
            "fantaisie", "évasion", "étoile", "harmonie", "lumière", "diamant", "nuance", "harmonica", "bienveillance",
            "mystère", "liberté", "merveille", "amour", "vallée", "sagesse", "équilibre", "pluie", "aventure", "forêt",
            "jardin", "nature", "karma", "ténacité", "union", "sérénité", "kangourou", "illumination", "kaleidoscope",
            "jeunesse", "soleil", "effervescence", "ouverture", "nadir", "délicate", "passé", "opulence", "béatitude",
            "émotion", "rêve", "horizon", "vibrant", "quiétude"
    };

    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting.hashCode());

        HashTable hashTable = new HashTable(TABLE_LENGTH);
        for (String word : WORDS) {
            hashTable.insertElement(word);
        }
        hashTable.insertElement("ornithorynque");
        System.out.println("\r\n*** " + (WORDS.length + 1) + " mots " +
                "dans un tableau de " + TABLE_LENGTH + " cellules ***\r\n");
        hashTable.displayTable();
    }
}
