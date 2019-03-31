/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author Dimitris
 */
public class Item {
    public  String Name;
    public  int Quantity;
    public  double Price;
    
    /**
     *
     * @param name
     * @param quantity
     * @param price
     */
    public Item(String name,int quantity, double price){
        Name=name;
        Quantity=quantity;
        Price=price;
    }
}
