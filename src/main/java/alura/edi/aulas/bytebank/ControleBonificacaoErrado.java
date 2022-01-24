package alura.edi.aulas.bytebank;

public class ControleBonificacaoErrado
{
    private double soma; //� para somar todas as bonifica��es

    // public void registra(Gerente g)
    // {
    // double bonificacao = g.getBonificacao(); // eu consigo acessar os m�todos do gerente
    // this.soma = this.soma + bonificacao;
    // }
    //
    // public void registra(Funcionario f) //pode ter o mesmo nome desde que passe par�metro diferente
    // {
    // double bonificacao = f.getBonificacao();
    // this.soma = this.soma + bonificacao;
    // }
    //
    // public void registra(EditorVideo e) //perceba que agora os c�digos est�o se repetindo, o que n�o � uma boa
    // pr�tica
    // {
    // double bonificacao = e.getBonificacao();
    // this.soma = this.soma + bonificacao;
    // }

    public void registra(Funcionario f) // todo mundo pode usar desde que seja funcion�rio
    {
        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma()
    {
        return soma;
    }

}
