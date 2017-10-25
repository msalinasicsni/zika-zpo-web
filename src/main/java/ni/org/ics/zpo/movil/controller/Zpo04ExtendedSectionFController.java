package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionF;
import ni.org.ics.zpo.service.Zpo04ExtendedSectionFService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo04Extended seccion F
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo04ExtendedSectionFController {
    @Resource(name = "zpo04ExtendedSectionFService")
    private Zpo04ExtendedSectionFService zpo04ExtendedSectionFService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo04ExtendedSectionFController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionFs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionF> getZpo04ExtendedSectionFs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionFs");
        List<Zpo04ExtendedSectionF> zpo04ExtendedSectionFs = zpo04ExtendedSectionFService.getZpo04ExtendedSectionF();
        if (zpo04ExtendedSectionFs == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionFs;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionFs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionF> getZpo04ExtendedSectionFs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionFs para el usuario " +username);
        List<Zpo04ExtendedSectionF> zpo04ExtendedSectionFs = zpo04ExtendedSectionFService.getZpo04ExtendedSectionFByUser(username);
        if (zpo04ExtendedSectionFs == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionFs;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo04ExtendedSectionF
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo04ExtendedSectionFs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo04ExtendedSectionFs(@RequestBody Zpo04ExtendedSectionF[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo04ExtendedSectionFs");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo04ExtendedSectionF> zpo04ExtendedSectionFs = Arrays.asList(envio);
            for (Zpo04ExtendedSectionF zpo04ExtendedSectionF : zpo04ExtendedSectionFs){
                zpo04ExtendedSectionFService.saveZpo04ExtendedSectionF(zpo04ExtendedSectionF);
            }
        }
        return "Datos recibidos!";
    }
}
