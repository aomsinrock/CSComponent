/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manu0.pkg7;

import java.util.ArrayList;

/**
 *
 * @author Exia
 */
public class Data implements Source {

    private final ArrayList<Livobserver> list;
    private String someData;

    public Data() {
        this.list = new ArrayList<Livobserver>();
    }

    public void setSomeData(String aData) {
        someData = aData;
        notifyObservers();
    }

    public String getSomeData() {
        return someData;
    }

    @Override
    public void register(Livobserver observer) {
        list.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
        }
    }
}
