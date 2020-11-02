package com.yantriks.ypfp.development;

public class MethodOverriding {

    int Add(int num1, int num2) {

        int num = num1 + num2;
        return num;
    }

}

   class Child extends MethodOverriding{

    int Add(int num1,int num2){
        int num=num1+num2+num2;
        return num;

    }

    public static void main(String[] args) {

        MethodOverriding overriding=new Child();
        System.out.println("Addition of two numbers " +overriding.Add(2,3));

    }
}
