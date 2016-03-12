package com.company;

public class Degree {

    public static void main(String[] args) {
        byte C = 2;
        byte F = 2;
        double FromCToF = (double)C * 1.8D + 32.0D;
        double FromFToC = (double)(F - 32) / 1.8D;
        System.out.println(FromCToF);
        System.out.println(FromFToC);
    }
}