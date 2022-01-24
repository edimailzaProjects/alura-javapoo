package alura.edi.aulas.bytebank.testes;

import alura.edi.aulas.bytebank.ControleBonificacaoErrado;
import alura.edi.aulas.bytebank.EditorVideo;
import alura.edi.aulas.bytebank.Gerente;

public class TesteControleBonificacaoIncorreto
{
    public static void main(String[] args)
    {
        Gerente g1 = new Gerente();

        g1.setSalario(100);

        ControleBonificacaoErrado c = new ControleBonificacaoErrado();
        c.registra(g1); // recebe todos que sejam funcionários
        System.out.println(g1.getBonificacao());

        EditorVideo f = new EditorVideo();
        f.setSalario(100);
        c.registra(f);// recebe todos que sejam funcionários
        //System.out.println(c.getSoma());
        System.out.println(f.getBonificacao());

    }

}
