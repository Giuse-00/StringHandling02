package it.develhope.stringHandling2;

import java.util.Arrays;

public class Start {

    public static void main(String[] args) {


        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring(0, 7);
        String sub2 = string1.substring(6, 14);

        String charArray = (sub1.concat(string2).concat(sub2));

        System.out.println(charArray.toUpperCase());

        /*
        altro metodo, personalmente mi sono trovato meglio col primo, molto più ordinato:

        String sub1 = string1.substring(0, 6);
        String sub2 = string1.substring(7, 14);
        char[] charArray = (sub1 + " " + string2 + " " + sub2).toUpperCase().toCharArray();
        System.out.println(charArray);
         */

    }
}
