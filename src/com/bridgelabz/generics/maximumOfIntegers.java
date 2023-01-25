package com.bridgelabz.generics;

public class maximumOfIntegers<T> {
    T num1, num2, num3;

    public static <T extends Comparable<T>> T maximumOfIntegers(T num1, T num2, T num3) {

        T maximumNumber = num1;
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            maximumNumber = num1;
        else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            maximumNumber = num2;
        else
            maximumNumber = num3;
        return maximumNumber;
    }

    public static void main(String[] args) {
        System.out.println("The max Number Among Three String numbers is:-\n "+ maximumOfIntegers("sreedhar", "vamshi", "narasappa"));
        System.out.println("The max Number of Three positive numbers is:-\n "+maximumOfIntegers(65, 101, 1));
        System.out.println("The max number of Three Float numbers is:-\n " + maximumOfIntegers(41.9f, 56.8f, 11.7f));
    }
}