import java.util.ArrayList;

public class Procedure {

    private String id;
    private ArrayList<Parameter> parameters;

    public Procedure(String id) {
        this.id = id;
        this.parameters = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Parameter> parameters) {
        this.parameters = parameters;
    }

    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }
}
