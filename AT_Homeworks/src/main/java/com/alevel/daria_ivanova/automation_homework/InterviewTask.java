package com.alevel.daria_ivanova.automation_homework;

public class InterviewTask {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 8;
        array[1] = -4;
        array[2] = 5;
        array[3] = -4;

        int minValue = array[0];
        int secondMinValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (array[i] < secondMinValue) {
                if (array[i] != minValue) {
                    secondMinValue = array[i];
                }
            }
        }
        System.out.println("Second min value of the array is " + secondMinValue);
    }
}
