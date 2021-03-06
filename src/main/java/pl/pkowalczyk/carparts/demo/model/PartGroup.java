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
@Table(name = "part_group")
public class PartGroup {
    @Id
    @Column(name = "part_group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "partGroup")
    @JsonBackReference
    private List<Part> partList;
}
