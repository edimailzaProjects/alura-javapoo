package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.ControleBonificacaoCorreto;
import alura.edi.aulas.bytebank.Designer;
import alura.edi.aulas.bytebank.EditorVideo;
import alura.edi.aulas.bytebank.Funcionario;
import alura.edi.aulas.bytebank.Gerente;

public class TesteControleBonificacaoCorreto
{
    public static void main(String[] args)
    {

        System.out.println("Aplicando o polimorfismo de maneira eficiente");
        Funcionario funcionario = new Funcionario(); // Atribuindo a refer�ncia do objeto Funcionario criado a uma
                                                     // vari�vel do tipo Funcionario
        funcionario.setSalario(100);

        Gerente gerente = new Gerente(); // Atribuindo a refer�ncia do objeto Gerente criado a uma vari�vel do tipo
                                         // Gerente
        gerente.setSalario(100);

        EditorVideo editorDeVideo = new EditorVideo(); // Atribuindo a refer�ncia do objeto EditorDeVideo a uma vari�vel
                                                       // do tipo EditorDeVideo
        editorDeVideo.setSalario(100);

        //Funcionario f = new Designer(); //tamb�m posso utilizar assim, pois todo designer � um funcion�rio
        Designer designer = new Designer();
        designer.setSalario(100);
        
        ControleBonificacaoCorreto controleDeBonificacao = new ControleBonificacaoCorreto();
        controleDeBonificacao.calcular(funcionario);
        controleDeBonificacao.calcular(gerente);
        controleDeBonificacao.calcular(editorDeVideo);
        controleDeBonificacao.calcular(designer);
        
        System.out.println("Total de bonifica��es: " + ControleBonificacaoCorreto.getSomaDeBonificacoes());
    }

}
