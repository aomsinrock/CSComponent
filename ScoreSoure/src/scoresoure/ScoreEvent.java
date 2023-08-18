/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoresoure;

import java.util.EventObject;

/**
 *
 * @author Exia
 */
public class ScoreEvent extends EventObject {

    private String ScoreData;

    public ScoreEvent(Object source, String ScoreLine) {
        super(source);
        ScoreData = ScoreLine;
    }

    public String getScoreData() {
        return ScoreData;
    }

}
