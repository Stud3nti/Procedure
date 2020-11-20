import java.util.Scanner;
public class Main {
    public static boolean balanceCheck(int[] intArray3){
        boolean balance = false;
        int total=0;
        for (int i = 0; i < intArray3.length; i++) {
            total+= intArray3[i];
        }
        if (total == 0)
            balance = true;
        return balance;
    }
    public static int arrayLength(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers are there?");
        int j = input.nextInt();
        return j;
    }
    public static int fRange(int[] intArray2){
        int range= intArray2[intArray2.length-1]-intArray2[0];

        System.out.println("Range: "+range);
        return range;
    }

    public static int[] getArray(int i){
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[i];
        System.out.print("Number:");
        for (int j = 0; j <i ; j++) {
            intArray[j] = input.nextInt();
        }
        return intArray;
    }
    public static int areaOfRectangle(int h, int w) {
        int area = w * h;
        return area;
    }

    public static float negativeReciprocal(float x) {
        return -1 / x;
    }

    public static int[] bubbleSort(int[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
        return intArray;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1:area of a square \t 2:Negative reciprocal \t 3:Bubble Sort \t 4:Range \t 5:BalanceCheck");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a Height");
                int h = input.nextInt();
                System.out.println("Enter a Width");
                int w = input.nextInt();
                int area = areaOfRectangle(h,w);
                System.out.println(area);
                break;
            case 2:
                System.out.println("Enter the number you want a negative reciprocal of:");
                float x = input.nextFloat();
                float nReciprocal = negativeReciprocal(x);
                System.out.print(nReciprocal);
                break;
            case 3:
                int i = arrayLength();
                int[] intArray = new int[i];
                intArray = getArray(i);
                intArray = bubbleSort(intArray);
                break;
            case 4:
                int j = arrayLength();
                int[] intArray2 = new int[j];
                intArray2 = getArray(j);
                intArray2 = bubbleSort(intArray2);
                int range = fRange(intArray2);
                break;
            case 5:
                int k = arrayLength();
                int[] intArray3 = new int[k];
                intArray3 = getArray(k);
                boolean balance = balanceCheck(intArray3);
                System.out.println("Balance: "+balance);




        }
    }
}