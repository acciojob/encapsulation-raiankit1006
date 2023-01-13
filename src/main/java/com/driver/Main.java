package com.driver;

public class Main {

    public static void main(String[] args)
    {
        RWOnly a = new RWOnly();

        a.setName("akki");
        System.out.println(a.getName());

        //name has private access in com.driver.RWOnly
        //name has private access in com.driver.RWOnly
    }
  
}