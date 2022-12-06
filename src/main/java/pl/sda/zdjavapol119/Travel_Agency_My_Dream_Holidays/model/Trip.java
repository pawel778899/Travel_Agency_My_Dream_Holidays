package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private City originCity;

    @ManyToOne(fetch = FetchType.EAGER)
    private Airport originAirport;
    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private City destinationCity;
    @ManyToOne
    private Continent destinationContinent;
    @ManyToOne(fetch = FetchType.EAGER)
    private Country destinationCountry;
    @ManyToOne(fetch = FetchType.EAGER)
    private Hotel destinationHotel;
    @ManyToOne(fetch = FetchType.EAGER)
    private Airport destinationAirport;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endDate;

    private Integer durationTime;

    //typ: (BB, HB, FB, AI - http://zw.lt/rozmaitosci/wyzywienie-w-hotelach-co-oznaczaja-bb-hb-fb-ai-ov-zpr/)
    //BB (bed & breakfast) – samo śniadanie
    //
    //HB (half board) – śniadanie i obiadokolacja
    //
    //FB (full board) – pełne wyżywienie, które obejmuje śniadanie, obiad, kolację

    private BigDecimal adultPrice;

    private BigDecimal childPrice;

    private Boolean promoted;

    private Integer  numberPlacesAdults;

    private Integer numberPlacesChildren;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    @ToString.Exclude
    List<PurchasedTrip> purchasedTrip;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Trip trip = (Trip) o;
        return id != null && Objects.equals(id, trip.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}


