public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Status atual -> Tv ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status atual -> Tv ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();;
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: "+smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("Canal atual: "+smartTv.canal);


    }
}
