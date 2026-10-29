```java
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class index {

    public static void main(String[] args) throws Exception {

        int puerto = Integer.parseInt(
            System.getenv().getOrDefault("PORT", "8080")
        );

        HttpServer servidor = HttpServer.create(
            new InetSocketAddress(puerto), 0
        );

        servidor.createContext("/", intercambio -> {

            String fecha = LocalDate.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
            );

            String html = """
                <!DOCTYPE html>
                <html lang="es">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport"
                          content="width=device-width, initial-scale=1.0">
                    <title>Mi Proyecto en la Nube</title>

                    <style>
                        * {
                            box-sizing: border-box;
                        }

                        body {
                            font-family: Arial, sans-serif;
                            min-height: 100vh;
                            margin: 0;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            padding: 20px;
                            background: linear-gradient(
                                135deg, #667eea, #764ba2
                            );
                        }

                        .contenedor {
                            background: white;
                            width: 100%;
                            max-width: 650px;
                            padding: 40px 30px;
                            text-align: center;
                            border-radius: 20px;
                            box-shadow: 0 12px 35px #0003;
                        }

                        .icono {
                            font-size: 55px;
                            margin-bottom: 15px;
                        }

                        h1 {
                            color: #4c3b8f;
                            margin-bottom: 20px;
                        }

                        p {
                            color: #555;
                            font-size: 17px;
                            line-height: 1.7;
                        }

                        .estado {
                            display: inline-block;
                            background: #e2fbe8;
                            color: #18783a;
                            padding: 10px 18px;
                            border-radius: 25px;
                            margin: 15px 0;
                        }

                        .fecha {
                            background: #f3f0ff;
                            padding: 18px;
                            border-radius: 10px;
                            color: #4c3b8f;
                            margin-top: 10px;
                            font-weight: bold;
                        }

                        footer {
                            margin-top: 25px;
                            color: #888;
                            font-size: 13px;
                            line-height: 2;
                        }

                        footer strong {
                            color: #764ba2;
                            font-size: 15px;
                        }
                    </style>
                </head>

                <body>
                    <div class="contenedor">
                        <div class="icono">☁️</div>

                        <h1>¡Bienvenido a mi proyecto!</h1>

                        <p>
                            Esta es mi aplicación web
                            desarrollada con Java.
                        </p>

                        <p>
                            Utilizo Amazon Web Services para
                            publicar mi proyecto en la nube.
                        </p>

                        <div class="estado">
                            ● Aplicación en funcionamiento
                        </div>

                        <div class="fecha">
                            Fecha del servidor:<br>
                            FECHA_AQUI
                        </div>

                        <footer>
                            Proyecto académico | Java + AWS
                            <br>
                            <strong>Hecho por:BJMD</strong>
                        </footer>
                    </div>
                </body>
                </html>
                """.replace("FECHA_AQUI", fecha);

            byte[] respuesta = html.getBytes(StandardCharsets.UTF_8);

            intercambio.getResponseHeaders().set(
                "Content-Type", "text/html; charset=UTF-8"
            );

            intercambio.sendResponseHeaders(200, respuesta.length);

            try (OutputStream salida = intercambio.getResponseBody()) {
                salida.write(respuesta);
            }
        });

        servidor.start();

        System.out.println(
            "Aplicación iniciada en el puerto " + puerto
        );
    }
}
```