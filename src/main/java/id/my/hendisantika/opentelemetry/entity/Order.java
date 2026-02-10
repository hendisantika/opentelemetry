package id.my.hendisantika.opentelemetry.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : opentelemetry
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 11/02/26
 * Time: 06.29
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "orders")
@Getter
@NoArgsConstructor
public class Order {
    @Id
    Long id;
    @Column(name = "customer_id")
    Long customerId;
    @Column(name = "order_date")
    ZonedDateTime orderDate;
    @Column(name = "total_amount")
    BigDecimal totalAmount;
}
