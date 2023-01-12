package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@Entity
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "continent", cascade = CascadeType.ALL)
    private List<Country> countries;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "destinationContinent", cascade = CascadeType.ALL)
    private List<Trip> trips;


}