/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularcalcario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Marilane
 */
public class CalcularCalcario extends JFrame {
  
    private Double NCTonHac, V2, V1, T, f;
    private String hac;
    
    public CalcularCalcario(){
        super("Formula para CAlcular CAlcario");
    
    JFrame frame = new JFrame();
    JPanel painel = new JPanel();
   
    JButton botao = new JButton("Calcular");
    
    JLabel labelvalor = new JLabel();
    labelvalor.setForeground(Color.red);
    
        JTextField texto1 = new JTextField(" ", 4);
        JTextField texto2 = new JTextField(" ", 4);
        JTextField texto3 = new JTextField(" ", 4);
        JTextField texto4 = new JTextField(" ", 4);
        JTextField texto5 = new JTextField(" ", 4);
        JTextField texto6 = new JTextField(" ", 4);
        JTextField texto7 = new JTextField(" ", 4);
        JTextField texto8 = new JTextField(" ", 4);
        JTextField texto9 = new JTextField(" ", 4);
        JTextField texto10 = new JTextField(" ", 4);
        
            JLabel label1 = new JLabel("CTC potencial - T(cmol/dm³):");
            JLabel label2 = new JLabel("Saturação por bases - V1(%):");
            JLabel label3 = new JLabel("Saturação por bases - V2(%):");
            JLabel label4 = new JLabel("Mg(cmol/dm³):");
            JLabel label5 = new JLabel("Ca(cmol/dm³):");
            JLabel label6 = new JLabel("Al(cmol/dm³):");
            JLabel label7 = new JLabel("Argila(dag/kg):");
            JLabel label8 = new JLabel("Área(ha):");
            JLabel label9 = new JLabel("PRNT(%):");
            JLabel label10 = new JLabel("SB(cmol/dm³):");
            
            
                texto1.setDocument(new TamanhoFixoJTextField(5));
                    texto1.setDocument(new SoNumerosJTextField());
                
                texto2.setDocument(new TamanhoFixoJTextField(5));
                    texto2.setDocument(new SoNumerosJTextField());
                
                texto3.setDocument(new TamanhoFixoJTextField(5));
                    texto3.setDocument(new SoNumerosJTextField());
                
                texto4.setDocument(new TamanhoFixoJTextField(5));
                    texto4.setDocument(new SoNumerosJTextField());
                    
                texto5.setDocument(new TamanhoFixoJTextField(5));
                    texto5.setDocument(new SoNumerosJTextField());
                    
                texto6.setDocument(new TamanhoFixoJTextField(5));
                    texto6.setDocument(new SoNumerosJTextField());
                    
                texto7.setDocument(new TamanhoFixoJTextField(5));
                    texto7.setDocument(new SoNumerosJTextField());
                    
                texto8.setDocument(new TamanhoFixoJTextField(5));
                    texto8.setDocument(new SoNumerosJTextField());
                    
                texto9.setDocument(new TamanhoFixoJTextField(5));
                    texto9.setDocument(new SoNumerosJTextField());
                    
                texto10.setDocument(new TamanhoFixoJTextField(5));
                    texto10.setDocument(new SoNumerosJTextField());
       
        
                painel.add(labelvalor);
        painel.add(label1);
        painel.add(texto1);
         painel.add(label2);
         painel.add(texto2);
            painel.add(label3);
             painel.add(texto3);
                painel.add(label4);
                painel.add(texto4);
                    painel.add(label5);
                    painel.add(texto5);
                        painel.add(label6);
                        painel.add(texto6);
                            painel.add(label7);
                            painel.add(texto7);
                                painel.add(label8);
                                painel.add(texto8);
                                    painel.add(label9);
                                    painel.add(texto9);
                                        painel.add(label10);
                                        painel.add(texto10);
                                            painel.add(labelvalor);
        
                                        
        
        painel.add(botao);
        
        painel.setSize(300, 100);
        
        frame.add(painel);
        frame.setVisible(true);
        frame.setSize(300, 400);
        frame.setLocation(450, 100);
        
        botao.addActionListener(
        
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evento) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                // V1 - Ã© valor encontrado na anÃ¡lise (saturacao por bases)
                V1 = Double.parseDouble(String.valueOf(texto2.getText()));
                
                // V2 - Ã© o valor que queremos elevar (saturacao por bases)
                V2 = Double.parseDouble(String.valueOf(texto3.getText()));
                
                //T = capacidade de troca de cations a pH 7,0
                T = Double.parseDouble(String.valueOf(texto1.getText()));
                
                //f - fator de correÃ§Ã£o do PRNT do calcario a ser utilizado. 
                f = 100/(Double.parseDouble(String.valueOf(texto9.getText())));
                
                // Area(hactare - ha)
                hac = String.valueOf(texto8.getText());
                
                //formula para calculo da necessidade de calagem 
                NCTonHac = (V2 - V1) * T * (f / 100);
                
                //JOptionPane.showMessageDialog(null, "Necessidade de calagem(Ton/ha):" + NCTonHac + "Hectare:"+ hac , "Calculo", JOptionPane.PLAIN_MESSAGE);
                        
               labelvalor.setText(String.valueOf(NCTonHac));
            }
           }
        
        );
        
      }  
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        CalcularCalcario calcular = new CalcularCalcario();
        
        calcular.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    
}

