
package cola;

import Vista.*;
import java.util.Scanner;


public class Main {

    public static void main(String arg[]) {

        Cola cola = new Cola();
        Vista vista = new Vista(cola);
        vista.setVisible(true);
    }
}
