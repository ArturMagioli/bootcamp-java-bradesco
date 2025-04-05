public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarttv = new SmartTv();

        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.aumentarVolume();

        smarttv.mudarCanal(13);

        System.out.println("Volume atual : " + smarttv.volume);

        System.out.println("TV Ligada?: " + smarttv.ligada);
        System.out.println("Canal atual?: " + smarttv.canal);

        smarttv.ligar();
        System.out.println("TV Ligada?: " + smarttv.ligada);
    }
}
