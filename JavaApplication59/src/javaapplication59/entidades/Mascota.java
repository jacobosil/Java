
package javaapplication59.entidades;



public class Mascota {
    
    private int energia;
    private String nombre; 
    private String apodo;
    private String raza;
    private boolean cola ;
    private int edad;
    private String color;
    private String tipo;
    
    
    public Mascota(){
        
    }

    public Mascota(String nombre, String apodo, String raza, boolean cola, int edad, String color) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.cola = cola;
        this.edad = edad;
        this.color = color;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if(tipo.equals("perro") || tipo.equals("gato") || tipo.equals("caballo")){
            this.tipo = tipo;
        }
        
        this.energia = 1000;
        
        
        
    } 
    
   public void setNombre(String nombre){
       this.nombre = nombre;
   } 
   public void setApodo(String apodo){
       this.apodo = apodo;
   }
   public void setTipo (String tipo){
       this.tipo = tipo;
   }
     
   
   
   public String getNombre(){
       return this.nombre;
   }
   
   public String getApodo(){
       return this.apodo;
   }
    
   public String getTipo(){
       return this.tipo;
   }

    @Override
    public String toString() {
        return "Mascota{" + "energia=" + energia + ", nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", cola=" + cola + ", edad=" + edad + ", color=" + color + ", tipo=" + tipo + '}';
    }

    
   

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    /**
     * 
     * @param energiaRestar
     * @return 
     */
    
   public int pasear(int energiaRestar){
       energia = energia - energiaRestar;
       
       return energia;
   }
   
   /**
    * funcion destinada a restar la energia dependiendo la cantidad de vueltas
    * @param energiaRestar
    * @param vueltas
    * @return 
    */
   
   public int pasear(int energiaRestar, int vueltas){
       for(int i = 0; i < vueltas; i++){
           energia -= energiaRestar;
       }
       
       
       return energia;
   }
   
  
   }
   


