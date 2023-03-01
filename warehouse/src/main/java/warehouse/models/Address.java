package warehouse.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;


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

    @ManyToOne(fetch = FetchType.LAZY, // .EAGER        // LAZY for initialization of Addresses related to Customer on explicit call; EAGER - immediate initialization of Addresses related to Customer
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}) // .ALL,       // ALL propagates all operations
    @JoinColumn(name="customer_fk_id")
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
