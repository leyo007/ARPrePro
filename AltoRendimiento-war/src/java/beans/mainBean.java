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
import entities.Mdclafundep;
import entities.Mdcodigos;
import entities.Mdconvocatoriat;
import entities.Mddeportest;
import entities.Mddisciplinat;
import entities.Mddivisionpolitica;
import entities.Mdevento;
import entities.Mdfederacion;
import entities.Mdhonorarios;
import entities.Mdincentivoshistt;
import entities.Mdincentivost;
import entities.Mdmenut;
import entities.Mdmodulot;
import entities.Mdnecesidades;
import entities.Mdperfilmodulot;
import entities.Mdperfilt;
import entities.Mdpersonast;
import entities.Mdreportes;
import entities.Mdusuarioperfilt;
import entities.Mdusuariot;
import facades.MdcategoriaactualtFacadeLocal;
import facades.MdcategoriaedadtFacadeLocal;
import facades.MdcategoriapropuestatFacadeLocal;
import facades.MdclafundepFacadeLocal;
import facades.MdcodigosFacadeLocal;
import facades.MdconvocatoriatFacadeLocal;
import facades.MddeportestFacadeLocal;
import facades.MddisciplinatFacadeLocal;
import facades.MddivisionpoliticaFacadeLocal;
import facades.MdeventoFacadeLocal;
import facades.MdfederacionFacadeLocal;
import facades.MdhonorariosFacadeLocal;
import facades.MdincentivoshisttFacadeLocal;
import facades.MdincentivostFacadeLocal;
import facades.MdmenutFacadeLocal;
import facades.MdmestFacadeLocal;
import facades.MdmodulotFacadeLocal;
import facades.MdnecesidadesFacadeLocal;
import facades.MdperfilmodulotFacadeLocal;
import facades.MdperfiltFacadeLocal;
import facades.MdpersonastFacadeLocal;
import facades.MdreportesFacadeLocal;
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
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.primefaces.model.UploadedFile;

@ManagedBean
@Named(value = "myBean")
@SessionScoped
//@ViewScoped
public class mainBean implements Serializable {

    @EJB
    private MdreportesFacadeLocal mdreportesFacade;

    @EJB
    private MdhonorariosFacadeLocal mdhonorariosFacade;

    @EJB
    private MdfederacionFacadeLocal mdfederacionFacade;

    @EJB
    private MdnecesidadesFacadeLocal mdnecesidadesFacade;

    @EJB
    private MdeventoFacadeLocal mdeventoFacade;

    @EJB
    private MdclafundepFacadeLocal mdclafundepFacade;

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

    private Mdhonorarios currentHono;
    private Mdhonorarios selecetedHono;
    private Mdhonorarios nuevoHono;
    private List<Mdhonorarios> listaHono;
    private List<Mdhonorarios> filtroHono;
    private Mdusuariot currentUser;
    private Mdusuariot selectedUser;
    private Mdusuariot newUser;
    private List<Mdusuariot> listUsers;
    private Mdusuarioperfilt currentPerfil;
    private Mdusuarioperfilt newuPerfil;
    private List<Mdperfilt> listPerfiles;
    private Mdperfilmodulot currentModulo;
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
    private List<Mdincentivoshistt> listaincHistXCI;
    private boolean nuevoDeportista;
    
    private Mdpersonast selAprobados;

    private boolean aprovacion;
    private Mdcodigos codigo;
    private String medida;
    private List<Mdclafundep> listaClafundep;
    private Mdcodigos selCode;
    
    private Mdevento selectedEvent;
    private Mdevento newEvent;
    private List<Mdevento> listaEventos;
    private List<Mdevento> filtroEventos;
    private List<Mdevento> filtroTEventos;
    
    private Mdnecesidades selectedNecesidad;
    private Mdnecesidades newNecesidad;
    private List<Mdnecesidades> listaNecesidad;
    private List<Mdnecesidades> filtroNecesidad;
    private int[] listaDel;
    private int[] listaMes;
    private double[] listaniveles;
    private String[] listaLvl;
    
    private Mdfederacion selectFede;
    private List <Mdfederacion> listFede;
    
    private boolean imcoe;
    private boolean editHono;
    
    private ScheduleModel eventModel;
     
    private ScheduleModel lazyEventModel;
 
    private ScheduleEvent event = new DefaultScheduleEvent();
    
    private Mdreportes newReport;
    private Mdreportes selectReport;
    private List<Mdreportes> listReport;
    private List<Mdreportes> filterReport;
    
    private List<Mdreportes> listInfTec;
    private List<Mdreportes> listRegAsist;
    private List<Mdreportes> listPagoIess;
    
    
    
    Renderizador r=new Renderizador();
    public void  noLogged() throws IOException{
        if(currentUser==null){
     
           r.irAInicio();
           
        }
    }
    
