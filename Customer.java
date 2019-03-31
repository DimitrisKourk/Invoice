/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dimitris
 */
public class Customer {
     String  Name;
     String Surname;
     public  List<Item> ItemsOrdered = new ArrayList<Item>();
     BillingAddress BillingAddress;
     ShippingAddress ShippingAddress;
    
    /**
     *
     * @param name
     * @param surname
     * @param BAddress
     * @param SAddress
     */
    public Customer(String name,String surname,
                                BillingAddress BAddress,
                                ShippingAddress SAddress){
        Name=name;
        Surname=surname;
        BillingAddress=BAddress;
        ShippingAddress=SAddress;
    }
    
    public void AddItem(Item item){
        ItemsOrdered.add(item);
}
    public double totalCost(){
        double totalCost=0;
        for(int i=0;i<ItemsOrdered.size();i++){
            totalCost=totalCost+(ItemsOrdered.get(i).Quantity *ItemsOrdered.get(i).Price);
        }
        return totalCost;
    }
    
}
    