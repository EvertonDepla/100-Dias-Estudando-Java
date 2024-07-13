package edu.everton.dia66;

import java.util.Objects;

public class Carro implements Comparable<Carro>{

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Carro carro = (Carro) object;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca); }

    @Override
    public String toString() {
        return "Carro{" +
                "marca=" + marca +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        if(this.marca.length() < o.marca.length()){
            return -1;
        }else if(this.marca.length() > o.marca.length()){
            return 1;
        }
        return 0;
    }
}