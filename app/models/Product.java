package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

/**
 * 
 */
@Entity 
public class Product extends Model {

    @Id
    public Long id;
    
	public String ean;
	
	@Constraints.Required
    public String name;
   
	public String description;
	 
	
}