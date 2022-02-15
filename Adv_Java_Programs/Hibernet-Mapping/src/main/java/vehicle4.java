import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class vehicle4{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String vname;


    @ManyToMany
    private Collection<User4> usr4 = new ArrayList<User4>();

    public Collection<User4> getUsr4() {
        return usr4;
    }

    public void setUsr4(Collection<User4> usr4) {
        this.usr4 = usr4;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
