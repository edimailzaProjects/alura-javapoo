package alura.edi.aulas.bytebank;

//Implementa a interface e evita o código repetitivo
public class AutenticavelUtil implements Autenticavel
{
    private int senha;

    @Override
    public void setSenha(int senha)
    {
        this.senha = senha;

    }

    @Override
    public boolean autentica(int senha)
    {
        if (this.senha == senha)
        {
            return true;
        }
        else
            return false;

    }

}
