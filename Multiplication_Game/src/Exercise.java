
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class Exercise implements Serializable{
    
    private int exerciseID;
    private int questionNum;
    private int[] ranges;
    private ArrayList<HighScore> highScores;

    public Exercise(int exerciseID, int questionNum, int[] ranges) {
        
        this.exerciseID = exerciseID;
        this.questionNum = questionNum;
        this.ranges = new int[4];
        this.ranges = ranges;
        highScores = new ArrayList<HighScore>();
    }
    
    //Oyun modunu [a,b]x[c,d] formatında elde etme
    public String getGameMode(){
        
        return "[" + String.valueOf(ranges[0]) + "-" + String.valueOf(ranges[1]) + "]x[" + String.valueOf(ranges[2]) + "-" + String.valueOf(ranges[3]) + "]";
    }

    public int getExerciseID() {
        return exerciseID;
    }
    
    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    public int[] getRanges() {
        return ranges;
    }

    public void setRanges(int[] ranges) {
        this.ranges = ranges;
    }

    public ArrayList<HighScore> getHighScores() {
        return highScores;
    }
}
