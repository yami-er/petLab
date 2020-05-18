public class Calculator {
   public int add(int num1, int num2){
       return num1 + num2;
   }
   public int subtract(int num1, int num2){
    return num1 - num2;
   }
   public int multiply(int num1, int num2){
    return num1 * num2;
   }
   public int divide(int num1, int num2){
    if(num2 !=0 ){
        return num1 / num2;
    }else{
     return 0;
    }
   }
   public int square(int num1){
    return num1 * num1 ;
   }
        
}
