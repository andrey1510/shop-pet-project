package warehouse.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "deal")
public class Deal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "deal_id", nullable = false)
    private Integer dealId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="customer_fk_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="product_fk_id")
    private Product product;

    @Basic
    @Column(name = "quantity", nullable = false)
    private Integer quantity;


}
