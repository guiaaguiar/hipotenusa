package com.mycompany.hipotenusa;
 
import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
        Hipotenusa2 h = new Hipotenusa2();
        
        Scanner leia1 = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero");
        h.c1 = leia1.nextDouble();
        
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Escreva o segundo numero");
        h.c2 = leia2.nextDouble();
            
        h.resultado();
        
    }
}
