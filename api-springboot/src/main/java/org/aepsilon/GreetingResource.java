package org.aepsilon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingResource {


    @GetMapping("/hello")
    public String sayHello() {
        return "Je m'présente, je m'appelle Henri\n"
            + "J'voudrais bien réussir ma vie, être aimé\n"
            + "Être beau, gagner de l'argent\n"
            + "Puis surtout être intelligent\n"
            + "Mais pour tout ça il faudrait que j'bosse à plein temps\n\n"
            + "J'suis chanteur, je chante pour mes copains\n"
            + "J'veux faire des tubes et que ça tourne bien, tourne bien\n"
            + "J'veux écrire une chanson dans le vent\n"
            + "Un air gai, chic et entraînant\n"
            + "Pour faire danser dans les soirées de Monsieur Durand";
    }
}