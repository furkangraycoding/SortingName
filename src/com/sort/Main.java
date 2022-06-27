package com.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"BANU", "ayten","AYşE","ÇİSEM", "DENİZ", "EmiN","ÖMER", "gülbEN"};
        String str= String.join(",",arr);
        String array_uppercase[]=str.toUpperCase().split(",");
        String order = "BAÇCDEÖFGHĞIJKLMNOPQRTSŞUÜVWXYZ";
        System.out.println(siraKontrol(array_uppercase,order));

    }

    public static boolean siraKontrol(String[] arr, String order){
        String[] beforeArr=arr.clone();
        Arrays.sort(arr, (first, second) -> {
            for (int index = 0; index < second.length(); index++) {
                int charFirst = (int) (first.charAt(index));
                int charSecond = (int) (second.charAt(index));
                if (order.indexOf(charFirst) >  order.indexOf(charSecond)) {
                    return 1;
                } else if (order.indexOf(charFirst) <  order.indexOf(charSecond)) {
                    return -1;
                } else {
                    continue;
                }
            }
            return 0;
        });

            if (Arrays.equals(arr, beforeArr)){
                return true;
            }
            else{
                return false;
            }

     }


}



