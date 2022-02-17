import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "FourWheel")//to change column name in table
public class FourWheeler extends Vehicle {

    private String stStering;

    public String getStStering() {
        return stStering;
    }

    public void setStStering(String stStering) {
        this.stStering = stStering;
    }
}
