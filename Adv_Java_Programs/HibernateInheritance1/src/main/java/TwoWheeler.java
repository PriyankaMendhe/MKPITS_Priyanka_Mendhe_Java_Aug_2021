import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TwoWheel")
public class TwoWheeler extends Vehicle {

    private String stHandle;

    public String getStHandle() {
        return stHandle;
    }

    public void setStHandle(String stHandle) {
        this.stHandle = stHandle;
    }
}
