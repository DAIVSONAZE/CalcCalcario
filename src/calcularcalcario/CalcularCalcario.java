
package calcularcalcario;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

public class CalcularCalcario extends JFrame {
  
    private Double NCTonHac, V2, V1, T, f, hac, totalcalcario;

    public CalcularCalcario() throws ParseException{
        super();
        
       // Container painel = getContentPane();
            // setLayout(null);

            JPanel painel = new JPanel();
            
            SpringLayout springlayout = new SpringLayout();
            painel.setLayout(springlayout);
            
            Container contain = getContentPane();
          
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
              
                ImageIcon imagebases = new ImageIcon("src\\calcularcalcario\\imagemFolder\\saturacaobase.JPG");
                JOptionPane.showMessageDialog(null,imagebases, "Saturação por Bases", JOptionPane.INFORMATION_MESSAGE);
                
            }
    });
   JMenuItem menuItem2 = new JMenuItem("Teores de Al e (Ca+Mg) trocáveis");
        menuItem2.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
           
                ImageIcon imagetrocaveis = new ImageIcon("src\\calcularcalcario\\imagemFolder\\teorestrocaveis.JPG");
                JOptionPane.showMessageDialog(null,imagetrocaveis, "Teores de Al e (Ca+Mg) trocáveis", JOptionPane.INFORMATION_MESSAGE);
                
            }
    });
    JMenuItem menuItem3 = new JMenuItem("Calculo para Teores de Al e (Ca+Mg) trocáveis");
        menuItem3.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
           
               
                try {
                   CalcularCalcarioTrocaveis trocar = new CalcularCalcarioTrocaveis();
                    trocar.setVisible(true);
                      trocar.setSize(600, 450);
                      
                } catch (ParseException ex) {
                    Logger.getLogger(CalcularCalcario.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }   
    });
        
    menuFile.add(menuItem1);
        menuFile.add(menuItem2);
            menuFile.add(menuItem3);
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
            texto1.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto1, 180, SpringLayout.WEST, painel);
            springlayout.putConstraint(SpringLayout.NORTH, texto1, 10, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto2 = new MaskFormatter("##.##");
        JFormattedTextField texto2 = new JFormattedTextField(mascaratexto2);
            texto2.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto2, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto2, 40, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto3 = new MaskFormatter("##.##");
        JFormattedTextField texto3 = new JFormattedTextField(mascaratexto3);
            texto3.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto3, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto3, 70, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto4 = new MaskFormatter("##.##");
        JFormattedTextField texto4 = new JFormattedTextField(mascaratexto4);
            texto4.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto4, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto4, 100, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto5 = new MaskFormatter("##.##");
        JFormattedTextField texto5 = new JFormattedTextField(mascaratexto5);
            texto5.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto5, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto5, 130, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto6 = new MaskFormatter("##.##");
        JFormattedTextField texto6 = new JFormattedTextField(mascaratexto6);
            texto6.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto6, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto6, 160, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto7 = new MaskFormatter("##.##");
        JFormattedTextField texto7 = new JFormattedTextField(mascaratexto7);
            texto7.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto7, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto7, 190, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto8 = new MaskFormatter("##.##");
        JFormattedTextField texto8 = new JFormattedTextField(mascaratexto8);
            texto8.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto8, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto8, 220, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto9 = new MaskFormatter("##.##");
        JFormattedTextField texto9 = new JFormattedTextField(mascaratexto9);
            texto9.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto9, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto9, 250, SpringLayout.NORTH, painel);
        
        MaskFormatter mascaratexto10 = new MaskFormatter("##.##");
        JFormattedTextField texto10 = new JFormattedTextField(mascaratexto10);
            texto10.setPreferredSize(new Dimension(40, 20));
            
            springlayout.putConstraint(SpringLayout.WEST, texto10, 180, SpringLayout.WEST, painel);
             springlayout.putConstraint(SpringLayout.NORTH, texto10, 280, SpringLayout.NORTH, painel);
        
      //------------------------------------------------------------------------  
        
            JLabel label1 = new JLabel("CTC potencial - T(cmol/dm³):");
                label1.setBounds(20,40,200,20);
             springlayout.putConstraint(SpringLayout.WEST, label1, 10, SpringLayout.WEST, painel);
            springlayout.putConstraint(SpringLayout.NORTH, label1, 10, SpringLayout.NORTH, painel);   
                
            JLabel label2 = new JLabel("Saturação por bases - V1(%):");
               
            JLabel label3 = new JLabel("Saturação por bases - V2(%):");
                
            JLabel label4 = new JLabel("Mg(cmol/dm³):");
                
            JLabel label5 = new JLabel("Ca(cmol/dm³):");
                
            JLabel label6 = new JLabel("Al(cmol/dm³):");
                
            JLabel label7 = new JLabel("Argila(dag/kg):");
                
            JLabel label8 = new JLabel("Área(ha):");
                
            JLabel label9 = new JLabel("PRNT(%):");
                
            JLabel label10 = new JLabel("SB(cmol/dm³):");
                
            JLabel label11 = new JLabel("Necessidade de Calagem (ton/ha):");
                
            JLabel label12 = new JLabel("Total de Calcário (ton):");
               
                
        //------------------------------------------------------------------------     
                
        painel.add(label1);
        springlayout.putConstraint(SpringLayout.WEST, label1, 10, SpringLayout.WEST, painel);
        springlayout.putConstraint(SpringLayout.NORTH, label1, 10, SpringLayout.NORTH, painel);
            painel.add(texto1);
        
         painel.add(label2);
         springlayout.putConstraint(SpringLayout.WEST, label2, 10, SpringLayout.WEST, painel);
         springlayout.putConstraint(SpringLayout.NORTH, label2, 40, SpringLayout.NORTH, painel);
            painel.add(texto2);
        
            painel.add(label3);
            springlayout.putConstraint(SpringLayout.WEST, label3, 10, SpringLayout.WEST, painel);
            springlayout.putConstraint(SpringLayout.NORTH, label3, 70, SpringLayout.NORTH, painel);
                painel.add(texto3);
             
                painel.add(label4);
                springlayout.putConstraint(SpringLayout.WEST, label4, 10, SpringLayout.WEST, painel);
                springlayout.putConstraint(SpringLayout.NORTH, label4, 100, SpringLayout.NORTH, painel);
                    painel.add(texto4);
                    
                    painel.add(label5);
                    springlayout.putConstraint(SpringLayout.WEST, label5, 10, SpringLayout.WEST, painel);
                    springlayout.putConstraint(SpringLayout.NORTH, label5, 130, SpringLayout.NORTH, painel);
                        painel.add(texto5);
                        
                        painel.add(label6);
                        springlayout.putConstraint(SpringLayout.WEST, label6, 10, SpringLayout.WEST, painel);
                        springlayout.putConstraint(SpringLayout.NORTH, label6, 160, SpringLayout.NORTH, painel);
                            painel.add(texto6);
                        
                            painel.add(label7);
                            springlayout.putConstraint(SpringLayout.WEST, label7, 10, SpringLayout.WEST, painel);
                            springlayout.putConstraint(SpringLayout.NORTH, label7, 190, SpringLayout.NORTH, painel);
                                painel.add(texto7);
                            
                                painel.add(label8);
                                springlayout.putConstraint(SpringLayout.WEST, label8, 10, SpringLayout.WEST, painel);
                                springlayout.putConstraint(SpringLayout.NORTH, label8, 220, SpringLayout.NORTH, painel);
                                painel.add(texto8);
                                
                                    painel.add(label9);
                                    springlayout.putConstraint(SpringLayout.WEST, label9, 10, SpringLayout.WEST, painel);
                                    springlayout.putConstraint(SpringLayout.NORTH, label9, 250, SpringLayout.NORTH, painel);
                                    painel.add(texto9);
                                    
                                        painel.add(label10);
                                        springlayout.putConstraint(SpringLayout.WEST, label10, 10, SpringLayout.WEST, painel);
                                        springlayout.putConstraint(SpringLayout.NORTH, label10, 280, SpringLayout.NORTH, painel);
                                        painel.add(texto10);
                                            
                                            painel.add(label11);
                                            springlayout.putConstraint(SpringLayout.WEST, label11, 300, SpringLayout.WEST, painel);
                                            springlayout.putConstraint(SpringLayout.NORTH, label11, 10, SpringLayout.NORTH, painel);
                                            
                                            painel.add(label12);
                                            springlayout.putConstraint(SpringLayout.WEST, label12, 300, SpringLayout.WEST, painel);
                                            springlayout.putConstraint(SpringLayout.NORTH, label12, 30, SpringLayout.NORTH, painel);
                                            
                                            painel.add(labelvalor);
                                            springlayout.putConstraint(SpringLayout.WEST, labelvalor, 500, SpringLayout.WEST, painel);
                                            springlayout.putConstraint(SpringLayout.NORTH, labelvalor, 10, SpringLayout.NORTH, painel);
                                            
                                            painel.add(labelhectare);
                                            springlayout.putConstraint(SpringLayout.WEST, labelhectare, 435, SpringLayout.WEST, painel);
                                            springlayout.putConstraint(SpringLayout.NORTH, labelhectare, 30, SpringLayout.NORTH, painel);
                                            
                                                painel.add(botao);
                                                springlayout.putConstraint(SpringLayout.WEST, botao, 50, SpringLayout.WEST, painel);
                                                springlayout.putConstraint(SpringLayout.NORTH, botao, 320, SpringLayout.NORTH, painel);
                                        
     //------------------------------------------------------------------------                                          
        setTitle("Fórmula para Calcular Calcário - Saturação Por Base");                                  
        setSize(665, 480);
        setVisible(true);
        setLocation(330, 100);
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
        
        contain.add(painel);
      }  
    
    
    public static void main(String[] args) throws ParseException {
   
        CalcularCalcario calcular = new CalcularCalcario();
        calcular.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }

    
}

