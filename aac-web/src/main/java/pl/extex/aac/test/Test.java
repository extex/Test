package pl.extex.aac.test;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;

/**
 * Created by Darek on 2015-01-29.
 */
@Component
//@Scope("session")
public class Test {
    private String someVariable = "xxx";

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }
}
