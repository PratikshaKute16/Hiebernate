package org.example.relationship;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question 
{
    @Id
    @Column(name = "quest_Id")
    private int questId;
    private String question;
//    @OneToOne
//    private Answer answer;

    @OneToMany(mappedBy = "question")
    private List<Answer> list;

    public Question() {
    }

    public Question(int questId, String question, List<Answer> list) {
        this.questId = questId;
        this.question = question;
        this.list = list;
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

    public List<Answer> getList() {
        return list;
    }

    public void setList(List<Answer> list) {
        this.list = list;
    }
}
