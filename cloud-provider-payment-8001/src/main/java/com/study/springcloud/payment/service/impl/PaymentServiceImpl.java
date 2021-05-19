package com.study.springcloud.payment.service.impl;

import com.study.springcloud.commons.entities.Payment;
import com.study.springcloud.payment.dao.PaymentDao;
import com.study.springcloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc
 * @Author lgl
 * @Date 2021/3/20
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}
