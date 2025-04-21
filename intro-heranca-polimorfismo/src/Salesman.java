/**
 * 'final' impede da classe de ser estendida
 * obs: cada classe só pode conter um modificador: sealed, non-sealed e final
 */

public non-sealed class Salesman extends Employee{
    
    private double percentPerSold;

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

}
