package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int[] a = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int word = s1.charAt(i);
            if(word!=32) {
                if (word >= 97) {
                    a[word - 97]++;
                } else {
                    a[word - 65]++;
                }
            }
        }
            for (int i = 0; i < 26; i++) {
                if (a[i] <= 0) {

                } else {
                    System.out.println("(" + (char) (i + 65) + ")" + " " + (char) (i + 97) + " " + a[i]);

                }
            }
        }
    }

