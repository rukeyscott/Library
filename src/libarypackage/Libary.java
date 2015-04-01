package libarypackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import patronpackage.Patron;
import check.Check;
import book.Book;
import java.util.ArrayList;
/**
 *
 * @author jenniferschofield
 */
public class Libary {
    ArrayList <Book> books;
    ArrayList <Patron> patrons;
    ArrayList <Check> checkeds;
    int lastbook;
    int lastpatron;

    public Libary() {
        
        books = new ArrayList<Book>();
        patrons = new ArrayList<Patron>();
        checkeds=new ArrayList<Check>();
        lastbook=1;
        lastpatron=1;
    }
    public void addbook(Book b){
        books.add(b);
    }
    public void addPatron(Patron p){
        patrons.add(p);
    }
    public void checkout(int card, int item){
        
        
    }
    public void checkin (int item){
        
    }
    public void removebook (int item){
        
    }
    public void removepatron(int card){
        
    }
            
    
}
