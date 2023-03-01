package warehouse.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "product")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id", nullable = false)
    private Integer productId;

//    @OneToMany(mappedBy="product")
//    private List<Deal> deal;

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Basic
    @Column(name = "price", nullable = false)
    private Integer price;

    @Basic
    @Size(min = 0, max = 100000)
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}
