package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PurchasedTrip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Trip trip;

    private BigDecimal tripPrice;

    private Integer numberPlacesAdultsPurchased;

    private Integer numberPlacesChildrenPurchased;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PurchasedTrip that = (PurchasedTrip) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}