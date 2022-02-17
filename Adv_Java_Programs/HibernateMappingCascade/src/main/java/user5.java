import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class user5 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<veh5> vob = new ArrayList<veh5>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<veh5> getVob() {
        return vob;
    }

    public void setVob(Collection<veh5> vob) {
        this.vob = vob;
    }
}
