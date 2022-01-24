package alura.edi.aulas.bytebank;

public interface Autenticavel
{
    public abstract void setSenha(int senha);
    
    public abstract boolean autentica(int senha);
    
    /**
     * 
     * Interface n�o � para reutiliza��o de c�digo. � uma alternativa para o polimorfismo
     * dado que java n�o possui heran�a multipla
     * 
     * */
}
