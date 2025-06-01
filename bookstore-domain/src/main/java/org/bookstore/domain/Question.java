package org.bookstore.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Question {

    public Question(String question) {
        this.setQuestion(question);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private
    Integer pk;

    private String question;

    @Column(name = "question_order")
    private Integer order;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    public Integer getPk() {
        return this.pk;
    }

    public List<Answer> getAnswers() {
        return this.answers;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
