package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo01StudyEntrySectionAtoB;
import ni.org.ics.zpo.service.Zpo01StudyEntrySectionAtoBService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario ZS01StudyEntry desde la seccion A a la B
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo01StudyEntrySectionAtoBController {

    @Resource(name = "zpo01StudyEntrySectionAtoBService")
    private Zpo01StudyEntrySectionAtoBService zpo01StudyEntrySectionAtoBService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo01StudyEntrySectionAtoBController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo01StudyEntrySectionAtoBs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo01StudyEntrySectionAtoB> getSs01StudyEntrySectionAtoBs() {
        logger.info("Descargando toda la informacion de los datos de los formulario zpo01StudyEntrySectionAtoB");
        List<Zpo01StudyEntrySectionAtoB> zpo01StudyEntrySectionAtoBs = zpo01StudyEntrySectionAtoBService.getZpo01StudyEntrySectionAtoB();
        if (zpo01StudyEntrySectionAtoBs == null){
            logger.debug("Nulo");
        }
        return zpo01StudyEntrySectionAtoBs;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo01StudyEntrySectionAtoBs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo01StudyEntrySectionAtoB> getZpo01StudyEntrySectionAtoBs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario zpo01StudyEntrySectionAtoB para el usuario " +username);
        List<Zpo01StudyEntrySectionAtoB> zpo01StudyEntrySectionAtoBs = zpo01StudyEntrySectionAtoBService.getZpo01StudyEntrySectionAtoBByUser(username);
        if (zpo01StudyEntrySectionAtoBs == null){
            logger.debug("Nulo");
        }
        return zpo01StudyEntrySectionAtoBs;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de zpo01StudyEntrySectionAtoB
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo01StudyEntrySectionAtoBs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo01StudyEntrySectionAtoBs(@RequestBody Zpo01StudyEntrySectionAtoB[] envio) {
        logger.debug("Insertando/Actualizando formularios zpo01StudyEntrySectionAtoB");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo01StudyEntrySectionAtoB> zpo01StudyEntrySectionAtoBs = Arrays.asList(envio);
            for (Zpo01StudyEntrySectionAtoB zpo01StudyEntrySectionAtoB : zpo01StudyEntrySectionAtoBs){
                zpo01StudyEntrySectionAtoBService.saveZpo01StudyEntrySectionAtoB(zpo01StudyEntrySectionAtoB);
            }
        }
        return "Datos recibidos!";
    }
}
