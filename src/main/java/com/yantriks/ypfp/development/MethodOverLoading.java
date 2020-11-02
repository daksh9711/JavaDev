package com.yantriks.ypfp.development;

public class MethodOverLoading {

    int Add(int num1,int num2){

        int num=num1+num2;
        return num;
    }

    int Add(int num1,int num2,int num3){
        int num=num1+num2+num3;
        return num;

    }

    public static void main(String[] args) {

        MethodOverLoading overLoading=new MethodOverLoading();
        System.out.println("Addition of two numbers " +overLoading.Add(2,3));
        System.out.println("Addition of three numbers "+overLoading.Add(2,3,8));



    }
}
