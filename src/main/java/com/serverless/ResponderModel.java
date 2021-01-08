package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "Elemento";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher mayorNumMatcher = Pattern.compile(".*which of the following numbers is the largest.*").matcher(question);
        if (mayorNumMatcher.matches()) {
            question.replace("^.*: which of the following numbers is the largest: ","");
            String [] elementos=question.trim().split(":");
            elementos=elementos[elementos.length-1].split(",");
            int [] enteros=convertirVectorAEnteros(elementos);
            return String.valueOf(obtenerEnteroMayor(enteros));
        }

        Matcher addNumMatcher = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        if (addNumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(addNumMatcher.group(1)) + Integer.parseInt(addNumMatcher.group(2)));
        }
        return teamName;
    }

    public int[] convertirVectorAEnteros(String[] elementos){
        int [] enteros = new int[elementos.length];
        for (int i =0;i<elementos.length;i++){
            enteros[i]=Integer.parseInt(elementos[i].trim());
        }
        return enteros;
    }
    public int obtenerEnteroMayor(int[] enteros){
        int temp = enteros[0];
        for (int i = 0; i < enteros.length; i++){
            for (int j = i + 1; j < enteros.length; j++)
            {
                if (enteros[i] > enteros[j]){
                    temp = enteros[i];
                    enteros[i] = enteros[j];
                    enteros[j] = temp;
                }
            }
        }
        return enteros[enteros.length-1];
    }
}