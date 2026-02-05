//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Halina Tri-Leanza
 */


public class Main {

  public static void main(String[] args) {

    System.out.println("Hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
    int a = 3;
    int b = 7;

    // Array in order using a while loop
    System.out.print("In Order: ");
    int i = 0;
    while (i < numbers.length) {
      System.out.print(numbers[i] + " ");
      i++;
    }
    System.out.println();

    // Array in reverse using a for loop
    System.out.print("In Reverse: ");
    for (int j = numbers.length - 1; j >= 0; j--) {
      System.out.print(numbers[j] + " ");
    }
    System.out.println(); 

    // First and last values
    System.out.println("First: " + numbers[0]);
    System.out.println("Last: " + numbers[numbers.length - 1]);

    // Lab 1 methods
    System.out.println("Max of A and B: " + lab.max(a, b));
    System.out.println("Min of A and B: " + lab.min(a, b));
    System.out.println("Sum: " + lab.sum(numbers));
    System.out.println("Average: " + lab.average(numbers));
    System.out.println("Max: " + lab.max(numbers));
    System.out.println("Min: " + lab.min(numbers));
  }
}

class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  // max of two 
  public int max(int a, int b) {

    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // min of two 
  public int min(int a, int b) {

    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  // sum of array
  public int sum(int[] nums) {
    int total = 0;

    for (int num : nums) {
      total += num;
    }

    return total;
  }

  // average using foreach loop
  public double average(int[] nums) {
    double total = 0;

    for (int num : nums) {
      total += num;
    }

    return total / nums.length;
  }

  // max array using for loop
  public int max(int[] nums) {
    int maxValue = nums[0];

    for (int i = 1; i < nums.length; i++) {

      if (nums[i] > maxValue) {
        maxValue = nums[i];
      }

    }
    return maxValue;
  }

  // min array using for loop
  public int min(int[] nums) {
    int minValue = nums[0];

    for (int i = 1; i < nums.length; i++) {

      if (nums[i] < minValue) {
        minValue = nums[i];
      }

    }
    return minValue;
  }
}