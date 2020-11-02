package com.yantriks.ypfp.development;

public class Encapsulation {

    private String StudentName;

    public String  getName(){
        return StudentName;

    }

    public void setName(String StudentName){

        if (StudentName.equals("DemoName")) {
            this.StudentName = StudentName;
        }
        else {
            System.out.println("Entered wrong name");
        }

    }

    public static void main(String[] args) {

        Encapsulation obj=new Encapsulation();
        obj.setName("DemoName");
        System.out.println(obj.getName());


    }
}

