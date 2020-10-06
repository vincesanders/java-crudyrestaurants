package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Payment;
import com.lambdaschool.crudyrestaurants.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional //If you have transactional methods, make the entire class transactional.
@Service(value = "paymentServices")
public class PaymentServicesImpl implements PaymentServices {
    @Autowired
    PaymentRepository payrepos;

    @Transactional //if anything fails, reset everything (it all fails)
    @Override
    public Payment save(Payment payment) {
        return payrepos.save(payment);
    }
}
