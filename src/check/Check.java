package check;


import java.util.Date;

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
        cardholder = s;
        bookid = 0;
        duedate;
    }

    @Override
    public String toString() {
        return "Check{" + "cardholder=" + cardholder + ", bookid=" + bookid + 
                ", duedate=" + duedate.toString() + '}';
    }
    public boolean ischeckedout(int item){
        return item==bookid;
    }
    public int getpatroncard (){
        return cardholder;
    }
       public boolean overdue(Date now){
        return now.after(duedate);        
        
    }
    
}
