package warehouse.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @OneToMany(mappedBy="customers")
    private List<Address> addresses;

    @Basic
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;

    @Basic
    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;

    @Basic
    @Column(name = "balance", nullable = true)
    private Integer balance;

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    private String phone;

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return customerId != null && Objects.equals(customerId, customer.customerId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
