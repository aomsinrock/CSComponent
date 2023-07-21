/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.draweclipseandrecapp;

import java.util.Scanner;

/**
 *
 * @author Exia
 */
public class DrawEclipseandRecApp {

    private Foot foot;

    public void getFootShape(String footshape) {
        switch(footshape) {
            case "Eclipse":
                foot = new Eclipse();
                break;
            case "Rectangle":
                foot = new Rectangle();
                break;
        }
    }

    public String drawShape() {
        return foot.draw();
    }

    public static void main(String[] args) {
        DrawEclipseandRecApp App = new DrawEclipseandRecApp();
        Scanner sc = new Scanner(System.in);
        System.out.println("What to Draw 1. Eclipse 2. Rectangle ");
        int type = sc.nextInt();
        switch(type) {
            case 1:
                App.getFootShape("Eclipse");
                break;
            case 2:
                App.getFootShape("Rectangle");
                break;
        }
        System.out.println(App.drawShape());
    }
}
