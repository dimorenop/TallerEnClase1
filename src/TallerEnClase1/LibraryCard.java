/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TallerEnClase1;

/**
 * @author Cristian Chitiva
 * @email cychitivav@unal.edu.co
 */
public class LibraryCard {
    private Student owner = null;
    private int borrowCnt = 0;

    public LibraryCard(Student owner, int borrowCnt) {
        this.owner = owner;
        this.borrowCnt = borrowCnt;
    }

    public Student getOwner() {
        return owner;
    }

    public int getBorrowCnt() {
        return borrowCnt;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "LibraryCard{" + "owner=" + owner + '}';
    }
    
    
    

}
