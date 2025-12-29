package ControleDoNivelDeBateria;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();

        bateria.setNivelBateria(15);//baixa
        bateria.statusBateria();

        bateria.setNivelBateria(50);//ok
        bateria.statusBateria();

        bateria.setNivelBateria(80);//cheia
        bateria.statusBateria();

        bateria.setNivelBateria(0);//baixa
        bateria.statusBateria();

        bateria.setNivelBateria(555);//erro
        bateria.statusBateria();

        bateria.setNivelBateria(-50);//erro
        bateria.statusBateria();
    }
}
