package mongoboot.domain;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author xd99326
 */
public class Address {

    @Field("str")
    String strasse;

    int plz;

    String ort;

    /**
     * @return the strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @param strasse the strasse to set
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @return the plz
     */
    public int getPlz() {
        return plz;
    }

    /**
     * @param plz the plz to set
     */
    public void setPlz(int plz) {
        this.plz = plz;
    }

    /**
     * @return the ort
     */
    public String getOrt() {
        return ort;
    }

    /**
     * @param ort the ort to set
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

}
