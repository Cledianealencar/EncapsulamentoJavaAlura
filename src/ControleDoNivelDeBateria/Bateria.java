package ControleDoNivelDeBateria;

public class Bateria {

    private int nivelBateria;

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        } else {
            this.nivelBateria = -1;
        }
    }

    public void statusBateria() {
        if (getNivelBateria() == -1) {
            System.out.println("Erro");
        } else if (getNivelBateria() <= 20) {
            System.out.println("Nível da bateria baixa");
        } else if (getNivelBateria() <= 79) {
            System.out.println("Nível da bateria ok!");
        } else {
            System.out.println("Nível da bateria cheia!");
        }
    }
}
