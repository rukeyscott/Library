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
    String author;
    String description;
    String type;
    boolean in;
    int id;

    public Book(String title, String athuor, String description, String type, boolean in) {
        this.title = title;
        this.author = athuor;
        this.description = description;
        this.type = type;
        this.in = in;
    }
   public void addid (int i){
        id=i;
}
   //takes asiingle string and converts it into a book object
    public Book(String book) {
       String[] b= book.split(",=");
        title = b[1];
        author =b[2];
        description = b[3];
        type = b[4];
        in = Boolean.getBoolean(b[5]);
        id= Integer.parseInt(b[6]);
        
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
        return "B" + ",=" + title + ",=" + author + ",=" + 
                description + ",=" + type + ",=" + in + ",=" + id;
    }
    public boolean isBook(int b){
        return b==id;
    }
   
    
}
