package CursoStchigel.quiz;

import java.util.ArrayList;

public class DepartmentFinder {
    private ArrayList<Department> depts;

    public DepartmentFinder() {
        this.depts = new ArrayList<>();
    }

    public Department find(int num){
        return this.depts.get(num);
    }

    public void addDep(Department dep){
        this.depts.add(dep);
    }
}
