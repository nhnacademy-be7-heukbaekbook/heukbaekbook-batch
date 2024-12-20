package com.nhnacademy.heukbaekbook_batch.memberset;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "grades")
public class Grade {

    @Id
    @Column(name = "grade_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "grade_name")
    private String gradeName;

    @NotNull
    @Column(name = "grade_point_percentage")
    private BigDecimal pointPercentage;

    @NotNull
    @Column(name = "promotion_standard")
    private BigDecimal promotionStandard;


}
