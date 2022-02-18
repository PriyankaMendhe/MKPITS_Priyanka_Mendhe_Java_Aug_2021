import javax.persistence.Entity;

@Entity
public class TwoWheel8 extends  Vehicle8{

    private String StrHandle;

    public String getStrHandle() {
        return StrHandle;
    }

    public void setStrHandle(String strHandle) {
        StrHandle = strHandle;
    }
}
