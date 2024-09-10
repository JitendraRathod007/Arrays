import java.util.*;

class ArmstrongNo {
    public static void main(String args[]) {
        int n = 153, temp = n, power = 0, sum = 0;
        while (temp != 0) {
            power++;
            temp = temp / 10;
        }

        temp = n;

        // Calculate the sum of each digit raised to the power
        while (temp != 0) {
            sum += Math.pow(temp % 10, power);
            temp = temp / 10;
         	}
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}