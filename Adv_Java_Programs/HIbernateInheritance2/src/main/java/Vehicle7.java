import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle7 {
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
