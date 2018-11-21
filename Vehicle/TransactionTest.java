
/**
 * TransactionTest is a class that does one thing only
 * It provides methods for testing out different test scenarios 
 * for our Shopping Cart Transaction classes
 * @author Ihsan Ullah
 * @version 04 October 2018
 */
public class TransactionTest
{
    
    /**
     * main method to execute the TransactionTest methods
     */
    public static void main(String[] args)
    {
       TransactionTest test = new TransactionTest();
       test.transaction1(); // calls the method with our test scenario
    }
    
    public void transaction1(){  
        
    //1. Create New Customer
    Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");
   
    
    }
}
