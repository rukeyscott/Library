package book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniferschofield
 */
public class Book {
    String title;
    String athuor;
    String description;
    String type;
    boolean in;
    int id;

    public Book(String title, String athuor, String description, String type, boolean in) {
        this.title = title;
        this.athuor = athuor;
        this.description = description;
        this.type = type;
        this.in = in;
    }
   public void addid (int i){
        id=i;
}
    public Book(String book) {
        
    }


    public int cancheckout(String patron){
       if( (patron==type || patron=="Adult")&&in){
           return dayscheckout();
       }else return 0;
    }
    public int dayscheckout(){
        if (type=="Adult"){
            return 14;
        }else  if (type=="Child"){
            return 7;
        }else  if (type=="dvd"){
            return 2;
        }else {
            return 3;
        }
    }
    public void checkout(){
        in=false;
    }
    public void checkin(){
        in=true;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", athuor=" + athuor + ", description=" + 
                description + ", type=" + type + ", in=" + in + ", id=" + id + '}';
    }
    public boolean isBook(int b){
        return b==id;
    }
   
    
}
