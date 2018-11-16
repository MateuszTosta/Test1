import java.awt.*;
import java.awt.event.*;
import java javax.swing.*;

class ButtonDemo implements ActionListener {
  JLabel jlab;
  ButtonDemo(){
    JFrame jfrm = new JFrame("Przyk³ad przyciski");
    jfrm.setLayout(new FlowLayuot());
    
    jfrm.setSize(300, 200);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton jbtnUp = new JButton("Góra");
    JButton jbnDown = new JButton("Dó³");
    
      jbtnUp.addActionListener(this);
      jbtnDown.addActionListener(this);
      
    jfrm.add(jbtnUp);
    jfrm.add(jbtnDown);
    
    jlab = new JLabel("Nacinij przycisk.");
    
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
  }
  
  public void ActionPreformed(ActionEvent ae) {
    if(ae.getActionComand().equals("Górra"))
      jlab.setText("Nasisn¹³es przycisk GÓRA");
    else
      jlab.setText("Nacisn¹³es przycisk DÓ£");
  }
  
  public static void main(String args []){
    SwingUtilities.invokeLater(new runnable(){
      public void run(){
        new ButtonDemo();
      }
    }
  }
}
