/* 2.	Consider a class that keeps track of the sales of an item. An object of this class 
will have the attributes
•	Number solQd
•	Total sales
•	Total discounts
•	Cost per item
•	Bulk quantity
•	Bulk discount percentage
and the following methods:
•	registerSale(n) records the sale of n items. If n is larger than the bulk quantity, 
the costper item will be reduced by the bulk discount.
•	displaySales displays the number sold, the total sales, and total discount.
•	Implement the class in Java.
•	Write some Java statements that test the class.
*/

public class ItemSales {
    private int numberSold;
    private double sales;
    private double discounts;
    private double itemCost;
    private int bulkMin;
    private double bulkDiscount;
       
    public void initialize(double cost, int bulk, double discount) {
        numberSold = 0;
        sales = 0.0;
        discounts = 0.0;
        itemCost = cost;
        bulkMin = bulk;
        bulkDiscount = discount;
    }
    public void displaySales(){
        System.out.println(
                "Total Sales revenue is : " + sales + " on the sale of " + numberSold +
                " items with " + discounts + " total discounts awarded.");
    }
    public void registerSale(int n){
        if(n>0){
            double basicCost = itemCost * n;
            double discountGiven = 0.0;
            numberSold += n;
            if(n >= bulkMin){
                discountGiven = basicCost * bulkDiscount / 100;
            }
            sales += (basicCost - discountGiven);
            discounts += discountGiven;
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ItemSales soupSeller = new ItemSales();
        soupSeller.initialize(10.0, 10, 90.0);
        
        System.out.println("We are selling 1 can of soup.  Should cost 10.0 with no discount");
        soupSeller.registerSale(1);
        soupSeller.displaySales();
        System.out.println();
        
        System.out.println("We are selling 9 cans of soup.  Should cost 90.0 with no discount");
        System.out.println("Total should be 10 items, sales: 100.0, discounts: 0.0");
        soupSeller.registerSale(9);
        soupSeller.displaySales();
        System.out.println();
        
        System.out.println("We are selling 10 cans of soup.  Should cost 10.0 with discount of 90.0");
        System.out.println("Total should be 20 items, sales: 110.0, discounts: 90.0");
        soupSeller.registerSale(10);
        soupSeller.displaySales();
        System.out.println();
        
        System.out.println("We are selling 50 cans of soup.  Should cost 50.0 with discount of 450.0");
        System.out.println("Total should be 70 items, sales: 160.0, discounts: 540.0");
        soupSeller.registerSale(50);
        soupSeller.displaySales();
        
    }
    
}
