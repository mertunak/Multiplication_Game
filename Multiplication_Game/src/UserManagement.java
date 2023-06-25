
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MERTTUNAKURNAZ
 */
public class UserManagement {
     
    static String usersFileName = "users.ser";                                          //Testler için static tanımlı
    
    private User admin;
    private ArrayList<User> children;

    public UserManagement(){
        
        admin = new User(0, "lütfen admin oluşturun", "admin", "123", true);            //Varsayılan admini oluşturma
        
        children = new ArrayList<User>();
        children = FileOperations.loadUsersFromFile(usersFileName);
        
        //Okunan dosyadaki listeden admini ve çocukları ayırma
        if(!children.isEmpty()){
           
           if(children.get(0).isIsAdmin()){
               
                admin = children.get(0);
                children.remove(0);
            }
        }
    }
    
    //Gelen giriş bilgilerine göre kullanıcı arama
    public User authUser(String userName, String password){
        
        if(userName.compareTo(admin.getUsername()) == 0 && password.compareTo(admin.getPassword()) == 0){
            
            return admin;
        }else{
            
           for(User child : children){
               
               if (userName.compareTo(child.getUsername()) == 0 && password.compareTo(child.getPassword()) == 0) {
                   
                   return child;
               }
           } 
        }
        return null;
    }
    
    //Admin ve çocukları ortak listede birleştirme
    public ArrayList<User> concatUsers(){
        
        if(!admin.getFullName().equals("lütfen admin oluşturun")){
            ArrayList<User> users = new ArrayList<User>();

            users.add(admin);
            users.addAll(1, children);
            return users;
        }
        
        return children;
    }
    
    public void updateAdmin(String fullName, String userName, String password){
        
        admin.setFullName(fullName);
        admin.setUsername(userName);
        admin.setPassword(password);
        
        FileOperations.writeUsersToFile(concatUsers(), usersFileName);
    }
    
    public int addChild(String fullName, String userName, String password){
        
        User child = new User((children.isEmpty() ? 1 : children.get(children.size() - 1).getID() + 1), fullName, userName, password, false);
        
        children.add(child);
        FileOperations.writeUsersToFile(concatUsers(), usersFileName);
        
        return child.getID();
    }
    
    public boolean delChild(int ID){
        
        User foundChild = null;
        
        boolean isNotFound = true;
        int i = 0;
        while(isNotFound && i < children.size()){            
            
            if(children.get(i).getID() == ID){
                
                foundChild = children.get(i);
                isNotFound = false;
            }else{
                
                i++;
            }
        }
        
        if(foundChild != null){
            
            children.remove(foundChild);
            FileOperations.writeUsersToFile(concatUsers(), usersFileName);
            
            return true;
        }else{
            
            return false;
        }
    }
    
    public User getAdmin() {
        
        return admin;
    }

    public void setAdmin(User admin) {
        
        this.admin = admin;
    }

    public ArrayList<User> getChildren() {
        
        return children;
    }

    public void setChildren(ArrayList<User> children) {
        
        this.children = children;
    }
}
