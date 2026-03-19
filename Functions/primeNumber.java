public class primeNumber {

  // prime number check

  public static boolean isprime(int n){
    for (int i = 2; i <=n-1; i++) {
      if (n%i==0) {
        return false;
      }
      
    }
     return true;
    }

    // prime in range
    
    public static void primeinrange(int n){
      for (int i = 2; i <=n; i++) {
        if(isprime(i)){
            System.out.print(i+" ");
        }
      }

    }


  public static void main(String[] args) {
    primeinrange(20);
  }
}


