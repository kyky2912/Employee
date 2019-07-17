public class Employee implements Taxable {
    protected String name;
    protected double salary;

    boolean isNameValid(String name) {
        if (name.equals("")) {
            return false;
        }
        return true;
    }

    boolean isSalaryValid(double salary) {
        if (salary >= 0) {
            return true;
        }
        return false;
    }

    public void setName(String name) {
        if (isNameValid(name)) {
            this.name = name;
        }
        else {
            throw new RuntimeException("Data Anda tidak valid");
        }
    }

    public void setSalary(double salary) {
        if (isSalaryValid(salary)) {
            this.salary = salary;
        } else {
            throw new RuntimeException("Data tidak valid");
        }
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getTakeHomePay() {
        return this.salary;
    }

    public double getTax() {
        return getSalary() * 0.1;
    }
}
