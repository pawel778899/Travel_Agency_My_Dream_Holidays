package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;


    @OneToMany(mappedBy = "destinationAirport", cascade = CascadeType.ALL)
    private List<Trip> tripsWithDestinationAirport;

    @OneToMany(mappedBy = "originAirport", cascade = CascadeType.ALL)
    private List<Trip> tripsWithOriginAirport;
}
