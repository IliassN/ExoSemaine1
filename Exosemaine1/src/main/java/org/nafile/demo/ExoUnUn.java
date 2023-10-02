package org.nafile.demo;

public class ExoUnUn {

public static String unUn(String source)
{
    if (source == null || source.isEmpty())
    {
        return "Veuillez rentrer un nombre";
    }
    StringBuilder resultat = new StringBuilder();
    char caractereActuel = source.charAt(0);
    int compteur = 1;

    for (int i = 1; i < source.length();i++)
    {
        char caractereSuivant = source.charAt(i);

        if(caractereSuivant == caractereActuel)
        {
            compteur++;
        }
        else{
            resultat.append(compteur).append(caractereActuel);
            caractereActuel = caractereSuivant;
            compteur =1;
        }
    }
    resultat.append(compteur).append(caractereActuel);

    return resultat.toString();
}

    public static void main(String[] args) {
        String source = "111213";
        String resultat = unUn(source);
        System.out.println(resultat);
    }
}
