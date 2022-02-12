import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String pname;
    private int pValue;
    private String pid;
    private  String pinfo1;
    private static String pManufacturer;
    @Transient
    private String pSupply;// showing null in table.

    private Date dos;//date and time of supply;

    @Temporal(TemporalType.DATE)
    private Date dot;//time of supply only

    @Temporal(TemporalType.TIME)
    private Date dos1;//date only

    @Lob
    private String pdesc;

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public Date getDot() {
        return dot;
    }

    public void setDot(Date dot) {
        this.dot = dot;
    }

    public Date getDos1() {
        return dos1;
    }

    public void setDos1(Date dos1) {
        this.dos1 = dos1;
    }

    public Date getDos() {
        return dos;
    }

    public void setDos(Date dos) {
        this.dos = dos;
    }

    public String getpSupply() {
        return pSupply;
    }

    public void setpSupply(String pSupply) {
        this.pSupply = pSupply;
    }

    public static String getpManufacturer() {
        return pManufacturer;
    }

    public static void setpManufacturer(String pManufacturer) {
        ProductEntry.pManufacturer = pManufacturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getpValue() {
        return pValue;
    }

    public void setpValue(int pValue) {
        this.pValue = pValue;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public  String getPinfo1() {
        return pinfo1;
    }

    public void setPinfo1(String pinfo1) {
        this.pinfo1 = pinfo1;
    }
}
