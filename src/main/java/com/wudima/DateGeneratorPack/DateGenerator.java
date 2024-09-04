package com.wudima.DateGeneratorPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DateGenerator {


    // 1992/ 1996/ 2000/

    // 1992-2002 y
    // 12 m
    // 30-31 d

    public static void main(String[] args) {

        System.out.println(getDate());
    }


    public static String getDate(){

//        List <Integer> years = new ArrayList<>();
//
//        for(int i = 1992; i<2003; i++){
//            years.add(i);
//        }
//
//        Collections.shuffle(years);


        int year = (int) ((Math.random()*(2002-1992)+1)+1992);
        int month = (int) (Math.random()*(12-1)+1)+1;

        //if month == 1/3/5/7/8/10/12  == 31 days
        //if month == 2/4/6/11    == 30 days
        //if month == 2 and year == 1992/1996/2000 == 28days

        int day;

        if(month == 4 || month == 6 || month == 11){
            day = (int) ((Math.random()*(30-1)+1)+1);
        }else if(month == 2){
            if(year==1992 || year==1996 || year==2000){
                day = (int) ((Math.random()*(29-1)+1)+1);
            }else{
                day = (int) ((Math.random()*(28-1)+1)+1);
            }
        }else{
            day = (int) ((Math.random()*(31-1)+1)+1);
        }


//        String result = years.get(index).toString()+" "+months.get(index2).toString();
         String result =  String.format("%02d/%02d/%4d",day,month,year);

        return result ;
    }
}
