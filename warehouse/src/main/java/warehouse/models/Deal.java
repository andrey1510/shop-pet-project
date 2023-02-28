package warehouse.models;

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
@Table(name = "deal")
public class Deal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "deal_id", nullable = false)
    private Integer dealId;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId
    private Product product;

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
        Deal order = (Deal) o;
        return dealId != null && Objects.equals(dealId, order.dealId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
