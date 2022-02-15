import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String uname;

    @ManyToMany
    private Collection<vehicle4> vob = new ArrayList<vehicle4>();

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Collection<vehicle4> getVob() {
        return vob;
    }

    public void setVob(Collection<vehicle4> vob) {
        this.vob = vob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
