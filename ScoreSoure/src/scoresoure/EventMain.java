/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoresoure;

import java.util.Scanner;

/**
 *
 * @author Exia
 */
public class EventMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSoure ss = new ScoreSoure();
        Subscriber sb = new Subscriber();
        Subscriber sb1 = new Subscriber();
        ss.addlisteners(sb);
        ss.addlisteners(sb1);
        Scanner sc = new Scanner(System.in);
        String score ; 
        while (true) {
            System.out.print("Enter Score ");
            score = sc.nextLine();
            if ("".equals(score)) {
                System.out.println("...");
                break;
            } else {
                ss.setScoreLine(score);
            }
        }
    }
}
