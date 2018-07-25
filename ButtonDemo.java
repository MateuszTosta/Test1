import java.awt.*;
import java.awt.event.*;
import java javax.swing.*;

class ButtonDemo implements ActionListener {
  JLabel jlab;
  ButtonDemo(){
    JFrame jfrm = new JFrame("Przyk�ad przyciski");
    jfrm.setLayout(new FlowLayuot());
    
    jfrm.setSize(300, 200);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton jbtnUp = new JButton("G�ra");
    JButton jbnDown = new JButton("D�");
    
      jbtnUp.addActionListener(this);
      jbtnDown.addActionListener(this);
      
    jfrm.add(jbtnUp);
    jfrm.add(jbtnDown);
    
    jlab = new JLabel("Nacinij przycisk.");
    
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
  }
  
  public void ActionPreformed(ActionEvent ae) {
    if(ae.getActionComand().equals("G�rra"))
      jlab.setText("Nasisn��es przycisk G�RA");
    else
      jlab.setText("Nacisn��es przycisk Dӣ");
  }
  
  public static void main(String args []){
    SwingUtilities.invokeLater(new runnable(){
      public void run(){
        new ButtonDemo();
      }
    });
  }
}