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
public class Pomocno {
    public static Scanner ulaz;
    
 public static int unosInteger(String poruka) {
        while (true) {
            System.out.println(poruka);
            try {
                return Integer.parseInt(Pomocno.ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Neispravan podatak");
            }
        }
    }

    public static String unosString(String poruka) {
        String unos = "";
        while (true) {
            System.out.println(poruka);
            unos = Pomocno.ulaz.nextLine().trim();
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
            System.out.println(poruka);
            try {
                return Float.parseFloat(Pomocno.ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Prosjek obavezno");
            }
        }
    }

    public static Date unosDate(String poruka) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
        while (true) {
            System.out.println(poruka);
            try {
                String input = Pomocno.ulaz.nextLine();
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
        System.out.println(poruka);
        String input = Pomocno.ulaz.nextLine();
        if (input.equalsIgnoreCase("true")) {
            return true;
        } else if (input.equalsIgnoreCase("false")) {
            return false;
        } else {
            System.out.println("Neispravan unos, unijeti true ili false");
        }
    }
    }

    public static double unosDouble(String poruka) {
        while (true) {
            System.out.println(poruka + " ");
            try {
                return Double.parseDouble(Pomocno.ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Neispravan podatak");
            }
        }
    }
    
    
}
