package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo08StudyExit;
import ni.org.ics.zpo.service.Zpo08StudyExitService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo08StudyExit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo08StudyExitController {

    @Resource(name = "zpo08StudyExitService")
    private Zpo08StudyExitService zpo08StudyExitService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo08StudyExitController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo08StudyExits", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo08StudyExit> getZpo08StudyExits() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo08StudyExit");
        List<Zpo08StudyExit> zpo08StudyExits = zpo08StudyExitService.getZpo08StudyExit();
        if (zpo08StudyExits == null){
            logger.debug("Nulo");
        }
        return zpo08StudyExits;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo08StudyExits/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo08StudyExit> getZpo08StudyExits(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo08StudyExit para el usuario " +username);
        List<Zpo08StudyExit> zpo08StudyExits = zpo08StudyExitService.getZpo08StudyExitByUser(username);
        if (zpo08StudyExits == null){
            logger.debug("Nulo");
        }
        return zpo08StudyExits;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo08StudyExit
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo08StudyExits", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo08StudyExits(@RequestBody Zpo08StudyExit[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo08StudyExits");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo08StudyExit> zpo08StudyExits = Arrays.asList(envio);
            for (Zpo08StudyExit zpo08StudyExit : zpo08StudyExits){
                zpo08StudyExitService.saveZpo08StudyExit(zpo08StudyExit);
            }
        }
        return "Datos recibidos!";
    }
}
