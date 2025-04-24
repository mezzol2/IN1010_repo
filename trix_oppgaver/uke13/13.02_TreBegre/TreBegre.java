import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

class TreBegre{
    private static boolean finished = false;
    public static void main(String[] args) {

        //Set Look and Feel
        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e){
            System.exit(1);
        }

        //Make JFrame
        JFrame frame = new JFrame("Three Cups");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add a panel
        JPanel panel = new JPanel();
        frame.add(panel);

        //Define the CupChooser class
        class CupChooser implements ActionListener{
            @Override
            public void actionPerformed (ActionEvent e){ 
                if (!finished){
                    Random random = new Random();
                    int randInt = random.nextInt(3);
                    
                    //Get the source of the action
                    JButton cup = (JButton) e.getSource();

                    if (randInt == 0){
                        cup.setText("OK");
                    } else {
                        cup.setText("X");
                    }

                    finished = true;
                }
            }
        }

        //Add 3 Buttons
        for (int i = 1; i<=3; i++){
            JButton cup = new JButton("Cup "+i);
            cup.addActionListener(new CupChooser());
            panel.add(cup);
        }

        //GUI setup
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }  
}