/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Engine;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;

/**
 *
 * @author anjana
 */
public class Timer {

    static int miliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;

    static boolean state = true;

    public void start(JLabel SecondLabel, JLabel MinuteLabel) {
        state = true;
        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1);
                            if (miliseconds > 650) {
                                miliseconds = 0;
                                seconds++;

                            }

                            if (seconds > 59) {
                                miliseconds = 0;
                                seconds = 0;
                                minutes++;

                            }
                            if (minutes > 59) {
                                miliseconds = 0;
                                seconds = 0;
                                minutes++;

                            }

                            miliseconds++;
                            SecondLabel.setText(": " + seconds + "s");
                            MinuteLabel.setText("" + minutes + "m");

                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }

            }
        };
        t.start();
    }

    public void stop() {
        state = false;
    }

    public void reset() {
        minutes = 0;
        seconds = 0;
        miliseconds = 0;
    }
    
    public int getSeconds(){
        return seconds;
        
    }
    public int getMinutes(){
        return minutes;
        
    }
}
