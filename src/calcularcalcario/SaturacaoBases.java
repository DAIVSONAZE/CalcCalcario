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
public class SaturacaoBases {

    public SaturacaoBases() {
    }
    
    public String saturarBases(){
                 String textoporbases = "Método da saturação por bases passo a passo\n" +
"\n" +
"<html><b>Com a análise de solos em mãos faça esse passo a passo para o cálculo de calagem:</b></html>\n" +
"\n" +
"1º passo: Saiba e entenda a fórmula\n" +
"\n" +
"NC = [CTC x (V2 – V1) x (100/PRNT)] / 100\n" +
"\n" +
"NC = Necessidade de calcário, em t/ha;\n" +
"\n" +
"CTC = CTCpH7 (capacidade de troca de cátions) em cmolc/dm3;\n" +
"\n" +
"V2 = Porcentagem de saturação por bases desejada;\n" +
"\n" +
"V1 = Porcentagem de saturação por bases atual do solo (encontrada na análise do solo);\n" +
"\n" +
"PRNT = Poder Relativo de Neutralização Total (encontrado na embalagem do calcário).\n" +
"\n" +
" \n" +
"\n" +
"2º passo: Saiba qual saturação de bases (V%) você vai usar\n" +
"\n" +
"A saturação por bases desejada (V2) pode variar de 50 a 70%, sendo em geral:\n" +
"\n" +
"    50% para cereais e tubérculos;\n" +
"    60% para leguminosas e cana-de-açúcar e utilizado no Cerrado;\n" +
"    70% para hortaliças, café e frutas.\n" +
"\n" +
"Se na sua análise não possuir o V% você pode calcular facilmente:\n" +
"\n" +
"V% = [Soma de bases (K + Ca + Mg + Na) x 100 ]/CTC\n" +
"\n" +
"Muitas vezes o Na não entra nesse cálculo por ter uma quantidade \n" +
 "muito pequena e muitas análises de solo não determinam.\n "+
 "\n" +
 "\n" +
"\n" +
                        " 3º passo: Faça o cálculo\n" +
"\n" +
"Você tem dúvidas sobre o cálculo? Então vamos a um exemplo de uma análise de solo:\n " ;
                        
                        
                 return textoporbases;
    }
}
