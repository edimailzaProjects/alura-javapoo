package alura.edi.aulas.bytebank;

public class Cliente implements Autenticavel
{

    private String nome;
    private String cpf;
    private String profissao;
    private AutenticavelUtil autenticavelUtil; //evitará códidigos duplicados
    
    public Cliente() { // para isso é necessário colocá-la no construtor padrão.
        this.autenticavelUtil = new AutenticavelUtil();
    }

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

    public String getProfissao()
    {
        return profissao;
    }

    public void setProfissao(String profissao)
    {
        this.profissao = profissao;
    }

    @Override
    public void setSenha(int senha) //autenticavelUtil agora implementa e evita o mesmo código escrito várias vezes
    {
        this.autenticavelUtil.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha)
    {
        return this.autenticavelUtil.autentica(senha);

    }

}