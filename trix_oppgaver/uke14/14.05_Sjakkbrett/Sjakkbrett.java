import java.awt.*;
import javax.swing.*;

class Sjakkbrett{
    private JFrame frame = new JFrame("Chessboard");
    private JPanel panel = new JPanel(new GridLayout(8,8));

    public Sjakkbrett(){
        setupGUI();
        makeVisible();
    }

    public void setupGUI(){
        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e){
            System.exit(1);
        }

        frame.add(panel);

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                JLabel square = new JLabel();
                square.setPreferredSize(new Dimension(50,50));
                if ((i+j)%2 == 0){
                    square.setBackground(Color.BLACK);
                    square.setOpaque(true);
                } else {
                    square.setBackground(Color.WHITE);
                    square.setOpaque(true);
                }
                panel.add(square);
            }
        }


    }

    public void makeVisible(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Sjakkbrett();
    }
}