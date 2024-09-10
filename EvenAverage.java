 class EvenAverage {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50}; // Sample array
        double sum = 0;
        int count = 0;

        // Iterate through the array
        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is even
                sum += num;      // Add to sum
                count++;         // Count the number of even numbers
            }
        }

        // Calculate the average
        double average = (count == 0) ? 0 : sum / count;

        // Print the result
        System.out.println("Average of even numbers: " + average);
    }
}