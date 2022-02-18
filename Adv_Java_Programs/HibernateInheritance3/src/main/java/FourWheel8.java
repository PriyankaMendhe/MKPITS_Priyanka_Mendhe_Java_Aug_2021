import javax.persistence.Entity;

@Entity
public class FourWheel8 extends Vehicle8{

    private String strStering;

    public String getStrStering() {
        return strStering;
    }

    public void setStrStering(String strStering) {
        this.strStering = strStering;
    }
}
