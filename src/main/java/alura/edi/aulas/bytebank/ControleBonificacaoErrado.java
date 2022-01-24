package alura.edi.aulas.bytebank;

public class ControleBonificacaoErrado
{
    private double soma; //é para somar todas as bonificações

    // public void registra(Gerente g)
    // {
    // double bonificacao = g.getBonificacao(); // eu consigo acessar os métodos do gerente
    // this.soma = this.soma + bonificacao;
    // }
    //
    // public void registra(Funcionario f) //pode ter o mesmo nome desde que passe parâmetro diferente
    // {
    // double bonificacao = f.getBonificacao();
    // this.soma = this.soma + bonificacao;
    // }
    //
    // public void registra(EditorVideo e) //perceba que agora os códigos estão se repetindo, o que não é uma boa
    // prática
    // {
    // double bonificacao = e.getBonificacao();
    // this.soma = this.soma + bonificacao;
    // }

    public void registra(Funcionario f) // todo mundo pode usar desde que seja funcionário
    {
        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma()
    {
        return soma;
    }

}
