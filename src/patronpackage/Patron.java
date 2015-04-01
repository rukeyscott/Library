package patronpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniferschofield
 */
public class Patron {
    String name;
    String type;
    int card;
    int numberCheckedOut;
    String phone;
    String addressl1;
    String addressl2;
    String city;
    String state;
    String zip;

    public Patron(String name, String type, int card, int numberCheckedOut, String phone, String addressl1, String addressl2, String city, String state, String zip) {
        this.name = name;
        this.type = type;
        this.card = card;
        this.numberCheckedOut = numberCheckedOut;
        this.phone = phone;
        this.addressl1 = addressl1;
        this.addressl2 = addressl2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Patron{" + "name=" + name + ", type=" + type + ", card=" + card +
                ", numberCheckedOut=" + numberCheckedOut + ", phone=" + phone + 
                ", addressl1=" + addressl1 + ", addressl2=" + addressl2 + ", city=" + 
                city + ", state=" + state + ", zip=" + zip + '}';
    }
    public String cancheckout(){
        if (numberCheckedOut<items()){
            return type;
        }else {
            return "";
        }
    }
    public void checkout(){
        numberCheckedOut++;
    }
    public void checkIn(){
        numberCheckedOut--;
    }

    public Patron(String person) {
        
    }

 
   
    public int items (){
        if (type=="Child"){
            return 3;
        }else return 6;
    }

   
    
}
