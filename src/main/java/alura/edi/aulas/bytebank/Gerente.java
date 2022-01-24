package alura.edi.aulas.bytebank;

//Um gerente é um funcionário, a classe gerente herda da classe funcionário
public class Gerente extends Funcionario implements Autenticavel // ,Bonificavel *com interface é possível, com Herança
                                                                 // não
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
        // return this.getSalario(); note que não tem salário apesar do "this", logo, invoque o super()
        // return (this.salario * 0.1) + super.salario; //aqui eu repeti código, se o salário de funcionário é
        // modificado, existe um retrabalho por esta razão é melhor chamar o método e reaproveito
        return (super.getBonificacao()) + super.getSalario() + 100; // código neste caso é OBRIGATÓRIO chamar o 'super'. 
    }

    @Override
    public void setSenha(int senha)
    {
        this.autenticavelUtil.setSenha(senha);

    }

    /*
     * Sobrecarga: é mais simples e independe de herança imagine um outro novo método autentica que recebe além da senha
     * também o login public boolean autentica(String login, int senha) { //implementacao omitida }
     */

}
