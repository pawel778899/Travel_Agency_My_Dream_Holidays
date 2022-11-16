package pl.sda.zdjavapol119.Travel_Agency_My_Dream_Holidays.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

}
