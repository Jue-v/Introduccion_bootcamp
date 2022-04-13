package com.company.ejercicio2;



public class Ejercicio2{

    public static void main(String[] args) {

       coche micoche = new coche();
       micoche.PonerPuerta();
        micoche.PonerPuerta();

        System.out.println(micoche.puertas);
    }


}

class coche{
    public int puertas = 0;

    public void PonerPuerta(){
        this.puertas++;

    }
}