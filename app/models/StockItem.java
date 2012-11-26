package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

/**
 * 
 */
@Entity 
public class StockItem extends Model {

    @Id
    public Long id;
    
    @ManyToOne
    public Warehouse warehouse;
    @ManyToOne(fetch = FetchType.EAGER)
	public Product product;
	public Long quantity;
	
	/**
     * Generic query helper for entity Company with id Long
     */
    public static Model.Finder<Long,StockItem> find = new Model.Finder(Long.class, StockItem.class);


	public String toString() {
		return product.name + " - " + quantity;
	}
}