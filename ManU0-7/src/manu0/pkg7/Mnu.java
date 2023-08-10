/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manu0.pkg7;

/**
 *
 * @author Exia
 */
public class Mnu implements Livobserver {

    @Override
    public void update(Source o) {
        System.out.println(
                "(Mnu)live result: "
                + ((Data) o).getSomeData());

    }
}
