package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        transaction1();
        transaction2();
    }

    private static void transaction1()
    {
        Item item1 = new Item("shoes",23456);
        item1.setPrice(20);
        Item item2 = new Item("fluffy princess dress", 453223);
        item2.setPrice(38);
        Item item3 = new Item("Angel Wings",89932);
        item3.setPrice(80);
        Address address = new Address("Kensington Shed","London","ZX56253","England");
        Customer customer = new Customer("Steven","Smith","smithyboiII@gmail.com",address);
        ShoppingCart cart = new ShoppingCart(customer);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        Payment payment = new Payment(customer,"MasterCard",19453768, "2020-06");
        Order order = new Order(cart,customer,payment);
        order.setOrderNo(45890);
        order.placeOrder();
    }

    private static  void transaction2()
    {
        Item item1 = new Item("Skirt",2345646);
        item1.setPrice(20);
        Item item2 = new Item("Belt", 4535653);
        item2.setPrice(38);
        Item item3 = new Item("Football Boots",87832);
        item3.setPrice(80);
        Address address = new Address("Loughinch","Galway","H56253","Ireland");
        Customer customer = new Customer("Cian","Mc Sweeney","c.swye@gmail.com",address);
        ShoppingCart cart = new ShoppingCart(customer);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.printItems();
        cart.removeItem(item1);
        Payment payment = new Payment(customer,"MasterLard",19453768, "2020-06");//wrong payment details
        Order order = new Order(cart,customer,payment);
        order.setOrderNo(45890);
        order.placeOrder();
    }
}
