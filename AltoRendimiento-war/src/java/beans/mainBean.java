/*
 * lvillavicencio
 */
package beans;



import entities.Mdcategoriaactualt;
import entities.Mdcvdp;
import entities.Mdcvdr;
import entities.Mdcvfa;
import entities.Mdcvhe;
import entities.Mdcvie;
import entities.Mdcvrd;
import facades.MdcvdpFacadeLocal;
import facades.MdcvdrFacadeLocal;
import facades.MdcvfaFacadeLocal;
import facades.MdcvheFacadeLocal;
import facades.MdcvieFacadeLocal;
import facades.MdcvrdFacadeLocal;
import entities.Mdcategoriaedadt;
import entities.Mdcategoriapropuestat;
import entities.Mdcodigos;
import entities.Mdconvocatoriat;
import entities.Mddeportest;
import entities.Mddisciplinat;
import entities.Mddivisionpolitica;
import entities.Mdincentivoshistt;
import entities.Mdincentivost;
import entities.Mdmenut;
import entities.Mdmodulot;
import entities.Mdperfilmodulot;
import entities.Mdperfilt;
import entities.Mdpersonast;
import entities.Mdusuarioperfilt;
import entities.Mdusuariot;
import facades.MdcategoriaactualtFacadeLocal;
import facades.MdcategoriaedadtFacadeLocal;
import facades.MdcategoriapropuestatFacadeLocal;
import facades.MdcodigosFacadeLocal;
import facades.MdconvocatoriatFacadeLocal;
import facades.MddeportestFacadeLocal;
import facades.MddisciplinatFacadeLocal;
import facades.MddivisionpoliticaFacadeLocal;
import facades.MdincentivoshisttFacadeLocal;
import facades.MdincentivostFacadeLocal;
import facades.MdmenutFacadeLocal;
import facades.MdmestFacadeLocal;
import facades.MdmodulotFacadeLocal;
import facades.MdperfilmodulotFacadeLocal;
import facades.MdperfiltFacadeLocal;
import facades.MdpersonastFacadeLocal;
import facades.MdusuarioperfiltFacadeLocal;
import facades.MdusuariotFacadeLocal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@Named(value = "myBean")
@SessionScoped
//@ViewScoped
public class mainBean implements Serializable {

    @EJB
    private MdcodigosFacadeLocal mdcodigosFacade;


    @EJB
    private MddivisionpoliticaFacadeLocal mddivisionpoliticaFacade;

    @EJB
    private MdcvrdFacadeLocal mdcvrdFacade;

    @EJB
    private MdcvieFacadeLocal mdcvieFacade;

    @EJB
    private MdcvheFacadeLocal mdcvheFacade;

    @EJB
    private MdcvfaFacadeLocal mdcvfaFacade;

    @EJB
    private MdcvdrFacadeLocal mdcvdrFacade;

    @EJB
    private MdcvdpFacadeLocal mdcvdpFacade;

    @EJB
    private MdpersonastFacadeLocal mdpersonastFacade;

    @EJB
    private MdusuarioperfiltFacadeLocal mdusuarioperfiltFacade;

    @EJB
    private MdusuariotFacadeLocal mdusuariotFacade;

    @EJB
    private MdperfiltFacadeLocal mdperfiltFacade;

    @EJB
    private MdperfilmodulotFacadeLocal mdperfilmodulotFacade;

    @EJB
    private MdmodulotFacadeLocal mdmodulotFacade;

    @EJB
    private MdmestFacadeLocal mdmestFacade;

    @EJB
    private MdmenutFacadeLocal mdmenutFacade;

    @EJB
    private MdincentivostFacadeLocal mdincentivostFacade;

    @EJB
    private MdincentivoshisttFacadeLocal mdincentivoshisttFacade;

    @EJB
    private MddisciplinatFacadeLocal mddisciplinatFacade;

    @EJB
    private MddeportestFacadeLocal mddeportestFacade;

    @EJB
    private MdconvocatoriatFacadeLocal mdconvocatoriatFacade;

    @EJB
    private MdcategoriapropuestatFacadeLocal mdcategoriapropuestatFacade;

    @EJB
    private MdcategoriaedadtFacadeLocal mdcategoriaedadtFacade;

    @EJB
    private MdcategoriaactualtFacadeLocal mdcategoriaactualtFacade;


