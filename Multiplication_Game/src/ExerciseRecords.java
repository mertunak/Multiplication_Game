
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class ExerciseRecords {
    
    private User child;
    private Exercise exercise;
    
    private String startDate;
    private int complateTime;
    private float correctnessScore;
    private float timeScore;
    
    private ArrayList<Question> questions;
    private int correctCount;

    public ExerciseRecords(User child, Exercise exercise) {
        
        this.child = child;
        this.exercise = exercise;
        
        //Soruları oluşturma
        this.questions = new ArrayList<Question>();
        for (int i = 0; i < this.exercise.getQuestionNum(); i++) {
            
            questions.add(new Question(exercise.getRanges()));
        }
        
        correctCount = 0;
    }
    
    //Csv için uygun rapor string'i oluşturma
    public String createReport(){
        
        String reportString = child.getFullName() + "," + exercise.getGameMode() + "/" + exercise.getQuestionNum() + " Soru" + "," + startDate + "," + String.format("%02d:%02d", complateTime/60, complateTime%60) + "," + correctnessScore + "," + timeScore + ",";
        
        reportString += "(" + questions.get(0).getNums()[0] + "x" + questions.get(0).getNums()[1] + ")/" + questions.get(0).getAnswerTime() + "/" + (questions.get(0).isIsCorrect() ? "D":"Y");
        
        for (Question question : questions.subList(1, questions.size())) {
            
            reportString += ":(" + question.getNums()[0] + "x" + question.getNums()[1] + ")/" + question.getAnswerTime() + "/" + (question.isIsCorrect() ? "D":"Y");
        }
        
        return reportString;
    }
    
    public void incCorrectCount(){
        
        this.correctCount++;
    }
    
    public int getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }
    
    public User getChild() {
        return child;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public int getComplateTime() {
        return complateTime;
    }

    public void setComplateTime(int complateTime) {
        this.complateTime = complateTime;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public float getCorrectnessScore() {
        return correctnessScore;
    }

    public void setCorrectnessScore(float correctnessScore) {
        this.correctnessScore = correctnessScore;
    }

    public float getTimeScore() {
        return timeScore;
    }

    public void setTimeScore(float timeScore) {
        this.timeScore = timeScore;
    }
}
