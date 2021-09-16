package cola;

import java.util.Random;

public class Cola {

    private Nodo raiz;
    private Nodo siguiente, nuevo;
    private int count = 0, num, i, serv;
    Random rnd = new Random();

    Cola() {
        raiz = new Nodo(1, "Cajero", raiz, 0);
        siguiente = raiz;
    }

    boolean vacia() {
        return raiz.getSig() == raiz;
    }

    public void insertar(int info, String nombre, int contador) {
        Nodo nuevo = new Nodo(info, nombre, raiz, contador);

        if (vacia()) {
            siguiente = nuevo;
            raiz.setSig(siguiente);

        } else {
            siguiente.setSig(nuevo);
            siguiente = nuevo;
        }
        /*num = 1 + rnd.nextInt(5);
        for(i = 1; i <= num;i++){
            serv = 1 + rnd.nextInt(6);
            nuevo = new Nodo(i,"Cliente"+i,raiz,serv);
            if (vacia()) {
            siguiente = nuevo;
            raiz.setSig(siguiente);

        } else {
            siguiente.setSig(nuevo);
            siguiente = nuevo;
        }
        }*/
    }

    public boolean atender() {
        if (!vacia()) {
            raiz.siguiente.atender();
            if (raiz.siguiente.recibos > 0) {
                Nodo aux = raiz.siguiente;
                raiz.setSig(raiz.siguiente.siguiente);
                aux.setSig(raiz);
                cola().setSig(aux);
            } else {
                raiz.setSig(raiz.siguiente.siguiente);
            }

            // raiz.sig = raiz.sig.sig;
            return true;
        } else {
            System.out.println("No hay más clientes en cola");
            return false;
        }
    }

    public void mostrar() {

        System.out.println("________________________");
        Nodo reco = raiz.siguiente;
        imprimir(raiz.nombre, raiz.recibos);
        while (reco != raiz) {
            imprimir(reco.nombre, reco.recibos);
            reco = reco.siguiente;

        }
        count++;
        System.out.println("________________________");
        System.out.println("\nAtención " + count);

    }

    public Nodo cola() {
        Nodo reco = raiz;

        while (reco.siguiente != raiz) {

            reco = reco.siguiente;

        }
        return reco;
    }

    public void imprimir(String nombre, int servicio) {
        if (nombre.equals("Cajera")) {
        } else {
            System.out.println(""
                    + "\n" + nombre + ".... Servicios: " + servicio
            );
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

}
