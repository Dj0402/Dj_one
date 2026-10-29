```php
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Proyecto en la Nube</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(135deg, #667eea, #764ba2);
            padding: 20px;
        }

        .contenedor {
            background: white;
            width: 100%;
            max-width: 650px;
            padding: 45px 30px;
            text-align: center;
            border-radius: 20px;
            box-shadow: 0 12px 35px rgba(0, 0, 0, 0.2);
        }

        .icono {
            font-size: 55px;
            margin-bottom: 15px;
        }

        h1 {
            color: #4c3b8f;
            margin-bottom: 15px;
        }

        p {
            color: #555;
            font-size: 17px;
            line-height: 1.7;
            margin-bottom: 12px;
        }

        .estado {
            display: inline-block;
            background: #e2fbe8;
            color: #18783a;
            padding: 9px 16px;
            border-radius: 25px;
            font-size: 14px;
            margin: 15px 0;
        }

        .fecha {
            background: #f3f0ff;
            padding: 15px;
            border-radius: 10px;
            color: #4c3b8f;
            margin-top: 15px;
            font-weight: bold;
        }

        footer {
            margin-top: 25px;
            color: #888;
            font-size: 13px;
            line-height: 1.8;
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
            Esta es mi aplicación web desarrollada con PHP.
        </p>

        <p>
            Estoy utilizando los servicios de Amazon Web Services
            para publicar mi proyecto en la nube.
        </p>

        <div class="estado">
            ● Aplicación en funcionamiento
        </div>

        <div class="fecha">
            Fecha del servidor:<br>
            <?php echo date("d/m/Y"); ?>
        </div>

        <footer>
            Proyecto académico | PHP + AWS Elastic Beanstalk
            <br>
            <strong>Hecho por: BJMD
            </strong>
        </footer>

    </div>
</body>
</html>
```