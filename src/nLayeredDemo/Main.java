package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductService productService=new ProductManager(new HibernateProductDao());

        Product product=new Product(1,1,"Elma",12,50);
        productService.add(product);





    }

}
