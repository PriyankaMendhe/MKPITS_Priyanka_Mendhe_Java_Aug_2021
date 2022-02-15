import javax.persistence.*;

@Entity
public class emp2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String ename;


    @Embedded
    @AttributeOverrides({

             @AttributeOverride(name= "pincode", column =@Column(name="home_pin" )),
            @AttributeOverride(name= "city", column =@Column(name="home_city" )),
            @AttributeOverride(name= "state", column =@Column(name="home_state" ))

    })
    private Address home_ad;

    @Embedded
    @AttributeOverrides({

            @AttributeOverride(name= "pincode", column =@Column(name="office_pin" )),
            @AttributeOverride(name= "city", column =@Column(name="office_city" )),
            @AttributeOverride(name= "state", column =@Column(name="office_state" ))

    })
    private Address office_ad;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Address getHome_ad() {
        return home_ad;
    }

    public void setHome_ad(Address home_ad) {
        this.home_ad = home_ad;
    }

    public Address getOffice_ad() {
        return office_ad;
    }

    public void setOffice_ad(Address office_ad) {
        this.office_ad = office_ad;
    }
}
