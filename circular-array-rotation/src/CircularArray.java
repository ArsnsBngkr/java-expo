public class CircularArray {
    public static int[] circularArrayRotation(int[] arr,int times) {
       //this function accepts an integer array and shift all remaining elements right one
        int arrTwo[] = new int[5];
  
        for (int k = 0; k < times; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    arrTwo[0] = arr[arr.length - 1];
                } else {

                    arrTwo[i] = arr[i - 1];
                }
            }
            arr=arrTwo.clone();
        }
        return arrTwo;
    }
}
