
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class FileOperations {
    
    public static void writeUsersToFile(ArrayList<User> userList, String usersFileName){
        
        try {
            FileOutputStream fileOut = new FileOutputStream(usersFileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(userList);

            objectOut.close();
            objectOut.close();

            System.out.println("Kullanıcılar başarıyla dosyaya kaydedildi.");
        } catch (IOException e) {
            
            System.err.println("Kullanıcılar dosyaya kaydedilemedi!!!");
        }
    }
    
    public static ArrayList<User> loadUsersFromFile(String usersFileName){
        
        ArrayList<User> userList = new ArrayList<User>();
        
        try {
            FileInputStream fileIn = new FileInputStream(usersFileName);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            
            userList = (ArrayList<User>) objIn.readObject();

            fileIn.close();
            objIn.close();

            System.out.println("Kullanıcılar dosyadan başarıyla okundu.");
        } catch (IOException | ClassNotFoundException e) {
            
            System.err.println("Kullanıcılar dosyadan okunamadı!!!");
        }
        
        return userList;
    }
    
    public static void writeExercisesToFile(ArrayList<Exercise> exerciseList, String exercisesFileName){
        
        try {
            FileOutputStream fileOut = new FileOutputStream(exercisesFileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(exerciseList);

            objectOut.close();
            objectOut.close();

            System.out.println("Egzersizler başarıyla dosyaya kaydedildi.");
        } catch (IOException e) {
            
            System.err.println("Egzersizler dosyaya kaydedilemedi!!!");
        }
    }
    
    public static ArrayList<Exercise> loadExerciseFromFile(String exercisesFileName){
        
        ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();
        
        try {
            FileInputStream fileIn = new FileInputStream(exercisesFileName);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            
            exerciseList = (ArrayList<Exercise>) objIn.readObject();

            fileIn.close();
            objIn.close();

            System.out.println("Egzersizler dosyadan başarıyla okundu.");
        } catch (IOException | ClassNotFoundException e) {
            
            System.err.println("Egzersizler dosyadan okunamadı!!!");
        }
        
        return exerciseList;
    }
    
    public static void addReportToFile(String report, String reportFileName){
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reportFileName, true))){
            
           if(new File(reportFileName).length() == 0){
               
               writer.write(report);
           }else{
               
               writer.newLine();
               writer.write(report);
           }
           
           writer.flush();
           System.out.println("Rapor dosyaya eklendi.");
        } catch (IOException e) {
            
            System.err.println("Rapor dosyaya eklenemedi!!!");
        }
    }
    
    public static ArrayList<String[]> loadReportsFromFile(String reportFileName){
        
        ArrayList<String[]> report = new ArrayList<String[]>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(reportFileName))){
            
            String row;
            while ((row = reader.readLine()) != null) {
                
                String[] dataList = row.split(",");                                     //Rapor içerikleri virgüllerle ayrıldığından
                
                report.add(dataList);
            }
            
            System.out.println("Raporlar dosyadan başarıyla okundu.");
        } catch (IOException e) {
            
            System.err.println("Rapor dosyadan okunamadı!!!");
        }
        return report;
    }
}
