import java.util.ArrayList;
/**
 * Escreva uma descrição da classe CriarProdutos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CriarProdutos
{
    public static ArrayList <Produto> getProdutos()
    {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
    
        Snack s1 = new Snack("Batatas explosivas", 10.99, 100000);
        Snack s2 = new Snack("Bolacha galática", 5.99, 10000);
        Doce d1 = new Doce("Chocolito turbo", 15.99, 1000);
        Doce d2 = new Doce("Gomas Mutantes", 12.99, 100);
        Bebida b1 = new Bebida("Refrigerante Cósmico", 2.99, 10);
        Bebida b2 = new Bebida("Chá Alienígena", 3.99, 1);

        produtos.add(s1);
        produtos.add(s2);
        produtos.add(d1);
        produtos.add(d2);
        produtos.add(b1);
        produtos.add(b2);
        
        return produtos;
    }
}
