package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Country country;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Airport> airports;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Hotel> hotels;

    @OneToMany(mappedBy = "destinationCity", cascade = CascadeType.ALL)
    private List<Trip> tripsWithDestinationCity;

    @OneToMany(mappedBy = "originCity", cascade = CascadeType.ALL)
    private List<Trip> tripsWithOriginCity;

}

