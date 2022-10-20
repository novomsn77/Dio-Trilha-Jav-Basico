public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV  smartTV = new SmartTV();

        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual ? " + smartTV.canal);
        System.out.println("Volume Atual ? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("A TV está ligada corretamente ? " + smartTV.ligada);
    }
}
