package hjh.spring.POS.service;

import hjh.spring.POS.model.Sale;
import hjh.spring.POS.model.SaleItem;
import hjh.spring.POS.repository.SaleRepository;

public class SaleService
{
    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository)
    {
        this.saleRepository = saleRepository;
    }

    public void saveSale(Sale sale)
    {
        saleRepository.saveSale(sale);
    }

    public void saveSaleItem(SaleItem saleItem, Long saleId)
    {
        saleRepository.saveSaleItem(saleItem, saleId);
    }

    public void updateSale(Sale sale)
    {
        saleRepository.updateSale(sale);
    }

    public void updateSaleItem(SaleItem saleItem)
    {
        saleRepository.updateSaleItem(saleItem);
    }

    public void deleteSaleItem(Long saleItemId)
    {
        saleRepository.deleteSaleItem(saleItemId);
    }

    public void deleteAllSaleItems()
    {
        saleRepository.deleteAllSaleItems();
    }

    public void deleteSale(Long saleId)
    {
        saleRepository.deleteSaleById(saleId);
    }
}
