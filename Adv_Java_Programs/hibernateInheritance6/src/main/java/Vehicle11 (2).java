import javax.persistence.*;

@Entity
@NamedQuery(name="vehicleByID",query = "from Vehicle11 where vid> :Id")
@NamedNativeQuery(name="vehicleByNAme",query = "select * from Vehicle11 where vname='KIA'", resultClass = Vehicle11.class)
public class Vehicle11 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vid", nullable = false)
    private Integer vid;

    private String vname;


    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}
