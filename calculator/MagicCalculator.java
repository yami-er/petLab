 //import static java.lang.Math.*;
   public class MagicCalculator  extends Calculator {
       
    public double squareRoot(int num3){
        return Math.sqrt(num3);
    }
    public double sin(int num3){
        return Math.sin(num3);
    }
    public double cos(int num3){
        return Math.cos(num3);
    }
    public double tan(int num3){
        return Math.tan(num3);
    }
    public double factorial(int num3){
        int fact = 1;
        for (int i=num3; i > 1; i--){
             fact=fact*i;   
        }
        return fact;
    } 
}
