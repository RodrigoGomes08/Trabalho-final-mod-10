
/**
 * Escreva uma descrição da classe UtilizadorTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class UtilizadorTest
{
    public static void main(String[] args){
        Utilizador u1 = new Utilizador("teste", "teste@gmail.com", 0.00);
        
        double saldoFinal = u1.carregarSaldo(100);
        
        System.out.println("Saldo: " + saldoFinal);
        
        saldoFinal = u1.carregarSaldo(200);
        
        System.out.println("Saldo: " + saldoFinal);
    }
}