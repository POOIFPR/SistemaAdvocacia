import java.util.Date;

public class Advogado extends Usuario{
    NivelAcesso nivel = NivelAcesso.ADVOGADO;
    Double horasTrabalhadasMensais;

    //Registrar horas trabalhadas
    public void setHorasTrabalhadasMensais(Double horasTrabalhadas) {
        this.horasTrabalhadasMensais = horasTrabalhadas;
    }

    public Advogado(String nome, String telefone, String cpf, String email, String senha, Double horasTrabalhadas) {
        super(nome, telefone, cpf, email, senha);
        this.horasTrabalhadasMensais = horasTrabalhadas;
    }

    public Compromisso agendarCompromisso(String nome, Date dataCompromisso, String horario) {
        return new Compromisso(nome, dataCompromisso, horario);
    }

    //Não sei o que adicionar de retorno, por isso o void
    public void acessarInformacoesCaso() {
    }
    
    //Não sei o que adicionar de retorno, por isso o void
    public void enviarDocumentoParaCliente(Cliente cliente) {
    }

    //Não sei o que adicionar de retorno, por isso o void
    public RelatorioFaturamento calcularHorasTrabalhadas(String titulo,
     String corpoDoTexto,
      Double faturamentoTotal) {
        return new RelatorioFaturamento(titulo, corpoDoTexto, faturamentoTotal);
    }
}
