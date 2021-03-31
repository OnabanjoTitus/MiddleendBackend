package com.middleend.middlend.Controllers;

import com.middleend.middlend.services.CustomerRegistrationServices;
import com.middleend.middlend.Models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("pentazon/addProduct")
@RestController
public class ProductController {
    private final CustomerRegistrationServices customerRegistrationServices;

    @Autowired
    public ProductController(CustomerRegistrationServices customerRegistrationServices) {
        this.customerRegistrationServices = customerRegistrationServices;
    }

    @PostMapping
    public void addProducts(@RequestBody Products products){
        customerRegistrationServices.addProducts(products);
    }



}
