<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi aplicación PHP</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background: #f0f4f8;
            padding: 80px 20px;
        }
        .contenedor {
            background: white;
            padding: 35px;
            border-radius: 15px;
            max-width: 600px;
            margin: auto;
            box-shadow: 0 4px 12px #cccccc;
        }
        h1 { color: #232f3e; }
        p { color: #444444; }
    </style>
</head>
<body>
    <div class="contenedor">
        <h1>¡Mi aplicación PHP funciona!</h1>
        <p>Bienvenido a mi primera aplicación en AWS. Actualizacion</p>
        <p>Desplegada con Elastic Beanstalk.</p>
        <p>Fecha y hora: <?php echo date("d/m/Y H:i:s"); ?></p>
    </div>
</body>
</html>
