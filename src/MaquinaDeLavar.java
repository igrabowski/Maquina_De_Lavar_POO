ublic class Maquina {

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
