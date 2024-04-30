public class Variable {

    private String id, type;
    private Object value;

    public Variable() {
    }

    public Variable(String id, String type, Object value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Variable\n" +
                "\tid: '" + id + '\n' +
                "\ttype: '" + type + '\n' +
                "\tvalue: '" + value + "\n-----------------------\n";
    }
}