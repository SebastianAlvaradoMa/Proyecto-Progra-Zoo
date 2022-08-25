
package proyecto.zoo;

import javax.swing.JOptionPane;

public class Rutina {
    int Persona;
    int Precio=2500;
    public int Total;
    public int estado=0;
    public String user;
    public String EditarEmpleado;
    public String EditarAnimal;
    public String EditarEspecie;
    
    //usuarios
    private Usuario[] datos= new Usuario[100];//arreglo
    //visitantes
    private Visitantes[] datosV= new Visitantes[100];//arreglo
    //empleados
    private Empleado[] datosEm=new Empleado[100];//arreglo
    //Especie
    private Especie[] datosEspecie=new Especie[100];//arreglo
    //Animal
    private Animal[] listaAnimal=new Animal[100];//arreglo
    //Factura
    private Factura[] datosR=new Factura[100];//arreglo
    
    
public void iniciarDatos(){
    for(int x=0;x<datos.length;x++){
        datos[x] = new Usuario();
        datosV[x] = new Visitantes();
        datosEm[x] = new Empleado();
        datosEspecie[x] = new Especie();
        listaAnimal[x] = new Animal();
        datosR[x] = new Factura();
    }
}
    
public void AgregarUsuarios(){
    for(int x=0;x<datos.length;x++){
        System.out.println("test");
        if(datos[x].getNombre() == " "){
            System.out.println("test");
            Usuario u=new Usuario();
            u.setNombre(JOptionPane.showInputDialog(null,"Digite su nombre:"));
            u.setApellidos(JOptionPane.showInputDialog(null,"Digite sus apellidos:"));
            u.setNickname(JOptionPane.showInputDialog(null,"Digite su nickname:"));
            u.setPassword(JOptionPane.showInputDialog(null,"Digite su contraseña:"));
            datos[x]=u;
            break;
        }
    }      
}
public void ConsultarUsuarios(){
    
     int x;
        String s="";
        for(x=0;x<datos.length;x++){
            s=s+datos[x].getNombre()+"  "+datos[x].getApellidos()+"  "+datos[x].getNickname()+"  "+datos[x].getPassword()+"\n";
        }
        JOptionPane.showMessageDialog(null,"**DATOS USUARIOS**\n"+s);
    }

public void EncontrarUsuario(){
         int x, encontrado=0;
         String nomU;
         nomU=JOptionPane.showInputDialog(null,"Digite el nombre del Usuario para verificar");
         for(x=0;x<datos.length;x++){
             if(nomU.equals(datos[x].getNombre())){
                 JOptionPane.showMessageDialog(null,"Usuario encontrado: "+datos[x].getNombre());
                 encontrado=1;
                 }
             }
         if(encontrado==0){
                     JOptionPane.showMessageDialog(null,"Este Usuario no ha sido encontrado");
         }
     }
public void InactivarUsuario(){
    user=JOptionPane.showInputDialog(null, "Cual Usuario desea inactivar:");
    for(int x = 0; x <datos.length; x++){
        if(user.equals(datos[x].getNombre())){
            datos[x].Desactivar();
        }
    }
}
 

public void ConsultarUsuariosInactivos(){
    for(int x = 0; x <datos.length;x++){
        if(datos[x].getEstado() == 1){
           JOptionPane.showMessageDialog(null,"Usuarios Inactivos"+"\n"+datos[x].getNombre()+" "+datos[x].getApellidos()+" "+datos[x].getNickname());
        }
    }
 }

public void ConsultarUsuariosActivos(){
    for(int x = 0; x <datos.length;x++){
        if(datos[x].getEstado() != 1){
           JOptionPane.showMessageDialog(null,"Usuarios Activos"+"\n"+datos[x].getNombre()+" "+datos[x].getApellidos()+" "+datos[x].getNickname());
           MenuP();
        }
        }
}
        

