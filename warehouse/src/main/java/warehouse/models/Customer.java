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
@Table(name = "customer")
public class Customer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", nullable = false)
    @Schema(hidden = true)
    private Integer customerId;

    @OneToOne(mappedBy="customer", cascade = {CascadeType.ALL})
    //@Schema(hidden = true)
    private Address address;

    @Column(name = "first_name", nullable = false, length = 255)
    @Schema(requiredMode = REQUIRED, example = "John")
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 255)
    @Schema(requiredMode = REQUIRED, example = "Doe")
    private String lastName;

    @Column(name = "balance", nullable = true)
    @Schema(requiredMode = NOT_REQUIRED, example = "300")
    private Integer balance;

    @Column(name = "phone", nullable = true, length = 255)
    @Schema(requiredMode = NOT_REQUIRED, example = "8 656 232 312")
    private String phone;

    @Column(name = "email", nullable = true, length = 255)
    @Schema(requiredMode = NOT_REQUIRED, example = "test@test.com")
    private String email;

}
