package com.rrayco.sistemaCotizacionV1.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tb_tipoUnidadMedida")
public class UnitMeasureType {

    @Id
    private Long idUnitMeasureType;
    private String UnitMeasureType ;
    private String abreviature;
}
