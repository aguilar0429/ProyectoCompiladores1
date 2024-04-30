import java.sql.SQLOutput;
import java.util.ArrayList;

public class SymbolTable {
    private ArrayList <Variable> variables;
    private ArrayList <Function> functions;

    private ArrayList <Procedure> procedures;

    public SymbolTable(){
        this.variables = new ArrayList<>();
        this.functions = new ArrayList<>();
        this.procedures = new ArrayList<>();
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public ArrayList<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(ArrayList<Function> functions) {
        this.functions = functions;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    public ArrayList<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(ArrayList<Procedure> procedures) {
        this.procedures = procedures;
    }

    public void addVariable(Variable variable) {
        this.variables.add(variable);
    }

    public void addFunction(Function function) {
        this.functions.add(function);
    }

    public void addProcedure(Procedure procedure) {
        this.procedures.add(procedure);
    }

    public void printSymbolTable(){
        System.out.println();
        System.out.println("                      SYMBOL TABLE:                      ");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("|                       VARIABLES                       |");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%20s %13s %15s", "IDENTIFIER", "TYPE", "VALUE");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        for (Variable variable:this.variables) {
            System.out.printf("%20s %13s %15s", variable.getId(), variable.getType(), variable.getValue());
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
        System.out.println();
        if (this.functions.size() != 0) {
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("|                                               FUNCTIONS                                               |");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.printf("%20s %28s %45s", "IDENTIFIER", "RETURN TYPE", "PARAMETERS");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------------------");
            for (Function function : this.functions) {
                System.out.printf("%20s %28s %45s", function.getId(), function.getReturnType(), function.getParameters().toString());
                System.out.println();
            }
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
        if (this.procedures.size() != 0) {
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("|                                          PROCEDURES                                          |");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.printf("%20s %65s", "IDENTIFIER", "PARAMETERS");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------");
            for (Procedure procedure : this.procedures) {
                System.out.printf("%20s %65s", procedure.getId(), procedure.getParameters().toString());
                System.out.println();
            }
            System.out.println("------------------------------------------------------------------------------------------------");
        }
    }

}