    private Mdusuariot uActual;
    private Mdusuarioperfilt uPerfil;
    private Mdperfilmodulot pModulo;
    private Mdmodulot modulo;
    private List<Mdmenut> menus;
    private String usuario, password;
    private List<Mdpersonast> listaPersonas;
    private List<Mdpersonast> filtroPersonas;
    private Mdpersonast selectPersona;
    private Mdincentivost selectIncentivo;
    private Date fecha;
    private Mdcategoriaedadt catEdad;
    private Mdcategoriapropuestat catPro;
    private Mddisciplinat disciplina;
    private Mddeportest deporte;
    private List<Mdcategoriaedadt> listCatE;
    private List<Mdcategoriapropuestat> listCatP;
    private List<Mddisciplinat> listDisciplina;
    private List<Mddeportest> listDeporte;
    private Mdconvocatoriat convocatoria;
    private List<Mdconvocatoriat> listConv;
    private List<Mdcategoriaactualt> catActual;
    
    private List<Mdcategoriaactualt> filtroCatA;
    private List<Mdcategoriapropuestat> filtroCatP;
    
    
    
    private Mdcategoriapropuestat selCatProp;
    private Mdcategoriapropuestat newCatpro;
    private Mdcategoriaactualt selCatActual;
    private Mdcategoriaactualt newCatActual;
    
    private Mdcvdp selCvSociEc;
    private Mdcvdr selCvDistRe;
    private Mdcvfa selCvForAc;
    private Mdcvhe selCvHistEnt;
    private Mdcvie selCvInfEnt;
    private Mdcvrd selCvResDep;
    private String[] nombres;
    
    private List<Mdcvhe> listHistEnt;
    private List<Mdcvdr> listDistReci;
    private List<Mdcvrd> listReconDep;
    
    private List<Mddivisionpolitica> listaProv;
    private List<Mddivisionpolitica> listaCiudad;
    
    private Mdincentivoshistt newIncHist;
    private Mdincentivoshistt selIncHist;
    
    private boolean nuevoDeportista;
    
    private Mdpersonast selAprobados;
    
