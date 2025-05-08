import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class View{
    private Control control;
    private JFrame frame = new JFrame("Counter");
    private JPanel panel = new JPanel(new BorderLayout());
    private JLabel label = new JLabel("0");
    private JButton button = new JButton("Count");

    View(Control control){
        this.control = control;

        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e){
            System.err.println("Look and feel could not be set");
            System.exit(1);
        }


        label.setHorizontalAlignment(JLabel.CENTER);

        
        panel.add(label, BorderLayout.NORTH);
        panel.add(button, BorderLayout.CENTER);
        frame.add(panel);

        button.addActionListener(new clickCounter());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(150,100));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class clickCounter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            control.countUp();
        }
    }

    public void updateCount(String newCount){
        label.setText(newCount);
    }

}