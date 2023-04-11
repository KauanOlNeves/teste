import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        JSONArray faturamentoDiario;

        try {
            // Leitura do arquivo JSON
            faturamentoDiario = (JSONArray) parser.parse(new FileReader("dados.json"));

            // Cálculo do menor e do maior valor de faturamento
            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasAcimaDaMedia = 0;

            for (Object obj : faturamentoDiario) {
                double faturamento = (double) obj;
                somaFaturamento += faturamento;
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }

            // Cálculo da média de faturamento diário, ignorando dias sem faturamento
            double mediaFaturamento = somaFaturamento / faturamentoDiario.size();
            int diasComFaturamento = faturamentoDiario.size();
            for (Object obj : faturamentoDiario) {
                double faturamento = (double) obj;
                if (faturamento == 0) {
                    diasComFaturamento--;
                } else if (faturamento > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            // Impressão dos resultados
            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias acima da média: " + diasAcimaDaMedia + " de um total de " + diasComFaturamento + " dias com faturamento.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
