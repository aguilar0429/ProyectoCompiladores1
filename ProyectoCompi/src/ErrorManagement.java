public class ErrorManagement {
    int fila;
    int columna;
    String instruccion;
    String descripcion;
    ErrorTipo tipo;

    public ErrorManagement(int fila, int columna, String instruccion, String descripcion, ErrorTipo tipo) {
        this.fila = fila;
        this.columna = columna;
        this.instruccion = instruccion;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public enum ErrorTipo {
        Lexico,
        Sintactico,
        Semantico
    }
    @Override
    public String toString() {
        return "manejoErrores{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", instruccion='" + instruccion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
