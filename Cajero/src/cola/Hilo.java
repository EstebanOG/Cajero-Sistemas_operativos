package cola;

import Vista.Vista;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge diaz
 */
public class Hilo extends Thread {

    Vista vista;

    public Hilo(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void run() {
        while (true) {
            if (vista.getjToggleButton1().isSelected()) {
                vista.atenderCliente();
            }

            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
