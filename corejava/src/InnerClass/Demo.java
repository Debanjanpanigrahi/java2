public class Demo {
    public static void main(String[] args)
    {
        Outer out = new Outer();
       Outer.Inner inner = new Outer.Inner(out);
        inner.fun();            
    }
}

 class Outer{
    int number = 4;

    static class Inner{

        public Outer outer;

        Inner(Outer outer){
            this.outer = outer;
        }
        
          void fun(){
            System.out.println("Hello");
        }
    }
}

class BankAccout{

    /*1.Helper class InerestCalculator 
      2.Builder Design Pattern
    */
    private static class InterestCalculator{
    static double calculateYearly(double principal,double rate){
        return principal * rate;
    }
}

    public double computeInterest(double principal){
        return BankAccout.InterestCalculator.calculateYearly(principal, 0.5);
    }
}