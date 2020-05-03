package com.uca.capas.tarea4.domain;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

public class Product {
    @Size(min = 12, max = 12, message = "El campo codigo debe tener exactamente 12 digitos")
    private String codigo;

    @Size(min = 1, max = 100, message = "El campo nombre debe tener un tamanio entre 1 y 100 caracteres")
    private String nombre;

    @Size(min = 1, max = 100, message = "El campo marca debe tener un tamanio entre 1 y 100 caracteres")
    private String marca;

    @Size(min = 1, max = 500, message = "El campo descripcion debe tener un tamanio entre 1 y 500 caracteres")
    private String descripcion;

    @Digits(integer = 3000, fraction = 0, message = "El campo existencia no debe tener decimales")
    private String existencia;

    @Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$", message = "El campo fecha debe tener un formato dd/mm/aaaa")
    private String fecha;

    public Product() {
    }

    public Product(String codigo, String nombre, String marca, String descripcion, String existencia, String fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
