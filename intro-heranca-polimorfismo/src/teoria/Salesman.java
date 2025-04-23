package teoria;
/**
 * 'final' impede da classe de ser estendida
 * obs: cada classe só pode conter um modificador: sealed, non-sealed e final
 */

public non-sealed class Salesman extends Employee{
    
    private double percentPerSold;

    private double soldAmount;

    public Salesman() {
        super();
    }

    public Salesman(String code, 
                    String name, 
                    String address, 
                    int age, 
                    double salary, 
                    double percentPerSold,
                    double soldAmount) {

        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    /**
     * Para métodos abstratos, temos as seguintes opções para validar esse método:
     *  - deve-se implementá-lo na subclasse;
     *  - a subclasse deve ser abstrata.
     */
    @Override
    public double getFullSalary() {
        return this.getSalary() + (soldAmount * percentPerSold) / 100;
    }
}
