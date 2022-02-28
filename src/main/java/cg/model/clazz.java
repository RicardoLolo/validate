package cg.model;

import javax.persistence.*;

@Entity
@Table(name ="clazz")
public class clazz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long c_id;
    private String c_name;

    public long getC_id() {
        return c_id;
    }

    public void setC_id(long c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
}
