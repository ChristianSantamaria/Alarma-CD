package RelojAlarma;

import javax.swing.JOptionPane;

public class Botonera {

    public static boolean alarmaActiva = false;
    public static boolean setHora;
    public static boolean setAlarma;

    /**
     * Este metodo enciende o apaga la alarma y te envia un mensaje con la modificacion actual
     */
    public static void AlarmaOnOff() {

        if (alarmaActiva == true) {
            alarmaActiva = false;
            JOptionPane.showMessageDialog(null, "La alarma esta desactivada");
        } else {
            alarmaActiva = true;
            JOptionPane.showMessageDialog(null, "La alarma esta activada");
        }

    }
    
    /**
     * Este metodo sirve para añadirle 1 a la hora actual o a la alarma segun el setHora
     */
    public static void plusHr() {
        if (setHora == true) 
            Reloj.horaAlarma = Reloj.horaAlarma.plusHours(1);
        else 
            Reloj.horaActual = Reloj.horaActual.plusHours(1);
        

    }
    
    /**
     * Este metodo sirve para añadirle 1 a los minutos actuales o a la alarma segun el setHora
     */
    public static void plusMin() {
        if (setHora == true) 
            Reloj.horaAlarma = Reloj.horaAlarma.plusMinutes(1);
        else 
            Reloj.horaActual = Reloj.horaActual.plusMinutes(1);

    }

    
    /**
     * Aqui se configuran los led adecuadamente para que reciba hora 
     * Y tenemos otro menu con el que podremos modificar la hora actual
     */
    public static void configHr() {
        Display.showLeds(true, false, true);
        Boolean quedarse = true;

        do {
            int sw1 = Integer.parseInt(JOptionPane.showInputDialog("Que quiere configurar de la hora: "
                    + "1. Sumar 1 a la hora "
                    + "2. Sumar 1 a los minutos"
                    + "3. Salir"));
            switch (sw1) {
                case 1:
                    Botonera.plusHr();
                    break;
                case 2:
                    Botonera.plusMin();
                    break;
                case 3:
                    quedarse = false;
                    break;
            }
        } while (quedarse);

    }
    
    /**
     * Aqui se configuran los led adecuadamente para que reciba hora 
     * Y tenemos otro menu con el que podremos modificar la hora de la alarma
     */
    public static void configAlarm() {
        Display.showLeds(false, true, true);

        Boolean quedarse = true;

        do {
            int sw1 = Integer.parseInt(JOptionPane.showInputDialog("Que quiere configurar de la alarma: "
                    + "1. Sumar 1 a la hora "
                    + "2. Sumar 1 a los minutos"
                    + "3. Salir"));
            switch (sw1) {
                case 1:
                    Botonera.plusHr();
                    break;
                case 2:
                    Botonera.plusMin();
                    break;
                case 3:
                    quedarse = false;
                    break;
            }
        } while (quedarse);

    }

}
