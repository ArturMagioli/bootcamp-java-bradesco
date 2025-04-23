package teoria;
public class App {
    public static void main(String[] args) throws Exception {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    /**
     * O java não reconhece as propriedades de subclasses a partir de uma classe mais geneérica.
     * Eis algumas formas para ele reconhecer:
     * @param employee
     */
    public static void printEmployee(Employee employee) {
        //primeira opção: casting
        // ((Manager)employee).setLogin("João");


        //Segunda opção: instanceof (verifica se o objeto é instância de uma classe) + apelido (nova variável com casting)
        // if (employee instanceof Manager manager){
        //     manager.setName("João");
        //     manager.setLogin("joao");
        //     manager.setPassword("123456");

        //     System.out.printf("=====================%s======================\n", employee.getClass().getCanonicalName());
        //     System.out.println(manager.getName());
        //     System.out.println(manager.getLogin());
        //     System.out.println(manager.getPassword());
        // }

        /**
        /* Terceira opção: switch-case com instâncias. Pode-se aplicar para
        /* não ter que lidar com uma gama de objetos com várias instâncias:
        /* Deve-se conter todas as instâncias possíveis da super-classe caso a mesma seja sealed
        /* um default caso não seja sealed
        */
        switch (employee) {
            //manager == (Manager)manager, mas manager acessa as propriedades da subclasse!
            //Realiza um casting seguro de employee em manager:
            case Manager manager ->{
                    manager.setCode("123");
                    manager.setName("Lucas");
                    manager.setSalary(5000);
                    manager.setLogin("lucas");
                    manager.setPassword("123456");
                    manager.setComission(1200);

                    System.out.println(manager.getCode());
                    System.out.println(manager.getSalary());
                    System.out.println(manager.getName());
                    System.out.println(manager.getLogin());
                    System.out.println(manager.getPassword());
                    System.out.println(manager.getComission());
            }
            case Salesman salesman -> {
                salesman.setCode("456");
                salesman.setName("João");
                salesman.setSalary(2800);
                salesman.setSoldAmount(1000);
                salesman.setPercentPerSold(10);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
            default ->{
                System.out.println("Nenhuma instancia desse tipo!");
            }
        }
        /*
         * observe que não é necessário casting para métodos abstratos:
         * OBSERVE O POLIMORFISMO!
         */
        System.out.println(employee.getFullSalary());
        System.out.println(employee.getFullSalary(500));
        System.out.println("================================================");
    }
}
