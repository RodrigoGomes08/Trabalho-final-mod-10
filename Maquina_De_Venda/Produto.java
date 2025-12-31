
/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private double preco;
    private int qtdDisponivel;
    private String imagem;
    
    /**
     * Construtor para objetos da classe Produto
     */
    public Produto(String nome, double preco, int qtdDisponivel)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.preco = preco;
        this.qtdDisponivel = qtdDisponivel;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome()
    {
        this.nome = nome;
    }
    
    public double getPreco()
    {
        return this.preco;
    }
    
    public int getQtdDisponivel()
    {
        return this.qtdDisponivel;
    }
    
    public void comprar()
    {
        String qtdCompra;
        
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome :").append(this.nome).append("\n");
        sb.append("Preço :").append(this.preco).append("\n");
        sb.append("Quantidde disponivel :").append(this.qtdDisponivel).append("\n");
        
        return sb.toString();
    }
}