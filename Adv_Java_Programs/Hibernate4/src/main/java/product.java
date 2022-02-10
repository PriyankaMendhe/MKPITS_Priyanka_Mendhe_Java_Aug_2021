import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
    @Id
    private String pid;
    private String pname;
    private int pvalue;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPvalue() {
        return pvalue;
    }

    public void setPvalue(int pvalue) {
        this.pvalue = pvalue;
    }
}
