package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        //array of 10 test scores
        int testScores[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //average test score
        double sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];

        }
        double average = sum / testScores.length;
        System.out.println("The average test score is: " + average);


        //high score
        Arrays.sort(testScores);
        System.out.println(Arrays.toString(testScores));





    }
}
