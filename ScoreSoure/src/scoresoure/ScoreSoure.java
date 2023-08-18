/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoresoure;

import java.util.ArrayList;

/**
 *
 * @author Exia
 */
public class ScoreSoure {

    private String ScoreLine;
    private ArrayList<ScoreListener> listeners;

    public ScoreSoure() {
        listeners = new ArrayList<>();
    }

    public void setScoreLine(String newScore) {
        ScoreLine = newScore;
        fireScoreEvent(new ScoreEvent(this, ScoreLine));
    }

    public String getScoreLine() {
        return ScoreLine;
    }

    public void addlisteners(ScoreListener lis) {
        listeners.add(lis);
    }

    public void removelisteners(ScoreListener lis) {
        listeners.remove(lis);
    }

    public void fireScoreEvent(ScoreEvent e) {
        for (int i = 0; i < listeners.size(); i++) {
            ScoreListener lis = listeners.get(i);
            lis.scoreChange(e);
        }
    }
}
