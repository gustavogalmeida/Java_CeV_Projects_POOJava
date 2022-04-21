package exercicioaula02;

public class ExercicioAula02 {

    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.iniciado = true;
        c1.finalizado = false;
        c1.nome = "Java POO";
        c1.ministrante= "Gustavo Guanabara - Curso em Video";
        c1.duracao= 40;
        c1.descricao="POO com a linguagem Java: Classes, metods, atributos e objetos.";
        
        c1.iniciarCurso();
        //c1.finalizarCurso();          
    }
}
 