    private boolean aprovacion;
    private Mdcodigos codigo;
    
    
    private Mdcodigos selCode;
    public String accessLogin() throws IOException{
        String resultado="";
        
        if(usuario.length()>0&&password.length()>0){
           
          
            
            uActual=mdusuariotFacade.findThisUser(usuario, password);
            System.out.println("Usuario: "+uActual.getUsumail());
            if(uActual.getIdusuario()!=null){
                if(uActual.getIdacticode()!=1){
                    System.out.println("Sin acceso...");
                
                 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario Sin Autorización","Contacte DTC"));
                }
                else{
                    uPerfil=mdusuarioperfiltFacade.findThisUser(uActual);
                    System.out.println("1.- uPerfil Cod Usuario: "+uPerfil.getIdusuario().getIdusuario());
                    System.out.println("2.- uPerfil P: "+uPerfil.getIdperfil().getIdperfil());
                    Mdperfilt x =mdperfiltFacade.find(uPerfil.getIdperfil().getIdperfil());
                    System.out.println("3.- perfil: "+x.toString());
                    pModulo=mdperfilmodulotFacade.findModulo(x);
                    System.out.println("4.- pmodulo: "+pModulo.getIdmodulo().getIdmodulo());
                    modulo = mdmodulotFacade.find(pModulo.getIdmodulo().getIdmodulo());
                    System.out.println("5.- modulo: "+modulo.getModnombre());
                    
                    
                    
                    menus=mdmenutFacade.getAllBymodulo(modulo.getIdmodulo());
                    System.out.println("6.- menus: "+menus.get(0));
                    for(Mdmenut t: menus){
                        System.out.println("7.- Nombres: "+t.getMennombre());
                    }
                    System.out.println("8.- FIN");
                    
                    
                    resultado="menu";
                    /*switch (uPerfil.getIdPerfil().getIdPerfil()) {
                       case 1:  resultado = "panelsu1";
                                   tipoUsuario=1;
                                   admin=true;
                                break;
                       case 2:  resultado = "gestionfichas_1";
                                   tipoUsuario=2;
                                   admin=false;
                                   currentCity=ciudadesFacade.find(uActual.getCiudad());
                                   
                                break;
                       case 3:  resultado = "reportes";
                                   tipoUsuario=3;
                                break;

                       default: resultado = "";
                                break;
                   }*/
//                System.out.println("Usuario: "+uActual.getNombres());
                }
            }
            else{
                System.out.println("No hay usuario");
                
                 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Datos erroneos","usuario o contraseña incorrectos"));
                return resultado;
            }
               
        }
        else{
            FacesContext.getCurrentInstance().addMessage(null, 
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos faltantes", "los campor son obligatorios"));
            return resultado;
        }
         return resultado;
    }
    
    public String logout() throws IOException{
        System.out.println("bye bye");
        RequestContext.getCurrentInstance().execute("window.scrollTo(0,0);");
        HttpSession session = SessionBean.getSession();
        session.invalidate();
        
        return"login";
    
    }
    
   
    
    public String redir(String x){
        return x;
    }
    
    public String editDeport(Mdpersonast x){
        selectPersona=x;
        selectIncentivo=mdincentivostFacade.buscaXpersona(x);
       
        selCvForAc=mdcvfaFacade.buscarXpersona(x.getIddep());
        selCvInfEnt=mdcvieFacade.buscarXpersona(x.getIddep());
        selCvSociEc=mdcvdpFacade.buscarXpersona(x.getIddep());
        
        listDistReci=mdcvdrFacade.getListByPersona(x.getIddep());
        listHistEnt=mdcvheFacade.getListByPersona(x.getIddep());
        listReconDep=mdcvrdFacade.getListByPersona(x.getIddep());
        
        return "editor_persona";
    }
    public String cv(Mdpersonast x){
        
        
        
        return "cv";
    }
    public String givmeLink(int x){
        String link="";
         switch (x) {
                    case 1:  link = "menu";
                             break;
                    case 2:  link = "incentivos_list";
                             break;
                    case 3:  link = "incentivo_nuevo";
                                System.out.println("gestioncfp");
                             break;
                    case 4:  editDeport(selectPersona);
                             
                             link = "resultados_1";  
                                break;
                    case 5:  if(uActual.getIdacticode()==1)
                                link = "panelsu1";
                             else
                                link = "gestionfichas_1";
                             break;
                    case 6:  link = "registro";
                             break;
                    case 7:  link = "reportes";
                             break;

                    default: link = "";
                             break;
                }
         return link;
            
    }
    
    public String newinc(){ 
        nuevoDeportista=true;
        selectPersona= new Mdpersonast();
        selectIncentivo= new Mdincentivost();
        selCvDistRe=new Mdcvdr();
        selCvForAc=new Mdcvfa();
        selCvHistEnt=new Mdcvhe();
        selCvInfEnt=new Mdcvie();
        selCvResDep=new Mdcvrd();
        selCvSociEc=new Mdcvdp();
        
        
        return "incentivo_nuevo";
    }
    public void prueba(String x){
        
        System.out.println("X: "+x);
        System.out.println("Persona: "+selectPersona.getDepnombre());
        System.out.println("Cédula: "+selectPersona.getDepcedula());
        System.out.println("DOB: "+selectPersona.getDepdob());
    
    
    }
    public void fechas(String x){
        
        System.out.println("DATES::::: "+x);
        System.out.println("Persona: "+selectPersona.getDepnombre());
        System.out.println("Cédula: "+selectPersona.getDepcedula());
        
    
    
    }
    public void sexo(int x){
        
        System.out.println("SEXO::::: "+x);
        System.out.println("Persona: "+selectPersona.getDepnombre());
        System.out.println("Cédula: "+selectPersona.getDepcedula());
        
    
    
    }
    public boolean selOtros(String x){
    if(x.equals("Otros"))
        return true;
    else 
        return false;
    }
     public void reloadDinardap(String persona, int x, String nombre){
        System.out.println("reloadDinardap"); 
        RequestContext.getCurrentInstance().execute("verifica("+persona+")");
      
        System.out.println(persona);
        System.out.println("Sexo: "+x);
        System.out.println("nombre: "+nombre);
        System.out.println("Datos: ");
         /*System.out.println(selectPersona.getDepnombre());
         System.out.println(selectPersona.getDepdob());
         System.out.println(selectPersona.getDepcedula());*/
         
        
        /*selectPersona.setDepcedula(persona);
        selectPersona.setDepnombre(nombre);
        selectPersona.setIdsexo(x);*/
       
    
    }
    public String registraPersona(){
        String resultado="";
                System.out.println("getIddep: "+ selectPersona.getIddep());
                System.out.println("ControlNuevo?: "+ nuevoDeportista);
        
        System.out.println("Dentor");

        System.out.println("Persona Actual: "+ selectPersona.getDepcedula());
        System.out.println("Persona Nombre: "+ selectPersona.getDepnombre());
        System.out.println("Persona Sexo: "+ selectPersona.getIdsexo());
        System.out.println("Cédula: "+ selectPersona.getDepcedula());
        
        if(mdpersonastFacade.findById(selectPersona.getDepcedula())&&nuevoDeportista){
            System.out.println("record ya existe...");
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Deportista ya registrado","Controle la lista"));
            resultado="";
        
        }else{
            if(selectPersona.getIddep()==null&&nuevoDeportista){
                System.out.println("puedo registrar nuevo");
                resultado="incentivos_list";
                nombres = selectPersona.getDepnombre().split("\\s+");
                int numnom=nombres.length;
                switch (numnom) {
                       case 3:  selectPersona.setDepnombre(nombres[2]);
                                selectPersona.setDepapellido(nombres[0]+" "+nombres[1]);
                                break;
                       case 5:  selectPersona.setDepnombre(nombres[2]+" "+nombres[3]+" "+nombres[4]);
                                selectPersona.setDepapellido(nombres[0]+" "+nombres[1]);

                                break;
                       case 4:  selectPersona.setDepnombre(nombres[2]+" "+nombres[3]);
                                selectPersona.setDepapellido(nombres[0]+" "+nombres[1]);
                                break;
                }
                System.out.println("Persona Nombre: "+ selectPersona.getDepnombre());
                System.out.println("Persona Apellidos: "+ selectPersona.getDepapellido());
                System.out.println(selectPersona.getIddeporte()); 
                selectPersona.setIdcreador(uActual.getIdusuario());
                mdpersonastFacade.guardarDatos(selectPersona);  
                selectIncentivo.setIddep(selectPersona.getIddep());
                mdincentivostFacade.guardarDatos(selectIncentivo);
                selCvSociEc.setPersona(selectPersona);
                mdcvdpFacade.guardarDatos(selCvSociEc);
                selCvForAc.setPersona(selectPersona);
                mdcvfaFacade.guardarDatos(selCvForAc);
                selCvInfEnt.setPersona(selectPersona);
                mdcvieFacade.guardarDatos(selCvInfEnt);
            }
            else{

                System.out.println("modifico solo algunos datos");
                mdpersonastFacade.modificarDatos(selectPersona);  
                mdincentivostFacade.modificarDatos(selectIncentivo);
                mdcvdpFacade.modificarDatos(selCvSociEc);
                mdcvfaFacade.modificarDatos(selCvForAc);
                mdcvieFacade.modificarDatos(selCvInfEnt);
                
                
                
                
                resultado="incentivos_list";
            }
        }
        listaPersonas=mdpersonastFacade.findAll();
        nuevoDeportista=false;
        return resultado;
    }
    
    public void registrarExEntrenador(){
        System.out.println("Registro Ex Entrenador");
        selCvHistEnt.setPersona(selectPersona.getIddep());
        mdcvheFacade.guardarDatos(selCvHistEnt);    
        listHistEnt=mdcvheFacade.getListByPersona(selectPersona.getIddep());
        
    }
    public void registrarResulDep(){
        System.out.println("Registro ResultDepo");
        selCvResDep.setPersona(selectPersona.getIddep());
        mdcvrdFacade.guardarDatos(selCvResDep);    
        listReconDep=mdcvrdFacade.getListByPersona(selectPersona.getIddep());
        
    }
    public void registrarDistRecib(){
        System.out.println("Registro DidtiRecibida");
        selCvDistRe.setPersona(selectPersona.getIddep());
        mdcvdrFacade.guardarDatos(selCvDistRe);    
        listDistReci=mdcvdrFacade.getListByPersona(selectPersona.getIddep());
        
    }
    
    
    public  int getAge(Date dateOfBirth) {
        int age =0;
        if(dateOfBirth!=null){
            System.out.println(dateOfBirth);
            Calendar hoy = Calendar.getInstance();
            Calendar fechacumple = Calendar.getInstance();
            fechacumple.setTime(dateOfBirth);
            if (fechacumple.after(hoy)) {
                throw new IllegalArgumentException("You don't exist yet");
            }
            int hoyYear = hoy.get(Calendar.YEAR);
            int fechacumpleYear = fechacumple.get(Calendar.YEAR);
            int hoyDayOfYear = hoy.get(Calendar.DAY_OF_YEAR);
            int fechacumpleDayOfYear = fechacumple.get(Calendar.DAY_OF_YEAR);
            int hoyMonth = hoy.get(Calendar.MONTH);
            int fechacumpleMonth = fechacumple.get(Calendar.MONTH);
            int hoyDayOfMonth = hoy.get(Calendar.DAY_OF_MONTH);
            int fechacumpleDayOfMonth = fechacumple.get(Calendar.DAY_OF_MONTH);
            age = hoyYear - fechacumpleYear;

            // If birth date is greater than hoys date (after 2 days adjustment of leap year) then decrement age one year
            if ((fechacumpleDayOfYear - hoyDayOfYear > 3) || (fechacumpleMonth > hoyMonth)){
                age--;

            // If birth date and hoys date are of same month and birth day of month is greater than hoys day of month then decrement age
            } else if ((fechacumpleMonth == hoyMonth) && (fechacumpleDayOfMonth > hoyDayOfMonth)){
                age--;
            }
        }else age=0;
        return age;
    }
    
    
     //UploadImages  
    private UploadedFile archivo;
    //private String ubicacionEnDisco="C:\\Users\\TOSHIBA\\AppData\\Roaming\\NetBeans\\8.0\\config\\GF_4.0\\domain1\\docroot\\imagenes\\";
    private String ubicacionEnDisco="C:\\glassfish4\\glassfish\\domains\\domain1\\docroot\\imagenes\\";
    //private String ubicacionEnDisco="/Applications/NetBeans/glassfish-4.0/glassfish/domains/domain1/docroot/img/";
    
    public void fileUploadListener(FileUploadEvent event){
        archivo=event.getFile();
        System.out.println("Archivo: "+archivo.getFileName());
         try {
             subirImagen(archivo.getFileName());
         } catch (IOException ex) {
             Logger.getLogger(mainBean.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

 public void subirImagen(String nombreImagen) throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();
        String extension = "";

        int i = archivo.getFileName().lastIndexOf('.');
        if (i > 0) {
            extension = archivo.getFileName().substring(i+1);
        }
        if(!archivo.getFileName().isEmpty()){
             try {
                 escribirEnDisco(selectPersona.getDepcedula()+"."+extension, archivo.getInputstream());
                 context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Archivo ", archivo.getFileName()+" almacenado correctaente."));
                 archivo = null;
             } catch (Exception e) {
                 context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", " al subir archivo "+e.getMessage()));
             }
         }else{ 
             context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN, "", "Seleccione un archivo"));
         }      
    }
    public void escribirEnDisco(String nombreArchivo, InputStream in){
        try {
            OutputStream out = new FileOutputStream(new File(ubicacionEnDisco+nombreArchivo));
            int reader = 0;           
            byte [] bytes = new byte[(int)archivo.getSize()];
            while ((reader = in.read(bytes))!= -1) {
                out.write(bytes,0,reader);
            }
            in.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }    
    }
    
    
    
    public double getincentivosMenXpersona(Mdpersonast p){
        double x=0.0;
        System.out.println("Incentivos por mes 607");
        
        if(mdincentivostFacade.buscaXpersona(p).getIncvalormensual()!=null && mdincentivostFacade.buscaXpersona(p).getIncvalormensual() >0){
            x=mdincentivostFacade.buscaXpersona(p).getIncvalormensual();
            
            System.out.println("XXXXXXXXXXXXXXXXXXX");
            System.out.println(x);
           // codigo=mdcodigosFacade.find(x)
        }
        return x;
        
    }
    public double getincentivosTotXpersona(Mdpersonast p){
        double x=0.0;
        if(mdincentivostFacade.buscaXpersona(p).getIncvalortotal() != null && mdincentivostFacade.buscaXpersona(p).getIncvalortotal()>0){
            x=mdincentivostFacade.buscaXpersona(p).getIncvalortotal();
        }
        return x;
        
    }
    
    public String getIncePropuesta(Mdpersonast p){
        System.out.println("Persona: "+p.getDepapellido());
        int x=mdincentivostFacade.buscaXpersona(p).getIdcatpro();
        String y="";
        if(x>0){
            System.out.println("X>0: "+x);
            y=mdcategoriapropuestatFacade.find(x).getCatdescripcion();
        }else{
            y="No tiene categoria";
        }
        return y;
    }
    
    public String getnombreDeporte(int x){
        System.out.println("Deporte: "+x);
        String y="";
        if(x>0){
            y=mddeportestFacade.find(x).getDepdescripcion();      
        }else
            y="Sin deporte";  
        return y;
    }
    
    public String getnombreDciplina(int x){
        System.out.println("Diciplina: "+x);
        String y="";
        if(x>0){
            y=mddisciplinatFacade.find(x).getDisdescripcion();
        }else
            y="sin dicplina";
        return y;
    }
    
    public void getDisXDep(int x){
        System.out.println("Seleccionar deporte: "+x);
            Mddeportest dep=new Mddeportest();
            dep=mddeportestFacade.find(x);
            listDisciplina=mddisciplinatFacade.findByDeporte(dep);
            for(Mddisciplinat y: listDisciplina ){
                System.out.println("Diciplinas: "+y.getDisdescripcion());
        
            }
        
       
        
    }
    public String getCatPro(int x){
        String y="No tiene categoría propuesta";
        if(x>0){
            y=mdcategoriapropuestatFacade.find(x).getCatdescripcion();
        }
        return y;
    }
    public String getCatEdad(int x){
        String y="No tiene categoría edad";
        if(x>0){
            y=mdcategoriaedadtFacade.find(x).getCatedaddescripcion();
        }
        return y;
    }
    
    
    //editor de categorias:
    
    public void onRowEdit(RowEditEvent event) {
        
        
        
        
         selCatProp=(Mdcategoriapropuestat)event.getObject();
         
         if(mdcategoriapropuestatFacade.modificarDatos(selCatProp)){
                   
                FacesMessage msg = new FacesMessage("Usuario Actualizado", ((Mdcategoriapropuestat) event.getObject()).getCatdescripcion());
                FacesContext.getCurrentInstance().addMessage(null, msg);
         }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "No se han realizado modificaciones."));
               
         }
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Cambios no realizados para", ""+((Mdcategoriapropuestat) event.getObject()).getCatdescripcion());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    //editor de propuestas de admin:
    
    public void onRowEditPro(RowEditEvent event) {
        
          selAprobados=(Mdpersonast) event.getObject();
        selAprobados.setAprobado(aprovacion);
        if(mdpersonastFacade.modificarDatos(selAprobados)){
            FacesMessage msg = new FacesMessage("Usuario Actualizado", ((Mdpersonast) event.getObject()).getAprobado().toString());
                FacesContext.getCurrentInstance().addMessage(null, msg);
        
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "No se han realizado modificaciones."));
               
        
        }
    }
    public void aprobadoValue(boolean x){
         aprovacion=x;
    
    }
     
    public void onRowCancelPro(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Cambios no realizados para", ""+((Mdpersonast) event.getObject()).getDepcedula());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
      public void registraCatpro(){
          System.out.println(newCatpro.getCatdescripcion()); 
       
        if(mdcategoriapropuestatFacade.guardarDatos(newCatpro)){
            System.out.println("Catpro registrada...");
             FacesMessage msg = new FacesMessage("Cat Pro Registrado", newCatpro.getCatdescripcion());
                FacesContext.getCurrentInstance().addMessage(null, msg); 
                listCatP=mdcategoriapropuestatFacade.findAll();
                System.out.println("update list CatPro...");
         }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Categoria propuesta  no registrado."));
               
        }
    
    }
    
    public void onCellEdit(CellEditEvent event){
        System.out.println("Dato actuales:");
        
        selCatProp=new Mdcategoriapropuestat();
        System.out.println(selCatProp.getCatdescripcion());
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
        
        System.out.println(oldValue+" "+newValue);
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        
    
    }
    
    public String getInstitucion(int x){
       return mdusuariotFacade.find(x).getInstitucion();
    
    }
    
    
    
    
    public UploadedFile getArchivo() {
        return archivo;
    }

    public void setArchivo(UploadedFile archivo) {
        this.archivo = archivo;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Mdusuariot getuActual() {
        return uActual;
    }

    public void setuActual(Mdusuariot uActual) {
        this.uActual = uActual;
    }

    public Mdusuarioperfilt getuPerfil() {
        return uPerfil;
    }

    public void setuPerfil(Mdusuarioperfilt uPerfil) {
        this.uPerfil = uPerfil;
    }

    public Mdperfilmodulot getpModulo() {
        return pModulo;
    }

    public void setpModulo(Mdperfilmodulot pModulo) {
        this.pModulo = pModulo;
    }

    public Mdmodulot getModulo() {
        return modulo;
    }

    public void setModulo(Mdmodulot modulo) {
        this.modulo = modulo;
    }

    public List<Mdmenut> getMenus() {
        return menus;
    }

    public void setMenus(List<Mdmenut> menus) {
        this.menus = menus;
    }

    public List<Mdpersonast> getListaPersonas() {
       
       
        // System.out.println("Perfil: "+uPerfil.getIdperfil().getIdperfil() );
        //if(listaPersonas==null){
            
            if(uPerfil.getIdperfil().getIdperfil()==3){
                 System.out.println("buscando personas de federación: "+uPerfil.getIdperfil().getPernombre() );
                listaPersonas=mdpersonastFacade.findByPerfil(uActual.getIdusuario());
            }
            else{
                //System.out.println("buscando todas las personas ");
                listaPersonas=mdpersonastFacade.findAll();
            }
            /*for(Mdpersonast x: listaPersonas ){
                System.out.println("Persona: "+x.getDepcedula());
        
            }*/
        return listaPersonas;
    }

    public void setListaPersonas(List<Mdpersonast> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public List<Mdpersonast> getFiltroPersonas() {
        return filtroPersonas;
    }

    public void setFiltroPersonas(List<Mdpersonast> filtroPersonas) {
        this.filtroPersonas = filtroPersonas;
    }

    public Mdpersonast getSelectPersona() {
        if(selectPersona==null){
            System.out.println("XXXXXXXXX --- Persona nulla --- XXXXXXXXXXXX");
            selectPersona=new Mdpersonast();
        }
       
        return selectPersona;
    }

    public void setSelectPersona(Mdpersonast selectPersona) {
        this.selectPersona = selectPersona;
    }

    public Mdincentivost getSelectIncentivo() {
        if(selectIncentivo==null)
            selectIncentivo= new Mdincentivost();
        return selectIncentivo;
    }

    public void setSelectIncentivo(Mdincentivost selectIncentivo) {
        this.selectIncentivo = selectIncentivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Mdcategoriaedadt getCatEdad() {
        return catEdad;
    }

    public void setCatEdad(Mdcategoriaedadt catEdad) {
        this.catEdad = catEdad;
    }

    public Mdcategoriapropuestat getCatPro() {
        return catPro;
    }

    public void setCatPro(Mdcategoriapropuestat catPro) {
        this.catPro = catPro;
    }

    public Mddisciplinat getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Mddisciplinat disciplina) {
        this.disciplina = disciplina;
    }

    public Mddeportest getDeporte() {
        return deporte;
    }

    public void setDeporte(Mddeportest deporte) {
        this.deporte = deporte;
    }

    public List<Mdcategoriaedadt> getListCatE() {
        if(listCatE==null)
            listCatE=mdcategoriaedadtFacade.findAll();
        return listCatE;
    }

    public void setListCatE(List<Mdcategoriaedadt> listCatE) {
        this.listCatE = listCatE;
    }

    public List<Mdcategoriapropuestat> getListCatP() {
        if(listCatP==null)
          listCatP=mdcategoriapropuestatFacade.findAll();
        return listCatP;
    }

    public void setListCatP(List<Mdcategoriapropuestat> listCatP) {
        this.listCatP = listCatP;
    }

    public List<Mddisciplinat> getListDisciplina() {
        if(listDisciplina==null)
            listDisciplina=mddisciplinatFacade.findAll();
        return listDisciplina;
    }

    public void setListDisciplina(List<Mddisciplinat> listDisciplina) {
        this.listDisciplina = listDisciplina;
    }

    public List<Mddeportest> getListDeporte() {
        System.out.println("DEPORTES - XXXXXXXXXXXXXXXXX");
        if(listDeporte==null){
            System.out.println("LISTA DEPORTES");
            listDeporte=mddeportestFacade.findAll();
        }else
            System.out.println("No está vacia....");
        return listDeporte;
    }

    public void setListDeporte(List<Mddeportest> listDeporte) {
        this.listDeporte = listDeporte;
    }

    public Mdconvocatoriat getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Mdconvocatoriat convocatoria) {
        this.convocatoria = convocatoria;
    }

    public List<Mdconvocatoriat> getListConv() {
        if(listConv==null)
            listConv=mdconvocatoriatFacade.findAll();
        return listConv;
    }

    public void setListConv(List<Mdconvocatoriat> listConv) {
        this.listConv = listConv;
    }

    public Mdcvdp getSelCvSociEc() {
        if(selCvSociEc==null)
            selCvSociEc=new Mdcvdp();
        return selCvSociEc;
    }

    public void setSelCvSociEc(Mdcvdp selCvSociEc) {
        this.selCvSociEc = selCvSociEc;
    }

    public Mdcvdr getSelCvDistRe() {
        if(selCvDistRe==null)
            selCvDistRe=new Mdcvdr();
        return selCvDistRe;
    }

    public void setSelCvDistRe(Mdcvdr selCvDistRe) {
        this.selCvDistRe = selCvDistRe;
    }

    public Mdcvfa getSelCvForAc() {
        if(selCvForAc==null)
            selCvForAc=new Mdcvfa();
        return selCvForAc;
    }

    public void setSelCvForAc(Mdcvfa selCvForAc) {
        this.selCvForAc = selCvForAc;
    }

    public Mdcvhe getSelCvHistEnt() {
        if(selCvHistEnt==null)
            selCvHistEnt=new Mdcvhe();
        return selCvHistEnt;
    }

    public void setSelCvHistEnt(Mdcvhe selCvHistEnt) {
        this.selCvHistEnt = selCvHistEnt;
    }

    public Mdcvie getSelCvInfEnt() {
        if(selCvInfEnt==null)
            selCvInfEnt=new Mdcvie();
        return selCvInfEnt;
    }

    public void setSelCvInfEnt(Mdcvie selCvInfEnt) {
        this.selCvInfEnt = selCvInfEnt;
    }

    public Mdcvrd getSelCvResDep() {
        if(selCvResDep==null)
            selCvResDep=new Mdcvrd();
        return selCvResDep;
    }

    public void setSelCvResDep(Mdcvrd selCvResDep) {
        this.selCvResDep = selCvResDep;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public List<Mddivisionpolitica> getListaProv() {
        
        if(listaProv==null){
            System.out.println("prov empty");
            listaProv=mddivisionpoliticaFacade.getProv();
        }
        else
            System.out.println("prov full");
        return listaProv;
    }

    public void setListaProv(List<Mddivisionpolitica> listaProv) {
        this.listaProv = listaProv;
    }

    public List<Mddivisionpolitica> getListaCiudad() {
        if(listaCiudad==null)
            listaCiudad=mddivisionpoliticaFacade.getCiudades();
        return listaCiudad;
    }

    public void setListaCiudad(List<Mddivisionpolitica> listaCiudad) {
        this.listaCiudad = listaCiudad;
    }

    public List<Mdcvhe> getListHistEnt() {
        if(listHistEnt==null){
            listHistEnt=mdcvheFacade.getListByPersona(selectPersona.getIddep());
        }
        
        return listHistEnt;
    }

    public void setListHistEnt(List<Mdcvhe> listHistEnt) {
        this.listHistEnt = listHistEnt;
    }

    public List<Mdcvdr> getListDistReci() {
        if(listDistReci==null)
            listDistReci=mdcvdrFacade.getListByPersona(selectPersona.getIddep());
        return listDistReci;
    }

    public void setListDistReci(List<Mdcvdr> listDistReci) {
        this.listDistReci = listDistReci;
    }

    public List<Mdcvrd> getListReconDep() {
        if(listReconDep==null)
            listReconDep=mdcvrdFacade.getListByPersona(selectPersona.getIddep());
        return listReconDep;
    }

    public void setListReconDep(List<Mdcvrd> listReconDep) {
        this.listReconDep = listReconDep;
    }

    public List<Mdcategoriaactualt> getCatActual() {
        if(catActual==null)
            catActual=mdcategoriaactualtFacade.findAll();
        return catActual;
    }

    public void setCatActual(List<Mdcategoriaactualt> catActual) {
        this.catActual = catActual;
    }

    public Mdcategoriapropuestat getSelCatProp() {
        return selCatProp;
    }

    public void setSelCatProp(Mdcategoriapropuestat selCatProp) {
        this.selCatProp = selCatProp;
    }

    public Mdcategoriaactualt getSelCatActual() {
        return selCatActual;
    }

    public void setSelCatActual(Mdcategoriaactualt selCatActual) {
        this.selCatActual = selCatActual;
    }

    public List<Mdcategoriaactualt> getFiltroCatA() {
        return filtroCatA;
    }

    public void setFiltroCatA(List<Mdcategoriaactualt> filtroCatA) {
        this.filtroCatA = filtroCatA;
    }

    public List<Mdcategoriapropuestat> getFiltroCatP() {
        return filtroCatP;
    }

    public void setFiltroCatP(List<Mdcategoriapropuestat> filtroCatP) {
        this.filtroCatP = filtroCatP;
    }

    public Mdcodigos getSelCode() {
        return selCode;
    }

    public void setSelCode(Mdcodigos selCode) {
        this.selCode = selCode;
    }

    public Mdcategoriapropuestat getNewCatpro() {
        return newCatpro;
    }

    public void setNewCatpro(Mdcategoriapropuestat newCatpro) {
        this.newCatpro = newCatpro;
    }

    public Mdcategoriaactualt getNewCatActual() {
        return newCatActual;
    }

    public void setNewCatActual(Mdcategoriaactualt newCatActual) {
        this.newCatActual = newCatActual;
    }

    public Mdincentivoshistt getNewIncHist() {
        return newIncHist;
    }

    public void setNewIncHist(Mdincentivoshistt newIncHist) {
        this.newIncHist = newIncHist;
    }

    public boolean isNuevoDeportista() {
        return nuevoDeportista;
    }

    public void setNuevoDeportista(boolean nuevoDeportista) {
        this.nuevoDeportista = nuevoDeportista;
    }

    public Mdpersonast getSelAprobados() {
        return selAprobados;
    }

    public void setSelAprobados(Mdpersonast selAprobados) {
        this.selAprobados = selAprobados;
    }

    public boolean isAprovacion() {
        return aprovacion;
    }

    public void setAprovacion(boolean aprovacion) {
        this.aprovacion = aprovacion;
    }

    public Mdcodigos getCodigo() {
        return codigo;
    }

    public void setCodigo(Mdcodigos codigo) {
        this.codigo = codigo;
    }

    
    

   

    

   

    
    
    
    
    
}
