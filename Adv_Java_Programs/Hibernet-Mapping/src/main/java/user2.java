import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class user2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String uname;

    @OneToMany
    private Collection<vehicle2> vob = new ArrayList<vehicle2>();

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Collection<vehicle2> getVob() {
        return vob;
    }

    public void setVob(Collection<vehicle2> vob) {
        this.vob = vob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
