import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Hilseknapp{
    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e){System.exit(1);}

        JFrame frame = new JFrame("Hello there!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String string = "";
        JPanel panel = new JPanel();
        frame.add(panel);
        JLabel label = new JLabel(string);
        panel.add(label);
        JButton button = new JButton("Click here");

        class StringShower implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                label.setText("Hey there :D");
            }
        }

        button.addActionListener(new StringShower());
        panel.add(button);

        frame.setPreferredSize(new Dimension(150, 100));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}