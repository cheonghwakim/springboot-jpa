package com.bithumb.api.user.domain;

import com.bithumb.api.order.domain.Order;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private long orderId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "reg_date")
    private String regDate;

    @OneToMany(mappedBy = "user") // User:1 Order:N (user는 주문을 여러 개 할 수 있음)
    private List<Order> orders = new ArrayList<>();
}
