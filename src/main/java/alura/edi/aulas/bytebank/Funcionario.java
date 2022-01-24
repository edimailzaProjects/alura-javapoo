package alura.edi.aulas.bytebank;

public class Funcionario
{
    private String nome;
    private String cpf;
    private double salario; //publico apenas para os as classes filhas
    private int tipo = 0; // 0 para funcionario comum, 1 para gerente, 2 para diretor

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public int getTipo()
    {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }

    // eu posso criar meus getter's
    public double getBonificacao()
    {
       // System.out.println("Chamando o metodo do funcionario");
    //    if (this.tipo == 0)
    //    {
            return this.salario * 0.05;
    //    }
    //    else if (this.tipo == 1)
    //    {
    //        return this.salario;
    //    }
    //    else
    //        return this.salario + 1000.00;
    }
}
