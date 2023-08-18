/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescorebean;

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
        LiveScoreBean ss = new LiveScoreBean();
        Subscriber sb = new Subscriber();
        Subscriber sb1 = new Subscriber();
        ss.addPropertyChangeListener(sb);
        ss.addPropertyChangeListener(sb1);
        Scanner sc = new Scanner(System.in);
        String score;
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
