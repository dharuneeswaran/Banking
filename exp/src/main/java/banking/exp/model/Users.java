package banking.exp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users {

    private String name;
    @Id
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}