/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import org.junit.Test;

/**
 *
 * @author Aluno
 */
public class TesteCalculo {

    @Test
    public void testCalculoPrice() {
        int nparc = 10;
        double[] vetor = new double[nparc];
        double[] vetorJ = new double[nparc];
        double[] vetorAmort = new double[nparc];
        double pmt = 0;

        double pv = 30000;
        pmt = pv * ((0.03 * Math.pow(1.03, nparc)) / (Math.pow(1.03, nparc) - 1));
        double pvdiv = pv/10;
        vetorAmort[0] = pvdiv;

        for (int i = 0; i < vetor.length; i++) {
            vetorJ[i] = pv * 0.03;
            vetorAmort[i] = pvdiv;
            vetor[i] = vetorAmort[i] + vetorJ[i];

            pv = pv - vetorAmort[i];
             double pvarredondado = (double) Math.round(pv * 100) / 100;
             double vetorPmtArredondado = (double) Math.round(vetor[i] * 100) / 100;
             double vetorJArredondado = (double) Math.round(vetorJ[i] * 100) / 100;
             double vetorAmortArredondado = (double) Math.round(vetorAmort[i] * 100) / 100;
            System.out.println("Pmt = " + vetorPmtArredondado + "   juros " + vetorJArredondado + "  amort " + vetorAmortArredondado + "  sd  " + pvarredondado);
            
        }
    }
}
