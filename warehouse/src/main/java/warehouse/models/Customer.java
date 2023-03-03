package warehouse.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "customer")
public class Customer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @OneToOne(mappedBy="customer", cascade = {CascadeType.ALL})
    private Address address;

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

}
