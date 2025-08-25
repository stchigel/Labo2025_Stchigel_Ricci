package electricidad;

public class Main {
    public static void main(String[] args) {
        Duenio d1 = new Duenio("Juan", "Domingues", 23745672);
        Casa c1 = new Casa("Avenida chorroarin 4235", 1435, d1, 30, 40);
        Duenio d2 = new Duenio("Maria", "Lopez", 30456789);
        Casa c2 = new Casa("Calle San Martín 1234", 1406, d2, 50, 20);
        Duenio d3 = new Duenio("Carlos", "Ramirez", 27890123);
        Casa c3 = new Casa("Boulevard Rivadavia 4521", 1708, d3, 80, 35);
        Duenio d4 = new Duenio("Lucia", "Fernandez", 32567890);
        Departamento c4 = new Departamento("Pasaje Lavalle 987", 1014, d4, 3);
        Duenio d5 = new Duenio("Pedro", "Gomez", 29543218);
        Departamento c5 = new Departamento("Avenida Corrientes 7532", 1190, d5, 5);

        c1.addConsumo(Mes.AGOSTO, 300);
        c1.addConsumo(Mes.SEPTIEMBRE, 250);

        c2.addConsumo(Mes.OCTUBRE, 200);
        c2.addConsumo(Mes.NOVIEMBRE, 180);

        c3.addConsumo(Mes.ENERO, 400);
        c3.addConsumo(Mes.FEBRERO, 350);

        c4.addConsumo(Mes.MARZO, 220);
        c4.addConsumo(Mes.MAYO, 270);

        c5.addConsumo(Mes.JUNIO, 500);
        c5.addConsumo(Mes.JULIO, 450);

        System.out.println("la casa 1 debe $"+c1.calcConsumo(Mes.AGOSTO)+" de agosto");

    }
}
