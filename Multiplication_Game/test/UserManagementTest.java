/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
public class UserManagementTest {
    
    private final static String testUsersFileName = "test_users.ser"; 
    private UserManagement userManagement;
    
    public UserManagementTest() {
    }

    @Before
    public void setUp() {
        
        deleteFile(testUsersFileName);
        UserManagement.usersFileName = testUsersFileName;                           //Test için dosyanın ismini güncelleme
        userManagement = new UserManagement();
    }
    
    @After
    public void tearDown() {
        
        deleteFile(testUsersFileName);
    }
    
    private void deleteFile(String fileName) {
        
        File file = new File(fileName);
        if (file.exists()){
            file.delete();
        }
    }
    
    @Test
    public void testUpdateAndAuthAdmin() {
        
        //Admin güncelleme testi
        
        userManagement.updateAdmin("testAdminFullName", "testAdminUsername", "testAdminPassword");
        
        User updatedAdmin = userManagement.getAdmin();
        
        assertEquals("testAdminFullName", updatedAdmin.getFullName());
        assertEquals("testAdminUsername", updatedAdmin.getUsername());
        assertEquals("testAdminPassword", updatedAdmin.getPassword());
        
        //Admin giriş kontrolü testi
        
        User controlledAdmin = userManagement.authUser(updatedAdmin.getUsername(), updatedAdmin.getPassword());
        
        assertNotNull(controlledAdmin);
        assertTrue(controlledAdmin.isIsAdmin());
    }
    
    @Test
    public void testAddAuthAndDelChild() {
        
        //Çocuk ekleme testi
        
        int childId = userManagement.addChild("testChildFullName", "testChildUsername", "testChildPassword");
        
        ArrayList<User> children = userManagement.getChildren();
        
        User addedChild = children.get(0);
        
        assertEquals(1, children.size());
        assertEquals(childId, addedChild.getID());
        assertFalse(addedChild.isIsAdmin());
        
        //Çocuk giriş kontrolü testi
        
        User controlledChild = userManagement.authUser(addedChild.getUsername(), addedChild.getPassword());
        
        assertNotNull(controlledChild);
        assertFalse(controlledChild.isIsAdmin());
        
        //Çocuk silme testi
        
        boolean result = userManagement.delChild(childId);
        
        assertTrue(result);
        assertEquals(0, children.size());
    }
}
