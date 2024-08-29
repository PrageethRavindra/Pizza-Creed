public class sorting {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "->");
        }
    }

    public static int[] bubbleSort(int arr[]) {
        for (int j=1;j<arr.length;j++)
        {
        for (int i = 0; i < arr.length-j; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {28, 13, 45, 62, 33};
        print(arr);
        System.out.println("");
        int sortedArr[] = bubbleSort(arr);
        print(sortedArr);
    }
}
