package com.micros.service2.Service2.services;

import com.micros.service2.Service2.entity.AcknowledgementClass;
import com.micros.service2.Service2.entity.Manufactuer;
import com.micros.service2.Service2.entity.Product;
import com.micros.service2.Service2.repo.ManuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ManufacturerServices {

    @Autowired
    private ManuRepo manuRepo;

    @Autowired
    private RestTemplate restTemplate;


    public Manufactuer addProduct(Manufactuer manufactuer)
    {
       return manuRepo.save(manufactuer);
    }

    public AcknowledgementClass getManuDetails(Integer id)
    {
        AcknowledgementClass ac=new AcknowledgementClass();
        Manufactuer manu=manuRepo.findByManufacuterId(id);
        Product product=restTemplate.getForObject("http://PRODUCT-SERVICE/product/viewProduct/"+manu.getProductId(),Product.class);
        ac.setManufactuer(manu);
        ac.setProduct(product);
        return ac;
    }




}
