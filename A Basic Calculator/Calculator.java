public class Calculator{
  // the cunstructor
  public Calculator(){}

  // add method
  public int add(int a, int b){
    int sum = a + b;
    return sum;
  }

  // subtract method
  public int subtract(int a, int b){
    int sub = a - b;
    return sub;
  }

  // multiply method
  public int multiply(int a, int b){
    int multi = a * b;
    return multi;
  }

  // division method
  public int devide(int a, int b){
    int devide = a / b;
    return devide;
  }

  // module method
  public int modulo(int a, int b){
    int mod = a % b;
    return mod;
  }


  // the main method
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
  }

}
