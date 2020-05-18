
public class CalculatorMain {
  public static void main(String[] args) {
      int num1 = 10;
      int num2 = 2;
      int num3 = 90;
      MagicCalculator  magic = new MagicCalculator ();
      System.out.println("Addition is  "+ magic.add(num1, num2));

      System.out.println("Subtraction is " + magic.subtract(num1, num2));

      System.out.println("Multiplication is " + magic.multiply(num1, num2));

      System.out.println("Division is " + magic.divide(num1, num2));

      System.out.println("Square is " + magic.square(num1));

      System.out.println("Square root is " + magic.squareRoot(num3));

      System.out.println("sin is " + magic.sin(num3));

      System.out.println("cos is " + magic.cos(num3));

      System.out.println("tan is " + magic.tan(num3));

      System.out.println("factorial is " + magic.factorial(num1));
  } 
} 

    
