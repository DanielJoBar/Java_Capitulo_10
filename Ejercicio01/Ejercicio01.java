package Ejercicio01;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> a = new ArrayList<String>();
    a.add("Manue");
    a.add("Muna");
    a.add("Ramón");
    a.add("Rosa");
    a.add("Paco");
    a.add("Nuria");
    System.out.println("Contenido de la lista: ");
    for(String nombre: a){
        System.out.println(nombre);
    }
    sc.close();
    }
}
