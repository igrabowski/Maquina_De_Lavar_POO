public class Maquina {

    String ligada = "nao";
    String porta = "sim";

    public void ligar() {
        if (porta.equals("sim")) {
            ligada = "sim";
            System.out.println("Máquina ligada!");
        } else {
            System.out.println("Não é possível ligar. Feche a porta.");
        }
    }

    public void desligar() {
        ligada = "nao";
        System.out.println("Máquina desligada!");
    }

    public void fecharPorta() {
        porta = "sim";
        System.out.println("Porta fechada!");
    }

    public void abrirPorta() {
        if (ligada.equals("nao")) {
            porta = "nao";
            System.out.println("Porta aberta!");
        } else {
            System.out.println("Não é possível abrir a porta com a máquina ligada.");
        }
    }

    }
}
