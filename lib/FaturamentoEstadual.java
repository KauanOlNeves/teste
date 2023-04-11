public class FaturamentoEstadual {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double faturamentoTotal = sp + rj + mg + es + outros;

        double pctSp = (sp / faturamentoTotal) * 100;
        double pctRj = (rj / faturamentoTotal) * 100;
        double pctMg = (mg / faturamentoTotal) * 100;
        double pctEs = (es / faturamentoTotal) * 100;
        double pctOutros = (outros / faturamentoTotal) * 100;

        System.out.printf("Percentual de faturamento de SP: %.2f%%\n", pctSp);
        System.out.printf("Percentual de faturamento de RJ: %.2f%%\n", pctRj);
        System.out.printf("Percentual de faturamento de MG: %.2f%%\n", pctMg);
        System.out.printf("Percentual de faturamento de ES: %.2f%%\n", pctEs);
        System.out.printf("Percentual de faturamento de Outros: %.2f%%\n", pctOutros);
    }
}
