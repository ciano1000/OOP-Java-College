package com.company;

import java.util.ArrayList;

public class Order {

    private Payment payment;
    private Customer customer;
    private ShoppingCart cart;
    private ArrayList<Item> order;
    private Email email;
    private int orderNumber;
    private int orderPrice;

    public Order(ShoppingCart shoppingCart, Customer customer, Payment payment)
    {
        cart = shoppingCart;
        this.customer = customer;
        this.payment = payment;
        order = new ArrayList<>();//a new list to transfer the shopping carts contents into
        orderPrice = cart.getTotal(); //get the total price of the items in the cart
        email = new Email(this, this.customer); // create a new email object, with this class and the customer class passed as arguments
    }

    public void placeOrder()//begin placing our order
    {
        System.out.println("Placing order... \n");
        if(payment.validate()) // check if our payment method is validated
        {
            transferItems(); // if validated, transfer cart items to our order
            email.sendEmail();// send confirmation email with order details
        }

    }

    private void transferItems()
    {
        for (Item item: cart.getItems() //foreach item in our cart...
             ) {
            order.add(item); //add the item to our order

        }
        cart.clear(); //empty our shopping cart once all items are transferred
        cart.close();//close our shopping cart to prevent changes being made
    }

    public int getOrderPrice()
    {
        return orderPrice;
    }

    public void setOrderNo(int num)
    {
        orderNumber =num;
    }

    public int getOrderNumber()
    {
        return orderNumber;
    }
    public ArrayList<Item> getOrder()
    {
        return order;
    }
}
