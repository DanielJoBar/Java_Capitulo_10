package Ejercicio02;
import java.util.ArrayList;
public class Ejercicio2 {
    public static void main(String[]args){
        long suma = 0;
        int contador =0;
        long media =0;
        long maximo =0;
        long minimo = 1000;
        ArrayList<Long> a = new ArrayList<Long>();
        System.out.println("La array quedó como : ");
        int tamaño = (int)Math.random()*11+10;
        for(int i =0;i<tamaño;i++){
            a.add((long)(Math.random()*101));
        }
        for(long Array  : a){
            suma+=Array;
            contador++;
            if(Array>maximo)
            maximo=Array;
            if(Array<minimo)
            minimo=Array;
            System.out.print(Array+" | ");
        }
        media = suma/contador;
        System.out.println("\nLa suma de los número de la array es: "+suma);
        System.out.println("La media de los número de la array es: "+media);
        System.out.println("El máximo de los número de la array es: "+maximo);
        System.out.println("El mínimo de los número de la array es: "+minimo);
    }
}