public class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int testArr[]=CircularArray.circularArrayRotation(arr,2);
        System.out.println("-------------");
        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }
    }
}
