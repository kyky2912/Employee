public class ComissionEmployee extends Employee implements Taxable {
    protected double comission;

    boolean isNilaiValid(double nilai) {
        if (nilai>=0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setComission(double comission){
        if (isNilaiValid(comission)) {
            this.comission = comission;
        }
        else {
            throw new RuntimeException("Data tidak valid");
        }
    }

    public double getComissionEmployee() {
        return getSalary() + this.comission;
    }

    public double getComission() {
        return this.comission;
    }

    public double getTakeHomePay() {
        return getSalary() + getComission() - getTax();
    }

    public double getTax() {
        return getSalary() * 0.1;
    }
}
