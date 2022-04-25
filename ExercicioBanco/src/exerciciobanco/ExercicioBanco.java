package exerciciobanco;

public class ExercicioBanco {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(1, "CP", "Gustavo", 9000f);
        c1.abrirConta();
        c1.fecharConta();
        c1.print();
        c1.sacar(30);
    }    
}
