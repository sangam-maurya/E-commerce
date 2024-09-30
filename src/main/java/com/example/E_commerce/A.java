package com.example.E_commerce;

import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
      int arr[]= {6, 7, 9, 10, 4, 5};

      int max = arr[0];
      for (int i=0; i< arr.length ; i++){
          if (arr[i]>max){
              max=arr[i];
          }
//          System.out.println(max);
      }
        // Initialize secondMax to the first element
        int secondMax = arr[0];

        // Find the second maximum value, ensuring it’s not the same as max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Maximum: " + secondMax);
    }
}
