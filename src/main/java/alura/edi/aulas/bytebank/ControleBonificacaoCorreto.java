package alura.edi.aulas.bytebank;

public class ControleBonificacaoCorreto
{
    private static int somaDeBonificacoes;

    public static int getSomaDeBonificacoes()
    {
        return ControleBonificacaoCorreto.somaDeBonificacoes;
    }

    /*
     * Explicando: O par�metro que estou recebendo � uma vari�vel que carrega a refer�ncia que pode ser para um objeto
     * do tipo Funcionario Entretanto, qualquer refer�ncia para um objeto que herda de Funcionario poder� ser passado
     * para este m�todo Seja uma refer�ncia para um objeto do tipo: Gerente, EditorDeVideo, Funcionario Isso acontece
     * porque todo Gerente, EditorDeVideo � oriundo de Funcionario Mas nem todo Gerente � oriundo de EditorDeViode ou
     * vice versa por isso, passamos a refer�ncia mais gen�rica poss�vel para o m�todo
     */
    public void calcular(Funcionario funcionario)
    {
        System.out.println("Sua bonifica��o � de: " + funcionario.getBonificacao());
        ControleBonificacaoCorreto.somaDeBonificacoes += funcionario.getBonificacao();
    }
}
