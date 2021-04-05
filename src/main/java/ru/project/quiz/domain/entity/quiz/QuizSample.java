package ru.project.quiz.domain.entity.quiz;

import lombok.*;
import ru.project.quiz.domain.entity.ituser.Category;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "quiz_sample")
public class QuizSample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "name", unique = true)
    String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "quiz_sample_id")
    List<Category> categories;
}