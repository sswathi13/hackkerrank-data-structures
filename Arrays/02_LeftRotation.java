// Problem: Left Rotation
// Platform: HackerRank
// Topic: Data Structures - Arrays
// Difficulty: Easy
// Link : https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true

import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=arr[(i+d)%n];
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
