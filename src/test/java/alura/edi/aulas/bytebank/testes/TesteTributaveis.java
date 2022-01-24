package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.CalculadorDeImposto;
import alura.edi.aulas.bytebank.ContaCorrente;
import alura.edi.aulas.bytebank.SeguroDeVida;

public class TesteTributaveis
{
    public static void main(String[] args)
    {
        ContaCorrente contaCorrente = new ContaCorrente(222, 5555);
        contaCorrente.deposita(100.0);
        
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        
        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(seguroDeVida);
        calculadorDeImposto.registra(contaCorrente);
    }
}
