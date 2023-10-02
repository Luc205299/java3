
import java.util.ArrayList;
import java.util.Scanner;

public class AvgCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a list of numbers with spaces :");
        String userInput = input.nextLine();
        double average = calculateAverage(userInput);
        System.out.println("The average of the numbers is: " + average);
    }

    public static double calculateAverage(String numbers) {
        String[] numberArray = numbers.split(" ");
        ArrayList<Integer> intList = new ArrayList<>(); // ArrayList of Integer
        for (String number : numberArray) {
            intList.add(Integer.parseInt(number));// convert String to Integer
        }
        double total = 0;
        for (int number : intList) {
            total += number;
        }

        return total / intList.size();
    }
}