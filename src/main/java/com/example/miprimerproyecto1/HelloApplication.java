package org.example.sumativainicial;

import  java.util.Scanner;

public class HelloApplication  {
    public static void main(String[] args) {
        for (int i =1 ; i<=100; i++){
        String salida = "";
        if (i % 3 ==0){
            salida += "fizz";
        }
        if (i % 5 ==0){
            salida += "buzz";
        }
            if (salida.isEmpty()){
                salida += i;
        }
         System.out.print(salida);
    }
  }
}
//Jacome Brenda
