
package inteligenciaartificial;

public class AGJava2024 {

    public static void main(String[] args) {
        int populacao = 20;
        double limitePeso = 8;
        int probabilidadeMutacao = 5;
        int qtdCruzamento = 5;
       AlgoritmoGenetico meuAg = 
               new AlgoritmoGenetico(populacao,limitePeso, probabilidadeMutacao, qtdCruzamento);
       meuAg.carregaArquivo("dados.csv");
       meuAg.executar();
    }
    
}