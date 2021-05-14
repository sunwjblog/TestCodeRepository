package com.sunwj.code.repository.sunwjcoderepository.spring.easyioc.bean;

public class Wheel {

    private String brand;
    private String specification;

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
