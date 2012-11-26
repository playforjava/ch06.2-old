package controllers;

import java.util.ArrayList;
import java.util.List;

import models.StockItem;

import org.apache.commons.lang.StringUtils;

import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Product extends Controller {
 
  public static Result index() {
	  return redirect(routes.Product.list(1));
  }

  public static Result list(Long warehouseId) {
	List<StockItem> stockItems = StockItem.find.fetch("product").where().eq("warehouse.id", warehouseId).findList();
	if (request().accepts("text/plain"))
		return ok(StringUtils.join(stockItems, "\n"));
	return ok(products.render(stockItems));
  }
  
} 