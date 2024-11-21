package jatek;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Kő-Papír-Olló játék\n");
        System.out.println("Válassz: Kő = 0, Papír = 1, Olló = 2");
        System.out.print("A te választásod (szám): ");

        int felhasznaloValaszt = sc.nextInt();
        //...
        int gepValaszt = rnd.nextInt(3);

        String gepValasztSzoveg;
        String felhasznaloValasztSzoveg;
        
        if (gepValaszt == 0) {
            gepValasztSzoveg = "Kő";
        } else if (gepValaszt == 1) {
            gepValasztSzoveg = "Papír";
        } else {
            gepValasztSzoveg = "Olló";
        }

        if (felhasznaloValaszt == 0) {
            felhasznaloValasztSzoveg = "Kő";
        } else if (felhasznaloValaszt == 1) {
            felhasznaloValasztSzoveg = "Papír";
        } else {
            felhasznaloValasztSzoveg = "Olló";
        }
        
        System.out.println("\nA gép választása: " + gepValasztSzoveg);
        System.out.println("A te választásod: " + felhasznaloValasztSzoveg);
        System.out.println("______________________________");
        System.out.println("Az eredmény:");
        
        if (felhasznaloValaszt == gepValaszt) {
            System.out.println("\t-> Döntetlen!\n");
        } else if (felhasznaloValaszt == 0) {
            if (gepValaszt == 2) {
                System.out.println("\t-> Nyertél! A kő legyőzte az ollót.\n");
            } else {
                System.out.println("\t-> A gép nyert! A papír becsomagolta a követ.\n");
            }
        } else if (felhasznaloValaszt == 1) {
            if (gepValaszt == 0) {
                System.out.println("\t-> Nyertél! A papír becsomagolta a követ.\n");
            } else {
                System.out.println("\t-> A gép nyert! Az olló elvágta a papírt.\n");
            }
        } else if (felhasznaloValaszt == 2) {
            if (gepValaszt == 1) {
                System.out.println("\t-> Nyertél! Az olló elvágta a papírt.\n");
            } else {
                System.out.println("\t-> A gép nyert! A kő széttörte az ollót.\n");
            }
        }
    }
    
}


//        if (felhasznaloValasztas < 0 || felhasznaloValasztas > 2) {
//            System.out.println("Érvénytelen választás! Csak 0, 1 vagy 2 lehet.");
//            return;
//        }