//jeff
package proyecto.zoo;

import javax.swing.JOptionPane;

public class Rutina {
    
    //usuarios
    private Usuario datos[]= new Usuario[2];//arreglo
    
public void LlenarUsuarios(){
    int x;
    for(x=0;x<datos.length;x++){
        
        Usuario u=new Usuario();
        
        u.setNombre(JOptionPane.showInputDialog(null,"Digite su nombre:"));
        u.setApellidos(JOptionPane.showInputDialog(null,"Digite sus apellidos:"));;
        u.setNickname(JOptionPane.showInputDialog(null,"Digite su nickname:"));
        u.setPassword(JOptionPane.showInputDialog(null,"Digite su contraseña:"));
        u.setEstado(JOptionPane.showInputDialog(null,"Digite su estado:"));
        datos[x]=u;
    }      
}
public void MostrarUsuarios(){
    
     int x;
        String s="";
        for(x=0;x<datos.length;x++){
            s=s+datos[x].getNombre()+"  "+datos[x].getApellidos()+"  "+datos[x].getNickname()+"  "+datos[x].getPassword()+"  "+datos[x].getEstado()+"\n";
        }
        JOptionPane.showMessageDialog(null,"***DATOS USUARIOS***\n"+s);
    }

//visitantes
private Visitantes datosV[]= new Visitantes[3];//arreglo
   
   public void LlenarVisitantes(){
       int x;
       for(x=0;x<datosV.length;x++){
           
           Visitantes v=new Visitantes();
           
           v.setNombreV(JOptionPane.showInputDialog(null,"Digite su nombre:"));
           v.setApellidosV(JOptionPane.showInputDialog(null,"Digite sus apellidos:"));;
           v.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su edad")));
           datosV[x]=v;
       }
   }
   public void MostrarVisitantes(){
       
       int x;
        String s="";
        for(x=0;x<datosV.length;x++){
            s=s+datosV[x].getNombreV()+"  "+datosV[x].getApellidosV()+"  "+datosV[x].getEdad()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  ***DATOS VISITANTES***\n"+s);
    }
  
    
    //empleados
    private Empleado datosEm[]=new Empleado[3];//arreglo
        
         public void LlenarDatosEmpleados(){
        int x;
        for(x=0;x<datosEm.length;x++){
            
            Empleado em=new Empleado();
            
            em.setNombreE(JOptionPane.showInputDialog(null,"Digite el nombre del empleado"));
            em.setApellidoE(JOptionPane.showInputDialog(null,"Digite el apellido del empleado"));
            em.setCiudad(JOptionPane.showInputDialog(null,"Digite la ciudad"));
            em.setDireccion(JOptionPane.showInputDialog(null,"Digite la dirección"));
            em.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número de teléfono")));
            em.setCorreoElec(JOptionPane.showInputDialog(null,"Digite su correo"));
            em.setEstado(JOptionPane.showInputDialog(null,"Digite su estado"));           
            datosEm[x]=em;
}
}
        public void MostrarDatosEmpleados(){
           
        int x;
        for(x=0;x<datosEm.length;x++){
         String s="";
        for(x=0;x<datosEm.length;x++){
            s=s+datosEm[x].getNombreE()+"  "+datosEm[x].getApellidoE()+"  "+datosEm[x].getCiudad()+"  "+datosEm[x].getDireccion()+
                    datosEm[x].getTelefono()+datosEm[x].getCorreoElec()+datosEm[x].getEstado()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  ***DATOS EMPLEADOS***\n"+s);
        }
    }
        //Especie
        private Especie datosEspecie[]=new Especie[3];//arreglo
    
    public void LlenarDatosEspecie(){
        int x;
        for(x=0;x<datosEspecie.length;x++){
            
            Especie esp=new Especie();
            
            esp.setEspecie(JOptionPane.showInputDialog(null,"Digite el nombre de la especie"));
            esp.setCarac(JOptionPane.showInputDialog(null,"Digite la característica"));
            esp.setEstado(JOptionPane.showInputDialog(null,"Digite el estado "));  
            datosEspecie[x]=esp;
        }
    }
     public void MostrarDatosEspecie(){
     
        int x;
        String s="";
        for(x=0;x<datosEspecie.length;x++){
            s=s+datosEspecie[x].getEspecie()+"  "+datosEspecie[x].getCarac()+"  "+datosEspecie[x].getEstado()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  ***DATOS ESPECIE\n"+s);
        }
     
     //animal
       private Animal listaAnimal[]=new Animal[3];//arreglo
    
    public void LlenarDatosAnimal(){
        int x;
        for(x=0;x<listaAnimal.length;x++){
            
            Animal a=new Animal();
            
            a.setNombreAnimal(JOptionPane.showInputDialog(null,"Digite el nombre del animal"));
            a.setFechaNacimiento(JOptionPane.showInputDialog(null,"Digite la fecha de nacimiento"));
            a.setEspecie(JOptionPane.showInputDialog(null,"Digite la especie del animal"));
            a.setNombreEmpleado(JOptionPane.showInputDialog(null,"Digite el nombre del empleado"));
            a.setEstadoEmpleado(JOptionPane.showInputDialog(null,"Digite el estado del empleado"));
            listaAnimal[x]=a;         
        }
    
        }
     public void MostrarDatosAnimal(){
        
        int x;
        for(x=0;x<listaAnimal.length;x++){
         String s="";
        for(x=0;x<listaAnimal.length;x++){
            s=s+listaAnimal[x].getNombreAnimal()+"  "+listaAnimal[x].getFechaNacimiento()+"  "+listaAnimal[x].getEspecie()+"  "+listaAnimal[x].getNombreEmpleado()+
                    listaAnimal[x].getEstadoEmpleado()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  ***DATOS  DEL  ANIMAL***\n"+s);
        }
    }
     //aquí abajo es factura
     //
     //
     //
     //
     //
     //
     
     
    //menu
    public void MenuP(){
        
        int OpcionMenu=0;
        while(OpcionMenu!=6){
            OpcionMenu=Integer.parseInt(JOptionPane.showInputDialog(null,"                                                        ***MENÚ PRINCIPAL***\n\n"
                    + "1. Llenar Usuarios  "+ "    2. Mostrar Uusarios  "+ "    3. Llenar Visitantes  "+ "   4. Mostrar Visitantes\n"
                    + "5. Llenar Empleados  "+"6. Mostrar Empleados"+"  7. Llenar Especie  "+"       8. Mostrar Especie\n"
                    + "9. Llenar Animal  "+"      10. Mostrar Animal  "+"     11. Factura"+"\n\n"+"Digite su opción"));
            
            switch (OpcionMenu){
                case 1:{
                    LlenarUsuarios();
                    break;
                }
                case 2:{
                    MostrarUsuarios();
                    break;
                }
                case 3:{
                    LlenarVisitantes();
                    break;
                }
                case 4:{
                    MostrarVisitantes();
                    break;
                }
                case 5:{
                    LlenarDatosEmpleados();
                }
                case 6:{                   
                    MostrarDatosEmpleados();
                }
                case 7:{
                    LlenarDatosEspecie();
                }
                case 8:{
                    MostrarDatosEspecie();
                }
                case 9:{
                    LlenarDatosAnimal();
                }
                case 10:{
                    MostrarDatosAnimal();
                }
            }//factura y más
        }
    }
}
