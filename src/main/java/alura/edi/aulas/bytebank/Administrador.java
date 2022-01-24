package alura.edi.aulas.bytebank;

public class Administrador extends Funcionario implements Autenticavel
{
    private AutenticavelUtil autenticavelUtil;

    public Administrador() // Implementando o relacionamento de COMPOSIÇÃO
    {// Um Administrador TEM UM autenticador
        this.autenticavelUtil = new AutenticavelUtil();
    }

    @Override
    public void setSenha(int senha) // implementou
    {
        this.autenticavelUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) // implementou
    {
        return autenticavelUtil.autentica(senha); // e meu método delegou o trabalho
    }

    @Override
    public double getBonificacao()
    { // herdou
        return 50;
    }

}
