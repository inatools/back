package inatools.backend.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;

@Entity
@Getter
@Table(name = "self_check")
public class SelfCheck {

    @Id
    @GeneratedValue
    @Column(name = "self_check_id")
    private Long id;

    private String name;
    private LocalDateTime recordDate;
    private Long faceTestResult;
    private Long pronounTestResult;
    private Long balanceTestResult;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Member member;

}
