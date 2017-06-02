package RelojAlarma;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Reloj {

    public static LocalTime horaActual;
    public static LocalTime horaAlarma = LocalTime.of(14, 00);

    /**
     * Aqui esta el main con el timer que lo recorrera a lo largo del tiempo
     * Y un menu con un Switch para seleccionar la opcion que desee el usuario
     * @param args 
     */
    public static void main(String[] args) {
        Boolean quedarse = true;

        Timer timer;
        timer = new Timer();
        
        horaActual = LocalTime.now();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (horaAlarma.getMinute() == LocalTime.now().getMinute()) {
                    Altavoz.playSound();
                } else {
                    System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond());
                }
            }
        };
        timer.schedule(task, 10, 10000);
        do {
            int sw1 = Integer.parseInt(JOptionPane.showInputDialog("Elija la opcion que desee \n 1) Ver Hora \n 2) Configurar Hora \n 3) Configurar Alarma \n 4) ON-OFF Alarma \n 5) Salir "));
            switch (sw1) {
                case 1:
                    Display.showHora();
                    break;
                case 2:
                    Botonera.configHr();
                    
                    break;
                case 3:
                    Botonera.configAlarm();
                    break;
                case 4:
                    Botonera.AlarmaOnOff();
                    break;
                case 5:
                    quedarse = false;
                    break;
            }

        }  while(quedarse);
        timer.cancel();
    }
}
