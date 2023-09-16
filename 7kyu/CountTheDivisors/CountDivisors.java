package CountTheDivisors;
public class CountDivisors {

  static  public long numberOfDivisors(int n) {
         
        int divisors =0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0)
            divisors++;
        }    
        return divisors;
      }
    public static void main(String[] args) {

     long s = numberOfDivisors(30);
     System.out.println(s);
     


    }
}
