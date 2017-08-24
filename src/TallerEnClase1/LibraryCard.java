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
    private String owner = this.toString();
    private int borrowCnt = 0;

    public String getOwner() {
        return owner;
    }

    public int getBorrowCnt() {
        return borrowCnt;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "LibraryCard{" + "owner=" + owner + '}';
    }
    
    
    

}
