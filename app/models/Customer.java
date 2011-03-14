package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Customer extends Model {
    @Required
    public String name;

    @Override
    public String toString() {
        return name;
    }
}
