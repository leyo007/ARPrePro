/*
 * lvillavicencio
 */
package beans;



import com.sun.xml.ws.security.opt.impl.util.SOAPUtil;
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
import entities.Mdresultados;
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
import facades.MdresultadosFacadeLocal;
import facades.MdusuarioperfiltFacadeLocal;
import facades.MdusuariotFacadeLocal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.digest.DigestUtils;
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
    private MdresultadosFacadeLocal mdresultadosFacade;

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

    private Mdresultados selectResultado;
    private List<Mdresultados> listaResult;
    private List<Mdresultados> filtroResult;
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
    private List<Mdpersonast> atletasEvento;
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
            /*ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            context.redirect(context.getRequestContextPath() + "/");
            System.out.println("context: "+context.getApplicationContextPath());
            System.out.println("context: "+context.getContextName());
            System.out.println("context: "+context.getRealPath("AltoRendimiento-war"));*/
        }
    }
    
    Mdperfilt x = new Mdperfilt();
    Mdperfilt y = new Mdperfilt();
    
    public String accessLogin() throws IOException{
        getUbicacionEnDisco();
        String resultado="";
        
        if(usuario.length()>0&&password.length()>0){
           
            String pwd=DigestUtils.shaHex(password);
            
            currentUser=mdusuariotFacade.findThisUser(usuario, pwd);
            System.out.println("Usuario: "+currentUser.getUsumail());
            if(currentUser.getIdusuario()!=null){
                /*if(currentUser.getIdacticode()!=1){
                    System.out.println("Sin acceso...");
                
                 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario Sin Autorización","Contacte DTC"));
                }
                else{*/
                    currentPerfil=mdusuarioperfiltFacade.findThisUser(currentUser);
                    System.out.println("1.- uPerfil Cod Usuario: "+currentPerfil.getIdusuario().getIdusuario());
                    System.out.println("2.- uPerfil P: "+currentPerfil.getIdperfil().getIdperfil());
                    x =mdperfiltFacade.find(currentPerfil.getIdperfil().getIdperfil());
                    System.out.println("3.- perfil: "+x.toString());
                    currentModulo=mdperfilmodulotFacade.findModulo(x);
                    System.out.println("4.- pmodulo: "+currentModulo.getIdmodulo().getIdmodulo());
                    modulo = mdmodulotFacade.find(currentModulo.getIdmodulo().getIdmodulo());
                    System.out.println("5.- modulo: "+modulo.getModnombre());
                    selectFede=mdfederacionFacade.find(currentUser.getCodinst());
                                     
                    if(currentUser.getEntrenador())
                        menus=mdmenutFacade.getAllBymoduloCoach(modulo.getIdmodulo());
                    else{
                        menus=mdmenutFacade.getAllBymodulo(modulo.getIdmodulo());
                        
                        if(currentModulo.getIdmodulo().getIdmodulo()==6 && !selectFede.getSector()){
                            menus.add(mdmenutFacade.find(7));
                            menus.remove(mdmenutFacade.find(16));
                        }
                    }
                    System.out.println("6.- menus: "+menus.get(0));
                    
                    //menus.forEach((t) -> {
                    for(Mdmenut t: menus){
                        System.out.println("7.- Nombres: "+t.getMennombre());
                    };
                    //});
                    
                    
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
                //}
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
        
        
        //return "incentivo_repost";
        return "incentivo_postulacion";
    }
    public String cv(Mdpersonast x){
        
        
        
        return "cv";
    }
    public String givmeLink(int x){
        
        String link="";
         switch (x) {
                    case 1:  link = "menu";
                             break;
                    case 2:  if(currentPerfil.getIdperfil().getIdperfil()==2||currentUser.getIdacticode()==1)
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
    private int delegacion=1;
    public String newEvento(){ 
        System.out.println("dentro nuevo evento....");
        System.out.println(delegacion);
        newEvent=new Mdevento();
        newEvent.setDelegacion(delegacion);
        newEvent.setValoja(0.0);
newEvent.setValojap(0);
newEvent.setValojad(0);
newEvent.setValimen(0.0);
newEvent.setValimenp(0);
newEvent.setValimend(0);
newEvent.setVhidra(0.0);
newEvent.setVhidrap(0);
newEvent.setVhidrad(0);
newEvent.setVtransaereo(0.0);
newEvent.setVtransaereop(0);
newEvent.setVtransaereod(0);
newEvent.setVtransaereointer(0.0);
newEvent.setVtransaereointerp(0);
newEvent.setVtransaereointerd(0);
newEvent.setVexcequi(0.0);
newEvent.setVexcequip(0);
newEvent.setVexcequid(0);
newEvent.setVtaxaereo(0.0);
newEvent.setVtaxaereop(0);
newEvent.setVtaxaereod(0);
newEvent.setVsegviaje(0.0);
newEvent.setVsegviajep(0);
newEvent.setVsegviajed(0);
newEvent.setVtransterr(0.0);
newEvent.setVtransterrp(0);
newEvent.setVtransterrd(0);
newEvent.setVtransterrinter(0.0);
newEvent.setVtransterrinterp(0);
newEvent.setVtransterrinterd(0);
newEvent.setVbonodep(0.0);
newEvent.setVbonodepp(0);
newEvent.setVbonodepd(0);
newEvent.setVinsc(0.0);
newEvent.setVinscp(0);
newEvent.setVinscd(0);
newEvent.setVvisa(0.0);
newEvent.setVvisap(0);
newEvent.setVvisad(0);
newEvent.setVfondoem(0.0);
newEvent.setVfondoemp(0);
newEvent.setVfondoemd(0);
newEvent.setTradextras(0.0);
newEvent.setTradextrasp(0);
newEvent.setTradextrasd(0);
newEvent.setGastosbanca(0.0);
newEvent.setGastosbancap(0);
newEvent.setGastosbancad(0);
newEvent.setReuniotaller(0.0);
newEvent.setReuniotallerp(0);
newEvent.setReuniotallerd(0);
newEvent.setActualizacioncono(0.0);
newEvent.setActualizacionconop(0);
newEvent.setActualizacionconod(0);
newEvent.setLicencias(0.0);
newEvent.setLicenciasp(0);
newEvent.setLicenciasd(0);
newEvent.setVespdep(0.0);
newEvent.setVespdepp(0);
newEvent.setVespdepd(0);
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
     private List<Mdevento> eventoDelegado;
     private List<String> eventoEntrenadores;
    public String registraEvento(){
        System.out.println("eventos:::::::::::::::::::: ");
        String resultado="";
        newEvent.setCreador(currentUser.getIdusuario());
        newEvent.setCodfed(currentUser.getCodinst());
        // xxx
        newEvent.setAtletas("");
        newEvent.setTotal((newEvent.getValoja()*newEvent.getValojap()*newEvent.getValojad())+(newEvent.getValimen()*newEvent.getValimenp()*newEvent.getValimend())+(newEvent.getVhidra()*newEvent.getVhidrap()*newEvent.getVhidrad())+(newEvent.getVtransaereo()*newEvent.getVtransaereop()*newEvent.getVtransaereod())+(newEvent.getVtransaereointer()*newEvent.getVtransaereointerp()*newEvent.getVtransaereointerd())+(newEvent.getVexcequi()*newEvent.getVexcequip()*newEvent.getVexcequid())+(newEvent.getVtaxaereo()*newEvent.getVtaxaereop()*newEvent.getVtaxaereod())+(newEvent.getVsegviaje()*newEvent.getVsegviajep()*newEvent.getVsegviajed())+(newEvent.getVtransterr()*newEvent.getVtransterrp()*newEvent.getVtransterrd())+(newEvent.getVtransterrinter()*newEvent.getVtransterrinterp()*newEvent.getVtransterrinterd())+(newEvent.getVbonodep()*newEvent.getVbonodepp()*newEvent.getVbonodepd())+(newEvent.getVinsc()*newEvent.getVinscp()*newEvent.getVinscd())+(newEvent.getVvisa()*newEvent.getVvisap()*newEvent.getVvisad())+(newEvent.getVfondoem()*newEvent.getVfondoemp()*newEvent.getVfondoemd())+(newEvent.getTradextras()*newEvent.getTradextrasp()*newEvent.getTradextrasd())+(newEvent.getGastosbanca()*newEvent.getGastosbancap()*newEvent.getGastosbancad())+(newEvent.getReuniotaller()*newEvent.getReuniotallerp()*newEvent.getReuniotallerd())+(newEvent.getActualizacioncono()*newEvent.getActualizacionconop()*newEvent.getActualizacionconod())+(newEvent.getLicencias()*newEvent.getLicenciasp()*newEvent.getLicenciasd())+(newEvent.getVespdep()*newEvent.getVespdepp()*newEvent.getVespdepd()));
       /* for (Mdpersonast atletas : atletasEvento) {
            System.out.println(atletas.getDepcedula());
            //newEvent.setAtletas(newEvent.getAtletas()+" "+atletas.getDepapellido()+" "+atletas.getDepnombre()+" - ");
        }
        for(String entre: eventoEntrenadores){
            System.out.println(entre);
            //newEvent.setEntrenadores(newEvent.getEntrenadores()+" "+entre+" -");
        }*/
        //falta multiplicadores * 19 valores
        System.out.println("eventos:::::::::::::::::::: "+newEvent.getValoja());
        if(delegacion>1){
            if(mdeventoFacade.guardarDatos(newEvent)){
                    if(currentModulo.getIdmodulo().getIdmodulo()==6 || currentModulo.getIdmodulo().getIdmodulo()==2){
                        filtroEventos=mdeventoFacade.findAll();                                         
                            eventoDelegado=mdeventoFacade.duplicateRows(delegacion, newEvent);
                            editDelegados(eventoDelegado);     
                    }
                    else{
                        filtroEventos=mdeventoFacade.getListByCreator(currentUser.getCodinst());
                        if(delegacion==1)
                            resultado="eventos";
                    }
            }
        }else{
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
        }    
        return resultado;
    } 
    public String editDelegados(List<Mdevento> lista){
        
        
        return "";
    }
    
    public String modificarEvento(){
        String resultado="";
        selectedEvent.setCreador(currentUser.getIdusuario());
        selectedEvent.setTotal(((selectedEvent.getValoja()*selectedEvent.getValojap()*selectedEvent.getValojad())+(selectedEvent.getValimen()*selectedEvent.getValimenp()*selectedEvent.getValimend())+(selectedEvent.getVhidra()*selectedEvent.getVhidrap()*selectedEvent.getVhidrad())+(selectedEvent.getVtransaereo()*selectedEvent.getVtransaereop()*selectedEvent.getVtransaereod())+(selectedEvent.getVtransaereointer()*selectedEvent.getVtransaereointerp()*selectedEvent.getVtransaereointerd())+(selectedEvent.getVexcequi()*selectedEvent.getVexcequip()*selectedEvent.getVexcequid())+(selectedEvent.getVtaxaereo()*selectedEvent.getVtaxaereop()*selectedEvent.getVtaxaereod())+(selectedEvent.getVsegviaje()*selectedEvent.getVsegviajep()*selectedEvent.getVsegviajed())+(selectedEvent.getVtransterr()*selectedEvent.getVtransterrp()*selectedEvent.getVtransterrd())+(selectedEvent.getVtransterrinter()*selectedEvent.getVtransterrinterp()*selectedEvent.getVtransterrinterd())+(selectedEvent.getVbonodep()*selectedEvent.getVbonodepp()*selectedEvent.getVbonodepd())+(selectedEvent.getVinsc()*selectedEvent.getVinscp()*selectedEvent.getVinscd())+(selectedEvent.getVvisa()*selectedEvent.getVvisap()*selectedEvent.getVvisad())+(selectedEvent.getVfondoem()*selectedEvent.getVfondoemp()*selectedEvent.getVfondoemd())+(selectedEvent.getTradextras()*selectedEvent.getTradextrasp()*selectedEvent.getTradextrasd())+(selectedEvent.getGastosbanca()*selectedEvent.getGastosbancap()*selectedEvent.getGastosbancad())+(selectedEvent.getReuniotaller()*selectedEvent.getReuniotallerp()*selectedEvent.getReuniotallerd())+(selectedEvent.getActualizacioncono()*selectedEvent.getActualizacionconop()*selectedEvent.getActualizacionconod())+(selectedEvent.getLicencias()*selectedEvent.getLicenciasp()*selectedEvent.getLicenciasd())+(selectedEvent.getVespdep()*selectedEvent.getVespdepp()*selectedEvent.getVespdepd())));
           /* for (Mdpersonast atletas : atletasEvento) {
                System.out.println(atletas.getDepcedula());
                selectedEvent.setAtletas(selectedEvent.getAtletas()+" "+atletas.getDepapellido()+" "+atletas.getDepnombre()+" - ");
            }*/
        /*if(eventoEntrenadores!=null||eventoEntrenadores.size()>0)    
            for(String entre: eventoEntrenadores){
                System.out.println(entre);
                selectedEvent.setEntrenadores(selectedEvent.getEntrenadores()+" "+entre+" -");
            }*/
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
    public void onRowSelectEvento(SelectEvent event){
        
        FacesMessage msg = new FacesMessage("Evento seleccionado: ", selectedEvent.getEvento());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    
    }
    public void onRowUnselectEvento(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Evento deseleccionado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public boolean controlArticulo(String y){ 
        boolean x=false;
        char c; 
        if(y.length()>0){
            c = y.charAt(0);
            x=(c == '8' || Character.isLetter(c));
        }
        return x;
    }
    
    public String registraNecesidadGral(){
        String resultado="";
        newNecesidad.setCreador(currentUser.getIdusuario());
        newNecesidad.setTipo(true);
        newNecesidad.setDeporte(getnombreDeporte(newNecesidad.getIddep()));
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
        newNecesidad.setTotal(newNecesidad.getValor()*newNecesidad.getCantidad());
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
         if(currentUser!=null&&x!=null)
            for (Mdnecesidades n : x) {
                y+=n.getValor();
            }
        return y;
     }
     public double totalEvento(List<Mdnecesidades> x){
         double y=0.0;
         if(currentUser!=null&&x!=null)
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
            if(selectPersona.getIddep()==null){
                System.out.println("puedo registrar nuevo");
                
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
                System.out.println("Current User: "+ currentUser.getIdusuario());
                System.out.println(selectPersona.getIddeporte()); 
                selectPersona.setIdcreador(currentUser.getIdusuario());
                selectPersona.setFederacion(currentUser.getCodinst());
                selectPersona.setDepprueba(selectPersona.getDepprueba());
                selectPersona.setAprobado(false);
                selectPersona.setHandi(selectFede.getSector());
                
                if(mdpersonastFacade.guardarDatos(selectPersona)){  
                
                    selectIncentivo.setIddep(selectPersona.getIddep());
                    selectIncentivo.setIncvalormensual(0f);
                    selectIncentivo.setEligibidad(0);
                    selectIncentivo.setIdcatpro(0);
                    mdincentivostFacade.guardarDatos(selectIncentivo);
                    selCvSociEc.setPersona(selectPersona);
                    mdcvdpFacade.guardarDatos(selCvSociEc);
                    selCvForAc.setPersona(selectPersona);
                    mdcvfaFacade.guardarDatos(selCvForAc);
                    selCvInfEnt.setPersona(selectPersona);
                    mdcvieFacade.guardarDatos(selCvInfEnt);
                    resultado="incentivos_list";
                }
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
        listaPersonas=mdpersonastFacade.findByCodFed(currentUser.getCodinst());
        nuevoDeportista=false;
        return resultado;
    }
    public String registraPostula(Mdpersonast x){
        String resultado="";
        selectPersona=x;
        if(selectPersona.getIddep()!=null){
            
            selectIncentivo.setIddep(selectPersona.getIddep());
            mdincentivostFacade.guardarDatos(selectIncentivo);
            
        }
        else{

            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No es posible postular...","Controle la lista"));
            resultado="";
        }
        
        listaPersonas=mdpersonastFacade.findByCodFed(currentUser.getCodinst());
        nuevoDeportista=false;
        return resultado;
    }
    private boolean apoyo;
    public String repostulacion(){
        String x="";
        mdpersonastFacade.modificarDatos(selectPersona);  
        if(!selectPersona.getApoyo()){
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("TOKIO 2020"))
                selectIncentivo.setIdcatpro(1);
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("ELITE"))
                selectIncentivo.setIdcatpro(2);
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("ALTO NIVEL"))
                selectIncentivo.setIdcatpro(3);
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("AVANZADO"))
                selectIncentivo.setIdcatpro(4);
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("DESARROLLO"))
                selectIncentivo.setIdcatpro(5);
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("RESERVA"))
                selectIncentivo.setIdcatpro(6);
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("TALENTO"))
                selectIncentivo.setIdcatpro(7);
            if(mdresultadosFacade.find(selectIncentivo.getEligibidad()).getPrograma().equals("DESENTR"))
                selectIncentivo.setIdcatpro(8);
        }else
        {
            selectIncentivo.setIdcatpro(9);
            
            
        }
        
        
        
        mdincentivostFacade.modificarDatos(selectIncentivo);
        if(currentPerfil.getIdperfil().getIdperfil()==2){
            
            x="incentivos_aprobacion";
        }
        else x="incentivos_list";
        return x;
    }
    private String proyeccion;
    private String convoCatoria;
    public void getproyeccion(int x){
        proyeccion=mdresultadosFacade.find(x).getProjuegos()+" - "+mdresultadosFacade.find(x).getProcampa();
        getConvoCatoria(mdresultadosFacade.find(x).getDivision());
    }
    public void getConvoCatoria(int x){
        switch(x){
            case 1: 
                selectPersona.setIdconv(1);
                convoCatoria=mdconvocatoriatFacade.find(1).getCondescripcion();
            break;
            case 2: 
                selectPersona.setIdconv(2);
                convoCatoria=mdconvocatoriatFacade.find(2).getCondescripcion();
            break;
            case 3: 
                selectPersona.setIdconv(1);
                convoCatoria=mdconvocatoriatFacade.find(1).getCondescripcion();
            break;
            case 4: 
                selectPersona.setIdconv(2);
                convoCatoria=mdconvocatoriatFacade.find(2).getCondescripcion();
            break;
            case 5: 
                selectPersona.setIdconv(3);
                convoCatoria=mdconvocatoriatFacade.find(3).getCondescripcion();
            break;
            case 6: 
                selectPersona.setIdconv(3);
                convoCatoria=mdconvocatoriatFacade.find(3).getCondescripcion();
            break;
            case 7: 
                selectPersona.setIdconv(4);
                convoCatoria=mdconvocatoriatFacade.find(4).getCondescripcion();
            break;
        
        }
        
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
    //private String ubicacionEnDisco="C:\\glassfish4\\glassfish\\domains\\domain1\\docroot\\imagenes\\";
    //private String ubicacionEnDisco="/opt/glassfish/4.0/glassfish/domains/domain1/docroot/altorendimiento/";
    private String ubicacionEnDisco="";
    private String folder;
  
    private boolean controlFileUp;
    private boolean archivoPostulante;
    public void tipoArchivo(){
        controlFileUp=true; 
    }
    
    public String getUbicacionEnDisco() {
        System.out.println("get path");
        System.out.println("ubicacionEnDisco: "+ubicacionEnDisco);
        if(ubicacionEnDisco.length()<1){
            System.out.println("find path...");
            if(System.getProperty("os.name").equals("Windows 7"))
                ubicacionEnDisco="C:\\glassfish4\\glassfish\\domains\\domain1\\docroot\\altorendimiento\\";
            else
                ubicacionEnDisco="/opt/glassfish/4.0/glassfish/domains/domain1/docroot/altorendimiento/";
        }
        return ubicacionEnDisco;
    }
    public void setUbicacionEnDisco(String ubicacionEnDisco) {
        this.ubicacionEnDisco = ubicacionEnDisco;
    }
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
                 if(controlFileUp){
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
                 }else{
                     System.out.println("Postulación....");

                           escribirEnDisco(selectPersona.getDepcedula()+"_postulacion."+extension, archivo.getInputstream());

                           context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Archivo ", archivo.getFileName()+" almacenado correctamente."));

                           archivo = null;
                           controlFileUp=false;
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
    
    public Mdresultados getPostulacion(Mdpersonast p){
        Mdresultados post;
        int x=mdincentivostFacade.buscaXpersona(p).getIdcatpro();
        post=mdresultadosFacade.find(x);
        
        return post;
        
    }
    
    public String getIncePropuesta(Mdpersonast p){
        System.out.println("Persona: "+p.getDepapellido());
        int x=mdincentivostFacade.buscaXpersona(p).getIdcatpro();
        String y="";
        Mdresultados rex = mdresultadosFacade.find(mdincentivostFacade.buscaXpersona(p).getEligibidad());
        if(rex==null){
            y="Sin postulación";
        }else{
        System.out.println(rex.getPrograma()+ " id: "+rex.getId());
            y=rex.getPrograma();}
        /*if(x>0){
            System.out.println("X>0: "+x);
            y=mdcategoriapropuestatFacade.find(x).getCatdescripcion();
        }else{
            y="No tiene categoria";
        }*/
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
    private String newPwdUser;
     public void modificaperfil(){
         if(newPwdUser!=null&&newPwdUser.length()>6)
            selectedUser.setUsuclave(DigestUtils.shaHex(newPwdUser));
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
     private boolean isAdmin;
     
    public void nuevousuario(){
        //admin modulo 2 y perfil 2
        //fed modulo 5 perfil 3
        // coe y cpe modulo 6 perfil 4
        //analista convencional modulo 7 perfil 5
        //analista discapacidad modulo 7 pefil 5
        System.out.println("try create newUser: ");
        System.out.println("newUser.getCodinst(): "+newUser.getCodinst());
        newuPerfil=new Mdusuarioperfilt();
        //newUser.setInstitucion(mdfederacionFacade.buscarXid(newUser.getCodinst()).getNombre());
        switch(newUser.getCodinst()){
            
            case 49:              
                newuPerfil.setIdperfil(mdperfiltFacade.find(4));
                break;//coe
            case 52: 
                if(isAdmin){
                    newuPerfil.setIdperfil(mdperfiltFacade.find(5));
                }else{
                    newuPerfil.setIdperfil(mdperfiltFacade.find(4));
                }
                break;//cpe
            default: 
                if(isAdmin){
                    newuPerfil.setIdperfil(mdperfiltFacade.find(5));
                }else{
                    newuPerfil.setIdperfil(mdperfiltFacade.find(3));
                }
                break;
            
        
        }
        if(isAdmin){
            newUser.setInstitucion("Analista de "+mdfederacionFacade.buscarXid(newUser.getCodinst()).getNombre());
            newUser.setIdacticode(newUser.getCodinst());
        }else{
            newUser.setInstitucion(mdfederacionFacade.buscarXid(newUser.getCodinst()).getNombre());
            newUser.setIdacticode(-1);
        }
        newUser.setUsuclave(DigestUtils.shaHex(newUser.getUsuclave()));
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
        System.out.println("id cat pro"+ selectIncentivo.getIdcatpro());
        
        if(event.getAprobado()&&selectIncentivo!=null){//wwws
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
            if(selectIncentivo.getIdcatactual()!=null)
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
            newIncHist.setHandi(selAprobados.getHandi());
            newIncHist.setClafundep(selAprobados.getClafundep());
            newIncHist.setEstado(event.getAprobado());
            newIncHist.setAprobadopor(currentUser.getIdusuario());
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
       
       
        //admin modulo 2 y perfil 2
                //fed modulo 5 perfil 3
                // coe y cpe modulo 6 perfil 4
                //analista convencional modulo 7 perfil 5
                //analista discapacidad modulo 7 pefil 5
        if(currentPerfil!=null){    
            if(currentPerfil.getIdperfil().getIdperfil()==3){
                 System.out.println("buscando personas de federación: "+currentPerfil.getIdperfil().getPernombre() );
                //listaPersonas=mdpersonastFacade.findByPerfil(currentUser.getIdusuario());
                listaPersonas=mdpersonastFacade.findByCodFed(currentUser.getCodinst());
            }
            else{
                if(selectFede.getSector()){
                    if(currentPerfil.getIdperfil().getIdperfil()==5){
                        listaPersonas=mdpersonastFacade.findByCodFed(currentUser.getCodinst());
                    }else{
                        if(currentPerfil.getIdperfil().getIdperfil()==4)
                            listaPersonas=mdpersonastFacade.findAll();
                    }
                        
                }else{
                    
                    listaPersonas=mdpersonastFacade.findBySector(selectFede.getSector());
                }
            }
        }else
            if(listaPersonas==null){
                System.out.println("buscando a nadie de los atletas....");
                listaPersonas=new ArrayList<>();
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
        if(currentUser!=null){
            System.out.println("Perfil: "+x.getIdperfil());
            System.out.println("para buscar, usa: "+currentUser.getCodinst());
            System.out.println("Convencional? "+selectFede.getSector());
            if(x.getIdperfil()==3){

                System.out.println("Federacion selecionada: " +selectFede.getNombre()+" "+selectFede.getId());
                listDeporte=mddeportestFacade.getDepByFed(selectFede.getId());
                
                if(!selectFede.getSector())
                    selectPersona.setHandi(true);

            }
            if(x.getIdperfil()==4){
                System.out.println("Es comite...");
                if(nuevoHono!=null){
                    nuevoHono.setTipo(3);
                    System.out.println("nuevoHono.getTipo(): "+nuevoHono.getTipo());
                }
                if(selectFede.getSector()){
                    listDeporte=mddeportestFacade.getDepByCat(true);
                    if(selectPersona!=null)
                    selectPersona.setHandi(false);
                }
                else{
                    listDeporte=mddeportestFacade.getDepByCat(false);
                    for (Mddeportest mddeportest : listDeporte) {
                        System.out.println("mddeportest.getFedcod(): "+mddeportest.getDepdescripcion());
                        System.out.println("mddeportest.getFedcod(): "+mddeportest.getFedcod());
                        System.out.println("sector: "+mddeportest.getSector());
                    }
                    if(selectPersona!=null)
                    selectPersona.setHandi(true);
                }
            }
            System.out.println("DEPORTES - XXXXXXXXXXXXXXXXX");
            if(listDeporte==null){
                System.out.println("LISTA DEPORTES");
                listDeporte=mddeportestFacade.findAll();
            }else
                System.out.println("No está vacia....");
        }
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
    private double totalSumEventos;
    private int totalEntEventos;
    private int totalAtlEventos;
    private int totalDiasEventos;
    public List<Mdevento> getFiltroEventos() {
        delegacion=1;
        totalSumEventos=0.0;
        totalEntEventos=0;
        totalAtlEventos=0;
        totalDiasEventos=0;
        if(filtroEventos==null){
            if(currentUser==null){
                filtroEventos=mdeventoFacade.findAll();
            }
            else{
                //admin modulo 2 y perfil 2
                //fed modulo 5 perfil 3
                // coe y cpe modulo 6 perfil 4
                //analista convencional modulo 7 perfil 5
                //analista discapacidad modulo 7 pefil 5
                switch(currentModulo.getIdmodulo().getIdmodulo()){
                        case 2: System.out.println("Admin");
                                filtroEventos=mdeventoFacade.findAll();
                                for (Mdevento filtroEvento : filtroEventos) {
                                    if(filtroEvento.getTotal()!=null)totalSumEventos=totalSumEventos+filtroEvento.getTotal();
                                    if(filtroEvento.getNumatl()!=null)totalAtlEventos=totalAtlEventos+filtroEvento.getNumatl();
                                    if(filtroEvento.getNumdias()!=null)totalDiasEventos=totalDiasEventos+filtroEvento.getNumdias();
                                    if(filtroEvento.getNument()!=null)totalEntEventos=totalEntEventos+filtroEvento.getNument();
                                }break;
                        case 5: System.out.println("Federación");
                                filtroEventos=mdeventoFacade.getListByCreator(currentUser.getIdusuario());
                                for (Mdevento filtroEvento : filtroEventos) {
                                    if(filtroEvento.getTotal()!=null)totalSumEventos=totalSumEventos+filtroEvento.getTotal();
                                    if(filtroEvento.getNumatl()!=null)totalAtlEventos=totalAtlEventos+filtroEvento.getNumatl();
                                    if(filtroEvento.getNumdias()!=null)totalDiasEventos=totalDiasEventos+filtroEvento.getNumdias();
                                    if(filtroEvento.getNument()!=null)totalEntEventos=totalEntEventos+filtroEvento.getNument();
                                }break;
                        case 6: System.out.println("Comité");
                                if(selectFede.getSector()){
                                    filtroEventos=mdeventoFacade.getListBySector("CONVENCIONAL");
                                    for (Mdevento filtroEvento : filtroEventos) {
                                        if(filtroEvento.getTotal()!=null)totalSumEventos=totalSumEventos+filtroEvento.getTotal();
                                        if(filtroEvento.getNumatl()!=null)totalAtlEventos=totalAtlEventos+filtroEvento.getNumatl();
                                        if(filtroEvento.getNumdias()!=null)totalDiasEventos=totalDiasEventos+filtroEvento.getNumdias();
                                        if(filtroEvento.getNument()!=null)totalEntEventos=totalEntEventos+filtroEvento.getNument();
                                    }
                                }else{
                                    filtroEventos=mdeventoFacade.getListBySector("DISCAPACIDAD");
                                    for (Mdevento filtroEvento : filtroEventos) {
                                        if(filtroEvento.getTotal()!=null)totalSumEventos=totalSumEventos+filtroEvento.getTotal();
                                        if(filtroEvento.getNumatl()!=null)totalAtlEventos=totalAtlEventos+filtroEvento.getNumatl();
                                        if(filtroEvento.getNumdias()!=null)totalDiasEventos=totalDiasEventos+filtroEvento.getNumdias();
                                        if(filtroEvento.getNument()!=null)totalEntEventos=totalEntEventos+filtroEvento.getNument();
                                    }               
                                }break;
                        case 7: if(selectFede.getSector()){
                                    filtroEventos=mdeventoFacade.getListByFed(currentUser.getCodinst());
                                    for (Mdevento filtroEvento : filtroEventos) {
                                        if(filtroEvento.getTotal()!=null)totalSumEventos=totalSumEventos+filtroEvento.getTotal();
                                        if(filtroEvento.getNumatl()!=null)totalAtlEventos=totalAtlEventos+filtroEvento.getNumatl();
                                        if(filtroEvento.getNumdias()!=null)totalDiasEventos=totalDiasEventos+filtroEvento.getNumdias();
                                        if(filtroEvento.getNument()!=null)totalEntEventos=totalEntEventos+filtroEvento.getNument();
                                    }
                                }else{
                                    filtroEventos=mdeventoFacade.getListBySector("DISCAPACIDAD");
                                    for (Mdevento filtroEvento : filtroEventos) {
                                        if(filtroEvento.getTotal()!=null)totalSumEventos=totalSumEventos+filtroEvento.getTotal();
                                        if(filtroEvento.getNumatl()!=null)totalAtlEventos=totalAtlEventos+filtroEvento.getNumatl();
                                        if(filtroEvento.getNumdias()!=null)totalDiasEventos=totalDiasEventos+filtroEvento.getNumdias();
                                        if(filtroEvento.getNument()!=null)totalEntEventos=totalEntEventos+filtroEvento.getNument();
                                    }               
                                }break;   
                    }
            }
        }else{
               System.out.println("Filtro eventos no está vacío...");
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
        if(newNecesidad==null)
            newNecesidad= new Mdnecesidades();
        return newNecesidad;
    }

    public void setNewNecesidad(Mdnecesidades newNecesidad) {
        this.newNecesidad = newNecesidad;
    }

    public List<Mdnecesidades> getListaNecesidad() {
        System.out.println("getnecesidades...");
        if(currentUser.getIdacticode()==0){
            System.out.println("Todos");
            listaNecesidad=mdnecesidadesFacade.findAll();
        }else if(currentUser.getCodinst()==49){
            System.out.println("49");
            listaNecesidad=mdnecesidadesFacade.getListBySector(true);
        }else if(currentUser.getCodinst()==52){
            System.out.println("52");
            listaNecesidad=mdnecesidadesFacade.getListBySector(false);
            //listaNecesidad=mdnecesidadesFacade.getListBySector(false);
        }else{
            System.out.println("por federación...");
            listaNecesidad=mdnecesidadesFacade.getListByFede(currentUser.getCodinst());
        }
        for (Mdnecesidades mdnecesidades : listaNecesidad) {
            System.out.println("mdnecesidades: "+mdnecesidades.getDisciplina()+" "+mdnecesidades.getTipo());
        }
        return listaNecesidad;
    }

    public void setListaNecesidad(List<Mdnecesidades> listaNecesidad) {
        this.listaNecesidad = listaNecesidad;
    }

    public List<Mdnecesidades> getFiltroNecesidad() {
       
        /*if(currentUser!=null)
            if(currentModulo.getIdmodulo().getIdmodulo()==6 || currentModulo.getIdmodulo().getIdmodulo()==2){
               
                filtroNecesidad=mdnecesidadesFacade.findAll();
            }else{
               
                filtroNecesidad=mdnecesidadesFacade.getListByCreator(currentUser.getIdusuario());
            }*/
        
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

                    }if(nuevoHono.getCargo().equals("Asistente Técnico")||nuevoHono.getCargo().equals("Preparador Físico")||nuevoHono.getCargo().equals("Coordinador Técnico")){
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

                    }if(selecetedHono.getCargo().equals("Asistente Técnico")||selecetedHono.getCargo().equals("Preparador Físico")||selecetedHono.getCargo().equals("Coordinador Técnico")){
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

    public String getNewPwdUser() {
        return newPwdUser;
    }

    public void setNewPwdUser(String newPwdUser) {
        this.newPwdUser = newPwdUser;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<Mdresultados> getListaResult() {
        if(listaResult==null)
            
            listaResult=mdresultadosFacade.getListBySector(selectFede.getSector());
        return listaResult;
    }

    public void setListaResult(List<Mdresultados> listaResult) {
        this.listaResult = listaResult;
    }

    public List<Mdresultados> getFiltroResult() {
        return filtroResult;
    }

    public void setFiltroResult(List<Mdresultados> filtroResult) {
        this.filtroResult = filtroResult;
    }

    public Mdresultados getSelectResultado() {
        return selectResultado;
    }

    public void setSelectResultado(Mdresultados selectResultado) {
        this.selectResultado = selectResultado;
    }

    public String getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(String proyeccion) {
        this.proyeccion = proyeccion;
    }

    public String getConvoCatoria() {
        return convoCatoria;
    }

    public void setConvoCatoria(String convoCatoria) {
        this.convoCatoria = convoCatoria;
    }

    

    
    

   

    

   

    
 private int eventosP[];
 private int eventosD[];

    public int[] getEventosP() {
        if(eventosP==null){
            eventosP=new int[20];
            for (int i = 0; i < eventosP.length; i++) {
                eventosP[i]=1;
            }
        
        }
        System.out.println("Valor eventosP[0]: "+eventosP[0]);
        return eventosP;
    }

    public void setEventosP(int[] eventosP) {
        this.eventosP = eventosP;
    }

    public int[] getEventosD() {
        if(eventosD==null){
            eventosD=new int[20];
            for (int i = 0; i < eventosD.length; i++) {
                eventosD[i]=1;
            }
        
        }
        return eventosD;
    }

    public void setEventosD(int[] eventosD) {
        this.eventosD = eventosD;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public boolean isControlFileUp() {
        return controlFileUp;
    }

    public void setControlFileUp(boolean controlFileUp) {
        this.controlFileUp = controlFileUp;
    }

    public boolean isArchivoPostulante() {
        
        File f = new File(ubicacionEnDisco+selectPersona.getDepcedula()+"_postulacion.pdf");
        System.out.println("FILE: "+f.getAbsolutePath());
        System.out.println("FILE: "+f.getName());
        System.out.println("FILE: "+f.getPath());
        if(f.exists() && !f.isDirectory()) { 
            archivoPostulante=true;
        }else{
        archivoPostulante=false;
        }
        return archivoPostulante;
    }

    public void setArchivoPostulante(boolean archivoPostulante) {
        this.archivoPostulante = archivoPostulante;
    }

    public int getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(int delegacion) {
        this.delegacion = delegacion;
    }

    public List<Mdevento> getEventoDelegado() {
        return eventoDelegado;
    }

    public void setEventoDelegado(List<Mdevento> eventoDelegado) {
        this.eventoDelegado = eventoDelegado;
    }

    public List<Mdpersonast> getAtletasEvento() {
        if(atletasEvento==null){
            atletasEvento=listaPersonas;
        }
        return atletasEvento;
    }

    public void setAtletasEvento(List<Mdpersonast> atletasEvento) {
        this.atletasEvento = atletasEvento;
    }

    public List<String> getEventoEntrenadores() {
        if(eventoEntrenadores==null)
            eventoEntrenadores=Arrays.asList("ND");
        return eventoEntrenadores;
    }

    public void setEventoEntrenadores(List<String> eventoEntrenadores) {
        this.eventoEntrenadores = eventoEntrenadores;
    }

    public double getTotalSumEventos() {
        return totalSumEventos;
    }

    public void setTotalSumEventos(double totalSumEventos) {
        this.totalSumEventos = totalSumEventos;
    }

    public double getTotalEntEventos() {
        return totalEntEventos;
    }

    public void setTotalEntEventos(int totalEntEventos) {
        this.totalEntEventos = totalEntEventos;
    }

    public double getTotalAtlEventos() {
        return totalAtlEventos;
    }

    public void setTotalAtlEventos(int totalAtlEventos) {
        this.totalAtlEventos = totalAtlEventos;
    }

    public double getTotalDiasEventos() {
        return totalDiasEventos;
    }

    public void setTotalDiasEventos(int totalDiasEventos) {
        this.totalDiasEventos = totalDiasEventos;
    }

    public boolean isApoyo() {
        return apoyo;
    }

    public void setApoyo(boolean apoyo) {
        this.apoyo = apoyo;
    }

    

    

    
    
    
    
}
