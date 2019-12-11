package mongoboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Tobias Trelle
 */
@Document(collection = "pois")
public class PointOfInterest {

    @Id
    int id;

    String name;

    String[] typ;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tags
     */
    public String[] getTyp() {
        return typ;
    }

    /**
     * @param tags the tags to set
     */
    public void setTyp(String[] typ) {
        this.typ = typ;
    }

}
