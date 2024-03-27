package com.mvc.ecommerce.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="security_details")
public class Security {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="security_id")
    private long securityId;

    @Column(name="security_question")
    private String securityQues;

    @Column(name="security_answer")
    private String securityAns;

    @Override
    public String toString() {
        return "Security{" +
                "securityId=" + securityId +
                ", securityQues='" + securityQues + '\'' +
                ", securityAns='" + securityAns + '\'' +
                '}';
    }

    public Security(String securityQues, String securityAns) {
        this.securityQues = securityQues;
        this.securityAns = securityAns;
    }

    public Security(){

    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public void setSecurityQues(String securityQues) {
        this.securityQues = securityQues;
    }

    public void setSecurityAns(String securityAns) {
        this.securityAns = securityAns;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getSecurityQues() {
        return securityQues;
    }

    public String getSecurityAns() {
        return securityAns;
    }
}
