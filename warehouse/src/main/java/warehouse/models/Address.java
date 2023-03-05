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
@Table(name = "address")
public class Address {

   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id", nullable = false)
   // @Schema(hidden = true)
    private Integer addressId;

    @OneToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.ALL})
    @JoinColumn(name="address_id")
    //@Schema(hidden = true)
    private Customer customer;

    @Column(name = "country", nullable = false, length = 255)
    @Schema(requiredMode = REQUIRED, example = "Greece")
    private String country;

    @Column(name = "postal_code", nullable = true, length = 255)
    @Schema(requiredMode = NOT_REQUIRED, example = "42334")
    private String postalCode;

    @Column(name = "city", nullable = false, length = 255)
    @Schema(requiredMode = REQUIRED, example = "Moscow")
    private String city;

    @Column(name = "address_line", nullable = false, length = 255)
    @Schema(requiredMode = NOT_REQUIRED, example = "Test street 4, apt. 404")
    private String addressLine;


}