   public void AgregarVisitantes(){
       for(int x=0;x<datosV.length;x++){
           System.out.println("test");
           if(datosV[x].getNombreV() == " "){
               System.out.println("test");
           Visitantes v=new Visitantes();
           v.setNombreV(JOptionPane.showInputDialog(null,"Digite su nombre:"));
           v.setApellidosV(JOptionPane.showInputDialog(null,"Digite sus apellidos:"));;
           v.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su edad")));
           datosV[x]=v;
           break;
           }
       }
   }
   public void ConsultarVisitantes(){
       int x;
        String s="";
        for(x=0;x<datosV.length;x++){
            s=s+datosV[x].getNombreV()+"  "+datosV[x].getApellidosV()+"  "+datosV[x].getEdad()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  **DATOS VISITANTES**\n"+s);
    }
  
    

        
         public void AgregarEmpleados(){
        int x;
        for(x=0;x<datosEm.length;x++){
            if(datosEm[x].getNombreE() == " "){
            Empleado em=new Empleado();
            em.setNombreE(JOptionPane.showInputDialog(null,"Digite el nombre del empleado"));
            em.setApellidoE(JOptionPane.showInputDialog(null,"Digite el apellido del empleado"));
            em.setCiudad(JOptionPane.showInputDialog(null,"Digite la ciudad"));
            em.setDireccion(JOptionPane.showInputDialog(null,"Digite la dirección"));
            em.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número de teléfono")));
            em.setCorreoElec(JOptionPane.showInputDialog(null,"Digite su correo"));
            em.setEstado(JOptionPane.showInputDialog(null,"Digite su estado"));           
            datosEm[x]=em;
            break;
            }
}
}
        public void ConsultarEmpleados(){
           
        int x;
        for(x=0;x<datosEm.length;x++){
         String s="";
        for(x=0;x<datosEm.length;x++){
            s=s+datosEm[x].getNombreE()+"  "+datosEm[x].getApellidoE()+"  "+datosEm[x].getCiudad()+"  "+datosEm[x].getDireccion()+" "+
                    datosEm[x].getTelefono()+" "+datosEm[x].getCorreoElec()+" "+datosEm[x].getEstado()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  **DATOS EMPLEADOS**\n"+s);
        }
    }
        
        public void EditarEmpleado(){
            
        
        int opcionMenuEmpleado=0;
        while(opcionMenuEmpleado!=10){
            opcionMenuEmpleado=Integer.parseInt(JOptionPane.showInputDialog(null,"      **EDITAR DATOS**\n\n"
                    +"1.Nombre"+"\n2.Apellidos"+"\n3.Direccion"+"\n4.Telefono"+"\n5.Correo"+"\n6.Regresar"+"\n\n"+"Digite su opción:"));
            
            switch (opcionMenuEmpleado){
                case 1:{
           EditarEmpleado=JOptionPane.showInputDialog(null, "Cual nombre desea cambiar:");
           for(int x = 0; x <datosEm.length; x++){
           if( EditarEmpleado.equals(datosEm[x].getNombreE())){
               String edit=JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre:");
               datosEm[x].setNombreE(edit);
           } else {
           }
            }
           break;
                }
                
                case 2:{
           EditarEmpleado=JOptionPane.showInputDialog(null, "Cual Apellido desea cambiar:");
           for(int x = 0; x <datosEm.length; x++){
           if(EditarEmpleado.equals(datosEm[x].getApellidoE())){
           String edit=JOptionPane.showInputDialog(null, "Ingrese el nuevo apellido:");
           datosEm[x].setApellidoE(edit);  
           }
           }
           break;
           }
                
                case 3:{
           EditarEmpleado=JOptionPane.showInputDialog(null, "Cual direccion desea cambiar:");
           for(int x = 0; x <datosEm.length; x++){
           if(EditarEmpleado.equals(datosEm[x].getDireccion())){
           String edit=JOptionPane.showInputDialog(null, "Ingrese la nueva direccion:");
           datosEm[x].setDireccion(edit);
           }
           }
           break;
                }
                
                case 4:{
           EditarEmpleado=JOptionPane.showInputDialog(null, "Cual correo desea cambiar:");
           for(int x = 0; x <datosEm.length; x++){
           if(EditarEmpleado.equals(datosEm[x].getCorreoElec())){
           String edit=JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre:");
           datosEm[x].setCorreoElec(edit);
           }
           }
           break;
                }
                
                case 5:{
           EditarEmpleado=JOptionPane.showInputDialog(null, "Cual numero de telefono desea cambiar:");
           for(int x = 0; x <datosEm.length; x++){
           if(EditarEmpleado.equals(datosEm[x].getNombreE())){
           String edit=JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de telefono:");
           datosEm[x].setNombreE(edit);
           }
           }
           break;
                }
                
                case 6:{
                    MenuP();
                    break;
                }
                
  }
  }
  }
 
    public void AgregarEspecie(){
        int x;
        for(x=0;x<datosEspecie.length;x++){
            if(datosEspecie[x].getEspecie() == " "){
            Especie esp=new Especie();
            esp.setEspecie(JOptionPane.showInputDialog(null,"Digite el nombre de la especie"));
            esp.setCarac(JOptionPane.showInputDialog(null,"Digite la característica"));
            esp.setEstado(JOptionPane.showInputDialog(null,"Digite el estado "));  
            datosEspecie[x]=esp;
            break;
            }
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
         
         public void EditarEspecie(){
        int opcionMenuEspecie=0;
        while(opcionMenuEspecie!=10){
            opcionMenuEspecie=Integer.parseInt(JOptionPane.showInputDialog(null,"      **EDITAR DATOS**\n\n"
                    +"1.Especie"+"\n2.Caracteristicas"+"\n3.Estado"+"\n4.Regresar"));
            
            switch (opcionMenuEspecie){
                case 1:{
           EditarEspecie=JOptionPane.showInputDialog(null, "Digite el nombre de la especie que desea cambiar:");
           for(int x = 0; x <datosEspecie.length; x++){
           if( EditarEspecie.equals(datosEspecie[x].getEspecie())){
               String edit=JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de especie:");
               datosEspecie[x].setEspecie(edit);
           } else {
           }
            }
           break;
                }
                case 2:{
           EditarEspecie=JOptionPane.showInputDialog(null, "Digite las caracteristicas que desea cambiar:");
           for(int x = 0; x <datosEspecie.length; x++){
           if(EditarEspecie.equals(datosEspecie[x].getCarac())){
           String edit=JOptionPane.showInputDialog(null, "Ingrese las nuevas caracteristicas:");
           datosEspecie[x].setCarac(edit);  
           }
           }
           break;
           }
                case 3:{
           EditarEspecie=JOptionPane.showInputDialog(null, "Digite si la especie se encuentra activa o inactiva:");
           for(int x = 0; x <datosEspecie.length; x++){
           if(EditarEspecie.equals(datosEspecie[x].getEstado())){
           String edit=JOptionPane.showInputDialog(null, "Ingrese si la especie cambia a activa o inactiva:");
           datosEspecie[x].setEstado(edit);  
           }
           }
           break;
           }
                case 4:{
                    MenuP();
                    break;
                }
  }
  }
  }
    
     //animal
       
    public void AgregarAnimal(){
        int x;
        for(x=0;x<listaAnimal.length;x++){
            if(listaAnimal[x].getNombreAnimal() == " "){
            Animal a=new Animal();
            a.setNombreAnimal(JOptionPane.showInputDialog(null,"Digite el nombre del animal"));
            a.setFechaNacimiento(JOptionPane.showInputDialog(null,"Digite la fecha de nacimiento"));
            a.setEspecie(JOptionPane.showInputDialog(null,"Digite la especie del animal"));
            a.setNombreEmpleado(JOptionPane.showInputDialog(null,"Digite el nombre del empleado"));
            a.setEstadoEmpleado(JOptionPane.showInputDialog(null,"Digite el estado del empleado"));
            listaAnimal[x]=a;
            break;
            }
        }
        }
    
     public void ConsultarAnimales(){ 
        
        int x;
        for(x=0;x<listaAnimal.length;x++){
         String s="";
        for(x=0;x<listaAnimal.length;x++){
            s=s+listaAnimal[x].getNombreAnimal()+"  "+listaAnimal[x].getFechaNacimiento()+"  "+listaAnimal[x].getEspecie()+"  "+listaAnimal[x].getNombreEmpleado()+" "
                    +listaAnimal[x].getEstadoEmpleado()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  **DATOS  DEL  ANIMAL**\n"+s);
        }
    }
     
     public void BuscarAnimal(){
         int x, encontrado=0;
         String nomA;
         String nomEmpleado;
         nomA=JOptionPane.showInputDialog(null,"Digite el nombre del animal para verificar:");
         nomEmpleado=JOptionPane.showInputDialog(null,"Digite el nombre del encargado para verificar:");
         for(x=0;x<listaAnimal.length;x++){
             if(nomA.equals(listaAnimal[x].getNombreAnimal()) && nomEmpleado.equals(listaAnimal[x].getNombreEmpleado())){
                 JOptionPane.showMessageDialog(null,"Este animal ya existe");
                 JOptionPane.showMessageDialog(null,"Nombre: "+listaAnimal[x].getNombreAnimal()+" Especie: "+listaAnimal[x].getEspecie()+" Nacimiento: "+listaAnimal[x].getFechaNacimiento()+" Encargado: "+listaAnimal[x].getNombreEmpleado()+"\n");
                 encontrado=1;
                 }
             }
         if(encontrado==0){
                     JOptionPane.showMessageDialog(null,"Este animal no existe");
         }
     }
     
     public void BuscarEncargadoAnimal(){
         int x, encontrado=0;
         String nomEmpleado;
         nomEmpleado=JOptionPane.showInputDialog(null,"Digite el nombre del empleado encargado para verificar:");
         for(x=0;x<listaAnimal.length;x++){
             if(nomEmpleado.equals(listaAnimal[x].getNombreEmpleado())){
                 JOptionPane.showMessageDialog(null,"Este empleado existe");
                 JOptionPane.showMessageDialog(null,"Empleado: "+listaAnimal[x].getNombreEmpleado()+" Se encarga de: "+listaAnimal[x].getNombreAnimal()+", "+listaAnimal[x].getFechaNacimiento());
                 encontrado=1;
                 }
             }
         if(encontrado==0){
                     JOptionPane.showMessageDialog(null,"Este empleado no existe");
         }
     }
     
     public void EditarAnimal(){
        int opcionMenuAnimal=0;
        while(opcionMenuAnimal!=10){
            opcionMenuAnimal=Integer.parseInt(JOptionPane.showInputDialog(null,"      **EDITAR DATOS**\n\n"
                    +"1.Nombre de animal"+"\n2.Nombre de empleado"+"\n3.Regresar"));
            
            switch (opcionMenuAnimal){
                case 1:{
           EditarAnimal=JOptionPane.showInputDialog(null, "Cual nombre de animal desea cambiar:");
           for(int x = 0; x <listaAnimal.length; x++){
           if( EditarAnimal.equals(listaAnimal[x].getNombreAnimal())){
               String edit=JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de animal:");
               listaAnimal[x].setNombreAnimal(edit);
           } else {
           }
            }
           break;
                }
                
                case 2:{
           EditarAnimal=JOptionPane.showInputDialog(null, "Cual nombre de empleado desea cambiar:");
           for(int x = 0; x <listaAnimal.length; x++){
           if(EditarAnimal.equals(listaAnimal[x].getNombreEmpleado())){
           String edit=JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de empleado:");
           listaAnimal[x].setNombreEmpleado(edit);  
           }
           }
           break;
           }
                case 3:{
                    MenuP();
                    break;
                }
  }
  }
  }    
     
     public void Reservacion(){
         int x;
         for(x=0;x<datosR.length;x++){
             if(datosR[x].getNombreV() == " "){
             Factura f=new Factura();
             JOptionPane.showMessageDialog(null, "Reservacion");
             f.setNombreV(JOptionPane.showInputDialog(null,"Digite su nombre:"));
             f.setFecha(JOptionPane.showInputDialog(null,"Digite la fecha de su cita:"));
             f.setHoraVisita(JOptionPane.showInputDialog(null,"Digite la hora de visita:"));
             Persona=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Entrada $2500 por persona\n\nInserte la cantidad de personas:"));
             Total=Persona*Precio;
                 datosR[x]=f; 
            JOptionPane.showMessageDialog(null,"  DATOS FACTURA\n"
                    +"Nombre:"+datosR[x].getNombreV()+"\n"
                    +"Fecha y hora:"+datosR[x].getFecha()+" a las "+datosR[x].getHoraVisita()+"\n"
                    +"Cantidad de personas:"+Persona+"\n"
                    +"Total: "+Total);
            break;
             }
        }
     }
        

       public void Cita(){
         int x;
         String s="";
        for(x=0;x<datosR.length;x++){
            s=s+datosR[x].getNombreV()+"  "+datosR[x].getFecha()+"  "+datosR[x].getHoraVisita()+"\n";
        }
        JOptionPane.showMessageDialog(null,"  ***CITAS PENDIENTES***\n"+ s);
        } 
         
       
       
        public void ModificarCita(){ 
            int x;
            for(x=0;x<datosR.length;x++){
                
                Factura f=new Factura();
                
            String FechaN=JOptionPane.showInputDialog(null, "Digite su nombre: ");
            String FechaC=JOptionPane.showInputDialog(null, "Digite la fecha de su anterior cita: ");
           
            if(FechaN.equals(datosR[x].getNombreV()) && FechaC.equals(datosR[x].getFecha())){
            f.setFechasMod(JOptionPane.showInputDialog(null, "Digite la nueva fecha: "));
            f.setHoraMod(JOptionPane.showInputDialog(null, "Digite la nueva hora: "));
            datosR[x]=f;
            }
            else{
            JOptionPane.showMessageDialog(null,"Digite bien los datos");
            }
            JOptionPane.showMessageDialog(null, "Cita cambiada para el "+datosR[x].getFechasMod()+" a las "+datosR[x].getHoraMod());
            break;
            }
            
        }
        
        
         public void ConsultarCitasModificadas(){ //Falla nombre 
            int x;
         String s="";
        for(x=0;x<datosR.length;x++){
            s=s+datosR[x].getNombreV()+"  "+datosR[x].getFechasMod()+"  "+datosR[x].getHoraMod()+"\n";
        }
        JOptionPane.showMessageDialog(null, "  ***Citas Modificadas***\n"+s);
        }
        
            

    //menu
    public void MenuP(){
        int OpcionMenu=0;
        while(OpcionMenu!=10){
            OpcionMenu=Integer.parseInt(JOptionPane.showInputDialog(null,"      **MENÚ PRINCIPAL**\n\n"
                    + "1. Usuarios  "+"\n2. Visitantes  "+"\n3. Empleados"+"\n4. Especie"+"\n5. Animal"+"\n6. Citas"+"\n7.Salir"+"\n\n"+"Digite su opción:"));
            
            switch (OpcionMenu){
                case 1:{
                    int opcionUsuario=0;
                    while(opcionUsuario!=0);
                    opcionUsuario=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Llenar Usuarios"+"\n2.Mostrar Usuarios"+"\n3.Buscar Usuario"+"\n4.Inactivar Usuario"+
                            "\n5.Consultar Usuarios Inactivos"+"\n6.Consultar Usuarios Activos"+"\n7.Regresar"));

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
                            InactivarUsuario();                        
                            break;
                        }
                        case 5:{
                            ConsultarUsuariosInactivos();
                            break;
                        }
                        case 6:{
                            ConsultarUsuariosActivos();
                            break;
                        }
                        case 7:{
                            MenuP();
                            break;
                        }
                    }
                    break;
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
                    break;
                }
                case 3:{
                int opcionEmpleado=0;
                    while(opcionEmpleado!=0);
                    opcionEmpleado=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Empleados"+"\n2.Consultar Empleados"+"\n3.Editar Empleado"+"\n4.Regresar"));
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
                            EditarEmpleado();
                            break;
                        }
                        case 4:{
                            MenuP();
                            break;
                        }
                    
            }
                    break;
         }
                case 4:{
                    int opcionEspecie=0;
                    while(opcionEspecie!=0);
                    opcionEspecie=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Especie"+"\n2.Consultar Especie"+"\n"
                            + "3.Buscar Especie"+"\n4.Regresar"));
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
                    break;
}
                case 5:{
                   int opcionAnimal=0;
                    while(opcionAnimal!=0);
                    opcionAnimal=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Animal"+"\n2.Consultar Animal"+"\n3.Buscar Animal"+"\n4.Buscar encargado de animal"+"\n5.Regresar"));
                    switch(opcionAnimal){
                        case 1:{
                            AgregarAnimal();
                            break;
                        }
                        case 2:{
                            ConsultarAnimales();
                            break;
                        }
                        case 3:{
                            BuscarAnimal();
                            break;
                        }
                        case 4:{
                            BuscarEncargadoAnimal();
                            break;
                        }
                        case 5:{
                            MenuP();
                            break;
                        } 
                }
                    break;
}
            
                case 6:{
                    int opcionCita=0;
                    while(opcionCita!=0);
                    opcionCita=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Reservación"+"\n2.Citas Pendientes"+"\n3.Modificar Cita"+"\n4.Citas Modificadas"+"\n5.Regresar"));
                    switch(opcionCita){
                        case 1:{
                            Reservacion();
                            break;
                        }
                        case 2:{
                            Cita();
                            break;
                        }
                        case 3:{
                            ModificarCita();
                            break;
                        }
                        case 4:{
                            ConsultarCitasModificadas();
                            break;
                        }
                        case 5:{
                            MenuP();
                            break;
                        } 
                }
                    break;
                }
                
                case 7:{
                    JOptionPane.showMessageDialog(null,"Has salido del Programa");
                    System.exit(0);
                    break;
                }
                
}
}
}
}
        
      
       
               


