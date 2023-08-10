/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manu0.pkg7;

import java.util.Scanner;

/**
 *
 * @author Exia
 */
public class ManU07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score ;
        Mnu obj1 = new Mnu();
        Liv obj2 = new Liv();
        Data obj = new Data();
        obj.register(obj1);
        obj.register(obj2);
        while (true) {
            System.out.print("Enter Score ");
            score = sc.nextLine();
            if ("".equals(score)) {
                System.out.println("...");
                break;
            } else {
                obj.setSomeData(score);
            }
        }
    }
}
