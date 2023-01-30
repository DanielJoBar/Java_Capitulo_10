public class Bicicleta extends Vehiculo {
    private int pinones;
    Bicicleta(){
        super();
        this.pinones=8;
    }
    Bicicleta(int pinones){
        super();
        this.pinones=pinones;
    }
    public int getPinones(){
        return this.pinones;
    }
    public void caballito(){
        System.out.println("Estoy haciendo el caballito");
    }
    @Override
    public void recorre(int kms){
        this.setKilometrosRecorridos(this.getKilometrosRecorridos()+kms);
    }
}
