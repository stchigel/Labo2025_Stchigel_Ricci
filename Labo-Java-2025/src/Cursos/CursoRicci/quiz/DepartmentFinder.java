package Cursos.CursoRicci.quiz;

import java.util.ArrayList;

public class DepartmentFinder {
    private ArrayList<Department> deparments;

    public DepartmentFinder() {
        this.deparments = new ArrayList<>();
    }

    public Department find(int num){
        return this.deparments.get(num);
    }

    public void addDeparment(Department deparment){
        this.deparments.add(deparment);
    }
}
