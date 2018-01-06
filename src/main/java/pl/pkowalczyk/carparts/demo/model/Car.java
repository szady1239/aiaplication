package pl.pkowalczyk.carparts.demo.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
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
    private List<PartGroup> partGroupList;

}
