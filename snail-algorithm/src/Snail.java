public class Snail {

    protected static void printArrayToClockWiseOrder(int arr[][]) {
        // init variables
        int x = 0;
        int y = 0;
        int yInit = 0;
        int xInit = 0;
        int length = arr.length - 1;
        int n = (arr.length * arr.length) - 1;
        for (int i = 0; i < n; i++) {
            if (x < length && x == xInit && y < length) {
                System.out.println(arr[x][y]);
                y++;
            } else if (y == length && x < length) {
                System.out.println(arr[x][y]);
                x++;
            } else if (x == length && y > yInit) {
                System.out.println(arr[x][y]);
                y--;
                if (arr.length == 2) {//special case for 2x2 array
                    System.out.println(arr[x][y]);
                    break;
                }
            } else if (x > xInit && y < length) {
                System.out.println(arr[x][y]);
                x--;
                if (x == xInit) {
                    xInit++;
                    x = xInit;
                    yInit++;
                    y = yInit;
                    length--;
                    if (length == y && length == y) {
                        System.out.println(arr[x][y]);
                        break;
                    }
                }
            }
        }
    }

    protected static int[][] getClockWiseArray(int number) {//return a 2d array in clockwise order
        // init variables
        int arrayLength = (int) Math.sqrt(number);
        int arr[][] = new int[arrayLength][arrayLength];
        int x = 0;
        int y = 0;
        int yInit = 0;
        int xInit = 0;
        int value = 1;
        int length = arrayLength - 1;
        int n = (arrayLength * arrayLength) - 1;
        for (int i = 0; i < n; i++) {
            if (x < length && x == xInit && y < length) {
                arr[x][y] = value;
                value++;
                y++;
            } else if (y == length && x < length) {
                arr[x][y] = value;
                value++;
                x++;
            } else if (x == length && y > yInit) {
                arr[x][y] = value;
                value++;
                y--;
                if (arr.length == 2) {//special case for 2x2 array
                    arr[x][y] = value;
                    break;
                }

            } else if (x > xInit && y < length) {
                arr[x][y] = value;
                value++;
                x--;
                if (x == xInit) {
                    xInit++;
                    x = xInit;
                    yInit++;
                    y = yInit;
                    length--;
                    if (length == y && length == y) {
                        arr[x][y] = value;
                        value++;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
