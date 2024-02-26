public class Main {
    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3, 4 },
        //                 { 12, 13, 14, 5 },
        //                 { 11, 16, 15, 6 },
        //                  { 10, 9, 8, 7 }};
        int arr[][] = { { 1, 2 },
                        { 4, 3 }};
        Snail.printArrayToClockWiseOrder(arr);// prints NxN array in clockwise order
       
        System.out.print("---------------------");
        
        int newArray[][] = Snail.getClockWiseArray(9);//eg 4,9,19,25 etc
        for (int i = 0; i < newArray.length; i++) {//simple 2d iteration
            System.out.println("");
            for (int j = 0; j < newArray.length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
        }
        System.out.println("");
    }
}
