package teoria;
public non-sealed class Manager extends Employee{
    
    private String login;

    private String password;

    private double comission;

    //Deve-se implementar um construtor caso a superclasse possua um construtor além do padrão
    public Manager() {
        super();
    }

    public Manager(String code, 
                   String name, 
                   String address, 
                   int age, 
                   double salary, 
                   String login, 
                   String password,
                   double comission) 
    {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.comission = comission;
    }

    //realizando um override:
    @Override
    public String getCode() {
        return "MN" + super.getCode(); //sem acesso direto dos próprios atributos herdados da superclasse
                                       // 'protected' seria útil, mas seu problema da-se pelo acesso de outras classes no mesmo pacote 
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }


    /*
     * Sobrescrita do método
     */
    @Override
    public double getFullSalary() {
        return super.getSalary() + comission; //this.getSalary() == super.getSalary();
    }

}
