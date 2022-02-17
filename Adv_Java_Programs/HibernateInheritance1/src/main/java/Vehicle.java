import javax.persistence.*;

@Entity
//@DiscriminatorColumn(name="VehicleType", discriminatorType = DiscriminatorType.STRING)// to change DTYpe(system Generated name) column name to Vehicle Type

//to set table per class following annotation
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "v_id", nullable = false)
    private Integer vID;

    private String vName;

    public Integer getvID() {
        return vID;
    }

    public void setvID(Integer vID) {
        this.vID = vID;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }


}
