import java.awt.*;
import javax.swing.*;

class Main{
    public static void main(String[] args){
        //Set look and feel
        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e){
            System.exit(1);
        }
    

        //Setup frame layout
        JFrame frame = new JFrame("Look upon my grid and despair!");
        JPanel panel = new JPanel();
        frame.add(panel);

        JPanel rutenett = new JPanel(new GridLayout(3,3));
        for (int i = 1; i<=9; i++){
            JLabel label = new JLabel(Integer.toString(i));
            label.setPreferredSize(new Dimension(30,30));
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rutenett.add(label);
        }

        panel.add(rutenett);

        //Setup GUI variables
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200,200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}