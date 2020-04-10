package com.company;
/*
 * Created by: Maria Temu
 * Created on: 7-April-2020
 * Created for: ICS4U
 * Day #28 (Towers Of Hanoi)
 * This program lets the user enter a number then plays
 * "Towers Of Hanoi"
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the number of disks: ");
        Scanner read = new Scanner(System.in);

        //disk no.
        int number = read.nextInt();
        //rod names
        towersOfHanoi(number, 'A', 'C', 'B');
    }

    // Java recursive function to solve tower of hanoi puzzle
    static void towersOfHanoi(int number, char from, char to, char mid) {
        if (number == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        towersOfHanoi(number - 1, from, mid, to);
        System.out.println("Move disk " + number + " from rod " + from + " to rod " + to);
        towersOfHanoi(number - 1, mid, to, from);

    }
    //System.out.println("Finished!!");
}
