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
public class BillingAddress {
    public  String StreetName;
    public  int Number;
    public  String City;
    public  int ZipCode;
    
    /**
     *
     * @param sname
     * @param number
     * @param city
     * @param zipcode
     */
    public BillingAddress(String sname, int number, String city, int zipcode){
        StreetName=sname;
        Number=number;
        City=city;
        ZipCode=zipcode;
    }
}
