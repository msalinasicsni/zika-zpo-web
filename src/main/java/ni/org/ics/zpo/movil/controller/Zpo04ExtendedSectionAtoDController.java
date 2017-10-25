package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionAtoD;
import ni.org.ics.zpo.service.Zpo04ExtendedSectionAtoDService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo04Extended desde la seccion A a la D
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo04ExtendedSectionAtoDController {

    @Resource(name = "zpo04ExtendedSectionAtoDService")
    private Zpo04ExtendedSectionAtoDService zpo04ExtendedSectionAtoDService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo04ExtendedSectionAtoDController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionAtoDs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionAtoD> getZpo04ExtendedSectionAtoDs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionAtoD");
        List<Zpo04ExtendedSectionAtoD> zpo04ExtendedSectionAtoD = zpo04ExtendedSectionAtoDService.getZpo04ExtendedSectionAtoD();
        if (zpo04ExtendedSectionAtoD == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionAtoD;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionAtoDs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionAtoD> getZpo04ExtendedSectionAtoDs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionAtoD para el usuario " +username);
        List<Zpo04ExtendedSectionAtoD> zpo04ExtendedSectionAtoD = zpo04ExtendedSectionAtoDService.getZpo04ExtendedSectionAtoDByUser(username);
        if (zpo04ExtendedSectionAtoD == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionAtoD;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zpo04ExtendedSectionAtoD
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo04ExtendedSectionAtoDs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo04ExtendedSectionAtoDs(@RequestBody Zpo04ExtendedSectionAtoD[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo04ExtendedSectionAtoD");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo04ExtendedSectionAtoD> zpo04ExtendedSectionAtoDs = Arrays.asList(envio);
            for (Zpo04ExtendedSectionAtoD zpo04ExtendedSectionAtoD : zpo04ExtendedSectionAtoDs){
                zpo04ExtendedSectionAtoDService.saveZpo04ExtendedSectionAtoD(zpo04ExtendedSectionAtoD);
            }
        }
        return "Datos recibidos!";
    }
}
