/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularcalcario;

/**
 *
 * @author Marilane
 */
public class TeoresTrocaveis {

    public TeoresTrocaveis() {
    }
    
    public String trocarTeores(){
        
                   String textoteorestrocaveis = "Esse é um método menos utilizado, sendo indicado para solos com baixa CTC (menor que 5 cmolc/dm3)\n" +
"\n" +
"A fórmula é:\n" +
"\n" +
"NC  = Y [Al3+ – (mt – t/100)] + [X – (Ca2+ + Mg2+)]\n" +
"\n" +
"\n" +
"NC = Necessidade de calcário, em t/ha;\n" +
"\n" +
"Y= Valor tabelado em função do poder tampão do solo:\n" +
"\n" +
"    Arenoso: Y = 0 a 1\n" +
"    Médio: Y = 1 a 2\n" +
"    Argiloso: Y = 2 a 3\n" +
"    Muito argiloso: Y = 3 a 4\n" +
"\n" +
"mt= Saturação por Al3+ (100xAl/SB+Al);\n" +
"t= CTCefetiva (SB + Al);\n" +
"X= Teor mínimo de Ca + Mg : tabelado, sendo que para forrageiras tropicais é de 1 a 2.\n" +
"\n" +
"Ca2+ + Mg2+ = teores trocáveis de Ca e Mg, em cmolc/dm3.\n" +
"\n" +
"  " ;
                   return textoteorestrocaveis;
    }
    
}
