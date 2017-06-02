package RelojAlarma;

import static RelojAlarma.Reloj.horaAlarma;
import javax.swing.JOptionPane;


public class Altavoz {

    public static boolean RingOn = true;
    
    /**
     * Aqui tenemos el sonido de la alarma el cual cuando tenga que sonar eviara este mensaje
     */
    public static void playSound(){
        JOptionPane.showMessageDialog(null, "ALARMA " + horaAlarma.getMinute() + ":" + horaAlarma.getSecond());
    }

}
