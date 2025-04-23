package exercicio.ex003;

public class Main {
    public static void main(String[] args) {
        try {
            Clock br = new BrazilianClock(22, 39, 50);
            System.out.println(br.getTime());
        }catch(TimeFormatterException e) {
            System.out.println("Error: " + e.getMessage());
        }            
    }
}
