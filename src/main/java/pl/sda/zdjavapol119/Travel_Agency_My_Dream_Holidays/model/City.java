package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
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
}

