package com.wudima;

import com.wudima.DateGeneratorPack.DateGenerator;
import com.wudima.NameGeneratorPack.NameGenerator;
import com.wudima.PassGeneratorPack.PassGenerator;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;


public class Main {

     private static  String namesPolMaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/male/namesPol.txt";
     private static  String surnamesPolMaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/male/surnamePol.txt";
     private static  String namesPolFemaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/female/namesPol.txt";
     private static  String surnamesPolFemaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/female/surnamePol.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String name =  NameGenerator.getName(namesPolFemaleFile);
        String surname =  NameGenerator.getName(surnamesPolFemaleFile);
        String date = DateGenerator.getDate();

        ByteArrayOutputStream byteArrayOutputStream = PassGenerator.getPassword(10);

        String pass = byteArrayOutputStream.toString();

        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Date of Birth: "+date);
        System.out.println("--------------------");
        System.out.println("Password: " + pass);








    }
}