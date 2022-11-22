public class MyClass {
    public static void main(String args[]) {
      
      Trabajador carlos = new Trabajador();
      
      carlos.setSalario(123456);
      
      System.out.println(carlos.getSalario());
      
    }
}

class Persona {
    public int edad;
    public String nombre;
    public int telefono;
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona {
    public int credito;
    
    public void setCredito(int credito){
        this.credito = credito;
    }
    
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona {
    
    public int salario; 
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    public int getSalario(){
        return this.salario;
    }
}