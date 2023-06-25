
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class ExerciseManagement {
    
    static String exercisesFileName = "exercises.ser";                                  //Testler için static tanımlı
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        
        exercises = new ArrayList<Exercise>();
        exercises = FileOperations.loadExerciseFromFile(exercisesFileName);
    }

    public int addExercise(int aMin, int aMax, int bMin, int bMax, int n){
        
        int[] ranges = {aMin, aMax, bMin, bMax};
        
        Exercise exercise = new Exercise((exercises.isEmpty() ? 1 : exercises.get(exercises.size() - 1).getExerciseID() + 1), n, ranges);
        
        exercises.add(exercise);
        
        FileOperations.writeExercisesToFile(exercises, exercisesFileName);
        
        return exercise.getExerciseID();
    }
    
    public boolean delExercise(int ID){
        
        Exercise foundExercise = null;
        
        boolean isNotFound = true;
        int i = 0;
        while(isNotFound && i < exercises.size()){            
            
            if(exercises.get(i).getExerciseID() == ID){
                
                foundExercise = exercises.get(i);
                isNotFound = false;
            }else{
                
                i++;
            }
        }
        
        if(foundExercise != null){
            
            exercises.remove(foundExercise);
            FileOperations.writeExercisesToFile(exercises, exercisesFileName);
            
            return true;
        }else{
            
            return false;
        }
    }
    
    public void addHighScore(User child, int exerciseID, float totalScore){
        
        int i = 0;
        int j = 0;
        boolean isNotFound1 = true;
        while(isNotFound1 && i < exercises.size()){
            
            if(exercises.get(i).getExerciseID() == exerciseID){                        //Egzersiz var mı kontrolü
                
                ArrayList<HighScore> highScores = exercises.get(i).getHighScores();
                boolean isNotFound2 = true;
                while (isNotFound2 && j < highScores.size()) {                    
                    
                    if(highScores.get(j).getChildID() == child.getID()){               //Çocuğun daha önce skoru var mı kontrolü
                        
                        isNotFound2 = false;
                    }else{
                        
                        j++;
                    }
                }
                isNotFound1 = false;
            }else{
                
                i++;
            }
        }
        
        if(j == exercises.get(i).getHighScores().size()){                              
            
            //Çocuk egzersizi ilk kez yaptıysa skoru ekle
            HighScore highScore = new HighScore(child.getID(), child.getUsername(), totalScore);
            exercises.get(i).getHighScores().add(highScore);
        }else{
            
            //Çocuk egzersizi daha önce yaptıysa ve yeni skor daha yüksekse değiştir
            if(exercises.get(i).getHighScores().get(j).getHighScore() < totalScore){
                
                exercises.get(i).getHighScores().get(j).setHighScore(totalScore);
            }
        }
        
        //Yüksek skorlar dizisini büyükten küçüğe sırala
        Collections.sort(exercises.get(i).getHighScores(), new Comparator<HighScore>() {
            public int compare(HighScore hS1, HighScore hS2) {
                return Double.compare(hS2.getHighScore(), hS1.getHighScore());
            }
        });
        
        FileOperations.writeExercisesToFile(exercises, exercisesFileName);
    }
    
    public Exercise getExercise(int exerciseID){
        
        int i = 0;
        boolean isNotFound = true;
        while(isNotFound && i < exercises.size()){
            
            if(exercises.get(i).getExerciseID() == exerciseID){
                
                return exercises.get(i);
            }
            i++;
        }
        return null;
    }

    public ArrayList<Exercise> getExercises() {
        
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        
        this.exercises = exercises;
    }

    public void setExercisesFileName(String exercisesFileName) {
        
        this.exercisesFileName = exercisesFileName;
    }
}
