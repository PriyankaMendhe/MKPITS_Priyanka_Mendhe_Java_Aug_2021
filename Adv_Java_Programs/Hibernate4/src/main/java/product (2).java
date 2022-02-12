import javax.persistence.*;

@Entity
@Table(name = "ProductDetails")
public class product {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "ProductID")
    private String pid;

    @Column(name = "ProductName")
    private String pname;

    @Column(name = "ProductValue")
    private int pvalue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
