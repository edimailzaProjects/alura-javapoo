package alura.edi.aulas.bytebank;

public class CalculadorDeImposto
{
    private double totalImposto;
    
    public void registra(Tributavel tributavel) //aqui, eu posso passar a interface com par�metro
    { // tudo o que pe tribut�vel pode ser acessado a partir daqui
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;
    }
    
    public double getTotalImposto()
    {
        return totalImposto;
    }
}
