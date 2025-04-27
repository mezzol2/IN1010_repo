import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PublishingGUI{
    public static void main(String[] args){
        
        //Set Look and Feel
        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e){ 
            System.exit(1);
        }
        
        //Make Frame and Main Panel
        JFrame frame = new JFrame("Publish Articles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
        frame.setPreferredSize(new Dimension(300,175));

        //Make panels and panelArray
        String[] articles = {"Nye tiltak for å bekjempe klimaendringene!",
            "Lokalvalget nærmer seg: Partiene på banen!",
            "Teknologigigantene slår seg sammen!"};


        //Make Publish Button
        JButton publishButton = new JButton("Publish");
        class Publisher implements ActionListener{
            int i = 0;
            
            @Override
            public void actionPerformed (ActionEvent e){
                if (i<3){
                    JLabel label = new JLabel(articles[i]);
                    JPanel panel = new JPanel();
                    panel.add(label);
                    mainPanel.add(panel);
                    mainPanel.revalidate();
                    mainPanel.repaint();
                    i++;
                    if (i == 3){
                        JButton button = (JButton) e.getSource();
                        button.setText("Exit");
                    }
                    return;
                }
                System.exit(0);
            }
        }

        publishButton.addActionListener(new Publisher());
        mainPanel.add(publishButton);


        //set final defaults
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}