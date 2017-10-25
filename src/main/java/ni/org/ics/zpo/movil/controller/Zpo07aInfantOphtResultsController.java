package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo07aInfantOphtResults;
import ni.org.ics.zpo.service.Zpo07aInfantOphtResultsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo07aInfantOphtResults
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo07aInfantOphtResultsController {

    @Resource(name = "zpo07aInfantOphtResultsService")
    private Zpo07aInfantOphtResultsService zpo07aInfantOphtResultsService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo07aInfantOphtResultsController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07aInfantOphtResults", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07aInfantOphtResults> getZpo07aInfantOphtResults() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07aInfantOphtResults");
        List<Zpo07aInfantOphtResults> zpo07aInfantOphtResults = zpo07aInfantOphtResultsService.getZpo07aInfantOphtResults();
        if (zpo07aInfantOphtResults == null){
            logger.debug("Nulo");
        }
        return zpo07aInfantOphtResults;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07aInfantOphtResults/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07aInfantOphtResults> getZpo07aInfantOphtResults(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07aInfantOphtResults para el usuario " +username);
        List<Zpo07aInfantOphtResults> zpo07aInfantOphtResults = zpo07aInfantOphtResultsService.getZpo07aInfantOphtResultstByUser(username);
        if (zpo07aInfantOphtResults == null){
            logger.debug("Nulo");
        }
        return zpo07aInfantOphtResults;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zpo07aInfantOphtResults
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo07aInfantOphtResults", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo07aInfantOphtResults(@RequestBody Zpo07aInfantOphtResults[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo07aInfantOphtResults");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo07aInfantOphtResults> zpo07aInfantOphtResults = Arrays.asList(envio);
            for (Zpo07aInfantOphtResults zpo07aInfantOphtResult : zpo07aInfantOphtResults){
                zpo07aInfantOphtResultsService.saveZpo07aInfantOphtResults(zpo07aInfantOphtResult);
            }
        }
        return "Datos recibidos!";
    }
}
