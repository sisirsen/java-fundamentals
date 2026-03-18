public class callbyValue {
  public static void func(int x){
    x=40;
    System.out.println(x);
  }
  public static void main(String[] args) {
    int a = 10;
    func(a);
    System.out.println(a);
  }
}
