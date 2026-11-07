import java.math.BigInteger;
import java.util.Scanner;
public class FatorialBigInteger{
	public static void main (String [] args){
		Scanner s = new Scanner (System.in);
		System.out.println ("Digite o numero");
		String numeroString = s.nextLine();
		BigInteger numero = new BigInteger (numeroString);
		BigInteger fatorial = BigInteger.ONE; 
		// ou new BigInteger ("1");
		for (BigInteger i = new BigInteger ("2"); 
		i.compareTo (numero) != 1;
		i = i.add (BigInteger.ONE)){
			fatorial = fatorial.multiply (i);
		}
		System.out.println (fatorial);	
	}
}