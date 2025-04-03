package org.example.sof3061_sof3061_01.entity;

import jakarta.persistence.*;

@Entity
public class Diem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String maDiem;

    @ManyToOne
    //@JoinColumn(name = "sinh_vien_id", referencedColumnName = "id")
    private SinhVien sinhVien;

    private String monHoc;
    private double diemSo;

}
