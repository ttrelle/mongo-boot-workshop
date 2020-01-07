package mongoboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Tobias Trelle
 */
@Document(collection = "pois")
public class PointOfInterest {

    @Id
    int id;

    String name;

    String[] typ;

    @Field("desc")
    String descripton;

    Address adresse;

    GeoJsonPoint location;

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

    /**
     * @return the descripton
     */
    public String getDescripton() {
        return descripton;
    }

    /**
     * @param descripton the descripton to set
     */
    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    /**
     * @return the adresse
     */
    public Address getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Address adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the location
     */
    public GeoJsonPoint getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

}
