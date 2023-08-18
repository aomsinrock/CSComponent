/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescore;

import java.util.Scanner;

/**
 *
 * @author Exia
 */
public class LiveScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean Liv = new LiveScoreBean();
        Subscriber Sn = new Subscriber();
        Subscriber Sn1 = new Subscriber();
        Liv.addPropertyChangeListener(Sn);
        Liv.addPropertyChangeListener(Sn1);
        Scanner sc = new Scanner(System.in);
        String score;
        while (true) {
            System.out.print("Enter Score ");
            score = sc.nextLine();
            if ("".equals(score)) {
                System.out.println("...");
                break;
            } else {
                Liv.setScoreLine(score);
            }
        }
    }
}
