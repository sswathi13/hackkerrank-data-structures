// Problem: Sparse Arrays
// Platform: HackerRank
// Topic: Data Structures - Arrays
// Difficulty: Medium
// Link: https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true

import java.util.Scanner;
public class Solution{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String a[]=new String[n];
    for(int i=0;i<n;i++){
        a[i]=sc.next();
    }
    int m=sc.nextInt();
    String b[]=new String[m];
    for(int i=0;i<m;i++){
        b[i]=sc.next();
    }

    int count=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        if(b[i].equals(a[j])){
            count=count+1;
        }}
        System.out.println(count);
        count=0;
    }
    sc.close();
}}
