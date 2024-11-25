package com.example;

public class Calculator {
    
    public  int add(int a,int b){

        return a+b;
    }

    public  int sub(int a,int b){

        return a-b;
    }

    public int mul(int a,int b){

        return a*b;
    }

    public int calMax(int [] ar){
        int max= ar[0];

        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }

        return max;
    }

    public  String display(){
        
        return "Thankyou!!";
    }
}
