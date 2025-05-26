package CursoStchigel.quiz;

public class Main {
    public static void main(String[] args) {
        DepartmentFinder df1=new DepartmentFinder();
        Employee e1= new Employee();
        Department d1 = new Department();
        d1.setName("Accounting");
        df1.addDep(d1);
        e1.setDep(df1.find(1));
        for (Employee employee : d1.getEmployees()){
            System.out.println("Nombre: "+employee.getName());
        }
    }
}
