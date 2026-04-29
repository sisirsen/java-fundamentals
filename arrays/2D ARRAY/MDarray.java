
//2D Arrays

// public class MDarray {
//   public static void Mdarray (){

//     int ages[][]={{1,2,3,4},{6,7,8,9}};

//     System.out.println(ages[0][0]);
//     System.out.println(ages[0][1]);
//     System.out.println(ages[0][2]);
//     System.out.println(ages[1][0]);
//     System.out.println(ages[1][1]);
//     System.out.println(ages[1][2]);
//   }
//   public static void main(String[] args) {
//     Mdarray();
//   }

// }

public class MDarray {

  public static void maxval(){
    int arr[]={1,2,3,4,5,3};
    int target=3;
    int ans= -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==target) {
        ans=i;
        break;
      }
    }
    System.out.println(ans);
    }
  
  public static void main(String[] args) {
    maxval();
  }
}
