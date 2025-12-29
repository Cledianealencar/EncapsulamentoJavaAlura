package AgendaDeContatos;

import java.util.ArrayList;

public class MainAgenda {
    public static void main(String[] args) {

        ArrayList<Agenda> contatos = new ArrayList<>();
        int contador = 1;

        contatos.add(new Agenda("Maria", "123-123"));
        contatos.add(new Agenda("João", "456-123"));
        contatos.add(new Agenda("Diane", "789-123"));

        System.out.println("======================================");
        System.out.println("        Agenda de contatos");
        System.out.println("======================================");

        for (Agenda contato : contatos){

            contador ++;
            System.out.printf("%d. %s - %s\n",
                    contador,
                    contato.getNome(),
                    contato.getNumero());

        }
    }
}
