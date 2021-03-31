package com.middleend.middlend.Controllers;

import com.middleend.middlend.services.CustomerRegistrationServices;
import com.middleend.middlend.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("pentazon/registration")
@RestController
public class CustomerRegistrationController {

    private final CustomerRegistrationServices customerRegistrationServices;
    @Autowired
    public CustomerRegistrationController(CustomerRegistrationServices customerRegistrationServices) {
        this.customerRegistrationServices = customerRegistrationServices;
    }

    @PostMapping
    public void registerCustomer(@RequestBody Customer customer){
        customerRegistrationServices.registerCustomer(customer);
    }


}
