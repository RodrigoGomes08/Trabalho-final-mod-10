
/**
 * Escreva uma descrição da classe ProdutoTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ProdutoTest
{
    public static void main(String [] args)
    {
        Snack s1 = new Snack("Batatas explosivas", 10.99, 100000);
        Snack s2 = new Snack("Bolacha galática", 5.99, 10000);
        Doce d1 = new Doce("Chocolito turbo", 15.99, 1000);
        Doce d2 = new Doce("Gomas Mutantes", 12.99, 100);
        Bebida b1 = new Bebida("Refrigerante Cósmico", 2.99, 10);
        Bebida b2 = new Bebida("Chá Alienígena", 3.99, 1);
        
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}