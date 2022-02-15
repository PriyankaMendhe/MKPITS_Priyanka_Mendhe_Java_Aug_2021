import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class user3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String uname;

    @OneToMany(mappedBy = "usr3")
    private Collection<vehicle3> vob = new ArrayList<vehicle3>();

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Collection<vehicle3> getVob() {
        return vob;
    }

    public void setVob(Collection<vehicle3> vob) {
        this.vob = vob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
