package exerciciobanco;


public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private boolean valida = false;
    
    // construtor
    public ContaBanco(int numConta, String tipo, String dono, float saldo){
        if (tipo == "CC" || tipo == "CP"){
            this.setValida(true);
            this.numConta = numConta;
            this.tipo = tipo;
            this.dono = dono;
            this.saldo = saldo;
            this.status = false;
        } else {
            System.out.println("Conta nao aberta!\n");
        }
    }
    
    // metodos
    public void abrirConta(){
        if (status == false && valida == true) {
            this.status = true;
            System.out.println("Conta aberta com sucesso!");
            if (tipo == "CC"){
                this.saldo = this.saldo + 50;
            } else if (tipo == "CP"){
                this.saldo = this.saldo + 150;
            }
        } else if (status == true){
            System.out.println("Nao foi possivel abrir sua conta!\nMotivo: Sua conta ja estava aberta.");
        } else if (valida == false){
            System.out.println("Nao foi possivel abrir sua conta!\nMotivo: Conta não valida.");
        }
    }
    public void fecharConta (){
        if (this.status == true && this.saldo == 0f && this.valida == true){
           setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } else if (this.status == false){
            System.out.println("Nao foi possivel fechar sua conta!\nMotivo: Ela nao esta aberta.");
        } else if (this.saldo != 0f){
            System.out.println("Nao foi possivel fechar sua conta!\nMotivo: Saldo nao e R$ 0,00.");
        } else if (this.valida == false){
            System.out.println("Nao foi possivel fechar sua conta!\nMotivo: Conta nao valida.");
        }
    }
    public void depositar (float valor){
        if (this.getStatus()==true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito de " + valor + " realizado com sucesso. Saldo atual: " + this.getSaldo());
        } else {
            System.out.println("Deposito nao realizado!\nMotivo: Conta nao aberta.");
        }
    }
    public void sacar (float valor){
        if (status == true && valida == true){
            if (valor > saldo){
            System.out.println("Valor de saque maior que saldo disponivel!");
            } else if (saldo >= valor){
                this.saldo = this.saldo - valor;
                System.out.println("Saque de " + valor + " realizado com sucesso! Saldo atual " + this.saldo);
            }   
        }
        
    }
    public void pagarMensal (){
        
    }
        
    // printar e testar conta
    public void print (){
        System.out.println("------------------------");
        System.out.println("Dono: " + this.dono);
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldo);
        if (this.status == true){
            System.out.println("Status da conta: Aberta");
        } else {
            System.out.println("Status da conta: Fechada");
        }    
    }
    
    // getters e setters
    public int getNumConta (){
        return this.numConta;
    }
    public void setNumConta (int numConta){
        this.numConta = numConta;
    }        
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getDono(String dono){
        return this.dono;
    }
    public void setDono (String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }
            
            
}
