import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("MaxNumber is " + getMaxNumber(array));
        System.out.println("MinNumber is " + getMinNumber(array));
        System.out.println("Number of digits from the shortest number is " + getShortNumber(array));
        System.out.println("Number of digits from the longest number is " + getLongNumber(array));
    }

    public static int getMaxNumber(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(int[] arr) {
        int minNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    public static int getCountOfNumbers(int x) {
        int count = (x == 0) ? 1 : 0;
        while (x != 0) {
            count++;
            x = x / 10;
        }
        return count;
    }

    public static int getShortNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getCountOfNumbers(arr[i]);
        }
        return getMinNumber(arr);
    }

    public static int getLongNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getCountOfNumbers(arr[i]);
        }
        return getMaxNumber(arr);
    }
}