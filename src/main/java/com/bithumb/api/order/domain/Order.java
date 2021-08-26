package com.bithumb.api.order.domain;

import com.bithumb.api.item.domain.Item;
import com.bithumb.api.user.domain.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id")
    private long orderId;

    @Column(name = "price")
    private long price;

    @Column(name = "order_status")
    private String count;

    @ManyToOne(fetch = FetchType.LAZY) // 어떤 걸 선행하게 해야 얘가 일어남. (ex. user와 item이 등록이 된 다음 order가 발생할 수 있음)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item; // mappedBy 가 얘
}
