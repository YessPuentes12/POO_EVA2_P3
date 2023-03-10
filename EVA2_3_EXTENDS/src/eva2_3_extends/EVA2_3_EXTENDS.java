/*

 */
package eva2_3_extends;


public class EVA2_3_EXTENDS {


    public static void main(String[] args) {
       
        Estudiante estu1=new Estudiante();
        
        estu1.setNombre("Yessly");
        estu1.setApellido("Mayorga");
        estu1.setEdad(18);
        estu1.setNoControl("22550338");
        
        System.out.println(estu1.getApellido());
 //------------------------------------------------------------------------------
 
      Proveedores prove1 = new Proveedores();
      
        prove1.setNombre("Oscar");
        prove1.setApellido("perez");
        prove1.setEdad(37);
        prove1.setRfc("o243nf35");
  
        System.out.println(prove1.getApellido());
      
    }
    
}
