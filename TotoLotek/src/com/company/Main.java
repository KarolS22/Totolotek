package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random();
        int[] tab=new int[6];
        int a=0;
        do{
            boolean czyLosowac=false;
            tab[a]=generator.nextInt(50);
            for(int i=0;i<a;i++){
                if(tab[a]==tab[i]) {
                    czyLosowac=true;
                }
            }
            if(!czyLosowac){
                a++;
            }
        } while(a<tab.length);
            for(int i=0;i<tab.length;i++){
                System.out.println(i+1+". "+tab[i]);
            }
    }
        }
