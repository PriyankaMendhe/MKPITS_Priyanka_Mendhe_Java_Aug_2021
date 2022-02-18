import javax.persistence.Entity;

@Entity
public class twoWheelar1 extends Vehicle7 {
    private String strHandle;

    public String getStrHandle() {
        return strHandle;
    }

    public void setStrHandle(String strHandle) {
        this.strHandle = strHandle;
    }
}
