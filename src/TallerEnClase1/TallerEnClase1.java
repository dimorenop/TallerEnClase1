/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerEnClase1;

/**
 *
 * @author Estudiante
 */
public class TallerEnClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student;
        student = new Student ("Jon Java", "jj@javauniv.edu");
        
        LibraryCard card1 = new LibraryCard(student, 3);
        LibraryCard card2 = new LibraryCard(student, 0);           
    }
    
}
