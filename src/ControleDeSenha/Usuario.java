package ControleDeSenha;

public class Usuario {
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenhaInicial(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (!senhaAtual.equals(this.senha)){
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }else{
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }
    }
}
