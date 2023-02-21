package warehouse.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Basic
    @Column(name = "price", nullable = false)
    private Integer price;

    @Basic
    @Size(min = 0, max = 1000)
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return productId != null && Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
