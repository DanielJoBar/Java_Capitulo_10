import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] ars){
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda");
        System.out.println("5. Kms Bicicleta");
        System.out.println("6. Kms Coche");
        System.out.println("7. Kms Totales");
        System.out.println("8. Salir");
    Bicicleta b = new Bicicleta(9);
    Coche c = new Coche(0);
    
        int opcion = sc.nextInt();
       switch(opcion){
        case 1:
            System.out.println("¿Cuántos kms?");
            int kms = sc.nextInt();
            b.recorre(kms);
        break;
        case 2:
            b.caballito();
        break;
        case 3:
            System.out.println("¿Cuántos kms?");
            kms = sc.nextInt();
            c.recorre(kms);
        break;
        case 4:
            c.quemaRuedas();
        break;
        case 5:
            System.out.println("La bicicleta lleva recorridos: ");
            System.out.println(b.getKilometrosRecorridos()+" kms");
        break;
        case 6:
        System.out.println("El coche lleva recorridos: ");
        System.out.println(c.getKilometrosRecorridos()+" kms");
        break;
        case 7:
        System.out.println("El recorrido total de ambos vehículos es de : ");
        System.out.println(Vehiculo.getKilometrosTotales()+" kms");
        break;
        case 8:
            salir=true;
        break;
       }
    }
    while(!salir);
    
    sc.close();
}
}