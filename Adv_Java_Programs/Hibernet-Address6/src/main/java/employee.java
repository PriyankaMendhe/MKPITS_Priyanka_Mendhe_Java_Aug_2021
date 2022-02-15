import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Entity
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ElementCollection(fetch =FetchType.EAGER)
   @JoinTable(name="Eaddress",joinColumns = @JoinColumn(name="Employeeid"))
    Set<Address> ad1 = new HashSet<Address>();


    public Set<Address> getAd1() {
        return ad1;
    }

    public void setAd1(Set<Address> ad1) {
        this.ad1 = ad1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ad1=" + ad1 +
                '}';
    }
}
