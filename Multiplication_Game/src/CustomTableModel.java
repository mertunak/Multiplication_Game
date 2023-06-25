
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class CustomTableModel{
    
    //Constructor aracılığıyla verilen tabloların modellerini elde ederek onları ilgili fonksiyonlara verilen listelerle doldurur.
    
    private DefaultTableModel tableModel;

    public CustomTableModel(JTable table) {
        
        this.tableModel = (DefaultTableModel)table.getModel();
    }

    public DefaultTableModel loadChildrenTableModel(ArrayList<User> children){
        
        Object[] row = new Object[2];
        
        for (User child : children) {
            
            row[0] = child.getID();
            row[1] = child.getFullName();
            tableModel.addRow(row);
        }
        
        return tableModel;
    }
    
    public static DefaultTableModel addChildRow(DefaultTableModel childrenTableModel, int ID, String fullName){
        
        //Çocuk tablosuna satır ekler.
        
        Object[] row = new Object[2];

        row[0] = ID;
        row[1] = fullName;
        
        childrenTableModel.addRow(row);
        return childrenTableModel;
    }
    
    public DefaultTableModel loadExercisesTableModel(ArrayList<Exercise> exercises){
        
        Object[] row = new Object[2];
        for (Exercise exercise : exercises) {
            
            row[0] = exercise.getExerciseID();
            row[1] = exercise.getGameMode() + "/" + exercise.getQuestionNum() + " Soru";
            tableModel.addRow(row);
        }
        
        return tableModel;
    }
    
    public static DefaultTableModel addExerciseRow(DefaultTableModel exerciseTableModel, int ID, String mode){
        
        //Egzersiz tablosuna satır ekler.
        
        Object[] row = new Object[2];

        row[0] = ID;
        row[1] = mode;
        
        exerciseTableModel.addRow(row);
        return exerciseTableModel;
    }
    
    public DefaultTableModel loadChildExercisesTableModel(ArrayList<Exercise> exercises){
        
        Object[] row = new Object[2];
        for (Exercise exercise : exercises) {
            
            row[0] = exercise.getQuestionNum();
            row[1] = exercise.getGameMode();
            tableModel.addRow(row);
        }
        
        return tableModel;
    }
    
    public DefaultTableModel loadLeaderBoardTableModel(ArrayList<HighScore> highScores){
        
        Object[] row = new Object[2];
        
        for (HighScore highScore : highScores) {
            
            row[0] = highScore.getChildUsername();
            row[1] = highScore.getHighScore();
            tableModel.addRow(row);
        }
        
        return tableModel;
    }
    
    public static DefaultTableModel changeLeaderBoardTableModel(DefaultTableModel tableModel, ArrayList<HighScore> highScores){
        
        //Tablonun gösterdiği yüksek skor listesini değiştirir.
        
        int oldRowCount = tableModel.getRowCount();
        
        Object[] row = new Object[2];
        
        //Eski değerleri silme
        for(int i = 0; i < oldRowCount; i++){
            
            tableModel.removeRow(0);
        }
        
        for (HighScore highScore : highScores) {
            
            row[0] = highScore.getChildUsername();
            row[1] = highScore.getHighScore();
            tableModel.addRow(row);
        }
        
        return tableModel;
    }
    
    public DefaultTableModel loadMainReportTableModel(ArrayList<String[]> report){
        
        Object[] row = new Object[6];
        
        for(String[] reportCell : report){
            
            row[0] = reportCell[0];
            row[1] = reportCell[1];
            row[2] = reportCell[2];
            row[3] = reportCell[3];
            row[4] = reportCell[4];
            row[5] = reportCell[5];
            
            tableModel.addRow(row);
        }
        
        return tableModel;
    }
    
    public DefaultTableModel loadQuestionReportTableModel(ArrayList<String[]> report){
        
        Object[] row = new Object[4];
        int i = 1;
        for(String[] reportCell : report){
            
            row[0] = i;
            row[1] = reportCell[0];
            row[2] = reportCell[1];
            row[3] = reportCell[2];
            
            tableModel.addRow(row);
            i++;
        }
        
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        
        this.tableModel = tableModel;
    }
}
