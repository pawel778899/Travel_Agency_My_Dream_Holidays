package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Country country;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Airport> airports;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Hotel> hotels;

    @OneToMany(mappedBy = "destinationCity", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Trip> tripsWithDestinationCity;

    @OneToMany(mappedBy = "originCity", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Trip> tripsWithOriginCity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        City city = (City) o;
        return id != null && Objects.equals(id, city.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

