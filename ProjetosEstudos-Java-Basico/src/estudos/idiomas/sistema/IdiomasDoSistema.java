/*
Desafio Básico do curso
 */

package estudos.idiomas.sistema;

// Importei Locale da biblioteca
import java.util.Locale;

public class IdiomasDoSistema {
    static void main(String[] args) {


        // Aqui puxei direto o method .getDefault() da class Locale
        Locale idioma = Locale.getDefault();

        // prints normais
        System.out.print("O Idioma utilizado no sistema é: ");
        System.out.print(idioma.getDisplayLanguage());
    }
}

/*
Neste desafio utilizei ajuda da IA para saber qual biblioteca importar
eu usei a lógica da atividade prática, apenas perguntei para IA, o que eu deveria importar.
Aprendi que cada class importada da biblioteca tem seus methods prontos
 */