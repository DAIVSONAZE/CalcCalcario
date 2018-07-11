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
"NC  = Y x Al + [X - (Ca+Mg)] x f\n" +
"\n" +
"\n" +
"NC = Necessidade de calcário, em t/ha;\n" +
"\n" +
"Y= Valor que varia em função do teor de argila do solo, ou seja:\n" +
"\n" +
"    Y = 1 para solos arenosos, com menos de 15% de argila;\n" +
"    Y = 2 para solos com teor de argila entre 15 e 35%;\n" +
"    Y = 3 para solos com teor de argila maior que 35%.\n" +

"\n" +
"Al= Al(cmol/dm³);\n" +
"X= Teor mínimo de Ca + Mg : tabelado, sendo que para forrageiras tropicais é de 1 a 2.\n" +
"O valor \"X\" é em função da cultura:\n" +
"valor = 2 para a maioria das culturas;\n" +
"O eucalipto usa valor = 1;\n" +
"O cafeeiro, valor = 3.\n" +
"\n" +
"Ca2+ + Mg2+ = teores trocáveis de Ca e Mg, em cmolc/dm3.\n" +
"\n" +
"f = fator de correção do PRNT do calcario a ser utilizado\n" +
"  " ;
                   return textoteorestrocaveis;
    }
    
}
