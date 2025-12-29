package ControleDeSenha;

import java.util.Scanner;

public class MainSenha {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.setUsuario("Diane");
        usuario.setSenhaInicial("12345");

        usuario.alterarSenha("12345", "543234"); //ok
        usuario.alterarSenha("11111", "12345"); //erro
    }
}
