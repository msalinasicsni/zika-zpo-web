package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionE;
import ni.org.ics.zpo.service.Zpo04ExtendedSectionEService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para la seccion E del formulario Zpo04Extended
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo04ExtendedSectionEController {
    @Resource(name = "zpo04ExtendedSectionEService")
    private Zpo04ExtendedSectionEService zpo04ExtendedSectionEService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo04ExtendedSectionEController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionEs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionE> getZpo04ExtendedSectionEs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionE");
        List<Zpo04ExtendedSectionE> zpo04ExtendedSectionE = zpo04ExtendedSectionEService.getZpo04ExtendedSectionE();
        if (zpo04ExtendedSectionE == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionE;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo04ExtendedSectionEs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo04ExtendedSectionE> getZpo04ExtendedSectionEs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo04ExtendedSectionE para el usuario " +username);
        List<Zpo04ExtendedSectionE> zpo04ExtendedSectionE = zpo04ExtendedSectionEService.getZpo04ExtendedSectionEByUser(username);
        if (zpo04ExtendedSectionE == null){
            logger.debug("Nulo");
        }
        return zpo04ExtendedSectionE;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo04ExtendedSectionE
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo04ExtendedSectionEs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo04ExtendedSectionEs(@RequestBody Zpo04ExtendedSectionE[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo04ExtendedSectionE");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo04ExtendedSectionE> zpo04ExtendedSectionEs = Arrays.asList(envio);
            for (Zpo04ExtendedSectionE zpo04ExtendedSectionE : zpo04ExtendedSectionEs){
                zpo04ExtendedSectionEService.saveZpo04ExtendedSectionE(zpo04ExtendedSectionE);
            }
        }
        return "Datos recibidos!";
    }
}
