import java.time.LocalTime;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Klokke{
    static boolean cont = true;
    public static void main(String[] args){
        //Set Look and Feel
        try{
            UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e){
            System.exit(1);
        }

        //Create frame and button
        JFrame frame = new JFrame("Clock");
        JPanel panel = new JPanel();
        JButton clock = new JButton(nå());  //shows time on startup
        frame.add(panel);
        panel.add(clock);

        //Define the ActionListener
        class ClockStopper implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent a){
                cont = false;
                System.exit(0);
            }
        }

        //Add actionlistener to button
        clock.addActionListener(new ClockStopper());

        //setup clockThread
        class ClockThread extends Thread{
            @Override
            public void run(){
                while(cont){
                    try{
                        sleep(500);
                        clock.setText(nå());
                    } catch (InterruptedException e){}
                }
            }
        }

        ClockThread clockThread = new ClockThread();
        clockThread.start();


        //Set final conditions
        frame.setPreferredSize(new Dimension(200,150));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static String nå(){
        LocalTime t = LocalTime.now();
        return String.format("%02d:%02d:%02d",
            t.getHour(), t.getMinute(), t.getSecond());
    }
}