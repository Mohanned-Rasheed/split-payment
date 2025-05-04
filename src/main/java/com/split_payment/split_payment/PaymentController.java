package com.split_payment.split_payment;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentRepository repo;

    public PaymentController(PaymentRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return repo.save(payment);
    }

    @GetMapping
    public List<Payment> getAll() {
        return repo.findAll();
    }
}
