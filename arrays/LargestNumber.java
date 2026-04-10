public class LargestNumber {

  public static int LargestNumber(int[] arr){

    int largeNum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      
        if (arr[i]>largeNum) {
          largeNum=arr[i];
}    }
    return largeNum;
  }
  public static void main(String[] args) {
    System.out.println(LargestNumber(new int[]{1,2,3,4,5,6,7,8,9,10}));
  }
}