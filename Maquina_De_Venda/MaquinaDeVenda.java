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
        // Ver qual é o produto
        Produto produto = produtos.get(i);
        // Ver a quantidade do produto
        int quantidade = produto.getQtd();
        // Se houver quantidade disponivel para comprar então ver o preço e se o utilizador tem saldo para o comprar
        if(quantidade >= 1){
            //Verificr o preço do produto
            double preco = produto.getPreco();
            // Verificar o saldo do Utilizador
            double saldo = this.utilizador.getSaldo();
            // Se o saldo do utilizador for maior ou igual que o preço então
            if(saldo >= preco){
                // O utilizador poderá fazer a compra
                produto.diminuirQtd();
                utilizador.descontarSaldo(preco);
            }
        }
    }
}

