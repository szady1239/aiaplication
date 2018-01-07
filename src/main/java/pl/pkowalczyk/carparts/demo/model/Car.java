package pl.pkowalczyk.carparts.demo.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mark", nullable = false)
    private String mark;
    @Column(name = "model", nullable = false)
    private String model;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "car")
    @JsonBackReference
    private List<PartGroup> partGroupList;

}
