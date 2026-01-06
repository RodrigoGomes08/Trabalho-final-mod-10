
/**
 * Escreva uma descrição da classe Utilizador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Utilizador
{
    // variáveis de classe
    static double SALDOINICIAL = 0.00;
    
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String email;
    private double saldo;
    /**
     * Construtor para objetos da classe Utilizador
     */
    public Utilizador(String nome, String email, double SALDOINICIAL)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.email = email;
        this.saldo = SALDOINICIAL;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double carregarSaldo(double valorCarregar){
        this.saldo = saldo + valorCarregar;
        
        return this.saldo;
    }
    
    public void descontarSaldo(){
        
    }
}