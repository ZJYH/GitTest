package com.zh.springbootdemo.service;

import com.zh.springbootdemo.domain.Car;
import com.zh.springbootdemo.domain.User;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class HelloService {

    public void modfiyAddress(User user){
        user.setAddress("ggboy");
    }

    public Car getCar(){
        Car car = new Car();
        car.setBrand("naike");
        car.setBuyDate(new Date());
        log.info("奥迪撒大苏打car:{}撒旦啊顶顶顶",car);
        car.setCarNum(ProNum.getCarNum(car.getBrand()));
        car.setBal(car.getCarNum()+1);
        if(car.getBal != null){
            car.setBal =100000000;
        }
       
        for(int i =1; i<10; i++){
            Ssytem.out.println(i);
        }
        return car;
    }
}
