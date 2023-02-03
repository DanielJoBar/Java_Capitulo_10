package Ejercicio04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        System.out.println("Introduzca 10 palagbras: ");
        for (int i =0; i< 10;i++){
        a.add(System.console().readLine());
        }
        System.out.println("Array original: "+a);
        Collections.sort(a);
        System.out.println("La lista quedo como : "+a);
        sc.close();
    }
}
