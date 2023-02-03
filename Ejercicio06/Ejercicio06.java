package Ejercicio06;
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oportunidades = 3;
        boolean accedido = false;
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("Area","Restringido");
        do{
            System.out.println(" Introduzca un nombre de usuario: ");
            String usuario = System.console().readLine();
            System.out.println(" Introduzca una contraseña: ");
            String contraseña = System.console().readLine();
            if(hm.containsKey(usuario)){
                if(hm.containsValue(contraseña)){
                    System.out.println("Ha accedido al área restringida");
                    accedido=true;
                    oportunidades=-1;
                }
                else
                System.out.println("Contraseña incorrecta , le quedan "+(oportunidades-1)+" oportunidades");
            }
            else{
            System.out.println("Usuario incorrecta , le quedan "+(oportunidades-1)+" oportunidades");
            oportunidades--;
            }
        }while(oportunidades>0);
        if(!accedido)
        System.out.println("Lo siento, no tiene acceso al área restringida");

        sc.close();
    }
}
