package alura.edi.aulas.bytebank;

public interface Autenticavel
{
    public abstract void setSenha(int senha);
    
    public abstract boolean autentica(int senha);
    
    /**
     * 
     * Interface não é para reutilização de código. É uma alternativa para o polimorfismo
     * dado que java não possui herança multipla
     * 
     * */
}
