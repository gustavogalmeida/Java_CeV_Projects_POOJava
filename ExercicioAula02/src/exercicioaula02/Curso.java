package exercicioaula02;

public class Curso {
    String nome;
    String descricao;
    String ministrante;
    int duracao;
    boolean iniciado;
    boolean finalizado;
         
    void iniciarCurso(){
        if (this.iniciado == false){
                System.out.println("Seja bem vindo ao curso de "+nome+"!\n"
                + "Espero que goste, neste curso voce aprendera:\n"
                +descricao+
                "Ministrante: "+ministrante); 
                this.iniciado=true;
            } else if (finalizado==true){
                    System.out.println("Seu curso ja foi finalizado!");
                } else {
                        System.out.println("Curso ja esta iniciado!");
                } 
            
    }
    
    void finalizarCurso(){
        if (finalizado == true){
            System.out.println("Voce ja finalizou o curso de "+ nome+"!");
        } else {
            if (iniciado==true){
                System.out.println("Voce concluiu com sucesso o curso!");
            } else {
                    System.out.println("Voce ainda nao iniciou o curso!");
              }
        }
    }    
}
