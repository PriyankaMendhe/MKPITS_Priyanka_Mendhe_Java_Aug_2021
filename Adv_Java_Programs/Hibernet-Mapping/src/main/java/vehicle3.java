import javax.persistence.*;

@Entity
public class vehicle3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String vname;

    @ManyToOne
    private user3 usr3;

    public user3 getUsr3() {
        return usr3;
    }

    public void setUsr3(user3 usr3) {
        this.usr3 = usr3;
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
