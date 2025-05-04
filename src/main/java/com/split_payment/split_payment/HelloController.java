package com.split_payment.split_payment;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return"Hello World";
    }

    @PostMapping("/split")
    public SplitResult splitBill(@RequestBody SplitRequest request){
        if (request.getPeople() <= 0 ){
            return new SplitResult(request.getTotal(),request.getPeople(),0);
        }

        double share = request.getTotal() / request.getPeople();
        return new SplitResult(request.getTotal(),request.getPeople(),share);
    }
}
