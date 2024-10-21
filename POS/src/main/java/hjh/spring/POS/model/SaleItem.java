package hjh.spring.POS.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SaleItem
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Sale sale;
    private Product product;
    private int quantity;

    public SaleItem()
    {

    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Sale getSale()
    {
        return sale;
    }

    public void setSale(Sale sale)
    {
        this.sale = sale;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
