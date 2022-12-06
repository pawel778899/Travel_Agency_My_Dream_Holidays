package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
public class PurchasedTrip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    private Trip trip;

    private BigDecimal tripPrice;

    private Integer numberPlacesAdultsPurchased;

    private Integer numberPlacesChildrenPurchased;
}