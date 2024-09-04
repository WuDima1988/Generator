package com.wudima.CityGeneratorPack;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class CityGenerator {

    final private static  String citiesPol = "/Users/wudima/Documents/IJ_Projects/Generator/src/main/resources/files/pol/cities/cities.txt";


    public static void main(String[] args) throws FileNotFoundException {

        //Polish name/surname Male

        String city = getCity(citiesPol);

        System.out.println(city);



    }





    public static String getCity(String filePath) throws FileNotFoundException {

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
