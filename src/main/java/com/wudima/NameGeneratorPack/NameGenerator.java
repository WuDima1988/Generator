package com.wudima.NameGeneratorPack;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class NameGenerator {

    final private static  String namesPolMaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/male/namesPol.txt";
    final private static  String surnamesPolMaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/male/surnamePol.txt";
    final private static  String namesPolFemaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/female/namesPol.txt";
    final private static  String surnamesPolFemaleFile = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/female/surnamePol.txt";








    public static String getName(String filePath){

        ArrayList <String> list = initialize(filePath);


        int index  = (int) (Math.random()*list.size());

        Collections.shuffle(list);

        return list.get(index);


    }



    private static ArrayList<String> initialize(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            return br.lines().collect(Collectors.toCollection(ArrayList::new));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
