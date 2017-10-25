package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo01StudyEntrySectionDtoF;
import ni.org.ics.zpo.service.Zpo01StudyEntrySectionDtoFService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo01StudyEntry desde la seccion D a la F
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo01StudyEntrySectionDtoFController {

    @Resource(name = "zpo01StudyEntrySectionDtoFService")
    private Zpo01StudyEntrySectionDtoFService zpo01StudyEntrySectionDtoFService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo01StudyEntrySectionDtoFController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo01StudyEntrySectionDtoFs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo01StudyEntrySectionDtoF> getZpo01StudyEntrySectionDtoFs() {
        logger.info("Descargando toda la informacion de los formulario Zpo01StudyEntrySectionDtoFs");
        List<Zpo01StudyEntrySectionDtoF> zpo01StudyEntrySectionDtoFs = zpo01StudyEntrySectionDtoFService.getZpo01StudyEntrySectionDtoF();
        if (zpo01StudyEntrySectionDtoFs == null){
            logger.debug("Nulo");
        }
        return zpo01StudyEntrySectionDtoFs;
    }
    
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo01StudyEntrySectionDtoFs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo01StudyEntrySectionDtoF> getZpo01StudyEntrySectionDtoFs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los formulario Zpo01StudyEntrySectionDtoFs para el usuario " +username);
        List<Zpo01StudyEntrySectionDtoF> zpo01StudyEntrySectionDtoFs = zpo01StudyEntrySectionDtoFService.getZpo01StudyEntrySectionDtoFByUser(username);
        if (zpo01StudyEntrySectionDtoFs == null){
            logger.debug("Nulo");
        }
        return zpo01StudyEntrySectionDtoFs;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo01StudyEntrySectionDtoF
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo01StudyEntrySectionDtoFs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo01StudyEntrySectionDtoFs(@RequestBody Zpo01StudyEntrySectionDtoF[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo01StudyEntrySectionDtoFs");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo01StudyEntrySectionDtoF> zpo01StudyEntrySectionDtoFs = Arrays.asList(envio);
            for (Zpo01StudyEntrySectionDtoF zpo01StudyEntrySectionDtoF : zpo01StudyEntrySectionDtoFs){
                zpo01StudyEntrySectionDtoFService.saveZpo01StudyEntrySectionDtoF(zpo01StudyEntrySectionDtoF);
            }
        }
        return "Datos recibidos!";
    }

}
