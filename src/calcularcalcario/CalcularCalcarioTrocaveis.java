
package calcularcalcario;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;


public class CalcularCalcarioTrocaveis extends JFrame{

    private Double Al, Ca, Mg, f, NCala  ;
    private Integer Y, X;
    
    
    public CalcularCalcarioTrocaveis() throws ParseException  {
    super("Calculo para Teores de Al e (Ca+Mg) trocáveis");
       
    
    JPanel pinel = new JPanel();
        
        SpringLayout spriglayout = new SpringLayout();
        pinel.setLayout(spriglayout);
        
        Container conter = getContentPane();
         
        
        
        
        JLabel valorNCala = new JLabel();
        valorNCala.setForeground(Color.red);
        pinel.add(valorNCala);
        
        spriglayout.putConstraint(SpringLayout.WEST, valorNCala, 100, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, valorNCala, 190, SpringLayout.NORTH, pinel);
        
        //---------------------------------------------------------------------------------------------- 
             JLabel valorAl = new JLabel("Al(cmol/dm³):");
             pinel.add(valorAl);
             
            MaskFormatter mascaratexto1 = new MaskFormatter("##.##");
            JFormattedTextField textovalor1 = new JFormattedTextField(mascaratexto1);
            textovalor1.setPreferredSize(new Dimension(40, 20)); // new Dimension(largura, altura);
            pinel.add(textovalor1);
            
        spriglayout.putConstraint(SpringLayout.WEST, valorAl, 10, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, valorAl, 10, SpringLayout.NORTH, pinel);
          
            spriglayout.putConstraint(SpringLayout.WEST, textovalor1, 150, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, textovalor1, 10, SpringLayout.NORTH, pinel);
        
        //----------------------------------------------------------------------------------------------      
             JLabel valorCa = new JLabel("Ca(cmol/dm³):");
             pinel.add(valorCa);
             
            MaskFormatter mascaratexto2 = new MaskFormatter("##.##");
            JFormattedTextField textovalor2 = new JFormattedTextField(mascaratexto2);
            textovalor2.setPreferredSize(new Dimension(40, 20)); // new Dimension(largura, altura);
            pinel.add(textovalor2);
            
        spriglayout.putConstraint(SpringLayout.WEST, valorCa, 10, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, valorCa, 40, SpringLayout.NORTH, pinel);
          
            spriglayout.putConstraint(SpringLayout.WEST, textovalor2, 150, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, textovalor2, 40, SpringLayout.NORTH, pinel);
             
        //----------------------------------------------------------------------------------------------      
             JLabel valorMg = new JLabel("Mg(cmol/dm³):");
             pinel.add(valorMg);
             
            MaskFormatter mascaratexto3 = new MaskFormatter("##.##");
            JFormattedTextField textovalor3 = new JFormattedTextField(mascaratexto3);
            textovalor3.setPreferredSize(new Dimension(40, 20)); // new Dimension(largura, altura);
            pinel.add(textovalor3);
            
        spriglayout.putConstraint(SpringLayout.WEST, valorMg, 10, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, valorMg, 70, SpringLayout.NORTH, pinel);
          
            spriglayout.putConstraint(SpringLayout.WEST, textovalor3, 150, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, textovalor3, 70, SpringLayout.NORTH, pinel);
             
        //----------------------------------------------------------------------------------------------
            // Y - teor de argila
             JLabel valorTeorArgila = new JLabel("Teor de argila no solo:");
             pinel.add(valorTeorArgila);
             
            MaskFormatter mascaratexto4 = new MaskFormatter("#");
            JFormattedTextField textovalor4 = new JFormattedTextField(mascaratexto4);
            textovalor4.setPreferredSize(new Dimension(40, 20)); // new Dimension(largura, altura);
            pinel.add(textovalor4);
            
        spriglayout.putConstraint(SpringLayout.WEST, valorTeorArgila, 10, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, valorTeorArgila, 100, SpringLayout.NORTH, pinel);
          
            spriglayout.putConstraint(SpringLayout.WEST, textovalor4, 150, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, textovalor4, 100, SpringLayout.NORTH, pinel);
             
       //---------------------------------------------------------------------------------------------- 
             // X - valor em funcao da cultura
             JLabel valorCultura = new JLabel("Cultura:");
             pinel.add(valorCultura);
             
            MaskFormatter mascaratexto5 = new MaskFormatter("#");
            JFormattedTextField textovalor5 = new JFormattedTextField(mascaratexto5);
            textovalor5.setPreferredSize(new Dimension(40, 20)); // new Dimension(largura, altura);
            pinel.add(textovalor5);
            
        spriglayout.putConstraint(SpringLayout.WEST, valorCultura, 10, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, valorCultura, 130, SpringLayout.NORTH, pinel);
          
            spriglayout.putConstraint(SpringLayout.WEST, textovalor5, 150, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, textovalor5, 130, SpringLayout.NORTH, pinel);
             
        
        //----------------------------------------------------------------------------------------------      
             JLabel fatorf = new JLabel("Fator de correção - f:");
             pinel.add(fatorf);
             
            MaskFormatter mascaratexto6 = new MaskFormatter("##.##");
            JFormattedTextField textovalor6 = new JFormattedTextField(mascaratexto6);
            textovalor6.setPreferredSize(new Dimension(40, 20)); // new Dimension(largura, altura);
            pinel.add(textovalor6);
            
        spriglayout.putConstraint(SpringLayout.WEST, fatorf, 10, SpringLayout.WEST, pinel);
         spriglayout.putConstraint(SpringLayout.NORTH, fatorf, 160, SpringLayout.NORTH, pinel);
          
            spriglayout.putConstraint(SpringLayout.WEST, textovalor6, 150, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, textovalor6, 160, SpringLayout.NORTH, pinel);
        
        //----------------------------------------------------------------------------------------------
             JButton botaoCalcular = new JButton("Calcular");
             pinel.add(botaoCalcular);
             spriglayout.putConstraint(SpringLayout.WEST, botaoCalcular, 10, SpringLayout.WEST, pinel);
             spriglayout.putConstraint(SpringLayout.NORTH, botaoCalcular, 190, SpringLayout.NORTH, pinel);
             
             botaoCalcular.addActionListener(
                            
                        new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent evento) {
            
            try{
            
                Al = Double.parseDouble(textovalor1.getText());
                Ca = Double.parseDouble(textovalor2.getText());
                Mg = Double.parseDouble(textovalor3.getText());
                Y = Integer.parseInt(textovalor4.getText());
                if(Y <1 || Y>3){
                    
                    JOptionPane.showMessageDialog(null, "VALOR INCORRETO PARA O TEOR DE ARGILA (DIGITE "
                            + "1, 2 ou 3)", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
                }
                X = Integer.parseInt(textovalor5.getText());
                
                 if(X <1 || X>3){
                    
                    JOptionPane.showMessageDialog(null, "VALOR INCORRETO PARA O TIPO DE CULTURA (DIGITE "
                            + "1, 2 ou 3)", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
                }
                 
                 f = 100/Double.parseDouble(textovalor6.getText());
                 
            
        }catch(Exception e){
            
         JOptionPane.showMessageDialog(null,"Algum campo não foi preechido!", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);

                    
            }
            
            
            try{
                
                NCala  = (Y * Al) + (X - (Ca+Mg)) * f;
                BigDecimal resultNCala = new BigDecimal(NCala).setScale(3, RoundingMode.HALF_EVEN);
                valorNCala.setText(String.valueOf(resultNCala));
                
            }catch(Exception e){
                
                valorNCala.setText("CAMPO VAZIO!");
                
            }
            
        }
    }
             
             
             
             );
             
            
            
        conter.add(pinel);
      
    }

    
}
   

 
    
    

