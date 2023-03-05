package warehouse.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.NOT_REQUIRED;
import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product")
@Schema(description = "Products table")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id", nullable = false)
    @Schema(hidden = true)
    private Integer productId;

    @Column(name = "title", nullable = false, length = 255)
    @Schema(requiredMode = REQUIRED, example = "chair")
    private String title;

    @Column(name = "price", nullable = false)
    @Schema(requiredMode = REQUIRED, example = "1000")
    private Integer price;

    @Schema(requiredMode = REQUIRED, minimum = "1", maximum = "100000", example = "100")
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}
