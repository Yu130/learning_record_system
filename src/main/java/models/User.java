package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity
public class User {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private Integer user_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "monthly_target_time")
    private Integer monthly_target_time;

    @Column(name = "annual_target_time")
    private Integer annual_target_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMonthly_target_time() {
        return monthly_target_time;
    }

    public void setMonthly_target_time(Integer monthly_target_time) {
        this.monthly_target_time = monthly_target_time;
    }

    public Integer getAnnual_target_time() {
        return annual_target_time;
    }

    public void setAnnual_target_time(Integer annual_target_time) {
        this.annual_target_time = annual_target_time;
    }
}
