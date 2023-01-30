package Ejercicio03;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
public class Ejercicio03{
    public static void main(String[] args){
    ArrayList<Integer> numero = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca 10 números: ");
    for (int i =0; i< 10;i++){
        numero.add(sc.nextInt());
        }
    System.out.println("Array original : "+numero);
    Collections.sort(numero);
    System.out.println("Ordenada de menor a mayor: "+numero);
    ArrayList<Integer> b = new ArrayList<Integer>();
      for(int n : numero) {
        b.add(0, n);
      }
        
      System.out.print("Lista ordenada de mayor a menor: " + b);
    sc.close();
}   
}