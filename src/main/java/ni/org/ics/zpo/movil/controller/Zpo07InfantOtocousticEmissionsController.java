package ni.org.ics.zpo.movil.controller;

import ni.org.ics.zpo.domain.Zpo07InfantOtoacousticEmissions;
import ni.org.ics.zpo.service.Zpo07InfantOtoacousticEmissionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zpo07InfantOtocousticEmissions
 */

@Controller
@RequestMapping("/movil/*")
public class Zpo07InfantOtocousticEmissionsController {

    @Resource(name = "zpo07InfantOtoacousticEmsService")
    private Zpo07InfantOtoacousticEmissionsService zpo07InfantOtoacousticEmsService;

    private static final Logger logger = LoggerFactory.getLogger(Zpo07InfantOtocousticEmissionsController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07InfantOtoacousticEms", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07InfantOtoacousticEmissions> getZpo07InfantOtoacousticEms() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zpo07InfantOacousticEmissions");
        List<Zpo07InfantOtoacousticEmissions> zpo07InfantOtoacousticEms = zpo07InfantOtoacousticEmsService.getZpo07InfantOtoacousticEms();
        if (zpo07InfantOtoacousticEms == null){
            logger.debug("Nulo");
        }
        return zpo07InfantOtoacousticEms;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpo07InfantOtoacousticEms/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zpo07InfantOtoacousticEmissions> getZpo07InfantOtoacousticEms(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formularios Zpo07InfantOacousticEmissions para el usuario " +username);
        List<Zpo07InfantOtoacousticEmissions> zpo07InfantOtoacousticEms = zpo07InfantOtoacousticEmsService.getZpo07InfantOtoacousticEmsByUser(username);
        if (zpo07InfantOtoacousticEms == null){
            logger.debug("Nulo");
        }
        return zpo07InfantOtoacousticEms;
    }


    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zpo07InfantOtoacousticEmissions
     * @return String con el resultado
     */
    @RequestMapping(value = "zpo07InfantOtoacousticEms", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpo07InfantOtoacousticEms(@RequestBody Zpo07InfantOtoacousticEmissions[] envio) {
        logger.debug("Insertando/Actualizando formularios Zpo07InfantOtocousticEmissions");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zpo07InfantOtoacousticEmissions> zpo07InfantOtoacousticEms = Arrays.asList(envio);
            for (Zpo07InfantOtoacousticEmissions zpo07InfantOtoacousticEm : zpo07InfantOtoacousticEms){
                zpo07InfantOtoacousticEmsService.saveZpo07InfantOtoacousticEm(zpo07InfantOtoacousticEm);
            }
        }
        return "Datos recibidos!";
    }



}
