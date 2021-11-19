package com.company;
import java.util.Random;

class Tablica{

    int[] tab = new int[10];

    void fill(){
        Random r = new Random();
        for(int i=0;i<tab.length;i++) {
            tab[i] = r.nextInt(100) + 1;
        }
    }
    void show(){
        System.out.println("Tablica: ");
        for (int num:tab){
            System.out.println(num);
        }
    }
    void minmax(){
        int min = 100;
        int max = 0;
            for(int num:tab){
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
            }

        System.out.println("\nNajmniejszy element tablicy to " + min);
        System.out.println("Największy element tablicy to " + max);
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tablica tablica = new Tablica();
        tablica.fill();
        tablica.show();
        tablica.minmax();
    }
}