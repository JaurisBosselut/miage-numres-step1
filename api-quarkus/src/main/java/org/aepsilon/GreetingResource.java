package org.aepsilon;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
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
