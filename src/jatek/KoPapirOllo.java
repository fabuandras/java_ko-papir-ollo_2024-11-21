package jatek;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Válassz: Kő (0), Papír (1), Olló (2)");
        System.out.print("A te választásod: ");

        int felhasznaloValasztas = sc.nextInt();
        //...
        int gepValasztas = rnd.nextInt(3);

        String gepValasztasSzoveg;
        String felhasznaloValasztasSzoveg;
        
        if (gepValasztas == 0) {
            gepValasztasSzoveg = "Kő";
        } else if (gepValasztas == 1) {
            gepValasztasSzoveg = "Papír";
        } else {
            gepValasztasSzoveg = "Olló";
        }

        if (felhasznaloValasztas == 0) {
            felhasznaloValasztasSzoveg = "Kő";
        } else if (felhasznaloValasztas == 1) {
            felhasznaloValasztasSzoveg = "Papír";
        } else {
            felhasznaloValasztasSzoveg = "Olló";
        }
        
        System.out.println("A gép választása: " + gepValasztasSzoveg);
        System.out.println("A te választásod: " + felhasznaloValasztasSzoveg);
    }
    
}


//        if (felhasznaloValasztas < 0 || felhasznaloValasztas > 2) {
//            System.out.println("Érvénytelen választás! Csak 0, 1 vagy 2 lehet.");
//            return;
//        }