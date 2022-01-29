package meubanco;

 
class Conta {
    private String nome;
    private float saldo;
    private float saldo_conta_2;
    
    
    //Metodo construtor

    public Conta(String nome, float saldo) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public Conta(float saldo_conta_2) {
        this.saldo_conta_2 = 5000;
    }
    
    
    //Metodo personalizado
    public void depositar(float d){
        this.setSaldo(this.getSaldo() + d);
    }
    
     public void sacar(float s){
        this.setSaldo(this.getSaldo() - s);
    }
    
     public void tranferir(float t){
       this.setSaldo(this.getSaldo() - t);
    }
     
      public float consultar(){
          return saldo;
    }
      
      //metodo especial
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo_conta_2() {
        return saldo_conta_2;
    }

    public void setSaldo_conta_2(float saldo_conta_2) {
        this.saldo_conta_2 = saldo_conta_2;
    }
    
    
}
