import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Smileyfaces{
    static SmileButton[] buttons = new SmileButton[5];
           
    //Make main frame and panel
    static JFrame frame = new JFrame("Choose a direction");
    static JPanel mainPanel = new JPanel();

    public static void main(String[] args) {
        //Set Look and Feel
        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e){
            System.exit(1);
        }

        makeGUI();

        makeVisible();

    }
    
    //Define SmileButton
    static class SmileButton extends JButton{
        SmileButton(){
            this.addActionListener(new Face());
        }

        private void updateMe(){
            this.setText(":D");
        }

        private void updateOthers(){
            for (SmileButton button : buttons){
                if (button != this){
                    button.setText(":@");
                }
            }
        }


        //Define actionLisenter
        class Face implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent e){
                updateMe();
                updateOthers();
            }
        }
    }



    public static void makeGUI(){

        frame.add(mainPanel);

        //Make layout
        BorderLayout layout = new BorderLayout();
        mainPanel.setLayout(layout);
        
       

        //Initialize arrays to make buttons

        String[] locations = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.CENTER,BorderLayout.WEST,BorderLayout.EAST};

        //Set Font
        Font font = new Font("Times New Roman", Font.BOLD ,18);

        //Make Buttons
        for (int i = 0; i<5; i++){
            SmileButton button = new SmileButton();
            buttons[i] = button;
            button.setPreferredSize(new Dimension(150,50));
            mainPanel.add(button, locations[i]);
            button.setFont(font);
        }
    }
        

    public static void makeVisible(){
        //Initialize GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //frame.setPreferredSize(new Dimension(400,400));
        frame.pack();
        frame.setVisible(true);
    }
}