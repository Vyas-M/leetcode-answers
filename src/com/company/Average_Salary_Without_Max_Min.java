//05 March 2022
//Leet code - 1491, Easy

//Given an array, we should exclude the minimum and maximum values from the array and then should find the average value by having the divisor as the
//Length of the array subtracted by 2, as we don't consider the max and min values.

//We need to first sort the array in ascending order and then should proceed further
package com.company;

public class Average_Salary_Without_Max_Min {
    public static double average(int[] salary){
        selectionSort(salary);
        int total = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            total += salary[i];
        }

        double average_salary = total/(salary.length - 2);
        return average_salary;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int salary[] = {1000 ,2000, 3000};
        double ans = average(salary);
        System.out.println(ans);
    }
}
