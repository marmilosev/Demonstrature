/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mgaric_kol2;

import mgaric_kol2.util.HibernateUtil;
import mgaric_kol2.view.Izbornik;



/**
 *
 * @author dell
 */
public class Start {

    // za ORM generalno čitati https://github.com/tjakopec/ORM_JAVA_PHP_CSHARP
    public static void main(String[] args) {
        new Izbornik().setVisible(true);
    }
}
