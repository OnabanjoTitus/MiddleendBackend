package com.middleend.middlend.Controllers;

import com.middleend.middlend.services.CustomerRegistrationServices;
import com.middleend.middlend.Models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("pentazon/addToCart")
@RestController
public class CartController {
    private final CustomerRegistrationServices customerRegistrationServices;
    @Autowired
    public CartController(CustomerRegistrationServices customerRegistrationServices) {
        this.customerRegistrationServices = customerRegistrationServices;
    }
    @PostMapping(path = "{sellerName}")
    public void addToCart(@PathVariable("sellerName") String customer, @RequestBody Products products){
        customerRegistrationServices.addToCart(customer,products);
    }
    @PutMapping (path = "{sellerName}")
    public void addToCart(@PathVariable("sellerName") String customer,int quantity,@RequestBody Products products){
        quantity=products.getProductQuantity();
        customerRegistrationServices.addToCart(customer,quantity,products);
    }
    @GetMapping  (path = "{sellerName}")
    public List<Products> getCart(@PathVariable("sellerName") String customer){
        return customerRegistrationServices.getCart(customer);
    }
    @DeleteMapping (path = "{sellerName}")
    public void deleteFromCart(@PathVariable("sellerName") String customer){
        customerRegistrationServices.deleteFromCart(customer);
    }
}
