import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private String bid;
    private String bname;
    private int bPrice;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getbPrice() {
        return bPrice;
    }

    public void setbPrice(int bPrice) {
        this.bPrice = bPrice;
    }
}
