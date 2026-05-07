public class ParameterConstructor {

  String n;
  int a;

  ParameterConstructor(int age, String name){
      a=age;
      n=name;
  }
  public static void main(String[] args) {
    ParameterConstructor s1=new ParameterConstructor(12,"Sisir");

    System.out.println(s1.a);
    System.out.println(s1.n);
  }
}
