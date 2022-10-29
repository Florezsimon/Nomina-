package dominio;

public class Directo  extends  Empleado{

    public static  final float APORTE_SALUD = (float) 0.05;
    public static final float APORTE_PENSION = (float) 0.065;

    protected long salario;

    public Directo(String nombre, long salario){
        super(nombre);
        this.salario =salario;
    }

    @Override
    protected long calcularSalario() {
        return salario - calcularAporte();
    }




    private long calcularSalud(){
        return (long)(salario *APORTE_SALUD);
    }


    private long calcularPension(){
        return(long)(salario*APORTE_PENSION);
    }

    private long calcularAporte(){
        return calcularSalud() + calcularPension();
    }

    public String getNombre(){
        return super.getNombre();
    }
}
