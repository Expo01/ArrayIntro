public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println("myIntArray index 5 is " + myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[5] = 50.0;
        System.out.println("myDoubleArray index 5 = " + myDoubleArray[5]);


        int[] preKnownElementArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("preKnownElementArray index 0 is " + preKnownElementArray[0]);

        int [] forLoopArray = new int [5];
        for (int i = 0; i<forLoopArray.length; i++){
            forLoopArray[i] = i*10;
        }
        printArray(forLoopArray);
    }

    public static void printArray(int[] array){ //accepts array as parameter type
        for (int i = 0; i<array.length; i++){ //using .length means we can change the length of the array
            // without changing the code other places and can't accidentally call an out-of-bounds element
            System.out.println("preKnownElementArray element " + i + ", was assigned a value of " + array[i]);
        }
    }
}