package estudos.relacionais.logicos;

    public class OperadorTernario {
        public static void main(String[] args) {
            int n1 = 10;
            int n2 = 10;
            int r = n1 > n2 ? (n1 + n2) / 2 : n1 + n2;
            System.out.println(r);

            String nome1 = "jp";
            String nome2 = "jp";
            String nome3 = new String("jp");
            String resposta;
            resposta = nome1.equals(nome3) ? "Iguais" : "Diferentes";
            System.out.println("Os nome comparados são: " + resposta);

            //utilizamos o method equais para comparar o conteúdo, não apenas a estrutura.
           //resposta = nome1==nome3 ? "Iguais" : "Diferentes";
         //neste caso iria retornar diferentes.


        }
    }


/*
    Operador ternario possui tres componentes, aceita operações matematicas dentro dele.

    Utilizado geralmente pra "compactar" sintaxes com if/else em uma linha apenas

    Em vez de:
    let desconto;
    if (membro) {
    desconto = 0.2;
    } else {
    desconto = 0;
    }

    Você escreve:
    const desconto = membro ? 0.2 : 0;

 */
