package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Continent continent;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country", cascade = CascadeType.ALL)
    private Set<City> cities;

}
