package warehouse.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "address")
public class Address {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id", nullable = false)
    private Integer addressId;

    @OneToOne(fetch = FetchType.EAGER, // .EAGER        // LAZY for initialization of Addresses related to Customer on explicit call; EAGER - immediate initialization of Addresses related to Customer
            cascade = {CascadeType.ALL})
    @JoinColumn(name="address_id")
    private Customer customer;

    @Basic
    @Column(name = "country", nullable = true, length = 255)
    private String country;

    @Basic
    @Column(name = "postal_code", nullable = true, length = 255)
    private String postalCode;

    @Basic
    @Column(name = "city", nullable = true, length = 255)
    private String city;

    @Basic
    @Column(name = "address_line", nullable = true, length = 255)
    private String addressLine;


}
