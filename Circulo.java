package examen;
/**@author Adrian Perez Chillaron*/
/**Nombre de la clase principal*/
public class Circulo {

    //Variable radio
    private double radio;
    //Variable color
    private String color;
    //Variable numeron de circulos
    private static int numCirculos;
    
    /**Método de calculo de áre
     * @return a*/
    public double calculoArea(){
        if (this.getRadio()<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(getRadio(), 2)*Math.PI);
    }
     /**Método de calculo de perímetr
     * @return o
     * @throws java.lang.Exception*/
    public double calculoPerimetro()throws Exception{
        if (this.getRadio()<0)
            throw new Exception ("Radio negativo");
        else if(getRadio()>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.getRadio());
    }
     /**Método de color válid
     * @return o
     * @throws java.lang.Exception*/
    public boolean colorAceptable() throws Exception {
        if(getColor().length()>20){
            return false;
        }
        else{
            if(getColor().length()<=0){
                throw new Exception ("Color no existente");
            }
            return true;
        }       
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numCirculos
     */
    public static int getNumCirculos() {
        return numCirculos;
    }

    /**
     * @param aNumCirculos the numCirculos to set
     */
    public static void setNumCirculos(int aNumCirculos) {
        numCirculos = aNumCirculos;
    }
    
    
}
