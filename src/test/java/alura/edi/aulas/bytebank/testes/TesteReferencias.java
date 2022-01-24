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
        
        Funcionario g2 = new Gerente(); // todo gerente é funcionário
//        Gerente g1 = new Funcionario(); // mas nem todo funcionário é gerente
        
        g2.setNome("Edi ");
        System.out.println(g2.getNome());
//        g2.autentica(123); não funciona, pois a referência é do tipo Funcionário
        
    }

}
