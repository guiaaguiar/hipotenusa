package com.mycompany.hipotenusa;

public class Hipotenusa2 {
    public double c1, c2, hip;
    
    public double calculo(){
        c1 = Math.pow(c1, 2);
        c2 = Math.pow(c2, 2);
        hip = c1 + c2;
        return hip;
    } 
    public void resultado(){
        calculo();
        System.out.println("O valor da hipotenusa é: " +Math.sqrt(hip));
    }
}
