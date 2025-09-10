package Cursos.CursoRicci.ejercicio8webServer;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

import java.util.List;

public class ItemList implements Handler {
    List<Clothing> items;

    public ItemList(List<Clothing> items) {
        this.items = items;
    }

    public List<Clothing> getItems() {
        return items;
    }

    public void accept(ServerRequest req, ServerResponse res){
        res.status(Http.Status.OK_200);
        res.headers().put("Content Type", "text/plain; charset=UTF-8");
        StringBuilder resultado = new StringBuilder();
        for(Clothing i : items){
            resultado.append(i+ "\n");
        }
        res.send(resultado.toString());
    }
}
