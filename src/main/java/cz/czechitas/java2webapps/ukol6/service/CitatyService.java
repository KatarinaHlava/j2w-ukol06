package cz.czechitas.java2webapps.ukol6.service;

//Controller bude přímo používat službu CitatyService. V té bude jedna metoda (v případě bonusového úkolu dvě metody).
// Metoda nahodnyCitat() bude vracet String – text náhodného citátu.
// V kódu této metody se použijí dvě následující služby.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {

    private final CitatyRepository service;
    private final NahodneCisloService nahodneCisloService;

   @Autowired
   public CitatyService(CitatyRepository service, NahodneCisloService nahodneCisloService) {
       this.service = service;
       this.nahodneCisloService=nahodneCisloService;
   }

    public String nahodnyCitat(){
       int kolko=nahodneCisloService.dejNahodneCislo(service.pocet());
       return service.citat(kolko);

    }


}

