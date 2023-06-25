
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class Question{
    
    private int[] nums;                                                             //[0]=ilk sayı, [1]=ikinci sayı, [2]=işlem sonucu, 
    private int answerTime;
    private boolean isCorrect;

    public Question(int[] ranges){
        
        nums = new int[3];
        
        //Soruyu rastgele değerlerle oluşturma
        Random random = new Random();
        nums[0] = random.nextInt(ranges[1] - ranges[0] + 1) + ranges[0];
        nums[1] = random.nextInt(ranges[3] - ranges[2] + 1) + ranges[2];
        nums[2] = nums[0] * nums[1];
        
        isCorrect = false;
    }
    
    public int[] getNums() {
        return nums;
    }

    public int getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(int answerTime) {
        this.answerTime = answerTime;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
