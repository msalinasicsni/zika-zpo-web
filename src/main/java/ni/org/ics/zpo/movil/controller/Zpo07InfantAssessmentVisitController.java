package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo07InfantAssessmentVisit;
import ni.org.ics.zpo.service.Zpo07InfantAssessmentVisitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo07InfantAssessmentVisit
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo07InfantAssessmentVisitController {

    @Resource(name = "zpo07InfantAssessmentVisitService")
    private Zpo07InfantAssessmentVisitService zpo07InfantAssessmentVisitService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo07InfantAssessmentVisitController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07InfantAssessmentVisits", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07InfantAssessmentVisit> getZpo07InfantAssessmentVisits() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07InfantAssessmentVisit");
        List<Zpo07InfantAssessmentVisit> zpo07InfantAssessmentVisits = zpo07InfantAssessmentVisitService.getZpo07InfantAssessmentVisit();
        if (zpo07InfantAssessmentVisits == null){
            logger.debug("Nulo");
        }
        return zpo07InfantAssessmentVisits;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07InfantAssessmentVisits/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07InfantAssessmentVisit> getZpo07InfantAssessmentVisits(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07InfantAssessmentVisit para el usuario " +username);
        List<Zpo07InfantAssessmentVisit> zpo07InfantAssessmentVisits = zpo07InfantAssessmentVisitService.getZpo07InfantAssessmentVisitByUser(username);
        if (zpo07InfantAssessmentVisits == null){
            logger.debug("Nulo");
        }
        return zpo07InfantAssessmentVisits;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zpo07InfantAssessmentVisit
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo07InfantAssessmentVisits", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo07InfantAssessmentVisits(@RequestBody Zpo07InfantAssessmentVisit[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo07InfantAssessmentVisits");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo07InfantAssessmentVisit> zpo07InfantAssessmentVisits = Arrays.asList(envio);
            for (Zpo07InfantAssessmentVisit zpo07InfantAssessmentVisit : zpo07InfantAssessmentVisits){
                zpo07InfantAssessmentVisitService.saveZp07InfantAssessmentVisit(zpo07InfantAssessmentVisit);
            }
        }
        return "Datos recibidos!";
    }
}
