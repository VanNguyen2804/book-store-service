package org.bookstore.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Answer {

    public Answer(String answer, Question question) {
        this.setAnswer(answer);
        this.setQuestion(question);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private
    Integer pk;

    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private
    Question question;

    private Boolean correct;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }
}
