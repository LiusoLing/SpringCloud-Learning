package com.study.springcloud.payment.service;

import com.study.springcloud.commons.entities.Payment;

/**
 * @Desc
 * @Author lgl
 * @Date 2021/3/20
 **/
public interface PaymentService {

    //写
    int create(Payment payment);

    //读取
    Payment getPaymentById(Long id);
}
