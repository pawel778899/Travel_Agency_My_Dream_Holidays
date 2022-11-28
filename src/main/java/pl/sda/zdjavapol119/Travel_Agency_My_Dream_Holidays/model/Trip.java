package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity

public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private City originCity;

    @ManyToOne
    private Continent destinationContinent;

    @ManyToOne(fetch = FetchType.EAGER)
    private Country destinationCountry;

    @ManyToOne(fetch = FetchType.EAGER)
    private Airport originAirport;

    @ManyToOne(fetch = FetchType.EAGER)
    private City destinationCity;

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
    List<PurchasedTrip> purchasedTrip;
}


