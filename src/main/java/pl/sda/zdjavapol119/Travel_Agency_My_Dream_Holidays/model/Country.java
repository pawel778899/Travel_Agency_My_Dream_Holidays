package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    private Continent continent;

    @OneToMany
    private List<City> cities;

}
