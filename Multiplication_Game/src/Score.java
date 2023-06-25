
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class Score {
    
    private float correctnessScore;
    private float timeScore;
    private float totalScore;

    public Score(int questionNum, int correctNum, int seconds) {
        
        //Doğruluk skorunu 100'e normalize etme
        this.correctnessScore = (correctNum * (100 / (float)questionNum));              
        
        //Zaman skorunu 100'e normalize etme
        float timePenalty = (((float)seconds / questionNum) - 2)*questionNum ;
        this.timeScore = 100 - (timePenalty > 0 ? timePenalty : 0);
        
        //Toplam skoru hesaplama
        this.totalScore = this.correctnessScore + this.timeScore - 100;
    }

    public float getCorrectnessScore() {
        return correctnessScore;
    }

    public float getTimeScore() {
        return timeScore;
    }

    public float getTotalScore() {
        return totalScore;
    }
}
