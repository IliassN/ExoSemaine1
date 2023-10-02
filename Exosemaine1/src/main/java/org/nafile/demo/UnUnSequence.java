package org.nafile.demo;

public class UnUnSequence {
    public static void main(String[] args) {
        sequence("1", 6);
    }

    public static void sequence(String source, int longueur) {
        String current = source;
        for (int i = 0; i < longueur; i++) {
            System.out.println(current);
            current = unUn(current);
        }
    }

    public static String unUn(String source) {
        StringBuilder resultat = new StringBuilder();
        char caractereActuel = source.charAt(0);
        int compteur = 1;

        for (int i = 1; i < source.length(); i++) {
            char caractereSuivant = source.charAt(i);

            if (caractereSuivant == caractereActuel) {
                compteur++;
            } else {
                resultat.append(compteur).append(caractereActuel);
                caractereActuel = caractereSuivant;
                compteur = 1;
            }
        }

        resultat.append(compteur).append(caractereActuel);

        return resultat.toString();
    }

}
