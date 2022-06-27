package exerciciobanco;

public class ExercicioBanco {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(1, "CP", "Jubileu", 300f);
        ContaBanco c2 = new ContaBanco(2, "CC", "Creuza", 500f);
        c1.abrirConta();       
        c1.sacar(150f);
        c1.depositar(100);
        c1.fecharConta();
        
        c2.abrirConta();       
        c2.sacar(10f);
        c2.depositar(1000);
        c2.fecharConta();
        
        c1.print();
        c2.print();
    }    
}
