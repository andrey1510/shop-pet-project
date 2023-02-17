package warehouse.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class AddressEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id", nullable = false)
    private Integer addressId;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId
    private CustomerEntity customer;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AddressEntity address = (AddressEntity) o;
        return addressId != null && Objects.equals(addressId, address.addressId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
