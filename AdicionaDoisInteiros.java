//importa biblioteca
import javax.swing.JOptionPane;

//classe
public class AdicionaDoisInteiros
{
   //main
   public static void main (String [] args)
   {
      //declara variaveis 
      int int1, int2, soma;
      //pega os valoes
      int1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
      int2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
      //soma
      soma = int1 + int2;
      //condicao para exibir
      if (soma > 10) 
      {
         JOptionPane.showMessageDialog(null, soma);
      }
   }
}