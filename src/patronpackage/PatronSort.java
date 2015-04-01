package patronpackage;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniferschofield
 */
public class PatronSort implements Comparator<Patron>{
     @Override
    public int compare(Patron o1, Patron o2) {
        if (o1.card<o2.card){
            return -1;
        }
            else if (o1.card==o2.card){
                return 0;
            }else return 1;
        
        
    }
    
}
