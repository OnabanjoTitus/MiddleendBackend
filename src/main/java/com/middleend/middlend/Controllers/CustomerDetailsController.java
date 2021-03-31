package com.middleend.middlend.Controllers;

import com.middleend.middlend.services.CustomerRegistrationServices;
import com.middleend.middlend.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("pentazon/viewSellers")
@RestController
public class CustomerDetailsController {
    private final CustomerRegistrationServices customerRegistrationServices;

    @Autowired
    public CustomerDetailsController(CustomerRegistrationServices customerRegistrationServices) {
        this.customerRegistrationServices = customerRegistrationServices;
    }

    @GetMapping (path = "{sellerName}")
    public Customer getCustomerByDetails(@PathVariable("sellerName") String name){
        return customerRegistrationServices.getCustomerByDetails(name);
    }

}
