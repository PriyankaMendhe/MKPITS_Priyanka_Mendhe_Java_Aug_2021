import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class emp {

    private String ename;
    private String email;
    @EmbeddedId
    private Address adr;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdr() {
        return adr;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
    }
}
