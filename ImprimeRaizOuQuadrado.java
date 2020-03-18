//importa biblioteca
import javax.swing.JOptionPane;
//classe
public class ImprimeRaizOuQuadrado
{
   //main
   public static void main (String [] args)
   {
   //declara variaveis
   double numero, raiz, quadrado;
   //pega numero
   numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número: "));
   //condicao
   JOptionPane.showMessageDialog(null, numero >= 0 ? Math.pow(numero, 0.5) : Math.pow(numero, 2));
   }
}