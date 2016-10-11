/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.largestpalindromeproduct;

import java.util.ArrayList;

/**
 *
 * @author Alec
 */
public class LargestPalindromeProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> allResults = getAllResults();
        ArrayList<Integer> allPalindromes = getPalindromes(allResults);
        Integer largestPalindrome = getLargestNum(allPalindromes);
        System.out.println("Largest Palindrome is " + largestPalindrome);
        
    }
    
    
    public static ArrayList<Integer> getAllResults(){
        int result;
        ArrayList<Integer> totalResults = new ArrayList<>();
        for(int i = 100;i<1000;i++){
            for(int j=100;j<1000;j++){
                result = i*j; 
                totalResults.add(result);
            }
        }
        return totalResults;
    }
    
    public static ArrayList<Integer> getPalindromes(ArrayList<Integer> inputList){
        ArrayList<Integer> allPalindromes = new ArrayList<>();
        for(Integer input : inputList){
            //find if it is a palindrome
            if(input.equals(flip(input))){
                allPalindromes.add(input);
            }
        }
        return allPalindromes;
    }
    
    public static Integer flip( Integer inputNum){
        Integer flippedNum = 0;
        //System.out.println(inputNum);
        while(inputNum != 0){
            flippedNum = flippedNum * 10;
            flippedNum = flippedNum + inputNum%10;
            inputNum = inputNum/10;
        }
        //System.out.println(flippedNum);
        return flippedNum;
    }
    
    public static Integer getLargestNum(ArrayList<Integer> listNums){
        Integer largestNum = 0; 
        for(Integer num : listNums){
            if(num > largestNum){
                largestNum = num; 
            }
        }
        
        return largestNum;
    }
}
