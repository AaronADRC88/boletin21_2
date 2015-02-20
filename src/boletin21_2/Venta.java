
package boletin21_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Venta {
    private String venta; 

ArrayList <String> window=new ArrayList();    
public Venta(String venta) {
        this.venta = venta;
        
    }

    public Venta() {
    }

    @Override
    public String toString() {
        return  "ventá=" + venta  ;
    }

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    

    public ArrayList<String> getWindow() {
        return window;
    }

    public void setWindow(ArrayList<String> window) {
        this.window = window;
    }

    public void abreVentas() {
        int confirm;
        do {
            String contido = JOptionPane.showInputDialog("introduce contido da venta");
            window.add(contido);
            confirm = JOptionPane.showConfirmDialog(null, "Abrir máis ventás?", "", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
        } while (confirm == 0);

    }

    public void pechaVentas() {
        for (int i =window.size()-1 ; i>=0; i--) {
            JOptionPane.showMessageDialog(null, "pechando " + window.remove(i));
       }
    }
    
    
    
    public static int menu() {
        int op = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"abre ventas", "pecha ventas", "sair"}, "sair");
        return op + 1;
    }
}
