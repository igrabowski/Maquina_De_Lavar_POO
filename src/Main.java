public class Main {

    public static void main(String[] args) {

        MaquinaDeLavar maquina = new MaquinaDeLavar();

        System.out.println("TESTANDO RESTRIÇÕES");

        maquina.iniciarLavagem();
        maquina.ligar();
        maquina.ligar();
        maquina.iniciarLavagem();
        maquina.abrirPorta();
        maquina.pausarLavagem();
        maquina.abrirPorta();
        maquina.desligar();
        maquina.retomarLavagem();
        maquina.concluirLavagem();
        
        System.out.println();
        System.out.println("CENTRIFUGAÇÃO");

        maquina.iniciarCentrifugacao();
        maquina.abrirPorta();
        maquina.desligar();
        maquina.concluirCentrifugacao();

        System.out.println();
        System.out.println("FINALIZANDO");

        maquina.desligar();
        maquina.desligar();
        maquina.abrirPorta();
        maquina.fecharPorta();
    }
}
