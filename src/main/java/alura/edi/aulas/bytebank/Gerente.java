package alura.edi.aulas.bytebank;

//Um gerente � um funcion�rio, a classe gerente herda da classe funcion�rio
public class Gerente extends Funcionario implements Autenticavel // ,Bonificavel *com interface � poss�vel, com Heran�a
                                                                 // n�o
{
    AutenticavelUtil autenticavelUtil;

    public Gerente()
    {
        autenticavelUtil = new AutenticavelUtil();
    }

    @Override
    public boolean autentica(int senha)
    {
        return this.autenticavelUtil.autentica(senha);
    }

    @Override
    public double getBonificacao()
    {
        // System.out.println("Chamando o metodo do gerente");
        // return this.getSalario(); note que n�o tem sal�rio apesar do "this", logo, invoque o super()
        // return (this.salario * 0.1) + super.salario; //aqui eu repeti c�digo, se o sal�rio de funcion�rio �
        // modificado, existe um retrabalho por esta raz�o � melhor chamar o m�todo e reaproveito
        return (super.getBonificacao()) + super.getSalario() + 100; // c�digo neste caso � OBRIGAT�RIO chamar o 'super'. 
    }

    @Override
    public void setSenha(int senha)
    {
        this.autenticavelUtil.setSenha(senha);

    }

    /*
     * Sobrecarga: � mais simples e independe de heran�a imagine um outro novo m�todo autentica que recebe al�m da senha
     * tamb�m o login public boolean autentica(String login, int senha) { //implementacao omitida }
     */

}
