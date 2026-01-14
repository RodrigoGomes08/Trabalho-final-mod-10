import java.util.ArrayList;
/**
 * Escreva uma descrição da classe MaquinaDeVenda aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MaquinaDeVenda
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Utilizador utilizador;
    private ArrayList<Produto> produtos;
    private int id;
    private String localizacao;
    
    /**
     * Construtor para objetos da classe MaquinaDeVenda
     */
    public MaquinaDeVenda(int id, ArrayList<Produto> produtos, String localizacao)
    {
        // inicializa variáveis de instância
        this.id = id;
        this.produtos = produtos;
        this.localizacao = localizacao;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    
    public void comprar(int i)
    {
        Produto produto = produtos.get(i);
        
        int quantidade = produto.getQtd();
        double preco = produto.getPreco();
        
        double saldo = this.utilizador.getSaldo();
    }
}

