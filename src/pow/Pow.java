package pow;

import javax.swing.JOptionPane;

public class Pow 
{    int i=0;
    double pow(double r,double p)
    {  
       i++;
       if(p == 0)
           return 1;
       if(i<p)
        {   
            return(r*pow(r,p));
        }
       else
           return r;
       
    }
    
    public static void main(String[] args) 
    {
        Pow s=new Pow();
        double r=Double.parseDouble(JOptionPane.showInputDialog("donner un entier"));
        double p=Double.parseDouble(JOptionPane.showInputDialog("donner la puissence"));
        JOptionPane.showMessageDialog(null,r+" a la puissence "+p+"est egale "+s.pow(r,p));
        
        
        
    }
    
}
