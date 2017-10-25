package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo01StudyEntrySectionC;
import ni.org.ics.zpo.service.Zpo01StudyEntrySectionCService;
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
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zpo01StudyEntrySectionCController {
    @Resource(name = "zpo01StudyEntrySectionCService")
    private Zpo01StudyEntrySectionCService zpo01StudyEntrySectionCService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo01StudyEntrySectionCController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo01StudyEntrySectionCs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo01StudyEntrySectionC> getZpo01StudyEntrySectionCs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo01StudyEntry seccion E");
        List<Zpo01StudyEntrySectionC> zpo01StudyEntrySectionCs = zpo01StudyEntrySectionCService.getZpo01StudyEntrySectionC();
        if (zpo01StudyEntrySectionCs == null){
            logger.debug("Nulo");
        }
        return zpo01StudyEntrySectionCs;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo01StudyEntrySectionCs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo01StudyEntrySectionC> getZpo01StudyEntrySectionCs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo01StudyEntry seccion E para el usuario " +username);
        List<Zpo01StudyEntrySectionC> zpo01StudyEntrySectionCs = zpo01StudyEntrySectionCService.getZpo01StudyEntrySectionCByUser(username);
        if (zpo01StudyEntrySectionCs == null){
            logger.debug("Nulo");
        }
        return zpo01StudyEntrySectionCs;
    }


    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo01StudyEntrySectionC
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo01StudyEntrySectionCs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo01StudyEntrySectionCs(@RequestBody Zpo01StudyEntrySectionC[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo01StudyEntrySectionC");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo01StudyEntrySectionC> zpo01StudyEntrySectionCs = Arrays.asList(envio);
            for (Zpo01StudyEntrySectionC zpo01StudyEntrySectionC : zpo01StudyEntrySectionCs){
                zpo01StudyEntrySectionCService.saveZpo01StudyEntrySectionC(zpo01StudyEntrySectionC);
            }
        }
        return "Datos recibidos!";
    }
}
