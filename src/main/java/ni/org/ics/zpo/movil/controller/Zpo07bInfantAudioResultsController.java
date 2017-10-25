package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo07bInfantAudioResults;
import ni.org.ics.zpo.service.Zpo07bInfantAudioResultsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo07bInfantAudioResults
 * Created by ics on 24/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo07bInfantAudioResultsController {

    @Resource(name = "zpo07bInfantAudioResultsService")
    private Zpo07bInfantAudioResultsService zpo07bInfantAudioResultsService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo07bInfantAudioResultsController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07bInfantAudioResults", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07bInfantAudioResults> getZpo07bInfantAudioResults() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07bInfantAudioResults");
        List<Zpo07bInfantAudioResults> zpo07bInfantAudioResults = zpo07bInfantAudioResultsService.getZpo07bInfantAudioResults();
        if (zpo07bInfantAudioResults == null){
            logger.debug("Nulo");
        }
        return zpo07bInfantAudioResults;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07bInfantAudioResults/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07bInfantAudioResults> getZpo07bInfantAudioResults(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07bInfantAudioResults para el usuario " +username);
        List<Zpo07bInfantAudioResults> zpo07bInfantAudioResults = zpo07bInfantAudioResultsService.getZpo07bInfantAudioResultstByUser(username);
        if (zpo07bInfantAudioResults == null){
            logger.debug("Nulo");
        }
        return zpo07bInfantAudioResults;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zpo07bInfantAudioResults
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo07bInfantAudioResults", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo07bInfantAudioResults(@RequestBody Zpo07bInfantAudioResults[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo07bInfantAudioResults");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo07bInfantAudioResults> zpo07bInfantAudioResults = Arrays.asList(envio);
            for (Zpo07bInfantAudioResults zpo07bInfantAudioResult : zpo07bInfantAudioResults){
                zpo07bInfantAudioResultsService.saveZpo07bInfantAudioResults(zpo07bInfantAudioResult);
            }
        }
        return "Datos recibidos!";
    }
}
