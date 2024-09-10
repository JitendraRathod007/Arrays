public class ShiftFirstToLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Store the first element
        int firstElement = arr[0];

        // Shift elements to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place the first element at the last position
        arr[arr.length - 1] = firstElement;

        // Print the modified array
        System.out.print("Array after shifting first element to last: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}