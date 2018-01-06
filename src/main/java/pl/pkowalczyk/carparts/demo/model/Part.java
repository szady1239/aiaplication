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
@Table(name = "part")
public class Part {
    @Id
    @Column(name = "part_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "code")
    private Long code;
    @ManyToOne
    @JoinColumn(name = "part_group_id")
    private PartGroup partGroup;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "part")
    @JsonBackReference
    private List<OrderDetail> orderDetailList;

}
