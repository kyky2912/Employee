public class TestEmployee {

    public static void main(String []args) {
        ComissionEmployee sam;
        sam = new ComissionEmployee();
        sam.setName("sam");
        sam.setSalary(400.0);
        sam.setComission(100.0);

        System.out.printf("Nama : %s \n", sam.getName());
        System.out.printf("Salary : %.2f\n", sam.getSalary());
        System.out.printf("Comission : %.2f\n", sam.getComission());
        System.out.printf("Tax: %.2f\n", sam.getTax());
        System.out.printf("Salary + Comission %.2f\n", sam.getComissionEmployee());
        System.out.printf("Total Gaji %.2f\n", sam.getTakeHomePay());
    }
}
