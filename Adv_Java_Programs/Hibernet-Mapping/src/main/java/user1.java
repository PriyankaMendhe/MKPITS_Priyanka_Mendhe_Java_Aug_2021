import javax.persistence.*;

@Entity
public class user1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String uname;

    @OneToOne
    private vehicle1 veh;

    public vehicle1 getVeh() {
        return veh;
    }

    public void setVeh(vehicle1 veh) {
        this.veh = veh;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
