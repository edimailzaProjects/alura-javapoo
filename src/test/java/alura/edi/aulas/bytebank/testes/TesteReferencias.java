package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Funcionario;
import alura.edi.aulas.bytebank.Gerente;

public class TesteReferencias
{
    public static void main(String[] args)
    {
        Gerente g1 = new Gerente();
        
        g1.setNome("Edi");
        System.out.println(g1.getNome());
        
        g1.autentica(123);
        
        Funcionario g2 = new Gerente(); // todo gerente � funcion�rio
//        Gerente g1 = new Funcionario(); // mas nem todo funcion�rio � gerente
        
        g2.setNome("Edi ");
        System.out.println(g2.getNome());
//        g2.autentica(123); n�o funciona, pois a refer�ncia � do tipo Funcion�rio
        
    }

}
