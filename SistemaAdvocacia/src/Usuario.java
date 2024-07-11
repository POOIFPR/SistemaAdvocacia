public abstract class Usuario {
    String nome;
    String telefone;
    String cpf;
    String email;
    String senha;
    public Usuario(String nome, String telefone, String cpf, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
}
