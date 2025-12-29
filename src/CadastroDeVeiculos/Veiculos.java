package CadastroDeVeiculos;

public class Veiculos {
    private String modelo;
    private String placa;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }


    public int getAno() {
        return ano;
    }


    public Veiculos(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String exibirVeiculos(){
        return String.format(
          "Veículo cadastrado:\n" +
                  "Modelo: %s\n" +
                  "Placa: %s\n" +
                  "Ano: %d", modelo, placa, ano
        );
    }
}
