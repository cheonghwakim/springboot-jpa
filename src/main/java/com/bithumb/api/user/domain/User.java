package com.bithumb.api.user.domain;

import com.bithumb.api.order.domain.Order;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private long userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password")
    @Size(min = 8, message = "8자리 이상 입력하세요")
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "reg_date")
    private String regDate;

    @OneToMany(mappedBy = "user") // User:1 Order:N (user는 주문을 여러 개 할 수 있음)
    private List<Order> orders = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER) // 생성할 때 Role이 반드시 주어져야 함
    List<Role> roles;
}
