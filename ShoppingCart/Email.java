package com.company;

import java.util.ArrayList;

public class Email {

    private Order order;
    private Customer customer;
    private ArrayList<Item> orderList;
    public Email(Order order,Customer customer)
    {
        this.order = order;
        this.customer = customer;
        orderList = order.getOrder();
    }

    public void sendEmail()
    {
        String items = "";
        for (Item item:orderList//add our ordered items to our email string
             ) {
            items += item.toString() +"\n";
        }

        System.out.println("Email sent to "+customer.getEmailAddress()+" Order no."+ order.getOrderNumber()+" confirmed for: \n" +items+ "" +
                "\n Total cost: "+ order.getOrderPrice() +"\n"+"Delivering to :" +customer.getAddress().toString()); //send our confirmation email
    }
}
