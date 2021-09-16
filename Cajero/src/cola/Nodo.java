
package cola;

import java.util.Random;

public class Nodo {

    int id;
    String nombre;
    Nodo siguiente;
    int recibos;
    String img;
    Random r = new Random();

    public Nodo(int id, String nombre, Nodo sig, int servicios) {
        this.id = id;
        this.nombre = nombre;
        this.siguiente = sig;
        this.recibos = servicios;
        aleatorioRutaImg();
    }

    public Nodo getSig() {
        return siguiente;
    }

    public void setSig(Nodo sig) {
        this.siguiente = sig;
    }

    public int getRecibos() {
        return recibos;
    }

    public void atender() {
        if (this.recibos <= 3) {
            this.recibos = 0;
        } else {
            this.recibos -= 3;
        }
    }

    public String getRutaImg() {
        return img;
    }

    public void aleatorioRutaImg() {
        //numero aleatorio para escoger imagen..0
      int num =  r.nextInt(4)+1;
      if(id==1){
          num=0;
          img="/img/persona1.jpg";
      }else{
          img="/img/personaje"+Integer.toString(num)+".png";
      }
      
      
    }
    public void setRutaImg(int n){
    
      img="/img/persona"+Integer.toString(n)+".png";
    
    
    }

    public int getInfo() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}
