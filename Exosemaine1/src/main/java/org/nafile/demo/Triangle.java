package org.nafile.demo;


public class Triangle
{
    public static void main( String[] args )
    {
        int taille = 4;


        for (int ligne = 1; ligne <= taille ; ligne ++)
        {
            for (int etoiles = 1; etoiles <= ligne; etoiles++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
