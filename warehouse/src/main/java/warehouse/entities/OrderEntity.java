package warehouse.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class OrderEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId
    private CustomerEntity customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId
    private ProductEntity product;

    @Basic
    @Column(name = "price", nullable = false, precision = 2)
    private BigDecimal price;

    @Basic
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderEntity order = (OrderEntity) o;
        return orderId != null && Objects.equals(orderId, order.orderId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
