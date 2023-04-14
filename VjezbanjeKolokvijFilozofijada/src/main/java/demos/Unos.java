/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demos;

import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author marija
 */
public class Unos {
    
 public static int unosInteger(String poruka) {
        while (true) {
            System.out.println(poruka);
            try {
                return Integer.parseInt(Start.scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Neispravan podatak");
            }
        }
    }

    public static String unosString(String poruka) {
        String unos = "";
        while (true) {
            System.out.println(poruka);
            unos = Start.scanner.nextLine().trim();
            if (unos.isEmpty()) {
                System.out.println("Neispravan podatak");
                continue;
            }
            break;
        }
        return unos;
    }

    public static float unosFloat(String poruka) {
        while (true) {
            System.out.print(poruka);
            try {
                return Float.parseFloat(Start.scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Decimalni broj s točkom");
            }
        }
    }

    public static Date unosDate(String poruka) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
        while (true) {
            System.out.print(poruka);
            try {
                String input = Start.scanner.nextLine();
                return sdf.parse(input);
            } catch (ParseException e) {
                System.out.println("Unos datuma obavezno u formatu dd.MM.yyyy.");
            }
        }
    }

    static String ispisiDatum(Date s) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy.");

        return sdf.format(s);
    }

    public static boolean unosBoolean(String poruka) {
        while (true) {
            System.out.print(poruka + " (true/false) ");
            try {
                return Boolean.parseBoolean(Start.scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Neispravan podatak");
            }
        }
    }

    public static double unosDouble(String poruka) {
        while (true) {
            System.out.print(poruka + " ");
            try {
                return Double.parseDouble(Start.scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Neispravan podatak");
            }
        }
    }
    
    
}
