package phone.phone_market.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "market")
public class Phone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "concern")
    private String concern;

    @Column(name = "name")
    private String name;
    @Column(name = "model")
    private String model;

    public Phone(Integer id, String concern, String name, String model) {
        this.id = id;
        this.concern = concern;
        this.name = name;
        this.model = model;
    }

    public Phone() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
