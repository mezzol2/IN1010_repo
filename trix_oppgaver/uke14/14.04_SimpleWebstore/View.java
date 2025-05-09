import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class View{
    private Control control;
    private JFrame frame = new JFrame("Web Store");
    private JPanel mainPanel = new JPanel(new BorderLayout());
    private JPanel labelPanel = new JPanel(new BorderLayout());
    private JPanel buttonPanel = new JPanel(new GridLayout(2,2));
    private JLabel numProducts = new JLabel("Products in your cart: 0");
    private JLabel productName = new JLabel();
    private JLabel productPrice = new JLabel();
    private JButton previous = new JButton("Previous");
    private JButton next = new JButton("Next");
    private JButton buy = new JButton("Buy");
    private JButton pay = new JButton("Pay");

    View(Control control){
        this.control = control;
        setLookAndFeel();
        frame.add(mainPanel);
        mainPanel.add(labelPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        labelPanel.add(numProducts, BorderLayout.NORTH);
        labelPanel.add(productName, BorderLayout.CENTER);
        labelPanel.add(productPrice, BorderLayout.SOUTH);
        buttonPanel.add(previous);
        buttonPanel.add(next);
        buttonPanel.add(buy);
        buttonPanel.add(pay);

        next.addActionListener(new NextAction());
        previous.addActionListener(new PreviousAction());
        buy.addActionListener(new BuyAction());
        pay.addActionListener(new PayAction());

    }

    public void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e){
            System.out.println("Could not get Look and Feel");
            System.exit(1);
        }
    }

    public void packAndMakeVisible(){
        numProducts.setHorizontalAlignment(JLabel.CENTER);
        productName.setHorizontalAlignment(JLabel.CENTER);
        productPrice.setHorizontalAlignment(JLabel.CENTER);
        numProducts.setVerticalAlignment(JLabel.CENTER);
        productName.setVerticalAlignment(JLabel.CENTER);
        productPrice.setVerticalAlignment(JLabel.CENTER);
        Dimension buttonSize = new Dimension(150,50);
        next.setPreferredSize(buttonSize);
        previous.setPreferredSize(buttonSize);
        buy.setPreferredSize(buttonSize);
        pay.setPreferredSize(buttonSize);
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void setProduct(String product, int price){
        productName.setText(product);
        productPrice.setText(Integer.toString(price)+" kr");
    }

    class NextAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a){
            control.nextProduct();
        }
    }

    class PreviousAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a){
            control.previousProduct();
        }
    }

    class BuyAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a){
            control.buyProduct();
        }
    }

    class PayAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a){
            control.pay();
        }
    }

    public void updateCart(int n){
        numProducts.setText("Products in your cart: "+Integer.toString(n));
    }
}