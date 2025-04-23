package teoria.interfacesFuncionais;

import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 21), new User("João", 32), new User("Eduardo", 46), new User("Ana", 19));

        // users.forEach(user -> System.out.println(user));
        // users.forEach(System.out::println);
        printStringValue(user -> user.name(), users);
    }

    /**
     * Eu estou recebendo uma expressão lambda (callback) para uma instância da interface Function
     * A interface Function recebe um parâmetro User e retorna uma String (<User, String>).
     * Para cada user da lista, aplica-se o método abstrato da interface Function: apply
     * apply recebe um callback, ou seja, a expressão lambda para cada um dos usuários.
     * @param callback
     * @param users
     */
    public static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
