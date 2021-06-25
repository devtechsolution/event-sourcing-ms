package org.as.devtechsolution.ecart.productservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private Environment env;


    @GetMapping("/")
    public ResponseEntity<String> getProduct(){
        return new ResponseEntity<String>("get product details"+ env.getProperty("local.server.port"), HttpStatus.OK);

    }
}
