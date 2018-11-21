package com.company;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShoppingCart {

    private ArrayList<Item> items;
    private int cartId;
    private String date;
    private int total;
    private boolean closed;
    private Customer customer;

    public ShoppingCart(Customer customer)
    {
        date = makeDate();
        total = 0;
        closed = false;
        this.customer = customer;
        cartId = makeCartID();
        items = new ArrayList<>();
    }

    private String makeDate() //create a new date object with the current date/time
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(date);
    }

    private int makeCartID()//create a random cart ID
    {
        return  1+(int)Math.random()*1000;
    }

    public String getDate()
    {
        return date;
    }

    public int getCartId()
    {
        return cartId;
    }
    public  void addItem(Item item)//add a item to our cart if the cart is not closed
    {
        if(!closed)
        {
            items.add(0,item);
            System.out.println("Item: "+ item.toString()+ " added to cart");
        }
        else
        {
            System.out.println("Sorry The Shopping Cart is closed");
        }
    }
    public void removeItem(Item item)//remove an item if " ..."
    {
        if(!closed)
        {
            System.out.println("Item: "+ item.toString()+ " removed to cart");
            items.remove(item);
        }
        else
        {
            System.out.println("Sorry The Shopping Cart is closed");
        }
    }

    public void printItems()//print out all items in our shopping cart
    {
        for (Item item: items
             ) {
            System.out.println(item.toString()+"\n");
        }
    }

    public int getTotal()//get the total price of all items in cart
    {
        for (Item item: items
             ) {
            total+= item.getPrice();
        }
        return  total;
    }

    public void clear()
    {
        items.clear();
    }

    public void close()
    {
        closed = true;
    }
    public ArrayList<Item> getItems()
    {
        return items;
    }
}
