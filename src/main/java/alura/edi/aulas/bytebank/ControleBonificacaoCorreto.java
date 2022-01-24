package alura.edi.aulas.bytebank;

public class ControleBonificacaoCorreto
{
    private static int somaDeBonificacoes;

    public static int getSomaDeBonificacoes()
    {
        return ControleBonificacaoCorreto.somaDeBonificacoes;
    }

    /*
     * Explicando: O parâmetro que estou recebendo é uma variável que carrega a referência que pode ser para um objeto
     * do tipo Funcionario Entretanto, qualquer referência para um objeto que herda de Funcionario poderá ser passado
     * para este método Seja uma referência para um objeto do tipo: Gerente, EditorDeVideo, Funcionario Isso acontece
     * porque todo Gerente, EditorDeVideo é oriundo de Funcionario Mas nem todo Gerente é oriundo de EditorDeViode ou
     * vice versa por isso, passamos a referência mais genérica possível para o método
     */
    public void calcular(Funcionario funcionario)
    {
        System.out.println("Sua bonificação é de: " + funcionario.getBonificacao());
        ControleBonificacaoCorreto.somaDeBonificacoes += funcionario.getBonificacao();
    }
}
