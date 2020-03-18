//importa biblioteca
import javax.swing.JOptionPane;
//classe
public class TresNumerosCrescente
{
   //main
   public static void main (String [] args)
   {
      //declara variaveis
      double primeiro, segundo, terceiro;
      //pega numeros
      primeiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
      segundo = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
      terceiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));
      //cola na ordem
      if (primeiro < segundo && segundo < terceiro)
      {
         JOptionPane.showMessageDialog(null, primeiro + " " + segundo + " " + terceiro);
      }
      else if (primeiro < terceiro && terceiro < segundo)
      {
         JOptionPane.showMessageDialog(null, primeiro + " " + terceiro + " " + segundo);
      }
      else if (segundo < primeiro && primeiro < terceiro)
      {
         JOptionPane.showMessageDialog(null, segundo + " " + primeiro + " " + terceiro);
      }
      else if (segundo < terceiro && terceiro < primeiro)
      {
         JOptionPane.showMessageDialog(null, segundo + " " + terceiro + " " + primeiro);
      }
      else if (terceiro < primeiro && primeiro < segundo)
      {
         JOptionPane.showMessageDialog(null, terceiro + " " + primeiro + " " + segundo);
      }
      else if (terceiro < segundo && segundo < primeiro)
      {
         JOptionPane.showMessageDialog(null, terceiro + " " + segundo + " " + primeiro);
      }
   }
}