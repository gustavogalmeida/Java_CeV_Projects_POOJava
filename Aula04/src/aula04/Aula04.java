package aula04;

public class Aula04 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta(.5f, "Rosa", "Bic"); // instanciando objeto da classe Caneta
        c1.status();
        // c1.modelo = ("Bic teste");
        // c1.ponta = 0.5f;             // não funciona porque ponta 
                                        // e modelo são atributos
                                        // da classe Caneta privado
                                        
        // maneira correta de atribuir valores
        //c1.setModelo("Bic Cristal"); 
        //c1.setPonta(.5f); 
    }
}
