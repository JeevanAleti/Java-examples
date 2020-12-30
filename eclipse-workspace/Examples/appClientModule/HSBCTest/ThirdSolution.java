package HSBCTest;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
import java.util.Scanner;

public class ThirdSolution {

	private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j] && nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total count and numbers: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Please enter the target number: ");
        int target = sc.nextInt();

        sc.close();

        int[] indices = findTwoSum_BruteForce(nums, target);

        if (indices.length == 2) {
            System.out.println("First Index is: " + indices[0] + ", " + "Second Index is:"+ indices[1]);
        } else {
            System.out.println("No solution found!/Invalid entry");
        }
    }
}