package warehouse.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "deal")
public class Deal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "deal_id", nullable = false)
    @Schema(hidden = true)
    private Integer dealId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="customer_fk_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="product_fk_id")
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;


}
