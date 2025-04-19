package teoria;
public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("João", 20);
        // Person.nomeEstatico = "Maria";
        System.out.println(person);
        System.out.println(person.getInfo());
        // System.out.println(Person.nomeEstatico);
    }
}
