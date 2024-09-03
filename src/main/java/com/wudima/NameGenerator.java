package com.wudima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NameGenerator {

    static ArrayList<String> names;
    static ArrayList<String> surname;
    static ArrayList<String> surnamePol;
    static ArrayList<String> surnameUkr;





    public static String getName(){


        initializeNames();


        int index  = (int) (Math.random()*names.size());

        Collections.shuffle(names);

        return names.get(index);


    }

    public static String getSurname(){


        initializeSurnames();


        int index  = (int) (Math.random()*surname.size());

        Collections.shuffle(surname);

        return surname.get(index);


    }

    public static void initializeNames(){

        names = new ArrayList<>();

        Collections.addAll(names, "Andrew","Tito","Vasia","Petia", "Kisel","Bonny");

    }

    public static void initializeSurnames(){

        surname = new ArrayList<>();

        Collections.addAll(surname, "Koval","Fieto","Schumek","Peliak", "Kizer","Bon");

    }
}
