package com.generation.dia20220602.modulo;


    //Atributos
    public class Trabajador {
        private String nombre;
        private String area;
        private Integer sueldo;
        private String rut;
        private int horasLaborales;

        //Constructor vacio
        public Trabajador() {
            super();
        }

        //Constructor con parametros
        public Trabajador(String nombre, String area, Integer sueldo, String rut, int horasLaborales) {
            super();
            this.nombre = nombre;
            this.area = area;
            this.sueldo = sueldo;
            this.rut = rut;
            this.horasLaborales = horasLaborales;
        }

        //Getter and Setter
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public Integer getSueldo() {
            return sueldo;
        }

        public void setSueldo(Integer sueldo) {
            this.sueldo = sueldo;
        }

        public String getRut() {
            return rut;
        }

        public void setRut(String rut) {
            this.rut = rut;
        }

        public int getHorasLaborales() {
            return horasLaborales;
        }

        public void setHorasLaborales(int horasLaborales) {
            this.horasLaborales = horasLaborales;
        }

        @Override
        public String toString() {
            return "Trabajador [nombre=" + nombre + ", area=" + area + ", sueldo=" + sueldo + ", rut=" + rut
                    + ", horasLaborales=" + horasLaborales + "]";
        }


    }


