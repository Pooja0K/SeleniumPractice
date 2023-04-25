package staticdata;
public enum WidgetTypeTest {
//Enum is like a class in java
// Enum is faster than class & by default variable in enum is public static final
    ACCORDION("accordion"),
    AUTOCOMPLETE("autocomplete"),
    BUTTON("button");

    final String value;
    WidgetTypeTest(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
