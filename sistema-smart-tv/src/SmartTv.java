public class SmartTv {
    //Caracteristicas da tv - Atributos - Estado Inicial
    boolean ligada = false;
    int canal = 13;
    int volume = 1;

   // Criar Metodos que manipulam estes estados

   public void ligar(){
    ligada = true;
   }
   public void desligar(){
    ligada = false;
   }

   // Mudar canal

   public void maisCanal(){
    canal = canal + 1;
   };
   public void manosCanal(){
    canal = canal - 1;
   }

    // Mudar Volume

    public void maisVolume (){
    volume = volume + 1;
    }

    public void menosVolume(){
        volume = volume - 1;
    }

}
