import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
class emp
 {
     private String name;
     private String  email;
     @EmbeddedId
     private Address add;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public Address getAdd() {
         return add;
     }

     public void setAdd(Address add) {
         this.add = add;
     }
 }