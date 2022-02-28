package cg.model;

import javax.persistence.*;

@Entity
@Table(name ="student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String age;
    private String phoneNumber;
    private String address;
    private double avgPoint;
    @ManyToOne
    @JoinColumn(name="clazzId")
    private clazz clazz;

    public student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public cg.model.clazz getClazz() {
        return clazz;
    }

    public void setClazz(cg.model.clazz clazz) {
        this.clazz = clazz;
    }
}
