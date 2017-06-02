package RelojAlarma;

import javax.swing.JOptionPane;


public class Display {

    static boolean ledClock;
    static boolean ledAlarm;
    static boolean ledSet;

    /**
     * Aqui podemos visualizar la hora normal o la de la alarma segun el ledAlarma
     */
    public static void showHora() { 
        if (Display.ledAlarm == true) {
            JOptionPane.showMessageDialog(null, Reloj.horaAlarma.getHour() + ":" + Reloj.horaAlarma.getMinute() + ":" + Reloj.horaAlarma.getSecond());
        } else {
            JOptionPane.showMessageDialog(null, Reloj.horaActual.getHour() + ":" + Reloj.horaActual.getMinute() + ":" + Reloj.horaActual.getSecond());
        }
    }

    public static void showLeds(boolean clock, boolean alarm, boolean set) {
        ledClock = clock;
        ledAlarm = alarm;
        ledSet = set;
    }

}
