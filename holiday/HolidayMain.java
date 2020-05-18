public class HolidayMain {
    public static void main(String[] args) {
        Holiday myFav = new Holiday();
        System.out.println("My favorite holiday is "+ myFav.getName()); 

       
        System.out.println("It is located in "+ myFav.getLocation());  

       
        System.out.println("The price is "+ myFav.getPrice()); 
        
       
        System.out.println("The address is " + myFav.address());
        
        
        System.out.println("And it is " +myFav.isExpensive() + " expensive");
    }
}