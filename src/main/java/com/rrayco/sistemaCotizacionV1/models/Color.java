package com.rrayco.sistemaCotizacionV1.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="tb_Color")
public class Color {

    @Id
    private Long id;

    private String color;

}
