package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionAtoF;
import ni.org.ics.zpo.service.Zpo04ExtendedSectionAtoFService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo04Extended desde la seccion A a la F
 * Created by ics.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo04ExtendedSectionAtoFController {

    @Resource(name = "zpo04ExtendedSectionAtoFService")
    private Zpo04ExtendedSectionAtoFService zpo04ExtendedSectionAtoFService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo04ExtendedSectionAtoFController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionAtoFs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionAtoF> getZpo04ExtendedSectionAtoFs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionAtoF");
        List<Zpo04ExtendedSectionAtoF> zpo04ExtendedSectionAtoF = zpo04ExtendedSectionAtoFService.getZpo04ExtendedSectionAtoF();
        if (zpo04ExtendedSectionAtoF == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionAtoF;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionAtoFs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionAtoF> getZpo04ExtendedSectionAtoFs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionAtoF para el usuario " +username);
        List<Zpo04ExtendedSectionAtoF> zpo04ExtendedSectionAtoF = zpo04ExtendedSectionAtoFService.getZpo04ExtendedSectionAtoFByUser(username);
        if (zpo04ExtendedSectionAtoF == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionAtoF;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zpo04ExtendedSectionAtoF
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo04ExtendedSectionAtoFs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo04ExtendedSectionAtoFs(@RequestBody Zpo04ExtendedSectionAtoF[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo04ExtendedSectionAtoF");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo04ExtendedSectionAtoF> zpo04ExtendedSectionAtoFs = Arrays.asList(envio);
            for (Zpo04ExtendedSectionAtoF zpo04ExtendedSectionAtoF : zpo04ExtendedSectionAtoFs){
                zpo04ExtendedSectionAtoFService.saveZpo04ExtendedSectionAtoF(zpo04ExtendedSectionAtoF);
            }
        }
        return "Datos recibidos!";
    }
}
