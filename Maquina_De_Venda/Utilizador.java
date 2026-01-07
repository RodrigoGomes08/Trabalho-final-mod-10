
/**
 * Escreva uma descrição da classe Utilizador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Utilizador
{
    // variáveis de classe
    private static final double SALDO_INICIAL = 0.00;
    
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
        this.saldo = SALDO_INICIAL;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void carregarSaldo(double valorCarregar)
    {
        if(valorCarregar > 0)
        {
            this.saldo = this.saldo + valorCarregar;
        }
    }
    
    public void descontarSaldo(double valorDescontar)
    {
        if(valorDescontar < this.saldo)
        {
            this.saldo = this.saldo - valorDescontar;
        }
    }
}











