package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment {

//declaring private instance variables
    private Customer customer;
    private String cardType;
    private int cardNum;
    private String expiryDate;


    public Payment(Customer customer,String cardType, int cardNum, String expiryDate)
    {

        this.customer = customer;
        this.cardType = cardType;
        this.cardNum = cardNum;
        this.expiryDate = expiryDate;
    }

    public boolean validate() //validate payment details
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM"); //declare a format for our date object
        Date present = new Date();//create a new date object at today's date
        Date date; //create a new date object, inside a try/catch block(in case wrong format date string supplied) assign it to our formatted input string
        try{
            date = sdf.parse(expiryDate);
        }
        catch (ParseException e)
        {
            date = new Date();
            System.out.println(e.getMessage());
        }
        int length = String.valueOf(cardNum).length();// get number of digits in our card number
        if(!cardType.equals("MasterCard") && !cardType.equals("Visa"))// check if the card is of the right type
        {
            System.out.println("Validation failed,wrong card type");
            return false;
        }
        else if(length !=8) //check if the card number is the right length
        {
            System.out.println("Validation failed, wrong card number");
            return  false;
        }
        else if(date.compareTo(present)<0)// check if the card hasn't expired
        {
            System.out.println("Validation failed, card out of date");
            return  false;
        }
        else{ //validate payment if all conditions are satisifed
            System.out.println("Payment Validated");
            return  true;

        }
    }
}
