
package boletin21_2;

import javax.swing.JOptionPane;

public class Boletin21_2 {

    public static void main(String[] args) {
      Venta obx=new Venta();
        int op;
        boolean creado = false;
        do {
            op = Venta.menu();
            switch (op) {
                case 1:
                    obx.abreVentas();
                    creado = true;
                    break;
                case 2:
                    if (creado) {
                        do{
                           obx.pechaVentas();
                     }while(obx.getWindow().isEmpty()==false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduce elementos para imprimir", "ERROR!!", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    if (op == 3 && op == 0) {
                        System.exit(0);
                    }
            }
        } while (op != 3 && op != 0);
    }
    }
    

