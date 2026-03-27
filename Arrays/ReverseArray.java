// Problem: Reverse Array
// Platform: HackerRank
// Topic: Data Structures - Arrays
// Difficulty: Easy
// Link: https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true

import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[n-i-1]+" ");
        }
        sc.close();
    }
}
    
