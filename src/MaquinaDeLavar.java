public class Maquina {

    String ligada = "nao";
    String porta = "sim";
    String lavando = "nao";
    String centrifugando = "nao";

    public void ligar() {

        if (ligada.equals("sim")) {
            System.out.println("A máquina já está ligada!");
        } else {
            ligada = "sim";
            System.out.println("Máquina ligada!");
        }
    }

    public void desligar() {

        if (ligada.equals("nao")) {
            System.out.println("A máquina já está desligada!");
        } else if (lavando.equals("sim") || lavando.equals("pausada")) {
            System.out.println("Não é possível desligar enquanto a lavagem estiver em andamento ou pausada.");
        } else if (centrifugando.equals("sim")) {
            System.out.println("Não é possível desligar enquanto a máquina estiver centrifugando.");
        } else {
            ligada = "nao";
            System.out.println("Máquina desligada!");
        }
    }

    public void fecharPorta() {

        if (porta.equals("sim")) {
            System.out.println("A porta já está fechada!");
        } else {
            porta = "sim";
            System.out.println("Porta fechada!");
        }
    }

    public void abrirPorta() {

        if (lavando.equals("sim") || lavando.equals("pausada")) {
            System.out.println("Não é possível abrir a porta durante a lavagem.");
        } else if (centrifugando.equals("sim")) {
            System.out.println("Não é possível abrir a porta durante a centrifugação.");
        } else {
            porta = "nao";
            System.out.println("Porta aberta!");
        }
    }
    public void iniciarLavagem() {

        if (ligada.equals("nao")) {
            System.out.println("Não é possível iniciar a lavagem. A máquina está desligada.");
        } else if (porta.equals("nao")) {
            System.out.println("Não é possível iniciar a lavagem. Feche a porta.");
        } else if (lavando.equals("sim")) {
            System.out.println("A máquina já está lavando!");
        } else if (lavando.equals("pausada")) {
            System.out.println("A lavagem está pausada. Use retomarLavagem().");
        } else {
            lavando = "sim";
            System.out.println("Lavagem iniciada!");
        }
    }

    public void pausarLavagem() {

        if (ligada.equals("nao")) {
            System.out.println("Não é possível pausar. A máquina está desligada.");
        } else if (!lavando.equals("sim")) {
            System.out.println("Não é possível pausar. A máquina não está lavando.");
        } else {
            lavando = "pausada";
            System.out.println("Lavagem pausada!");
        }
    }

    public void retomarLavagem() {

        if (ligada.equals("nao")) {
            System.out.println("Não é possível retomar. A máquina está desligada.");
        } else if (!lavando.equals("pausada")) {
            System.out.println("Não é possível retomar. A lavagem não está pausada.");
        } else {
            lavando = "sim";
            System.out.println("Lavagem retomada!");
        }
    }

    public void concluirLavagem() {

        if (!lavando.equals("sim")) {
            System.out.println("Não é possível concluir. A máquina não está lavando.");
        } else {
            lavando = "nao";
            System.out.println("Lavagem concluída!");
        }
    }
public void iniciarCentrifugacao() {

        if (ligada.equals("nao")) {
            System.out.println("Não é possível centrifugar. A máquina está desligada.");
        } else if (lavando.equals("sim") || lavando.equals("pausada")) {
            System.out.println("Não é possível centrifugar enquanto a lavagem não estiver concluída.");
        } else if (centrifugando.equals("sim")) {
            System.out.println("A máquina já está centrifugando!");
        } else if (porta.equals("nao")) {
            System.out.println("Não é possível centrifugar. Feche a porta.");
        } else {
            centrifugando = "sim";
            System.out.println("Centrifugação iniciada!");
        }
    }

    public void concluirCentrifugacao() {

        if (!centrifugando.equals("sim")) {
            System.out.println("Não é possível concluir. A máquina não está centrifugando.");
        } else {
            centrifugando = "nao";
            System.out.println("Centrifugação concluída!");
        }
    }
}
