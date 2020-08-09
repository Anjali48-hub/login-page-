

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;


public class loginformvalidate extends JFrame 
{
    //JFrame fr;
    JPanel p;
    JLabel l1,l2,l3,l4;
    JTextField tx;
    JPasswordField pass;
    JComboBox cb;
    JRadioButton r1,r2;
    ButtonGroup grp;
    GridBagLayout gl;
    GridBagConstraints gbc;
    JButton b1,b2,b3;
    Pattern pat1,pat2;
    Matcher match1,match2;
    public loginformvalidate()
    {
      gl=new GridBagLayout();
      gbc=new GridBagConstraints();
      p=new JPanel();
      p.setLayout(gl);
      p.setBackground(Color.cyan);
        
        
      l1=new JLabel("Enter Login Name");
      gbc.anchor=GridBagConstraints.NORTHEAST;
      gbc.fill=GridBagConstraints.HORIZONTAL;
      gbc.gridx=10;//col
      gbc.gridy=10;//row
      gl.setConstraints(l1, gbc);
      p.add(l1);
      
      tx=new JTextField(20);
      gbc.gridx=11;//col
      gbc.gridy=10;//row
      gl.setConstraints(tx, gbc);
      p.add(tx);
        
       l2=new JLabel("Enter Password");
       gbc.gridx=10;//col
       gbc.gridy=11;//row
       gl.setConstraints(l2, gbc);
       p.add(l2);
      
       pass=new JPasswordField(20);
       gbc.gridx=11;//col
       gbc.gridy=11;//row
       gl.setConstraints(pass, gbc);
       p.add(pass);
        
        l3=new JLabel("Select City");
        gbc.gridx=10;//col
        gbc.gridy=12;//row
        gl.setConstraints(l3, gbc);
        p.add(l3);
      
        String [] city={"New Delhi","Pune","Haldwani","Nainital"};
        cb=new JComboBox(city);
        gbc.gridx=11;//col
        gbc.gridy=12;//row
        gl.setConstraints(cb, gbc);
        p.add(cb);
        
        
        l4=new JLabel("Specify Gender");
        gbc.gridx=10;//col
        gbc.gridy=13;//row
        gl.setConstraints(l4, gbc);
        p.add(l4);
      
        r1=new JRadioButton("MALE");
        r2=new JRadioButton("FEMALE");
        grp=new ButtonGroup();
        grp.add(r1); grp.add(r2);
        gbc.gridx=11;//col
        gbc.gridy=13;//row
        gl.setConstraints(r1, gbc);
        p.add(r1); 
        
        
        
        gbc.gridx=12;//col
        gbc.gridy=13;//row
        gl.setConstraints(r2, gbc);
        p.add(r2);
        
    
        
        b1=new JButton("LOGIN");
        gbc.gridx=10;//col
        gbc.gridy=14;//row
        gl.setConstraints(b1, gbc);
        p.add(b1); 
        b1.addActionListener(new Check());
        
        b2=new JButton("CANCEL");
        gbc.gridx=11;//col
        gbc.gridy=14;//row
        gl.setConstraints(b2, gbc);
        p.add(b2); 
        b2.addActionListener(new Check());
        
        
        b3=new JButton("QUIT");
        gbc.gridx=12;//col
        gbc.gridy=14;//row
        gl.setConstraints(b3, gbc);
        p.add(b3); 
        b3.addActionListener(new Check());
        add(p);
        setSize(400,400);
        setVisible(true);
    }
    class Check implements ActionListener
    {
         @Override
    public void actionPerformed(ActionEvent e)
    {
            //submit...
            if(e.getSource()==b1)
            {
                pat1=Pattern.compile("^[a-z]+[a-z.0-9-]+@[a-z.-]+(\\.[A-Za-z0-9]+)$");
                match1=pat1.matcher(tx.getText());
                boolean boo=match1.matches();
                if(boo==true)
                {
                    JOptionPane.showMessageDialog(null, "login id is correct");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "incorrect id");
                }
            }
            if(e.getSource()==b2)
            {
                tx.setText("");
                pass.setText("");
                
            }
            
            if(e.getSource()==b3)
            {
                int res=JOptionPane.showConfirmDialog(null, "Wish To Terminate");
                if(res==0)
                    System.exit(0);
            }
    }
        
    }
    public static void main(String[] args)
    {
          
      loginformvalidate sw=new loginformvalidate();
    }

   
}



