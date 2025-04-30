import java.awt.*;
import javax.swing.*;


class GUI{
    private JFrame frame = new JFrame("Word Combiner");
    private JPanel panel = new JPanel();
    private JTextArea text = new JTextArea();

    
    public GUI(){
        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception E){
            System.err.println("Counld not set Look and Feel");
            System.exit(1);
        }
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.add(text);
 

        frame.setPreferredSize(new Dimension(300,150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void addWord(String word){
        text.append(word+" ");
        text.setCaretPosition(text.getDocument().getLength()-1);
    }
}