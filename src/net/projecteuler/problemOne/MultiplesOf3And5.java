/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projecteuler.problemOne;

/**
 *
 * @author uwij002
 */

/**
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
**/
public class MultiplesOf3And5 {
    public static void main(String[] args) {
        
       
       int sum = sumDivisible(3, 999) + sumDivisible(5, 999) - sumDivisible(15, 999);
        System.out.println(sum);
    }

    private static int sumDivisible(int n, int p) {
//        Integers are whole numbers without fractional or decimal components. 
//        If a math problem requires you to sum a certain number of integers from 1 to a given value N, 
//        it's not necessary to add each and every value by hand. Instead, use the equation (N(N + 1))/2, 
//        where N is the highest number in your series, to save time and effort.
        return n*(p/n)*((p/n) +1)/2;
    }
}
