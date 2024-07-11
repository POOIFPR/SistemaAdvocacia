import java.sql.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Advogado advogado = new Advogado("Dr. Edvaldo",
         "(45) 3745-8186",
         "04099142906",
           "edvaldo@oab.com.br",
            "advog345",
             45.6);
             
        Cliente cliente = new Cliente("Juliany",
         "(43) 3277-6567",
         "33896152963",
          "julyzinha@gmail.com",
           "juju4589@@");

        Compromisso compromisso = new Compromisso("Reunião com a Juliany",
         Date.valueOf("2024-07-19"),
          "14h00");

        ProcessoJudicial processoJudicial = new ProcessoJudicial("Acusação de tentativa de homicídio de Eduardo Costa, ex-marido de Juliany",
         "O suposto fato ocorreu na madrugada do dia 01/07/2024 (Segunda-feira)",
          "Dr. Edvaldo",
           "Juliany, ex-mulher do cantor Eduardo Costa, está enfrentando um processo judicial sob a acusação de tentativa de homicídio contra ele.",
            8, advogado);

        RelatorioFaturamento relatorio = new RelatorioFaturamento("Faturamento do mês de junho",
         "Esse relatório mostra todo o faturamento obtido durante o mês de junho de 2024 pelo escritório do Dr. Edvaldo",
          25000.50);
    }
}
