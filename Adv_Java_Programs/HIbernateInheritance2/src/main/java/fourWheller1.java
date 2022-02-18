import javax.persistence.Entity;

@Entity
public class fourWheller1 extends Vehicle7{

    private String strwheel;

    public String getStrwheel() {
        return strwheel;
    }

    public void setStrwheel(String strwheel) {
        this.strwheel = strwheel;
    }
}
