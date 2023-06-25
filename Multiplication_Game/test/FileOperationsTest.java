/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class FileOperationsTest {
    
    private final static String testUsersFileName = "test_users.ser"; 
    private final static String testExercisesFileName = "test_exercises.ser";
    private final static String testReportsFileName = "test_reports.csv"; 
    
    public FileOperationsTest() {
    
    }
    
    @Before
    public void setUp() {
        
        deleteTestFiles();
    }
    
    @After
    public void tearDown() {
        
        deleteTestFiles();
    }
    
    private void deleteFile(String fileName) {
        
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
    
    private void deleteTestFiles() {
        
        deleteFile(testUsersFileName);
        deleteFile(testExercisesFileName);
        deleteFile(testReportsFileName);
    }
    
    @Test
    public void testWriteAndLoadUsers() {
        
        //Çocukları oluşturma
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(0, "John Doe", "john", "12345", false));
        userList.add(new User(1, "Jane Smith", "jane", "67890", false));
        userList.add(new User(2, "Johan Liebert", "johan", "13579", false));
        
        //Çocukları dosyaya yazma
        try{
            
            FileOperations.writeUsersToFile(userList, testUsersFileName);
        }catch(Exception e){
            
            fail("Test Write Children To File failed " + e.getMessage());
        }
        
        ArrayList<User> loadedUserList = null;
        
        //Çocukları dosyadan okuma
        try{
            
            loadedUserList = FileOperations.loadUsersFromFile(testUsersFileName);
        }catch(Exception e){
            
            fail("Test Load Children From File failed " + e.getMessage());
        }
        
        //Oluşturulan ve okunan değerler aynı mı kontolleri
        assertEquals(userList.size(), loadedUserList.size());
        for(int i = 0; i < userList.size(); i++){
            
            User expectedUser = userList.get(i);
            User loadedUser = loadedUserList.get(i);
            
            assertEquals(expectedUser.getID(), loadedUser.getID());
            assertEquals(expectedUser.getFullName(), loadedUser.getFullName());
            assertEquals(expectedUser.getUsername(), loadedUser.getUsername());
            assertEquals(expectedUser.isIsAdmin(), loadedUser.isIsAdmin());
        }
    }
    
    @Test
    public void testWriteAndLoadExercises() {
        
        //Egzersizleri oluşturma
        ArrayList<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(new Exercise(0, 5, new int[]{1, 5, 1, 5}));
        exerciseList.add(new Exercise(1, 7, new int[]{2, 5, 3, 7}));
        exerciseList.add(new Exercise(2, 10, new int[]{1, 10, 5, 10}));
        
        //Egzersizleri dosyaya yazma
        try{
            
            FileOperations.writeExercisesToFile(exerciseList, testExercisesFileName);
        }catch(Exception e){
            
            fail("Test Write Execises To File failed " + e.getMessage());
        }
        
        ArrayList<Exercise> loadedExerciseList = null;
        
        //Egzersizleri dosyadan okuma
        try{
            
            loadedExerciseList = FileOperations.loadExerciseFromFile(testExercisesFileName);
        }catch(Exception e){
            
            fail("Test Load Exercises From File failed " + e.getMessage());
        }
        
        //Oluşturulan ve okunan değerler aynı mı kontolleri
        assertEquals(exerciseList.size(), loadedExerciseList.size());
        for(int i = 0; i < exerciseList.size(); i++){
            
            Exercise expectedExercise = exerciseList.get(i);
            Exercise loadedExercise = loadedExerciseList.get(i);
            
            assertEquals(expectedExercise.getExerciseID(), loadedExercise.getExerciseID());
            assertEquals(expectedExercise.getQuestionNum(), loadedExercise.getQuestionNum());
            assertArrayEquals(expectedExercise.getRanges(), loadedExercise.getRanges());
        }
    }
    
    @Test
    public void testAddAndLoadReports() {
        
        ArrayList<String> reportList = new ArrayList<>();
        
        User testChild = new User(0, "John Doe", "john", "12345", false);
        Exercise testExercise = new Exercise(0, 5, new int[]{1, 5, 1, 5});
        
        //Test kaydı oluşturma
        ExerciseRecords record1 = new ExerciseRecords(testChild, testExercise);
        record1.setComplateTime(15);
        record1.setStartDate("23.05.2023");
        record1.setCorrectCount(5);
        record1.setCorrectnessScore(100);
        record1.setTimeScore(100);
        
        //Soruları cevaplama
        for(int i = 0; i < testExercise.getQuestionNum(); i++){
            
            record1.getQuestions().get(i).setAnswerTime(2);
            record1.getQuestions().get(i).setIsCorrect(true);
        }
        
        reportList.add(record1.createReport());
        
        //Raporları dosyaya ekleme
        try{
            
            for(int i = 0; i < reportList.size(); i++){
                
                FileOperations.addReportToFile(reportList.get(i), testReportsFileName);
            }
        }catch(Exception e){
            
            fail("Test Write Reports To File failed " + e.getMessage());
        }
        
        ArrayList<String[]> loadedReportList = null;
        
        //Raporları dosyadan okuma
        try{
            
            loadedReportList = FileOperations.loadReportsFromFile(testReportsFileName);
        }catch(Exception e){
            
            fail("Test Load Reports From File failed " + e.getMessage());
        }
        
        //Oluşturulan ve okunan değerler aynı mı kontolleri
        assertEquals(reportList.size(), loadedReportList.size());
        for(int i = 0; i < reportList.size(); i++){
            
            String[] dataList = reportList.get(i).split(",");
            String[] loadedDataList = loadedReportList.get(i);
            
            for(int j = 0; j < dataList.length; j++){

                assertEquals(dataList[j], loadedDataList[j]);
            }
        }
    }
}
