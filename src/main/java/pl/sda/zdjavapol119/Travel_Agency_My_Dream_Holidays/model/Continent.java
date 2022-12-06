package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;
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