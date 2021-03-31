package com.middleend.middlend.Controllers;


import com.middleend.middlend.Models.Products;
import com.middleend.middlend.services.CustomerRegistrationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("pentazon/viewProduct")
@RestController
public class ProductViewController {
    private final CustomerRegistrationServices customerRegistrationServices;
    @Autowired
    public ProductViewController(CustomerRegistrationServices customerRegistrationServices) {
        this.customerRegistrationServices = customerRegistrationServices;
    }

    @GetMapping (path = "{sellerId}")
    public List<Products> getProductsBySeller(@PathVariable("sellerId") String name){
        return customerRegistrationServices.getProductsBySeller(name);
    }


}
