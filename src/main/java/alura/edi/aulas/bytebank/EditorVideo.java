package alura.edi.aulas.bytebank;

public class EditorVideo extends Funcionario
{
    public double getBonificacao()
    {
       // System.out.println("Chamando m�todo do editor de video");
        return super.getBonificacao() + 100;
    }

}
