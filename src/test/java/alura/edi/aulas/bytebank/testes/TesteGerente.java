package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Autenticavel;
import alura.edi.aulas.bytebank.Cliente;
import alura.edi.aulas.bytebank.Funcionario;
import alura.edi.aulas.bytebank.Gerente;

public class TesteGerente
{
    public static void main(String[] args)
    {
        Gerente gerenteEspecifico = new Gerente();
        gerenteEspecifico.setNome("Edi Especifico");
        gerenteEspecifico.setSalario(10000.0);

        System.out.println(gerenteEspecifico.getNome());
        System.out.println(gerenteEspecifico.getBonificacao());

        boolean autenticou = gerenteEspecifico.autentica(123);
        System.out.println(autenticou);
        
        Funcionario gerenteGenerico = new Gerente(); //herda
        Autenticavel gerenteAssinouContrato = new Gerente();
        
        gerenteGenerico.setNome("Edi Generico");
        
        
        System.out.println(gerenteAssinouContrato.autentica(123));
        
        Cliente cliente = new Cliente();
        System.out.println(cliente.autentica(123));
        
        
    }

}
