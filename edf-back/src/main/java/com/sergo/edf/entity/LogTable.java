package com.sergo.edf.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "logtable")
public class LogTable implements Serializable {

    private static final long serialVersionUID = -4029524329797204411L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String user;

    @Column
    private String message;

    @Column
    private Date date;
}
