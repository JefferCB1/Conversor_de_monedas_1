import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda buscarMonedas(String monedaBase, String monedaTarget){
        URI direction = URI.create("https://v6.exchangerate-api.com/v6/619d8c3a72c78ce69ff4d4ef/pair/"+ monedaBase +"/"+ monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e) {
            throw new RuntimeException("No se encontró esa moneda ");
        }
    }
}
