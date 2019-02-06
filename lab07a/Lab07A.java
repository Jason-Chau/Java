/*
Program Name:           Lab07A
Program Description:    An argument that determines if a random list of integers should
                        be printed or not. Does a linear search then sorted in ascending
                        order with a bubblesort method and does a binary search
Program Author:         Jason Chau
Date Created:           04/6/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab07a;

import java.util.Scanner;
public class Lab07A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean printList = false;
/*Switch statement based on the argument inputted
  "y" to print a list of numbers, "n" to not print them, and anything else as invalid*/
        switch (args[0]) {
            case "y":
                printList = true;
                break;
            case "n":
                printList = false;
                break;
            default:
                System.out.println("Invalid argument");
                System.exit(0);
        }
//Prompt user to input the length of the list, then will generate random numbers, and a random key
        System.out.println("Please enter the list length:");
        int listLength = input.nextInt();
        int[] list = new int[listLength];
        for (int i = 0; i < listLength; i++) {
            list[i] = (int)(Math.random() * listLength);
        }
        int key = (int)(Math.random() * listLength);
        System.out.println("Key = " + key);
        if (printList == true) {
            System.out.print("Unsorted list: ");
        }
        printArray(printList, listLength, list);
        linearSearch(listLength, list, key);
        bubbleSort(listLength, list, printList);
        binarySearch(listLength, list, key);
    }
    public static void printArray(boolean printList, int listLength, int[] list) {
//If argument was "y", program will print out the random numbers from the array in the output
        if (printList == true) {
            for (int i = 0; i < listLength; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
        }
    }
    public static int linearSearch(int listLength, int[] list, int key) {
//Search method that determines if the generated key can be found in the generated number array
        boolean foundKey = false;
        int i = 0;
        while (i < listLength) {
            if (key == list[i]) {
                foundKey = true;
                break;
            }
            i++;
        }
//If the key matches, the key and position it was found is printed out
        if (foundKey == true) {
            System.out.println("Key " + key + " found in linear search at position: " + (i + 1));
        }
//If the key does not match, this is printed out
        else {
            System.out.println("No key found in linear search");
        }
        return key;
    }
    public static void bubbleSort(int listLength, int[] list, boolean printList) {
//Captures the time that the sorting takes place
        long startTime = System.currentTimeMillis();
//Bubble sort method that sorts numbers in ascending order
        for (int y = 0; y < (listLength - 1); y++) {
            for (int i = 0; i < (listLength - y - 1); i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
//Captures the time that the sorting finished
        long endTime = System.currentTimeMillis();
//Calculate the difference between the two times and prints that out
        long currentTime = endTime - startTime;
        System.out.println("Sort time is " + currentTime + " milliseconds");
//If argument was "y" then the new sorted list is printed out from the printArray method
        if (printList == true) {
            System.out.print("\nSorted list: ");
        }    
        printArray(printList, listLength, list);
    }
    public static void binarySearch(int listLength, int[] list, int key) {
//Search method that see if the key matches within the array base don the middle integer
        int low = 0;
        boolean foundKey = false;
        int high = listLength - 1;
        int i = 0;
//If key number is found above or below the middle integer keep those numbers and search again
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            }
            else if (key == list[mid]) {
                foundKey = true;
                break;
            }
            else {
                low = mid + 1;
            }
            i += 1;
        }
//If the key matches within the array then the key and how many reads it needed to find it is printed out
        if (foundKey == true) {
            System.out.println("Key " + key + " found in binary search after " + (i + 1) + " reads.");
        }
        else {
            System.out.println("No key found in binary search");
        }
    }
}
