package Ejercicio09;
import java.util.Objects;

public class Carta2 implements Comparable<Carta2>{

  private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private static String[] p = {"bastos", "copas", "espadas", "oros"};
  
  private Integer numero;
  private String palo;

  public Carta2() {
    this.numero = (int)(Math.random()*10);
    this.palo = p[(int)(Math.random()*4)];
  }
  
  public int getNumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  @Override
  public String toString() {
    return n[numero] + " de " + palo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Carta2 other = (Carta2) obj;
    if (!Objects.equals(this.numero, other.numero)) {
      return false;
    }
    if (!Objects.equals(this.palo, other.palo)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Carta2 c) {
    if (palo.equals(c.getPalo())) {
      return numero.compareTo(c.getNumero());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}