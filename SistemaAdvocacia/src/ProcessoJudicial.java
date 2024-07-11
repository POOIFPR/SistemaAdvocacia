public class ProcessoJudicial {
    String titulo;
    String subtitulo;
    String autor;
    String corpoDoTexto;
    Integer numeroPaginas;
    Advogado advogado;
    public ProcessoJudicial(String titulo, String subtitulo, String autor, String corpoDoTexto, Integer numeroPaginas,
            Advogado advogado) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.autor = autor;
        this.corpoDoTexto = corpoDoTexto;
        this.numeroPaginas = numeroPaginas;
        this.advogado = advogado;
    }
}
