public class Cliente extends Usuario{
    NivelAcesso nivel = NivelAcesso.CLIENTE;

    public Cliente(String nome, String telefone, String cpf, String email, String senha) {
        super(nome, telefone, cpf, email, senha);
    }

}
