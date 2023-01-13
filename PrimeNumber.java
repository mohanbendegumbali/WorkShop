package com.bridgelabz.workshop;

public class PrimeNumber {
    public static void main(String args[]){
        int s1=4,s2=50,s3,i,j;
        int flag=0;
        for(i=s1;i<=s2;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
                else{
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println("Prime Numbers are " +i);
            }
        }
    }
}
