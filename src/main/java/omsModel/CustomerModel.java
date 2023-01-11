package omsModel;

import javax.persistence.*;

@Entity
@Table
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String address;
    private long mobno;
    private String email;
    private int allOrderNo;

    public CustomerModel ( ) {
    }

    public CustomerModel (Long id, String name, String address, long mobno, String email, int allOrderNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobno = mobno;
        this.email = email;
        this.allOrderNo = allOrderNo;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public long getMobno ( ) {
        return mobno;
    }

    public void setMobno (long mobno) {
        this.mobno = mobno;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public int getAllOrderNo ( ) {
        return allOrderNo;
    }

    public void setAllOrderNo (int allOrderNo) {
        this.allOrderNo = allOrderNo;
    }



}
