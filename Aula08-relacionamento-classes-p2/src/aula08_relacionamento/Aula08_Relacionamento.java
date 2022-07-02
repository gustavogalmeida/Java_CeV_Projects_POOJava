
package aula08_relacionamento;

public class Aula08_Relacionamento {

    public static void main(String[] args) {
        Lutador jonh = new Lutador("John", "America", 42, 1.75f, 85, 11, 3, 2);
        Lutador marco = new Lutador("Marco", "Brasil", 35, 1.80f, 84, 5, 1, 0);
        
        Luta  luta1 = new Luta();
        luta1.marcarLuta(jonh, marco);
        luta1.lutar();
        jonh.status();
        marco.status();
    }
    
}
