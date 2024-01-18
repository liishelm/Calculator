public class Calculator{
  public Calculator(){

  }
  //This method adds two doubles and return their sum
  public double add(double a, double b){
    double sum= a+b;
    return sum;
  }
  //This method subtracts b from a and return their difference
  public double subtract(double a, double b){
    double dif= a-b;
    return dif;
  }
  //This method multiplies a times b and returns the answer
  public double multiply(double a, double b){
    double mult=a*b;
    return mult;
  }
  //This method divides a with b and returns the outcome 
  public double divide(double a, double b){
    double div=a/b;
    return div;
  }
  //This method returns a and b modulo
  public int modulo(int a, int b){
    int mod=a%b;
    return mod;
  }
  public static void main(String[] args){
    Calculator myCalculator=new Calculator();
    System.out.println(myCalculator.add(5.6,7.2));
    System.out.println(myCalculator.subtract(45,11.5));
    System.out.println(myCalculator.divide(5,2));
    System.out.println(myCalculator.multiply(13.5,2));
  }
}
