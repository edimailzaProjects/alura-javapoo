package alura.edi.aulas.bytebank;

public class SistemaInterno
{
    private int senha = 1234;
    
    public void autentica(Autenticavel autenticavel) {
        boolean autenticou = autenticavel.autentica(this.senha);
        if (autenticou)
        {
            System.out.println("Usu�rio autenticado com sucesso!");
        }else {
            System.out.println("Usu�rio ou senha incorretos!");
        }
    }
}
