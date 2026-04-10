import java.util.Scanner;
public class SimpleInterest {
  public static void main(String[] args) {
    
    System.out.println("lets calculate Interest");

    Scanner scan=new Scanner(System.in);

    System.out.println("Enter P : ");
     double p = scan.nextDouble();


    System.out.println("Enter r : ");
     double r = scan.nextDouble();


    System.out.println("Enter t : ");
     double t = scan.nextDouble();

     System.out.println("The interest is : "+(p*r*t/100));
  }
}
