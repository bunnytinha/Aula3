//importa biblioteca
import javax.swing.JOptionPane;
//classe
public class SomaNumerosCasoSubtrai
{
   //main
   public static void main (String [] args)
   {
      //declara variaveis
      double numero1, numero2, soma, subtracao;
      //pega numeros
      numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
      numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
      soma = numero1 + numero2;
      //condicao
      if (soma <= 20)
      {
         subtracao = soma - 5;
         JOptionPane.showMessageDialog(null,subtracao);
      }
      else JOptionPane.showMessageDialog(null,soma);      
   }
}
