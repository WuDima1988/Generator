package com.wudima;

import java.io.ByteArrayOutputStream;


public class Main {
    public static void main(String[] args) {

       ByteArrayOutputStream byteArrayOutputStream = PassGenerator.getPassword(10);

       String pass = byteArrayOutputStream.toString();
        System.out.println(pass + "\n"+pass.length());



    }
}