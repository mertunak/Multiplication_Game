
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class HighScore implements Serializable{
    
    private int childID;
    private String childUsername;
    private float highScore;

    public HighScore(int childID, String childUsername, float highScore) {
        
        this.childID = childID;
        this.childUsername = childUsername;
        this.highScore = highScore;
    }

    public int getChildID() {
        return childID;
    }

    public String getChildUsername() {
        return childUsername;
    }
    
    public double getHighScore() {
        return highScore;
    }

    public void setHighScore(float highScore) {
        this.highScore = highScore;
    }
}
