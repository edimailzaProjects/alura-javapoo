package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.Funcionario;

public class TesteFuncionario
{
    
    public static void main(String[] args)
    {
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome("Edi");
        funcionario.setCpf("123.123.123.12");
        funcionario.setSalario(123456);
        funcionario.setTipo(2);
        
        System.out.println(funcionario.getBonificacao());
        
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Edi Dois");
        funcionario2.setCpf("123.321.321.32");
        funcionario2.setSalario(654321);
        funcionario2.setTipo(3);
        
        System.out.println(funcionario2.getBonificacao());
    }

}
