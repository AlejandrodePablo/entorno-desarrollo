package com.adpc.pccomponentes;

    /**
     * Clase MotherBoard
     */
    public class TarjetaGrafica {
        /**
         * Atributos, propiedades, variables, estado
         */
        private Integer id;
        public String marca;
        private String fabricante;

        /**
         * Métodos, funciones, comportamiento
         */

        public Integer getId() {
            return id;
        }

        public void setId(Integer id){
            this.id = id;
        }

        public String getMarca(){
            return marca;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public String getFabricante(){
            return fabricante;
        }

        public void setFabricante(String fabricante){
            this.fabricante = fabricante;
        }
    }

}
