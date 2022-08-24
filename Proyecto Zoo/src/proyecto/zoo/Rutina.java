
package proyecto.zoo;

import javax.swing.JOptionPane;

public class Rutina {
    public int PersonasU;
    public int Persona;//arreglo
    private Usuario datos[]= new Usuario[2];//arreglo
    
public void AgregarUsuarios(){
    int x;
    for(x=0;x<datos.length;x++){
        Usuario u=new Usuario();
        
        u.setNombre(JOptionPane.showInputDialog(null,"Digite su nombre:"));
        u.setApellidos(JOptionPane.showInputDialog(null,"Digite sus apellidos:"));;
        u.setNickname(JOptionPane.showInputDialog(null,"Digite su nickname:"));
        u.setPassword(JOptionPane.showInputDialog(null,"Digite su contraseña:"));
      //  u.setEstado (Integer.parseInt((JOptionPane.showInputDialog(null,"Digite su estado:"))));
        datos[x]=u;
     //   datos[x].Desactivar();
    }      
}
public void ConsultarUsuarios(){
    
     int x;
        String s="";
        for(x=0;x<datos.length;x++){
            s=s+datos[x].getNombre()+"  "+datos[x].getApellidos()+"  "+datos[x].getNickname()+"  "+datos[x].getPassword()+"\n";
        }
        JOptionPane.showMessageDialog(null,"***DATOS USUARIOS***\n"+s);
    }

public void EncontrarUsuario(){
         int x, encontrado=0;
         String nomU;
         nomU=JOptionPane.showInputDialog(null,"Digite el nombre del Usuario para verificar");
         for(x=0;x<datos.length;x++){
             if(nomU.equals(datos[x].getNombre())){
                 JOptionPane.showMessageDialog(null,"Usuario encontrado: "+datos[x].getNombre());
                 encontrado=1;
                 if(encontrado==0){
                     JOptionPane.showMessageDialog(null,"Este Usuario no ha sido encontrado");
                 }
             }
         }
     }
     
//visitantes
private Visitantes datosV[]= new Visitantes[5];//arreglo
   public void AgregarVisitantes(){
       
       int x;
       for(x=0;x<datosV.length;x++){
           
           Visitantes v=new Visitantes();
           
           v.setNombreV(JOptionPane.showInputDialog(null,"Digite su nombre:"));
           v.setApellidosV(JOptionPane.showInputDialog(null,"Digite sus apellidos:"));;
           v.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su edad")));
           datosV[x]=v;
       }
   }
   public void ConsultarVisitantes(){
       int x;
        String s="";
        for(x=0;x<datosV.length;x++){
            s=s+datosV[x].getNombreV()+"  "+datosV[x].getApellidosV()+"  "+datosV[x].getEdad()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  ***DATOS VISITANTES***\n"+s);
    }
  
    
    //empleados
    private Empleado datosEm[]=new Empleado[3];//arreglo
        
         public void AgregarEmpleados(){
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
        public void ConsultarEmpleados(){
           
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
    
    public void AgregarEspecie(){
        int x;
        for(x=0;x<datosEspecie.length;x++){
            
            Especie esp=new Especie();
            
            esp.setEspecie(JOptionPane.showInputDialog(null,"Digite el nombre de la especie"));
            esp.setCarac(JOptionPane.showInputDialog(null,"Digite la característica"));
            esp.setEstado(JOptionPane.showInputDialog(null,"Digite el estado "));  
            datosEspecie[x]=esp;
        }
    }
     public void ConsultarEspecie(){
     
        int x;
        String s="";
        for(x=0;x<datosEspecie.length;x++){
            s=s+datosEspecie[x].getEspecie()+"  "+datosEspecie[x].getCarac()+"  "+datosEspecie[x].getEstado()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  ***DATOS ESPECIE\n"+s);
        }
     
         public void EncontrarEspecie(){
         int x, encontrado=0;
         String nomE;
         nomE=JOptionPane.showInputDialog(null,"Digite el nombre de la especie para verificar:");
         for(x=0;x<datosEspecie.length;x++){
             if(nomE.equals(datosEspecie[x].getEspecie())){
                 JOptionPane.showMessageDialog(null,"Esta especie ya existe");
                 JOptionPane.showMessageDialog(null,"Especie encontrada: "+datosEspecie[x].getEspecie()+", "+datosEspecie[x].getCarac());
                 encontrado=1;
                 if(encontrado==0){
                     JOptionPane.showMessageDialog(null,"Esta especie no existe");
                 }
             }
         }
     }
    
     //animal
       private Animal listaAnimal[]=new Animal[1];//arreglo
       
    public void AgregarAnimal(){
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
    
     public void ConsultarAnimal(){
        
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

     private Factura datosR[]=new Factura[2];

     public void Reservacion(){
         int Persona;
         int Precio=2500;
         int Total;
         int x;
         
         for(x=0;x<datosR.length;x++){
             
             Factura f=new Factura();

             f.setNombreV(JOptionPane.showInputDialog(null,"Digite su nombre:"));
             f.setFecha(JOptionPane.showInputDialog(null,"Digite la fecha de su cita:"));
             f.setHoraVisita(JOptionPane.showInputDialog(null,"Digite la hora de visita:"));
             Persona=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Entrada $2500 por persona\n\nInserte la cantidad de personas:"));
             Total=Persona*Precio;
                 datosR[x]=f; 
            JOptionPane.showMessageDialog(null,"  DATOS FACTURA\n"+ datosR[x].getNombreV()+"  "+datosR[x].getFecha()+"  "+datosR[x].getHoraVisita()+" Personas: "+Persona+" Precio= $"+Total);
        }
        }
       
     
     public void Cita(){
         int x;
        for(x=0;x<datosR.length;x++){
         String s="";
        for(x=0;x<datosR.length;x++){
            s=s+datosR[x].getNombreV()+"  "+datosR[x].getFecha()+"  "+datosR[x].getPersonas()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  DATOS FACTURA\n"+s);
        } 
     }
     
     
     
    //menu
    public void MenuP(){
        int OpcionMenu=0;
        while(OpcionMenu!=10){
            OpcionMenu=Integer.parseInt(JOptionPane.showInputDialog(null,"                                                        ***MENÚ PRINCIPAL***\n\n"
                    + "1. Usuarios  "+"\n2. Visitantes  "+"3. Empleados"+"4. Especie"+"5. Animal"+"6. Citas"+"\n\n"+"Digite su opción:"));
            
            switch (OpcionMenu){
                case 1:{
                    int opcionUsuario=0;
                    while(opcionUsuario!=0);
                    opcionUsuario=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Llenar Usuarios"+"\n2.Mostrar Usuarios"+"\n3.Desactivar Usuario"+"3.Buscar Usuario"+"\n4.Regresar"));
                    switch(opcionUsuario){
                        case 1:{
                            AgregarUsuarios();
                            break;
                        }
                        case 2:{
                            ConsultarUsuarios();
                            break;
                        }
                        case 3:{
                            EncontrarUsuario();
                        break; 
                        }
                        case 4:{
                            MenuP();
                            break;
                        }
                    }
                }
            
                
            
                case 2:{
                    int opcionVisitante=0;
                    while(opcionVisitante!=0);
                    opcionVisitante=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Visitantes"+"\n2.Consultar Visitantes"+"\n3.Regresar"));
                    switch(opcionVisitante){
                        case 1:{
                            AgregarVisitantes();
                            break;
                        }
                        case 2:{
                            ConsultarVisitantes();
                            break;
                        }
                        case 3:{
                            MenuP();
                            break;
                        }
                    }
                }
                case 3:{
                int opcionEmpleado=0;
                    while(opcionEmpleado!=0);
                    opcionEmpleado=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Empleados"+"\n2.Consultar Empleados"+"\n3.Regresar"));
                    switch(opcionEmpleado){
                        case 1:{
                            AgregarEmpleados();
                            break;
                        }
                        case 2:{
                            ConsultarEmpleados();
                            break;
                        }
                        case 3:{
                            MenuP();
                            break;
                        }
                    
            }
         }
                case 4:{
                    int opcionEspecie=0;
                    while(opcionEspecie!=0);
                    opcionEspecie=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Especie"+"\n2.Consultar Especie"+"3.Buscar Especie"+"\n4.Regresar"));
                    switch(opcionEspecie){
                        case 1:{
                            AgregarEspecie();
                            break;
                        }
                        case 2:{
                            ConsultarEspecie();
                            break;
                        }
                        case 3:{
                            EncontrarEspecie();
                            break;
                        }
                        case 4:{
                            MenuP();
                            break;
                        }
                    
                    
   }
}
                case 5:{
                   int opcionAnimal=0;
                    while(opcionAnimal!=0);
                    opcionAnimal=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Animal"+"\n2.Consultar Animal"+"\n3.Regresar"));
                    switch(opcionAnimal){
                        case 1:{
                            AgregarAnimal();
                            break;
                        }
                        case 2:{
                            ConsultarAnimal();
                            break;
                        }
                        case 3:{
                            MenuP();
                            break;
                        } 
                }
}
            
                case 6:{
                    int opcionCita=0;
                    while(opcionCita!=0);
                    opcionCita=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Reservación"+"\n2.Citas Pendientes"+"\n3.Factura"+"\n4.Regresar"));
                    switch(opcionCita){
                        case 1:{
                            Reservacion();
                            break;
                       }
                        case 2:{
                            Cita();
                            break;
                        }
              //          case 3:{
               //            Factura();
                 //           break;
                 //       }
                        case 3:{
                            MenuP();
                            break;
                        } 
                }
                }
}
}
}
    }
        
      
       
               


