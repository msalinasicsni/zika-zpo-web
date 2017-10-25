package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo07cInfantImageStudies;
import ni.org.ics.zpo.service.Zpo07cInfantImageStudiesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo07cInfantImageStudies
 * Created by ics on 24/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo07cInfantImageStudiesController {

    @Resource(name = "zpo07cInfantImageStudiesService")
    private Zpo07cInfantImageStudiesService zpo07cInfantImageStudiesService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo07cInfantImageStudiesController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07cInfantImageStudies", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07cInfantImageStudies> getZpo07cInfantImageStudies() {
        logger.info("Descargando toda la informacion de los datos de los formulario zpo07CInfantImageStudies");
        List<Zpo07cInfantImageStudies> zpo07CInfantImageStudies = zpo07cInfantImageStudiesService.getZpo07cInfantImageStudies();
        if (zpo07CInfantImageStudies == null){
            logger.debug("Nulo");
        }
        return zpo07CInfantImageStudies;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07cInfantImageStudies/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07cInfantImageStudies> getZpo07cInfantImageStudies(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07cInfantImageStudies para el usuario " +username);
        List<Zpo07cInfantImageStudies> zpo07CInfantImageStudies = zpo07cInfantImageStudiesService.getZpo07cInfantImageStudiesByUser(username);
        if (zpo07CInfantImageStudies == null){
            logger.debug("Nulo");
        }
        return zpo07CInfantImageStudies;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zpo07cInfantImageStudies
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo07cInfantImageStudies", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo07cInfantImageStudies(@RequestBody Zpo07cInfantImageStudies[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo07cInfantImageStudies");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo07cInfantImageStudies> zpo07CInfantImageStudies = Arrays.asList(envio);
            for (Zpo07cInfantImageStudies zpo07cInfantImageSt : zpo07CInfantImageStudies){
                zpo07cInfantImageStudiesService.saveZpo07cInfantImageStudies(zpo07cInfantImageSt);
            }
        }
        return "Datos recibidos!";
    }
}
