package org.example.relationship;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
    @Id
    @Column(name = "quest_Id")
    private int questId;
    private String question;
    @OneToOne
    private Answer answer;

    public Question() {
    }

    public Question(int questId, String question, Answer answer) {
        this.questId = questId;
        this.question = question;
        this.answer = answer;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
