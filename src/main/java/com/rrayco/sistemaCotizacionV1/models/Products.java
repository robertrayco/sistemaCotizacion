package com.rrayco.sistemaCotizacionV1.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name="tb_producto")
public class Products {

    @Id
    private Long idProduct;

    private String nameProduct;

    private String descriptionProduct;

    @ManyToOne
    @JoinColumn(name="idTipoUnidadMedida", nullable = false)
    private UnitMeasureType unitMeasureType;

    @ManyToOne
    @JoinColumn(name="idTipoMaterial", nullable = false)
    private TipoMaterial tipoMaterial;

    @ManyToOne
    @JoinColumn(name="idColor", nullable = false)
    private Color color;

    private String pathImageProduct;

    private BigDecimal priceProduct;

    private Integer stockProduct;

    private Boolean stateProduct;

}
