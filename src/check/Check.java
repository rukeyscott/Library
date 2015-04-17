package check;


import java.util.Date;
import java.text.DateFormat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniferschofield
 */
public class Check {
    int cardholder;
    int bookid;
    Date duedate;

    public Check(int cardholder, int bookid,int days, Date duedate) {
        this.cardholder = cardholder;
        this.bookid = bookid;
        this.duedate = duedate;
    }
    public Check (String s){
        String [] ch= s.split(",=");
        cardholder =Integer.parseInt(ch[1]);
        bookid = Integer.parseInt(ch[2]);
        
        
    }

    @Override
    public String toString() {
        return "C" + ",=" + cardholder + ",=" + bookid + 
                ",=" + duedate.toString();
    }
    public boolean ischeckedout(int item){
        return item==bookid;
    }
    public int getpatroncard (){
        return cardholder;
    }
    public boolean ispatron(int c){
        return c==cardholder;
    }
    public int getbookid (){
        return bookid;
    }
       public boolean overdue(Date now){
        return now.after(duedate);        
        
    }
    
}
