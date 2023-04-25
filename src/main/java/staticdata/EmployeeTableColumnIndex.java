package staticdata;

public enum EmployeeTableColumnIndex {

    NAME("2"),
    POSITION("3"),
    OFFICE("4"),
    AGE("5"),
    SALARY("6");

     String index;

    EmployeeTableColumnIndex(String index) {

        this.index=index;
    }

    public String getIndex() {

        return index;

    }

}
