/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularcalcario;

import java.awt.Color;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class CalcularCalcario extends JFrame {
  
    private Double NCTonHac, V2, V1, T, f, hac, totalcalcario;

    public CalcularCalcario() throws ParseException{
        super();
        
        Container painel = getContentPane();
             setLayout(null);

          
   //---- Menu------     
    
    //barra do menu
    JMenuBar menuBar = new JMenuBar();
    //novo Menu
    JMenu menuFile = new JMenu("Métodos"); 
    //item do menu
    JMenuItem menuItem1 = new JMenuItem("Saturação Por Base");
        menuItem1.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                        
                SaturacaoBases saturabases = new SaturacaoBases();
                
                JOptionPane.showMessageDialog(null,saturabases.saturarBases(), "Saturação por Bases", JOptionPane.INFORMATION_MESSAGE);
                
            }
    });
   JMenuItem menuItem2 = new JMenuItem("Teores de Al e (Ca+Mg) trocáveis");
        menuItem2.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
           
                TeoresTrocaveis teorestro = new TeoresTrocaveis();
                
                JOptionPane.showMessageDialog(null,teorestro.trocarTeores(), "Teores de Al e (Ca+Mg) trocáveis", JOptionPane.INFORMATION_MESSAGE);
                
            }
    });
    JMenuItem menuItem3 = new JMenuItem("Calculo para Teores de Al e (Ca+Mg) trocáveis");
        menuItem3.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
           
               CalcularCalcarioTrocaveis trocar = null;
                try {
                    trocar = new CalcularCalcarioTrocaveis();
                    trocar.setVisible(true);
                      trocar.setSize(600, 450);
                      
                } catch (ParseException ex) {
                    Logger.getLogger(CalcularCalcario.class.getName()).log(Level.SEVERE, null, ex);
                }
               
               
               
            }   
    });
        menuFile.add(menuItem3);
    menuFile.add(menuItem1);
    menuFile.add(menuItem2);
    menuBar.add(menuFile);
    super.setJMenuBar(menuBar);
    //------------------------------
   
    JButton botao = new JButton("Calcular");
        botao.setBounds(20,380,200,30);
    
    //label com resposta vermelha para o resultado final
    JLabel labelvalor = new JLabel();
        labelvalor.setForeground(Color.red);
        labelvalor.setBounds(500,40,200,20);
        
                JLabel labelhectare = new JLabel();
                    labelhectare.setForeground(Color.red);
                    labelhectare.setBounds(500,70,200,20);
    
    //------------------------------------------------------------------------
        
        //mascara
        MaskFormatter mascaratexto1 = new MaskFormatter("##.##");
        JFormattedTextField texto1 = new JFormattedTextField(mascaratexto1);
            // setBounds(eixo X, eixo Y, comprimento, largura);
            texto1.setBounds(200,40,40,20);
        
        MaskFormatter mascaratexto2 = new MaskFormatter("##.##");
        JFormattedTextField texto2 = new JFormattedTextField(mascaratexto2);
            texto2.setBounds(200,70,40,20);
        
        MaskFormatter mascaratexto3 = new MaskFormatter("##.##");
        JFormattedTextField texto3 = new JFormattedTextField(mascaratexto3);
            texto3.setBounds(200,100,40,20);
        
        MaskFormatter mascaratexto4 = new MaskFormatter("##.##");
        JFormattedTextField texto4 = new JFormattedTextField(mascaratexto4);
            texto4.setBounds(200,130,40,20);
        
        MaskFormatter mascaratexto5 = new MaskFormatter("##.##");
        JFormattedTextField texto5 = new JFormattedTextField(mascaratexto5);
            texto5.setBounds(200,160,40,20);
        
        MaskFormatter mascaratexto6 = new MaskFormatter("##.##");
        JFormattedTextField texto6 = new JFormattedTextField(mascaratexto6);
            texto6.setBounds(200,190,40,20);
        
        MaskFormatter mascaratexto7 = new MaskFormatter("##.##");
        JFormattedTextField texto7 = new JFormattedTextField(mascaratexto7);
            texto7.setBounds(200,220,40,20);
        
        MaskFormatter mascaratexto8 = new MaskFormatter("##.##");
        JFormattedTextField texto8 = new JFormattedTextField(mascaratexto8);
            texto8.setBounds(200,250,40,20);
        
        MaskFormatter mascaratexto9 = new MaskFormatter("##.##");
        JFormattedTextField texto9 = new JFormattedTextField(mascaratexto9);
            texto9.setBounds(200,280,40,20);
        
        MaskFormatter mascaratexto10 = new MaskFormatter("##.##");
        JFormattedTextField texto10 = new JFormattedTextField(mascaratexto10);
            texto10.setBounds(200,310,40,20);
        
      //------------------------------------------------------------------------  
        
            JLabel label1 = new JLabel("CTC potencial - T(cmol/dm³):");
                label1.setBounds(20,40,200,20);
            JLabel label2 = new JLabel("Saturação por bases - V1(%):");
                label2.setBounds(20,70,200,20);
            JLabel label3 = new JLabel("Saturação por bases - V2(%):");
                label3.setBounds(20,100,200,20);
            JLabel label4 = new JLabel("Mg(cmol/dm³):");
                label4.setBounds(20,130,200,20);
            JLabel label5 = new JLabel("Ca(cmol/dm³):");
                label5.setBounds(20,160,200,20);
            JLabel label6 = new JLabel("Al(cmol/dm³):");
                label6.setBounds(20,190,200,20);
            JLabel label7 = new JLabel("Argila(dag/kg):");
                label7.setBounds(20,220,200,20);
            JLabel label8 = new JLabel("Área(ha):");
                label8.setBounds(20,250,200,20);
            JLabel label9 = new JLabel("PRNT(%):");
                label9.setBounds(20,285,200,20);
            JLabel label10 = new JLabel("SB(cmol/dm³):");
                label10.setBounds(20,315,200,20);
            JLabel label11 = new JLabel("Necessidade de Calagem (ton/ha):");
                label11.setBounds(300,40,200,20);
            JLabel label12 = new JLabel("Total de Calcário (ton):");
                label12.setBounds(300,70,200,20);
                
        //------------------------------------------------------------------------     
                
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
                                            
                                            painel.add(label11);
                                            painel.add(label12);
                                            
                                            painel.add(labelvalor);
                                            painel.add(labelhectare);
                                            
                                                painel.add(botao);
                                        
     //------------------------------------------------------------------------                                          
        setTitle("Fórmula para Calcular Calcário");                                  
        setSize(665, 480);
        setVisible(true);
        setLocation(450, 100);
     //------------------------------------------------------------------------    
          
        botao.addActionListener(
        
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evento) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
                try {
                    
                // V1 - Ã© valor encontrado na anÃ¡lise (saturacao por bases)
                V1 = Double.parseDouble(texto2.getText());
                
                // V2 - Ã© o valor que queremos elevar (saturacao por bases)
                V2 = Double.parseDouble(texto3.getText());
                
                        //T = capacidade de troca de cations a pH 7,0 NumberFormatException
                T = Double.parseDouble(texto1.getText());
                
                //f - fator de correÃ§Ã£o do PRNT do calcario a ser utilizado. 
                f = 100/Double.parseDouble(texto9.getText());
                
                
                // Area(hactare - ha)
                hac = Double.parseDouble(texto8.getText());
                
                
                } catch (Exception e) {
                    
                     //labelvalor.setText("REPITA!");
                    JOptionPane.showMessageDialog(null,"Algum campo não foi preechido!", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
                }
           
                
                try {
                    
                    //formula para calculo da necessidade de calagem 
                NCTonHac = (V2 - V1) * T * (f / 100);
                    BigDecimal resultNC = new BigDecimal(NCTonHac).setScale(3, RoundingMode.HALF_EVEN);  
                labelvalor.setText(String.valueOf(resultNC));
                
                totalcalcario = NCTonHac * hac;
                
                    BigDecimal resultTotHac = new BigDecimal(totalcalcario).setScale(3, RoundingMode.HALF_EVEN);
                labelhectare.setText(String.valueOf( resultTotHac));
                
                } catch (Exception e) {
                    
                    labelvalor.setText("CAMPO VAZIO AO LADO!");
                }
                
            }
           }
        
        );
        
      }  
    
    
    public static void main(String[] args) throws ParseException {
   
        CalcularCalcario calcular = new CalcularCalcario();
        calcular.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }

    
}

