/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ffos.kolokvij0;

import ffos.kolokvij0.util.HibernateUtil;



/**
 *
 * @author dell
 */
public class Start {

    // za ORM generalno čitati https://github.com/tjakopec/ORM_JAVA_PHP_CSHARP
    public static void main(String[] args) {
        HibernateUtil.getSession();
    }
}
