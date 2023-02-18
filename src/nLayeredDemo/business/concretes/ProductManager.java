package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("Bu kateqoride urun kabul edilmiyor");
        }
      /*  HibernateProductDao dao=new HibernateProductDao();
        dao.add(product);-> bu bagimliligin qarsini almaq ucun yuxarida gedib private deyiseini yaradiriq*/
        this.productDao.add(product);
        this.loggerService.logToSystem("urun eklendi"+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
