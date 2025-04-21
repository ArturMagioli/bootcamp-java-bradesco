/**
 * Para não bloquear a possibilidade de estender a classe e ainda assim estendê-la para outras classes
 * utilize o modificador 'sealed + permits Class1...' na classse e 'non-sealed' nas classes que podem estendê-la.
 */

public sealed abstract class Employee permits Manager, Salesman {
    
    private String code;

    private String name;

    private String address;

    private int age;

    private double salary;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}