    Mdperfilt x = new Mdperfilt();
    Mdperfilt y = new Mdperfilt();
    public String accessLogin() throws IOException{
        String resultado="";
        
        if(usuario.length()>0&&password.length()>0){
           
          
            
            currentUser=mdusuariotFacade.findThisUser(usuario, password);
            System.out.println("Usuario: "+currentUser.getUsumail());
            if(currentUser.getIdusuario()!=null){
                if(currentUser.getIdacticode()!=1){
                    System.out.println("Sin acceso...");
                
                 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario Sin Autorización","Contacte DTC"));
                }
                else{
                    currentPerfil=mdusuarioperfiltFacade.findThisUser(currentUser);
                    System.out.println("1.- uPerfil Cod Usuario: "+currentPerfil.getIdusuario().getIdusuario());
                    System.out.println("2.- uPerfil P: "+currentPerfil.getIdperfil().getIdperfil());
                    x =mdperfiltFacade.find(currentPerfil.getIdperfil().getIdperfil());
                    System.out.println("3.- perfil: "+x.toString());
                    currentModulo=mdperfilmodulotFacade.findModulo(x);
                    System.out.println("4.- pmodulo: "+currentModulo.getIdmodulo().getIdmodulo());
                    modulo = mdmodulotFacade.find(currentModulo.getIdmodulo().getIdmodulo());
                    System.out.println("5.- modulo: "+modulo.getModnombre());
                    
                                       
                    if(currentUser.getEntrenador())
                        menus=mdmenutFacade.getAllBymoduloCoach(modulo.getIdmodulo());
                    else
                        menus=mdmenutFacade.getAllBymodulo(modulo.getIdmodulo());
                    System.out.println("6.- menus: "+menus.get(0));
                    
                    //menus.forEach((t) -> {
                    for(Mdmenut t: menus){
                        System.out.println("7.- Nombres: "+t.getMennombre());
                    };
                    //});
                    selectFede=mdfederacionFacade.find(currentUser.getCodinst());
                    
                    System.out.println("8.- selectFede: "+selectFede);
                    System.out.println("9.- selectFede: "+selectFede.getSector());
                    System.out.println("10.- FIN");
                    
                    
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
        r.irAInicio();
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
    public String editEvent(Mdevento x){
        System.out.println("Go to edit Event");
        selectedEvent=x;
        
        
        return "evento_edit";
    }
    public String reposDeport(Mdpersonast x){
        selectPersona=x;
        System.out.println("-------------------");
        System.out.println("REPOSTULACION");
       
        selectIncentivo=mdincentivostFacade.buscaXpersona(x);
        System.out.println(getnombreDeporte(selectPersona.getIddeporte()));
        System.out.println(getnombreDciplina(selectPersona.getIddis()));
        
        System.out.println("-------------------");
        
        
        return "incentivo_repost";
    }
    public String cv(Mdpersonast x){
        
        
        
        return "cv";
    }
    public String givmeLink(int x){
        String link="";
         switch (x) {
                    case 1:  link = "menu";
                             break;
                    case 2:  if(currentPerfil.getIdperfil().getIdperfil()==2)
                                link="incentivos_aprobacion";
                             else link = "incentivos_list";
                        
                        
                             break;
                    case 3:  link = "incentivo_nuevo";
                                System.out.println("gestioncfp");
                             break;
                    case 4:  editDeport(selectPersona);
                             
                             link = "resultados_1";  
                                break;
                    case 5:  if(currentUser.getIdacticode()==1)
                                link = "panelsu1";
                             else
                                link = "gestionfichas_1";
                             break;
                    case 6:  link = "registro";
                             break;
                    case 7:  link = "reportes";
                             break;
                    case 8:  if(currentModulo.getIdmodulo().getIdmodulo()==6)
                                link = "eventosView";
                             else 
                                   link = "eventos";
                             break;
                    case 9:  link = "necesidades";
                             break;
                    case 10:  link = "honorarios_list";
                            imcoe=false;
                             break;

                    default: link = "";
                             break;
                }
         return link;
            
    }
    public String newnecesitiesGral(){
        newNecesidad=new Mdnecesidades();
        newNecesidad.setTipo(true);
        System.out.println("try new necesities");
        //xxx
        return "necesidades_nuevo_gral";
    
    }
    public String newnecesitiesInd(){
        newNecesidad=new Mdnecesidades();
        newNecesidad.setTipo(false);
        System.out.println("try new necesities");
        //xxx
        return "necesidades_nuevo_ind";
    
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
    public String newEvento(){ 
        newEvent=new Mdevento();
        
        newEvent.setAd(selectFede.getAd());
        if(selectFede.getTipo().equals("NACIONALES"))
            newEvent.setTipomacro("CPS");
        
        if(selectFede.getSector())
            newEvent.setSector("CONVENCIONAL");
        else
            newEvent.setSector("DISCAPACIDAD");
   
        return "evento_nuevo";
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
    public void pruebaH(String x){      
        System.out.println("X: "+x);
        System.out.println("Persona: "+nuevoHono.getNombres());
        System.out.println("Cédula: "+nuevoHono.getCi());
        System.out.println("DOB: "+nuevoHono.getDob());
    }
    public void fechasH(String x){       
        System.out.println("DATES::::: "+x);
        System.out.println("Persona: "+nuevoHono.getNombres());
        System.out.println("Cédula: "+nuevoHono.getCi());  
    }
    public void sexoH(int x){       
        System.out.println("SEXO::::: "+x);
        System.out.println("Persona: "+nuevoHono.getNombres());
        System.out.println("Cédula: "+nuevoHono.getCi()); 
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
    public String registraEvento(){
        String resultado="";
        newEvent.setCreador(currentUser.getIdusuario());
        if(mdeventoFacade.guardarDatos(newEvent)){
            
                if(currentModulo.getIdmodulo().getIdmodulo()==6 || currentModulo.getIdmodulo().getIdmodulo()==2){
                    filtroEventos=mdeventoFacade.findAll();
                    resultado="eventosView";
                }
                else{
                    filtroEventos=mdeventoFacade.getListByCreator(currentUser.getIdusuario());
                    resultado="eventos";
                }
            
            
        }
        
        return resultado;
    } 
    public String modificarEvento(){
        String resultado="";
        selectedEvent.setCreador(currentUser.getIdusuario());
        if(mdeventoFacade.modificarDatos(selectedEvent))
            if(currentModulo.getIdmodulo().getIdmodulo()==6 || currentModulo.getIdmodulo().getIdmodulo()==2){
                    filtroEventos=mdeventoFacade.findAll();
                    resultado="eventosView";
                }
                else{
                    filtroEventos=mdeventoFacade.getListByCreator(currentUser.getIdusuario());
                    resultado="eventos";
                }
        
        return resultado;
    } 
    public String registraNecesidadGral(){
        String resultado="";
        newNecesidad.setCreador(currentUser.getIdusuario());
        newNecesidad.setDeporte(getnombreDeporte(newNecesidad.getIddep()));
        newNecesidad.setTipo(true);
        newNecesidad.setTotal(newNecesidad.getValor()*newNecesidad.getCantidad());
         if(selectFede.getSector())
            newNecesidad.setSector("CONVENCIONAL");
        else
            newNecesidad.setSector("DISCAPACIDAD");
       
        if(mdnecesidadesFacade.guardarDatos(newNecesidad)){
            filtroNecesidad=mdnecesidadesFacade.getListByCreator(currentUser.getIdusuario());
            resultado="necesidades";
        }
        
        return resultado;
    } 
    public String registraNecesidadInd(){
        String resultado="";
        newNecesidad.setCreador(currentUser.getIdusuario());
        newNecesidad.setDeporte(getnombreDeporte(newNecesidad.getIddep()));
        newNecesidad.setTipo(false);
        newNecesidad.setTotal(newNecesidad.getValor()*newNecesidad.getCantidad());
         if(selectFede.getSector())
            newNecesidad.setSector("CONVENCIONAL");
        else
            newNecesidad.setSector("DISCAPACIDAD");
       
        if(mdnecesidadesFacade.guardarDatos(newNecesidad)){
            filtroNecesidad=mdnecesidadesFacade.getListByCreator(currentUser.getIdusuario());
            resultado="necesidades";
        }
        
        return resultado;
    } 
    public String modificarNecesidadGral(){
        mdnecesidadesFacade.modificarDatos(newNecesidad);
        
        
        return "necesidades";
    } 
    public String modificarNecesidadGral(Mdnecesidades x){
        String y="";
        newNecesidad=x;
        if(newNecesidad.getTipo())
            y="necesidades_geditor";
        else 
            y="necesidades_ieditor";
        return y;
    } 
    public String modificarHonorario(Mdhonorarios x){
        String y="";
        System.out.println("selecetedHono");
        selecetedHono=x;
        
        if(currentModulo.getIdmodulo().getIdmodulo()==5 && selectFede.getSector()){
            editHono=true;
            y="honorario_fede_edit";
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==2){
            editHono=true;
            y="honorario_admin_edit";
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==6 && selectFede.getSector()){
            editHono=true;
            y="honorario_coe_edit"; //xxx
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==6 && !selectFede.getSector()){
            editHono=true;
            y="honorario_cpe_edit"; //xxx
        }
        
        return y;
    } 
    public String individual(Mdnecesidades x){
        selectedNecesidad=x;
        
        newNecesidad=new Mdnecesidades();
        listaNecesidad=mdnecesidadesFacade.getListByGral(selectedNecesidad.getId());
        
        return "necesidades_individual";
    } 
     public void registrarIndividual(){
        System.out.println("Registro Necesidad Individual");
        newNecesidad.setCreador(currentUser.getIdusuario());
        newNecesidad.setDeporte(getnombreDeporte(selectedNecesidad.getIddep()));
        newNecesidad.setTipo(false);
        newNecesidad.setTotal(newNecesidad.getValor()*newNecesidad.getCantidad());
         if(selectFede.getSector())
            newNecesidad.setSector("CONVENCIONAL");
        else
            newNecesidad.setSector("DISCAPACIDAD");
        newNecesidad.setPadre(selectedNecesidad.getId());
        mdnecesidadesFacade.guardarDatos(newNecesidad);    
        listaNecesidad=mdnecesidadesFacade.getListByGral(selectedNecesidad.getId());
        
    }
     public double totalEventos(List<Mdnecesidades> x){
         double y=0.0;
         for (Mdnecesidades n : x) {
             y+=n.getValor();
         }
        return y;
     }
     public double totalEvento(List<Mdnecesidades> x){
         double y=0.0;
         for (Mdnecesidades n : x) {
             y+=n.getTotal();
         }
        return y;
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
                selectPersona.setIdcreador(currentUser.getIdusuario());
                selectPersona.setDepprueba(selectPersona.getDepprueba()+" "+medida);
                selectPersona.setAprobado(false);
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
    
    public String repostulacion(){
        String x="";
        mdpersonastFacade.modificarDatos(selectPersona);  
        if(currentPerfil.getIdperfil().getIdperfil()==2){
            
            x="incentivos_aprobacion";
        }
        else x="incentivos_list";
        return x;
    }
    
    public void printevent(){
        System.out.println("EVENT PRESSED");
    
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
    //private String ubicacionEnDisco="/opt/glassfish/4.0/glassfish/domains/domain1/docroot/img/";
    
    public void fileUploadListener(FileUploadEvent event){
        archivo=event.getFile();
        System.out.println("Archivo: "+archivo.getFileName());
         try {
             subirImagen(archivo.getFileName());
         } catch (IOException ex) {
             Logger.getLogger(mainBean.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
String name="";
 public void subirImagen(String nombreImagen) throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();
        String extension = "";

        int i = archivo.getFileName().lastIndexOf('.');
        if (i > 0) {
            extension = archivo.getFileName().substring(i+1);
            System.out.println("extension: "+extension);
        }
        if(!archivo.getFileName().isEmpty()){
             try {
                 
                 if(!extension.equals("pdf")){
                     System.out.println("No pdf");
                     
                    escribirEnDisco(selectPersona.getDepcedula()+"."+extension, archivo.getInputstream());
                    
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Archivo ", archivo.getFileName()+" almacenado correctamente."));
                    
                    archivo = null;
                 }else{
                     System.out.println("pdf");
                     
                     if(newReport.getId()!=null){
                     
                        Calendar hoy = Calendar. getInstance();
                        hoy.setTime(newReport.getMesano());
                        name=hoy.get(Calendar.MONTH)+"_"+hoy.get(Calendar.YEAR);
                     }
                    name=name+"_"+currentUser.getUsucedula()+"."+extension;
                    newReport.setArchivo(name);
                    mdreportesFacade.modificarDatos(newReport);
                    escribirEnDisco(name, archivo.getInputstream());
                    listInfTec=mdreportesFacade.getReportsByType("IT", currentUser);
                    listRegAsist=mdreportesFacade.getReportsByType("RA", currentUser);
                    listPagoIess=mdreportesFacade.getReportsByType("IESS", currentUser);
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Archivo ", archivo.getFileName()+" almacenado correctamente."));
                    
                    archivo = null;
                    newReport = null;
                 
                 }
             } catch (Exception e) {
                 System.out.println("error carga file: "+e.getMessage());
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
            
            //System.out.println("XXXXXXXXXXXXXXXXXXX");
           // System.out.println(x);
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
        System.out.println("Seleccionar deporte 1: "+x);
            Mddeportest dep=new Mddeportest();
            dep=mddeportestFacade.find(x);
            listDisciplina=mddisciplinatFacade.findByDeporte(dep);
            listaClafundep=mdclafundepFacade.findAll();
            for(Mddisciplinat y: listDisciplina ){
                System.out.println("Diciplinas: "+y.getDisdescripcion());
        
            }     
    }
    public void getDisXDepDesc(String x){
        System.out.println("Seleccionar deporte 2: "+x);
           listDisciplina=mddeportestFacade.getAllDiciplinaByDesc(x);
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
    public void onRowSelect(SelectEvent event){
        selAprobados=(Mdpersonast) event.getObject();
        listaincHistXCI=mdincentivoshisttFacade.getListByCI(selAprobados.getDepcedula());
        FacesMessage msg = new FacesMessage("Cèdula seleccionada: ", selAprobados.getDepcedula());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    
    }
    public void onRowEditPro(RowEditEvent event) {    
        selAprobados=(Mdpersonast) event.getObject();
        selAprobados.setAprobado(aprovacion);
        
        selectIncentivo=mdincentivostFacade.buscaXpersona(selAprobados);
        selectIncentivo.setIdestado(aprovacion);
        
        if(aprovacion){
            selectIncentivo.setIncvalormensual(mdcodigosFacade.find(1).getValor()*mdcategoriaactualtFacade.find(selectIncentivo.getIdcatpro()).getNumrbu());
            
            
        }
        else{
            selectIncentivo.setIncvalormensual(new Float(0));
        }
        selectIncentivo.setIdcatactual(selectIncentivo.getIdcatpro());
        if(mdpersonastFacade.modificarDatos(selAprobados)){
            mdincentivostFacade.modificarDatos(selectIncentivo);
            FacesMessage msg = new FacesMessage("Usuario Actualizado", ((Mdpersonast) event.getObject()).getAprobado().toString());
                FacesContext.getCurrentInstance().addMessage(null, msg);
                //listaPersonas=mdpersonastFacade.findAll();
                selAprobados=(Mdpersonast) event.getObject();
//                onRowCancelPro(event);
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "No se han realizado modificaciones.")); 
            selAprobados=(Mdpersonast) event.getObject();
        }
    }
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Cèdula deseleccionada: ", ((Mdpersonast) event.getObject()).getDepcedula());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    //editor de perfiles:
    public void onRowSelectPerfil(SelectEvent event){
        System.out.println("selectedUserselectedUserselectedUser");
        selectedUser=(Mdusuariot) event.getObject();
        FacesMessage msg = new FacesMessage("Perfil seleccionado", "Modificar");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }
    public void onRowUnselectPerfil(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Suelta perfil: ", "this perfil");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     public void modificaperfil(){
        if(mdusuariotFacade.modificarDatos(selectedUser)){
            System.out.println("Usuario modificado...");
             FacesMessage msg = new FacesMessage("usuario modificado", selectedUser.getUsunombre());
                FacesContext.getCurrentInstance().addMessage(null, msg); 
                listUsers=mdusuariotFacade.findAll();
                
         }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Usuario no modificado"));
               
        }
    
    }
     public void resetUser(){
         selectPersona= new Mdpersonast();
     }
    public void nuevousuario(){
        System.out.println("try create newUser: ");
        System.out.println("newUser.getCodinst(): "+newUser.getCodinst());
        newuPerfil=new Mdusuarioperfilt();
        newUser.setInstitucion(mdfederacionFacade.buscarXid(newUser.getCodinst()).getNombre());
        switch(newUser.getCodinst()){
            
            case 49:              
                newuPerfil.setIdperfil(mdperfiltFacade.find(4));
                break;//coe
            case 52: 
                newuPerfil.setIdperfil(mdperfiltFacade.find(4));
                break;//cpe
            default: 
                newuPerfil.setIdperfil(mdperfiltFacade.find(3));
                break;
            
        
        }
       
        newUser.setInstitucion(mdfederacionFacade.buscarXid(newUser.getCodinst()).getNombre());
        newUser.setIdacticode(1);
        if(mdusuariotFacade.guardarDatos(newUser)){
            System.out.println("newUser: "+newUser.getIdusuario());
            newuPerfil.setIdusuario(newUser);
            if(mdusuarioperfiltFacade.guardarDatos(newuPerfil)){
                RequestContext.getCurrentInstance().execute("PF('newUser').hide();");
                FacesMessage msg = new FacesMessage("Usuario generado", newUser.getUsunombre());
                FacesContext.getCurrentInstance().addMessage(null, msg); 
                listUsers=mdusuariotFacade.findAll();
                //pruebas
            }
                
         }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Usuario no generado"));
               
        }
    
    }
    
    public void onRowAcceptPos(Mdpersonast event) {    
        System.out.println(event.getAprobado()+" Estado actual aprobacion");
        System.out.println("EVENT:");
        System.out.println(event.getDepcedula());
        System.out.println(event.getDepapellido());
       
        selectIncentivo=mdincentivostFacade.buscaXpersona(event);
        selectIncentivo.setIdestado(event.getAprobado());

        
        if(event.getAprobado()){//wwws
            newIncHist= new Mdincentivoshistt();
            selectIncentivo.setIncvalormensual(mdcodigosFacade.find(1).getValor()*mdcategoriaactualtFacade.find(selectIncentivo.getIdcatpro()).getNumrbu());
            newIncHist.setInchcedula(event.getDepcedula());
            newIncHist.setInchdeporte(getnombreDeporte(event.getIddeporte()));  
            newIncHist.setInchdisciplina(getnombreDciplina(event.getIddeporte()));
            if(event.getIdsexo()==0)                
                newIncHist.setInchgenero("H");
            else
                newIncHist.setInchgenero("F");
            
            newIncHist.setInchconvocatoria(mdconvocatoriatFacade.find(event.getIdconv()).getCondescripcion());
            newIncHist.setInchcatedad(mdcategoriaedadtFacade.find(selectIncentivo.getIdcatpro()).getCatedaddescripcion());
            newIncHist.setInchnombre(event.getDepnombre());
            newIncHist.setInchapellido(event.getDepapellido());
            newIncHist.setInchprovincia(mddivisionpoliticaFacade.getProvSingle(event.getIdprorep()).getNombredivpol());
            newIncHist.setInchprueba(event.getDepprueba());
            newIncHist.setInchresultados(event.getDepresultados());
            newIncHist.setInchproyeccion(event.getDepproyeccion());
            if(selectIncentivo.getIdcatactual()!=0)
                newIncHist.setInchcatactual(mdcategoriaactualtFacade.find(selectIncentivo.getIdcatactual()).getCatdescripcion());
            else
                newIncHist.setInchcatactual(mdcategoriaactualtFacade.find(selectIncentivo.getIdcatpro()).getCatdescripcion());
            newIncHist.setInchnovedad(event.getDepnovedad());
            newIncHist.setInchcatprop(mdcategoriaactualtFacade.find(selectIncentivo.getIdcatpro()).getCatdescripcion());
            newIncHist.setInchvmensual(getincentivosMenXpersona(event));
            newIncHist.setInchnmes(selectIncentivo.getIdmes());
            newIncHist.setInchtotal(newIncHist.getInchvmensual()*newIncHist.getInchnmes());
            Calendar hoy = Calendar.getInstance();
            int hoyMonth = hoy.get(Calendar.MONTH);
            newIncHist.setInchfechaini(hoy.getTime());
            //newIncHist.setInchfechafin(fecha); // xxx
            newIncHist.setPerid(0);
            newIncHist.setHandi(aprovacion);
            newIncHist.setClafundep(usuario);
            newIncHist.setEstado(event.getAprobado());
            
            mdincentivoshisttFacade.guardarDatos(newIncHist);
            mdpersonastFacade.modificarDatos(event);
            selectIncentivo.setIdcatactual(selectIncentivo.getIdcatpro());
            mdincentivostFacade.modificarDatos(selectIncentivo);
            FacesMessage msg = new FacesMessage("Postulación Aprobada para", event.getDepapellido());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            
        }
        else{
            selectIncentivo.setIncvalormensual(new Float(0));
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atención!", "No se han realizado modificaciones.")); 
        }
        selectIncentivo.setIdcatactual(selectIncentivo.getIdcatpro());
        
    }
    public void onRowCancelPos(Mdpersonast event) {
        FacesMessage msg = new FacesMessage("Cambios no realizados para", ""+event.getDepcedula());
        FacesContext.getCurrentInstance().addMessage(null, msg);
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
    
    
    public String newhonorario(){
        String honor="";
        nuevoHono=new Mdhonorarios();
        System.out.println("try new honorario");
        if(currentModulo.getIdmodulo().getIdmodulo()==5 && selectFede.getSector()){
            System.out.println("honorario_fede");
            honor="honorario_fede";
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==2){
            System.out.println("honorario_admin");
            nuevoHono.setTipo(2);
            System.out.println("nuevoHono.getTipo(): "+nuevoHono.getTipo());
            honor="honorario_admin";
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==6 && selectFede.getSector()){
             System.out.println("honorario_coe");
             imcoe=true;
            honor="honorario_coe"; //xxx
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==6 && !selectFede.getSector()){
             System.out.println("honorario_cpe");
            honor="honorario_cpe"; //xxx
        }
        
        
        //xxx
        return honor;
    
    }
    public String registraHonorario(Mdhonorarios y){
        String x="";
        System.out.println("Dentro honorario");
        y.setCreador(currentUser.getIdusuario());
        for (double listanivele : listaniveles) {
            if(y.getValor()>0.0)
                if(y.getValor()==listanivele)
                    y.setNivel(listanivele);
        }
        if(y.getNivel()==null)
            y.setNivel(0.0);
        
        if(mdhonorariosFacade.guardarDatos(y)){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"El registro ha sido efectuado","Cargando Lista..."));
            x="honorarios_list";
            listaHono=mdhonorariosFacade.getListByCreator(currentUser.getIdusuario());
            nuevoHono=null;
        }else{
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se ha efectuado el registro","Controle los datos"));
        }
        
        imcoe=false;
        
        return x;
    }
    public String modificaHonorario(Mdhonorarios y){
        String x="";
        System.out.println("Dentro editar H");
        y.setModificador(currentUser.getIdusuario());
         for (double listanivele : listaniveles) {
            if(y.getValor()>0.0)
                if(y.getValor()==listanivele)
                    y.setNivel(listanivele);
        }
         if(y.getNivel()==null)
            y.setNivel(0.0);
        
        if(mdhonorariosFacade.modificarDatos(y)){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"El registro ha sido modificado","Cargando Lista..."));
            x="honorarios_list";
            listaHono=mdhonorariosFacade.getListByCreator(currentUser.getIdusuario());
            
        }else{
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se ha modificado el registro","Controle los datos"));
        }
        
        
        
        return x;
    }
    public double getTotalH(double x, double y){
        Mdhonorarios z=new Mdhonorarios();
        System.out.println("valores: "+x+" "+y);
        if(nuevoHono!=null){
            nuevoHono.setTotal(x*y);
            z=nuevoHono;
        }
        if(selecetedHono!=null){
            selecetedHono.setTotal(x*y);
            z=selecetedHono;
        }
        System.out.println("x.getTotal() "+z.getTotal());
        return z.getTotal();
    }
    
    
    
    public String getInstitucion(int x){
       return mdusuariotFacade.find(x).getInstitucion();
    
    }
    public String searchIessAtleta(int x){
        String z="";
        Mdpersonast y=mdpersonastFacade.findById(x);
        return z=y.getDepapellido()+" "+y.getDepnombre();
    }
    public void registraInforme(int x){
        FacesContext context = FacesContext.getCurrentInstance();
     switch(x){
        case 1: 
                    
                //newReport.setArchivo(name);
                newReport.setFechacarga(new Date());
                newReport.setCargadox(currentUser);
                newReport.setTipo("IT");
                if(mdreportesFacade.guardarDatos(newReport))
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro ", newReport.getArchivo()+" efectuado correctamente."));
                else
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Registro ", " No realizad."));
                
                 
                break;
        case 2: 
                newReport.setFechacarga(new Date());
                newReport.setCargadox(currentUser);
                newReport.setTipo("RA");
                if(mdreportesFacade.guardarDatos(newReport))
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro ", newReport.getArchivo()+" efectuado correctamente."));
                else
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Registro ", " No realizad."));
                
                break;
        case 3: 
                newReport.setFechacarga(new Date());
                newReport.setCargadox(currentUser);
                newReport.setTipo("IESS");
                if(mdreportesFacade.guardarDatos(newReport))
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro IESS", newReport.getArchivo()+" efectuado correctamente."));
                else
                    context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Registro IESS", " No realizad."));
                break;
        case 4: break;
        default: break;
     }
    
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

    public Mdusuariot getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Mdusuariot currentUser) {
        this.currentUser = currentUser;
    }

    public Mdusuarioperfilt getCurrentPerfil() {
        return currentPerfil;
    }

    public void setCurrentPerfil(Mdusuarioperfilt currentPerfil) {
        this.currentPerfil = currentPerfil;
    }

    public Mdperfilmodulot getCurrentModulo() {
        return currentModulo;
    }

    public void setCurrentModulo(Mdperfilmodulot currentModulo) {
        this.currentModulo = currentModulo;
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
            
            if(currentPerfil.getIdperfil().getIdperfil()==3){
                 System.out.println("buscando personas de federación: "+currentPerfil.getIdperfil().getPernombre() );
                //listaPersonas=mdpersonastFacade.findByPerfil(currentUser.getIdusuario());
                listaPersonas=mdpersonastFacade.findByCodFed(currentUser.getCodinst());
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
        System.out.println("Perfil: "+x.getIdperfil());
        System.out.println("para buscar, usa: "+currentUser.getCodinst());
        if(x.getIdperfil()==(Integer)3){
          
            System.out.println("Federacion selecionada: " +selectFede.getNombre()+" "+selectFede.getId());
            listDeporte=mddeportestFacade.getDepByFed(selectFede.getId());
            if(!selectFede.getSector())
                selectPersona.setHandi(true);
            
        }
        if(x.getIdperfil()==(Integer)4){
            System.out.println("Es comite...");
            if(nuevoHono!=null){
                nuevoHono.setTipo(3);
                System.out.println("nuevoHono.getTipo(): "+nuevoHono.getTipo());
            }
            if(imcoe)
                listDeporte=mddeportestFacade.getDepByCat(true);
            else
                listDeporte=mddeportestFacade.getDepByCat(false);
        }
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

    public Mdincentivoshistt getSelIncHist() {
        return selIncHist;
    }

    public void setSelIncHist(Mdincentivoshistt selIncHist) {
        this.selIncHist = selIncHist;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public List<Mdclafundep> getListaClafundep() {
        if(listaClafundep==null){
            listaClafundep=mdclafundepFacade.findAll();
        }
        return listaClafundep;
    }

    public void setListaClafundep(List<Mdclafundep> listaClafundep) {
        this.listaClafundep = listaClafundep;
    }

    public List<Mdincentivoshistt> getListaincHistXCI() {
        return listaincHistXCI;
    }

    public void setListaincHistXCI(List<Mdincentivoshistt> listaincHistXCI) {
        this.listaincHistXCI = listaincHistXCI;
    }

    public Mdevento getSelectedEvent() {
        return selectedEvent;
    }

    public void setSelectedEvent(Mdevento selectedEvent) {
        this.selectedEvent = selectedEvent;
    }

    public Mdevento getNewEvent() {
        return newEvent;
    }

    public void setNewEvent(Mdevento newEvent) {
        this.newEvent = newEvent;
    }

    public List<Mdevento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Mdevento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public List<Mdevento> getFiltroEventos() {
        System.out.println("GET EVENTOS BY CREADOR");
        if(filtroEventos==null){
            if(currentUser==null){
                filtroEventos=mdeventoFacade.findAll();
            }
            else{
                if(currentModulo.getIdmodulo().getIdmodulo()==6 || currentModulo.getIdmodulo().getIdmodulo()==2){
                    filtroEventos=mdeventoFacade.findAll();
                }
                else{
                    filtroEventos=mdeventoFacade.getListByCreator(currentUser.getIdusuario());
                }
            }
        }else{
                if(currentModulo.getIdmodulo().getIdmodulo()==6 || currentModulo.getIdmodulo().getIdmodulo()==2){
                    filtroEventos=mdeventoFacade.findAll();
                }
                else{
                    filtroEventos=mdeventoFacade.getListByCreator(currentUser.getIdusuario());
                }
            }
        return filtroEventos;
    }

    public void setFiltroEventos(List<Mdevento> filtroEventos) {
        this.filtroEventos = filtroEventos;
    }

    public int[] getListaDel() {
        
            listaDel=new int[60];
            for (int i = 0; i < listaDel.length; i++) {
                listaDel[i] = i+1;
             }
       
        return listaDel;
    }

    public void setListaDel(int[] listaDel) {
        this.listaDel = listaDel;
    }

    public Mdnecesidades getSelectedNecesidad() {
        return selectedNecesidad;
    }

    public void setSelectedNecesidad(Mdnecesidades selectedNecesidad) {
        this.selectedNecesidad = selectedNecesidad;
    }

    public Mdnecesidades getNewNecesidad() {
        return newNecesidad;
    }

    public void setNewNecesidad(Mdnecesidades newNecesidad) {
        this.newNecesidad = newNecesidad;
    }

    public List<Mdnecesidades> getListaNecesidad() {
        return listaNecesidad;
    }

    public void setListaNecesidad(List<Mdnecesidades> listaNecesidad) {
        this.listaNecesidad = listaNecesidad;
    }

    public List<Mdnecesidades> getFiltroNecesidad() {
       
        
            if(currentModulo.getIdmodulo().getIdmodulo()==6 || currentModulo.getIdmodulo().getIdmodulo()==2){
               
                filtroNecesidad=mdnecesidadesFacade.findAll();
            }else{
               
                filtroNecesidad=mdnecesidadesFacade.getListByCreator(currentUser.getIdusuario());
            }
        
        return filtroNecesidad;
    }

    public void setFiltroNecesidad(List<Mdnecesidades> filtroNecesidad) {
        this.filtroNecesidad = filtroNecesidad;
    }

    public List<Mdusuariot> getListUsers() {
        if(listUsers==null){
            listUsers=mdusuariotFacade.findAll();
            System.out.println("Get All Users");
        }
        
        return listUsers;
    }

    public void setListUsers(List<Mdusuariot> listUsers) {
        this.listUsers = listUsers;
    }

    public List<Mdperfilt> getListPerfiles() {
        return listPerfiles;
    }

    public void setListPerfiles(List<Mdperfilt> listPerfiles) {
        this.listPerfiles = listPerfiles;
    }

    public Mdfederacion getSelectFede() {
        return selectFede;
    }

    public void setSelectFede(Mdfederacion selectFede) {
        this.selectFede = selectFede;
    }

    public List <Mdfederacion> getListFede() {
        if(listFede==null)
            listFede=mdfederacionFacade.findAll();
        return listFede;
    }

    public void setListFede(List <Mdfederacion> listFede) {
        this.listFede = listFede;
    }

    public Mdusuariot getSelectedUser() {
        if(selectedUser==null)
            selectedUser=new Mdusuariot();
        return selectedUser;
    }

    public void setSelectedUser(Mdusuariot selectedUser) {
        this.selectedUser = selectedUser;
    }

    public Mdusuariot getNewUser() {
        if(newUser==null){
            newUser=new Mdusuariot();
            newUser.setEntrenador(false);
        }
        return newUser;
    }

    public void setNewUser(Mdusuariot newUser) {
        this.newUser = newUser;
    }

    public Mdhonorarios getCurrentHono() {
        return currentHono;
    }

    public void setCurrentHono(Mdhonorarios currentHono) {
        this.currentHono = currentHono;
    }

    public Mdhonorarios getNuevoHono() {
            if(currentModulo.getIdmodulo().getIdmodulo()==2){
                System.out.println("Nuevo Hono para admin");
                //nuevoHono = new Mdhonorarios();
                nuevoHono.setTipo(2);
            }if(currentModulo.getIdmodulo().getIdmodulo()==5 && selectFede.getSector()){
                System.out.println("Nuevo Hono para fede");
               // nuevoHono = new Mdhonorarios();
                nuevoHono.setTipo(1);
            }
        return nuevoHono;
    }

    public void setNuevoHono(Mdhonorarios nuevoHono) {
        this.nuevoHono = nuevoHono;
    }

    public List<Mdhonorarios> getListaHono() {
        if(currentModulo.getIdmodulo().getIdmodulo()==5 && selectFede.getSector()){
            listaHono=mdhonorariosFacade.getListByCreator(currentUser.getIdusuario());
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==2){
            listaHono=mdhonorariosFacade.findAll();
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==6 && selectFede.getSector()){
            listaHono=mdhonorariosFacade.getListByCreator(currentUser.getIdusuario());
        }
        if(currentModulo.getIdmodulo().getIdmodulo()==6 && !selectFede.getSector()){
            listaHono=mdhonorariosFacade.getListByCreator(currentUser.getIdusuario());
        }
            
       
        return listaHono;
    }

    public void setListaHono(List<Mdhonorarios> listaHono) {
        this.listaHono = listaHono;
    }

    public List<Mdhonorarios> getFiltroHono() {
        return filtroHono;
    }

    public void setFiltroHono(List<Mdhonorarios> filtroHono) {
        this.filtroHono = filtroHono;
    }

    public Mdhonorarios getSelecetedHono() {
        return selecetedHono;
    }

    public void setSelecetedHono(Mdhonorarios selecetedHono) {
        this.selecetedHono = selecetedHono;
    }

    public int[] getListaMes() {
        listaMes=new int[12];
            for (int i = 0; i < listaMes.length; i++) {
                listaMes[i] = i+1;
             }
        return listaMes;
    }

    public void setListaMes(int[] listaMes) {
        this.listaMes = listaMes;
    }

    public boolean isImcoe() {
        return imcoe;
    }

    public void setImcoe(boolean imcoe) {
        this.imcoe = imcoe;
    }

    public double[] getListaniveles() {
        if(!editHono){
                if(nuevoHono.getCargo()!=null){
                    if(nuevoHono.getCargo().equals("Entrenador")){
                        listaniveles=new double[5];
                            listaniveles[0] = 1500.0;
                            listaniveles[1] = 2000.0;
                            listaniveles[2] = 2500.0;
                            listaniveles[3] = 3000.0;
                            listaniveles[4] = 4000.0;
                            nuevoHono.setTipo(1);

                    }if(nuevoHono.getCargo().equals("Asistente Técnico")||nuevoHono.getCargo().equals("Preparador Físico")){
                        listaniveles=new double[4];
                            listaniveles[0] = 1500.0;
                            listaniveles[1] = 1000.0;
                            listaniveles[2] = 800.0;
                            listaniveles[3] = 600.0;
                            nuevoHono.setTipo(1);
                    }
                }else{ 
                    listaniveles=new double[1];
                     nuevoHono.setTipo(3);
                }
                System.out.println("nuevoHono.getTipo(); "+nuevoHono.getTipo());
        }else{
        
                if(selecetedHono.getCargo()!=null){
                    if(selecetedHono.getCargo().equals("Entrenador")){
                        listaniveles=new double[5];
                            listaniveles[0] = 1500.0;
                            listaniveles[1] = 2000.0;
                            listaniveles[2] = 2500.0;
                            listaniveles[3] = 3000.0;
                            listaniveles[4] = 4000.0;
                            selecetedHono.setTipo(1);

                    }if(selecetedHono.getCargo().equals("Asistente Técnico")||selecetedHono.getCargo().equals("Preparador Físico")){
                        listaniveles=new double[4];
                            listaniveles[0] = 1500.0;
                            listaniveles[1] = 1000.0;
                            listaniveles[2] = 800.0;
                            listaniveles[3] = 600.0;
                            selecetedHono.setTipo(1);
                    }
                }else{ 
                    listaniveles=new double[1];
                     selecetedHono.setTipo(3);
                }
                System.out.println("selecetedHono.getTipo(); "+selecetedHono.getTipo());
        }
        return listaniveles;
    }

    public void setListaniveles(double[] listaniveles) {
        this.listaniveles = listaniveles;
    }

    public String[] getListaLvl() {
         if(nuevoHono.getCargo()!=null){
            if(nuevoHono.getCargo().equals("Entrenador")){
                listaLvl[0] = "1";
                listaLvl[1] = "2";
                listaLvl[2] = "3";
                listaLvl[3] = "4";
                listaLvl[4] = "5";
            }
            else{
                listaLvl[0] = "1";
                listaLvl[1] = "2";
                listaLvl[2] = "3";
                listaLvl[3] = "4";
                
            }
         }else listaLvl=new String[1];
        return listaLvl;
    }

    public void setListaLvl(String[] listaLvl) {
        this.listaLvl = listaLvl;
    }

    public boolean isEditHono() {
        return editHono;
    }

    public void setEditHono(boolean editHono) {
        this.editHono = editHono;
    }

    public List<Mdevento> getFiltroTEventos() {
        return filtroTEventos;
    }

    public void setFiltroTEventos(List<Mdevento> filtroTEventos) {
        this.filtroTEventos = filtroTEventos;
    }

    public Mdusuarioperfilt getNewuPerfil() {
        return newuPerfil;
    }

    public void setNewuPerfil(Mdusuarioperfilt newuPerfil) {
        this.newuPerfil = newuPerfil;
    }

    public ScheduleModel getEventModel() {
        return eventModel;
    }

    public void setEventModel(ScheduleModel eventModel) {
        this.eventModel = eventModel;
    }

    public ScheduleModel getLazyEventModel() {
        return lazyEventModel;
    }

    public void setLazyEventModel(ScheduleModel lazyEventModel) {
        this.lazyEventModel = lazyEventModel;
    }

    public ScheduleEvent getEvent() {
        return event;
    }

    public void setEvent(ScheduleEvent event) {
        this.event = event;
    }

    public Mdreportes getNewReport() {
        if(newReport==null)
            newReport= new Mdreportes();
        return newReport;
    }

    public void setNewReport(Mdreportes newReport) {
        this.newReport = newReport;
    }

    public Mdreportes getSelectReport() {
        return selectReport;
    }

    public void setSelectReport(Mdreportes selectReport) {
        this.selectReport = selectReport;
    }

    public List<Mdreportes> getListReport() {
        if(listReport==null){
            if(currentUser.getEntrenador()){
                listReport=mdreportesFacade.getReportsByCreator(currentUser);
            }else{
                listReport=mdreportesFacade.findAll();
            }
        
        }
        return listReport;
    }

    public void setListReport(List<Mdreportes> listReport) {
        this.listReport = listReport;
    }

    public List<Mdreportes> getFilterReport() {
        return filterReport;
    }

    public void setFilterReport(List<Mdreportes> filterReport) {
        this.filterReport = filterReport;
    }

    public List<Mdreportes> getListInfTec() {
        if(listInfTec==null)
            listInfTec=mdreportesFacade.getReportsByType("IT", currentUser);
        return listInfTec;
    }

    public void setListInfTec(List<Mdreportes> listInfTec) {
        this.listInfTec = listInfTec;
    }

    public List<Mdreportes> getListRegAsist() {
        if(listRegAsist==null)
            listRegAsist=mdreportesFacade.getReportsByType("RA", currentUser);
        return listRegAsist;
    }

    public void setListRegAsist(List<Mdreportes> listRegAsist) {
        this.listRegAsist = listRegAsist;
    }

    public List<Mdreportes> getListPagoIess() {
        if(listPagoIess==null)
            listPagoIess=mdreportesFacade.getReportsByType("IESS", currentUser);
        return listPagoIess;
    }

    public void setListPagoIess(List<Mdreportes> listPagoIess) {
        this.listPagoIess = listPagoIess;
    }

    

    
    

   

    

   

    
    
    
    
    
}
