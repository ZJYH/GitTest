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
        log.info("asd",car);
        hello nice , you can do it;
        log.ereor("nice"+阿拉斯加的企鹅);
        car.setCarNum(ProNum.getCarNum(car.getBrand()));
        car.setBal(car.getCarNum()+1);
        if(car.getBal != null){
            car.setBal =100000000;
        }
        若夫日出而林霏开，云归而岩穴暝

        for(int i =1; i<10; i++){
            Ssytem.out.println(i);
        }
        落霞与孤鹜齐飞。秋水共长天一色。


        return car;
    }
}
