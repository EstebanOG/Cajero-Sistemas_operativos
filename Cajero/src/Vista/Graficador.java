
package Vista;

import cola.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class Graficador extends Canvas {

    int x = 0;
    int y = 20;

    Cola cola;

    public Graficador(Cola cola) {
        this.cola = cola;
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        dibujar(g, 0, x, y, cola.getRaiz());
    }

    void limpiar(Graphics g) {
        g.setColor(this.getBackground());
        g.clearRect(0, 0, 1000, 1000);
    }

    public void dibujar(Graphics g, int i, int X, int Y, Nodo aux) {
        if(aux!=null){
            //separacion por niveles en canvas
        if (i == 4) {
            X = X + 300;
            Y = 20;
        } else if (i % 4 == 0 && i != 0 && i != 4) {
            X = X + 200;
            Y = 20;
        } else {
        }
        
        //letra estadisticas
        g.setColor(Color.black);
        g.drawString(aux.getNombre(), X + 120, Y + 5);
        //servicios
        if(aux.getNombre().equals("Cajera")){
        
        }else{
        g.setColor(Color.red);
        g.drawString("Recibos: "+Integer.toString(aux.getRecibos()), X + 120, Y + 20);}
        
        //datos
        Image image = new ImageIcon(getClass().getResource(aux.getRutaImg())).getImage();
        g.drawImage(image, X + 200, Y, this);
        if (aux.getSig() != cola.getRaiz()) {
            dibujar(g, (i + 1), X , Y + 100, aux.getSig());

        } else {
        }
        }
        

    }

}
