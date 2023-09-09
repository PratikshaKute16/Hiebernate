package org.example.relationship.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project
{
    @Id
    private int pid;
    private String pname;

    @ManyToMany
    private List<Emp1> list;

    public List<Emp1> getList() {
        return list;
    }

    public void setList(List<Emp1> list) {
        this.list = list;
    }

    public Project() {
    }

    public Project(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
