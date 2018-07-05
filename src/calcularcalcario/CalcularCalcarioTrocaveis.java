
package calcularcalcario;

import java.awt.Container;
import java.awt.Dimension;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;


public class CalcularCalcarioTrocaveis extends JFrame{

    public CalcularCalcarioTrocaveis() throws ParseException  {
    super("Calculo para Teores de Al e (Ca+Mg) trocáveis");
       
    
    JPanel pinel = new JPanel();
        
        SpringLayout spriglayout = new SpringLayout();
        pinel.setLayout(spriglayout);
        
        Container conter = getContentPane();
         
        
             JLabel valorK = new JLabel("Valor de K:");
             pinel.add(valorK);
             
            MaskFormatter mascaratexto1 = new MaskFormatter("##.##");
            JFormattedTextField textovalor1 = new JFormattedTextField(mascaratexto1);
            textovalor1.setPreferredSize(new Dimension(40, 20)); // new Dimension(largura, altura);
            pinel.add(textovalor1);
            
        spriglayout.putConstraint(SpringLayout.WEST, valorK, 10, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, valorK, 10, SpringLayout.NORTH, pinel);
          
            spriglayout.putConstraint(SpringLayout.WEST, textovalor1, 80, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, textovalor1, 10, SpringLayout.NORTH, pinel);
            
            
        conter.add(pinel);
      
    }

    
}
   

 
    
    

