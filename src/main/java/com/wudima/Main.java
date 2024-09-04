package com.wudima;

import com.wudima.PassGeneratorPack.PassGenerator;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {

        ByteArrayOutputStream byteArrayOutputStream = PassGenerator.getPassword(10);

        String pass = byteArrayOutputStream.toString();
        System.out.println(pass + "\n"+pass.length());








    }
}