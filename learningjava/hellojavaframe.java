import javax.swing.*;

public class hellojavaframe {
  public static void main(String [] args) {
    JFrame frame = new JFrame("Hello, JFrame!" );
    JLabel label = new JLabel("Hello, JLabel!", JLabel.CENTER );
    frame.add(label);
    frame.setSize( 300, 300 );
    frame.setVisible( true );
  }
} 
