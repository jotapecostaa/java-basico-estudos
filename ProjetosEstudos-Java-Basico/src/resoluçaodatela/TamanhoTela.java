package resoluçaodatela;

// Biblioteca importada, o * indica que importei a biblioteca toda
import java.awt.*;

public class TamanhoTela {
   public static void main(String[] args) {

       // Dimension = classe importada, resolucao é o objeto, Toolkit é um classe, apos vem os methods
       Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();

       /*
       Aqui utilizei o (int) para indicar que o valor deveria ser inteiro e não quebrado.
       utilizei o objeto resolucao mais o method getWidth e a mesma coisa com o getHeight
        */
       System.out.print("A resolução da sua tela é: " + (int) resolucao.getWidth() + " X " + (int) resolucao.getHeight());

   }
}

