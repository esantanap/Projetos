public class Usuario {    // Controle Remoto
    public static void main(String[] args) throws Exception {
        System.out.println("TV DESLIGADA");

        SmartTv smartTv = new SmartTv(); // Classe Variavel = new Classe

        // Imprimir o estado Inicial

        System.out.println("A TV está Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);
        
        // Mudar Estado

        smartTv.ligar();
        System.out.println("A TV está Ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("A TV está Ligada ? " + smartTv.ligada);

        // Mudar Canal

        smartTv.maisCanal();
        System.out.println("Canal Atual " + smartTv.canal);
        smartTv.manosCanal();
        System.out.println("Canal Atual " + smartTv.canal);

        // Mudar Volume
        smartTv.maisVolume();
        System.out.println("Volume Atual " + smartTv.volume);
        smartTv.maisVolume();
        System.out.println("Volume Atual " + smartTv.volume);
        smartTv.maisVolume();
        System.out.println("Volume Atual " + smartTv.volume);
        smartTv.maisVolume();
        System.out.println("Volume Atual " + smartTv.volume);
        smartTv.menosVolume();
        System.out.println("Volume Atual " + smartTv.volume);
        


    }
}
