/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoresoure;

import java.util.EventListener;

/**
 *
 * @author Exia
 */
public interface ScoreListener extends EventListener {

    public void scoreChange(ScoreEvent evt);
}
