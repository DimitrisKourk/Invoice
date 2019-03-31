/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import static java.lang.Math.floor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dimitris
 */
public class Invoice {
     static List<Customer> CustomerList= new ArrayList<Customer>();
    
    public static void addCustomer(Customer customer){
        CustomerList.add(customer);  
    }
    
    
    public static void main(String[] args) {
       
        addCustomer(new Customer("Kwstas","Eleutheriou",
                                 new BillingAddress("Papasiopoulou",22,"Lamia",35100),
                                 new ShippingAddress("Papasiopoulou",22,"Lamia",35100)));
        addCustomer(new Customer("Elenh","Tsaita",
                                 new BillingAddress("Ethnomarturwn",15,"Athina",15232),
                                 new ShippingAddress("Papaflesa",45,"Kozani",50100)));
        
         CustomerList.get(0).AddItem(new Item("Keyborad",5,49.9));
         CustomerList.get(0).AddItem(new Item("Mouse",10,29.99));
         CustomerList.get(0).AddItem(new Item("HeadSet",5,59.9));
         
         CustomerList.get(1).AddItem(new Item("CPU",15,149.89));
         CustomerList.get(1).AddItem(new Item("4GRam",30,49.99));
         CustomerList.get(1).AddItem(new Item("Sata3Cables",200,1.99));
         
         
         int customerID=0; //chage this to print invoice of other customer
         printInvoice(customerID);
    }
    
    public static void printInvoice(int id){
        int max=CustomerList.get(id).ItemsOrdered.get(0).Name.length();
        
        for(int i=0;i<CustomerList.get(id).ItemsOrdered.size();i++){
            int b=CustomerList.get(id).ItemsOrdered.get(i).Name.length();
            if(b>max){
                max=b;
            }
        }
        
        
        
        
        System.out.println("Name: "+CustomerList.get(id).Name);
        System.out.println("Surname: "+CustomerList.get(id).Surname);
        System.out.println();
        System.out.println();
        System.out.println("Customer's Billing address:");
        System.out.println();
        System.out.print("StreetName: "+CustomerList.get(id).BillingAddress.StreetName+" ");
        System.out.println(CustomerList.get(id).BillingAddress.Number);
        System.out.println("City: "+CustomerList.get(id).BillingAddress.City);
        System.out.println("ZipCode: "+CustomerList.get(id).BillingAddress.ZipCode);
        System.out.println();
        System.out.println();
        System.out.println("Customer's Shipping address:");
        System.out.println();
        System.out.print("StreetName: "+CustomerList.get(id).ShippingAddress.StreetName+" ");
        System.out.println(CustomerList.get(id).ShippingAddress.Number);
        System.out.println("City: "+CustomerList.get(id).ShippingAddress.City);
        System.out.println("ZipCode: "+CustomerList.get(id).ShippingAddress.ZipCode);
        System.out.println();
        System.out.println();
        System.out.println("=====================================================================================================================================================");
        System.out.println("        Item Name       |        Quantity         |      Price       |       Total Item Price        |      Paid        |       Amounts Due         |");
        System.out.println("=====================================================================================================================================================");
        System.out.println();
        double pr=0 ;
        for(int i=0;i<CustomerList.get(id).ItemsOrdered.size();i++){
            
            System.out.print(CustomerList.get(id).ItemsOrdered.get(i).Name);
            System.out.print("                         ");
            int a=CustomerList.get(id).ItemsOrdered.get(i).Name.length();
            int count=max-a;
            
            for(int j=0;j<count;j++){
                System.out.print(" ");
            }
           
            System.out.print(CustomerList.get(id).ItemsOrdered.get(i).Quantity);
            int q=CustomerList.get(id).ItemsOrdered.get(i).Quantity;
            if(q<10)System.out.print("   ");
            else if(q<100)System.out.print("  ");
            else if(q<1000)System.out.print(" ");
            System.out.print("                 ");
            double p=CustomerList.get(id).ItemsOrdered.get(i).Price;
            System.out.print(p+"$");
            
            
            if((String.valueOf(p).length()-String.valueOf(floor(p)).length())<1){
                if(p<10.0)System.out.print("      ");
                else if(p<100.00)System.out.print("     ");
                else if(p<1000.00)System.out.print("    ");
                else if(p<10000.00)System.out.print("   ");
                else if(p<100000.00)System.out.print("  ");
            }
            else{
                if(p<10.0)System.out.print("     ");
                else if(p<100.00)System.out.print("    ");
                else if(p<1000.00)System.out.print("   ");
                else if(p<10000.00)System.out.print("  ");
                else if(p<100000.00)System.out.print(" ");
            }
            
            System.out.print("               ");
            double t=p*q;
            System.out.print(t+"$");
            System.out.print("               ");
            Random rand=new Random();
            int paid=rand.nextInt(CustomerList.get(id).ItemsOrdered.get(i).Quantity);
            double payment=(double)paid*CustomerList.get(id).ItemsOrdered.get(i).Price;
           if((String.valueOf(t).length()-String.valueOf(floor(t)).length())<1){
                if(t<10.0)System.out.print("      ");
                else if(t<100.00)System.out.print("     ");
                else if(t<1000.00)System.out.print("    ");
                else if(t<10000.00)System.out.print("   ");
                else if(t<100000.00)System.out.print("  ");
            }
            else{
                if(t<10.0)System.out.print("     ");
                else if(t<100.00)System.out.print("    ");
                else if(t<1000.00)System.out.print("   ");
                else if(t<10000.00)System.out.print("  ");
                else if(t<100000.00)System.out.print(" ");
            }
             pr=pr+payment;
           System.out.format("%.2f$",payment);
            
            if((String.valueOf(p).length()-String.valueOf(floor(p)).length())<2){
                if(payment<10.0)System.out.print("      ");
                else if(payment<100.00)System.out.print("     ");
                else if(payment<1000.00)System.out.print("    ");
                else if(payment<10000.00)System.out.print("   ");
                else if(payment<100000.00)System.out.print("  ");
            }
            else{
                if(p<10.0)System.out.print("     ");
                else if(payment<100.00)System.out.print("    ");
                else if(payment<1000.00)System.out.print("   ");
                else if(payment<10000.00)System.out.print("  ");
                else if(payment<100000.00)System.out.print(" ");
            }
            System.out.print("             ");
            double due=(CustomerList.get(id).ItemsOrdered.get(i).Price*CustomerList.get(id).ItemsOrdered.get(i).Quantity)-payment;
            System.out.format("%.2f$", due);
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
           
        }
        System.out.println("=====================================================================================================================================================");
        double totalCost=CustomerList.get(id).totalCost();
        Random rand=new Random();
        double paid=rand.nextDouble()*totalCost;
        
               
        
        System.out.println("                                                     "
                + "                                                               Total Cost:    "+totalCost+"$");
        
        System.out.format("                                                      "
                + "                                                       Payments Received:    %.2f$\n",pr);
        
        System.out.format("                                                      "
                + "                                                              Amound due:    %.2f$\n",(totalCost-pr));
       
    }   
    
}
