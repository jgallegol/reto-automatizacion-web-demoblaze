# Automatizacion Web DemoBlaze

## Descripcion

Proyecto de automatizacion web desarrollado utilizando:

- Serenity BDD
- Screenplay Pattern
- Cucumber
- Gradle
- Selenium

## Flujos automatizados

### Login exitoso

Valida el acceso correcto de un usuario en DemoBlaze.

### Compra exitosa de producto

Valida el flujo completo de compra:

- Seleccion de producto
- Agregar al carrito
- Place Order
- Purchase
- Confirmacion de compra exitosa

## Ejecucion

Ejecutar todas las pruebas:

```bash

.\gradlew.bat clean test

```
## Aplicacion bajo prueba

URL: https://www.demoblaze.com

## Escenarios automatizados

### Login exitoso

- Abrir DemoBlaze
- Iniciar sesion
- Validar mensaje Welcome Admin

### Compra exitosa

- Seleccionar producto
- Agregar al carrito
- Completar formulario de compra
- Confirmar compra
- Validar mensaje de compra exitosa

## Evidencias

Los resultados de ejecucion pueden consultarse en:

target/index.html

El reporte Serenity incluye:

- Resultado de ejecucion
- Capturas de pantalla
- Trazabilidad de pasos
- Duracion de escenarios

## Versiones utilizadas

- Java 21
- Gradle 8.5
- Serenity BDD 4.x
- Cucumber 7.x
- Selenium WebDriver 4.x

# 🚀 Arquetipo Base de Automatización Web - Serenity BDD

## 📋 Descripción

Este proyecto es un **arquetipo base de automatización** diseñado para que analistas QA puedan automatizar pruebas web de manera eficiente y escalable. Utiliza **Serenity BDD** con **Cucumber** y el patrón **Screenplay** para crear pruebas mantenibles y legibles.

## 🎯 Objetivo

Proporcionar una estructura base que permita a candidatos o analistas QA automatizar cualquier aplicación web siguiendo las mejores prácticas de la industria.

## 🛠️ Stack Tecnológico

- **Java 11+** - Lenguaje de programación
- **Serenity BDD 4.0.12** - Framework de automatización y reporting
- **Cucumber 7.14.0** - BDD framework para escribir pruebas en Gherkin
- **Selenium WebDriver 4.17.0** - Automatización de navegadores
- **Gradle** - Gestión de dependencias y construcción
- **WebDriverManager** - Gestión automática de drivers
- **Lombok** - Reducción de código boilerplate
- **JavaFaker** - Generación de datos de prueba

## 📁 Estructura del Proyecto

```
ProyectoBaseSPCandidato/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com.co.choucair/
│   │           ├── interactions/    # Interacciones personalizadas
│   │           ├── model/           # Clases de modelo/datos
│   │           ├── questions/       # Questions del patrón Screenplay
│   │           ├── tasks/           # Tasks del patrón Screenplay
│   │           ├── ui/              # Page Objects / Elementos UI
│   │           └── utils/           # Utilidades generales
│   └── test/
│       ├── java/
│       │   ├── runners/             # Test Runners de Cucumber
│       │   └── stepdefinitions/     # Definición de pasos Gherkin
│       └── resources/
│           ├── features/            # Archivos .feature en Gherkin
│           └── serenity.conf        # Configuración de Serenity
├── build.gradle                     # Configuración de Gradle
├── serenity.properties             # Propiedades de Serenity
└── README.md                        # Este archivo
```

## 🚦 Inicio Rápido

### Prerrequisitos

```bash
# Verificar Java
java -version  # Debe ser 11 o superior

# Verificar Gradle
gradle -v      # O usar ./gradlew incluido
```

### Instalación

```bash
# Clonar el repositorio
git clone [URL_DEL_REPOSITORIO]
cd ProyectoBaseSPCandidato

# Instalar dependencias
gradle clean build

# Ejecutar pruebas de ejemplo
gradle test
```

### Ejecución de Pruebas

```bash
# Ejecutar todas las pruebas
gradle clean test aggregate

# Ejecutar pruebas con tags específicos
gradle test -Dcucumber.filter.tags="@smoke"
gradle test -Dcucumber.filter.tags="@regression"

# Ejecutar en navegador específico
gradle test -Dwebdriver.driver=firefox

# Generar reporte
gradle aggregate
```

## 📊 Criterios Mínimos de Automatización

### ✅ Pruebas de Adherencia (Smoke Tests)
*Verificación básica de que el sistema está operativo*

| # | Criterio | Tag Sugerido | Prioridad |
|---|----------|--------------|-----------|
| 1 | Validar que la URL principal carga sin errores (HTTP 200) | `@smoke` | CRÍTICA |
| 2 | Comprobar certificado SSL válido (o página carga correctamente) | `@smoke` | ALTA |
| 3 | Usuario válido accede correctamente | `@smoke @auth` | CRÍTICA |
| 4 | Desde el home se puede acceder a página secundaria crítica | `@smoke @navigation` | ALTA |
| 5 | Enviar formulario con datos válidos | `@smoke @forms` | ALTA |
| 6 | Verificar carga de CSS/JS principales y recurso multimedia | `@smoke @resources` | MEDIA |
| 7 | Apertura en al menos 2 navegadores (Chrome + Firefox) | `@smoke @crossbrowser` | ALTA |

### 🔧 Pruebas Funcionales
*Validación completa de funcionalidades del sistema*

| # | Criterio | Tag Sugerido | Área |
|---|----------|--------------|------|
| 1 | **Navegación global**: menú y enlaces principales funcionan | `@functional @navigation` | Navegación |
| 2 | **Rutas críticas**: flujos happy path completos | `@functional @critical` | Core Business |
| 3 | **Autenticación**: login válido/inválido/bloqueo | `@functional @auth` | Seguridad |
| 4 | **Recuperación de contraseña**: flujo completo | `@functional @password` | Seguridad |
| 5 | **Gestión de sesión**: expiración y redirección | `@functional @session` | Seguridad |
| 6 | **Validación de formularios**: campos obligatorios, tipos, máscaras | `@functional @forms` | Entrada de Datos |
| 7 | **Validación server vs client**: mensajes consistentes | `@functional @validation` | Entrada de Datos |
| 8 | **Gestión de archivos**: subida/descarga con validaciones | `@functional @files` | Archivos |
| 9 | **Búsqueda/filtrado/paginación**: incluye "sin resultados" | `@functional @search` | Consultas |
| 10 | **Ordenamiento de tablas**: asc/desc estable | `@functional @tables` | Visualización |
| 11 | **Estados vacíos y errores**: 404/500 personalizados | `@functional @errors` | UX |
| 12 | **Internacionalización**: formato fecha, moneda, separadores | `@functional @i18n` | Localización |

### 🌐 Pruebas de Compatibilidad
*Asegurar funcionamiento en diferentes entornos*

| # | Criterio | Tag Sugerido | Cobertura |
|---|----------|--------------|-----------|
| 1 | **Navegadores objetivo**: Chrome, Firefox, Safari, Edge | `@compatibility @browsers` | Multi-browser |
| 2 | **Responsive design**: xs, sm, md, lg breakpoints | `@compatibility @responsive` | Multi-device |
| 3 | **Inputs HTML5**: comportamiento consistente | `@compatibility @html5` | Estándares |
| 4 | **Cookies/LocalStorage**: habilitado y deshabilitado | `@compatibility @storage` | Configuración |
| 5 | **Fuentes/íconos**: carga correcta y fallbacks | `@compatibility @assets` | Recursos |
| 6 | **Compatibilidad móvil**: gestos básicos | `@compatibility @mobile` | Touch devices |
| 7 | **Soporte RTL**: verificación si aplica | `@compatibility @rtl` | Idiomas |
| 8 | **Impresión CSS**: páginas críticas | `@compatibility @print` | Salida |

## 🎭 Patrón Screenplay

### Estructura de una Prueba

```gherkin
Feature: Login test
  
  Scenario Outline: testing the successful login
    Given the user is on the serenity demo page
    When attempts to log in
      | user   | pass   |
      | <user> | <pass> |
    Then validate the text on screen <message>
    
    Examples:
      | user  | pass     | message   |
      | admin | serenity | Dashboard |
```

### Implementación con Screenplay

```java
// Task
public class Login implements Task {
    public static Login withCredentials(String user, String password) {
        return instrumented(Login.class, user, password);
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(user).into(USERNAME_FIELD),
            Enter.theValue(password).into(PASSWORD_FIELD),
            Click.on(LOGIN_BUTTON)
        );
    }
}

// Question
public class DashboardMessage implements Question<String> {
    public static DashboardMessage displayed() {
        return new DashboardMessage();
    }
    
    @Override
    public String answeredBy(Actor actor) {
        return DASHBOARD_MESSAGE.resolveFor(actor).getText();
    }
}
```

## 🌟 Características Avanzadas

### Selenium Grid Support

El proyecto está preparado para ejecutarse en **Selenium Grid** para pruebas paralelas y distribuidas:

```properties
# serenity.conf
webdriver {
  remote {
    url = "http://selenium-hub:4444/wd/hub"
    driver = chrome
  }
  capabilities {
    browserName = "chrome"
    version = "latest"
    platform = "LINUX"
    maxInstances = 5
  }
}
```

**Ventajas de usar Selenium Grid:**
- ✅ **Ejecución paralela** - Reduce tiempo de ejecución hasta 70%
- ✅ **Multi-browser testing** - Pruebas simultáneas en diferentes navegadores
- ✅ **Escalabilidad horizontal** - Añadir nodos según demanda
- ✅ **CI/CD optimizado** - Integración perfecta con pipelines
- ✅ **Gestión centralizada** - Un único punto de control
- ✅ **Ahorro de recursos** - Distribución de carga entre máquinas

### Ejecución con Docker Compose

```yaml
# docker-compose.yml
version: '3'
services:
  selenium-hub:
    image: selenium/hub:latest
    ports:
      - "4444:4444"
  
  chrome:
    image: selenium/node-chrome:latest
    depends_on:
      - selenium-hub
    environment:
      - HUB_HOST=selenium-hub
    deploy:
      replicas: 3
  
  firefox:
    image: selenium/node-firefox:latest
    depends_on:
      - selenium-hub
    environment:
      - HUB_HOST=selenium-hub
    deploy:
      replicas: 2
```

## 📈 Reportes

### Serenity Reports
Los reportes se generan automáticamente en `target/site/serenity/`:
- **index.html** - Reporte principal con resumen ejecutivo
- **capabilities.html** - Cobertura por funcionalidad
- **requirements.html** - Trazabilidad de requerimientos

### Visualización de Reportes
```bash
# Generar y abrir reporte
gradle aggregate
open target/site/serenity/index.html
```

## 🔄 Integración CI/CD

### Jenkins Pipeline Example
```groovy
pipeline {
    agent any
    stages {
        stage('Test') {
            parallel {
                stage('Chrome Tests') {
                    steps {
                        sh 'gradle test -Dwebdriver.driver=chrome'
                    }
                }
                stage('Firefox Tests') {
                    steps {
                        sh 'gradle test -Dwebdriver.driver=firefox'
                    }
                }
            }
        }
        stage('Report') {
            steps {
                sh 'gradle aggregate'
                publishHTML(target: [
                    reportDir: 'target/site/serenity',
                    reportFiles: 'index.html',
                    reportName: 'Serenity Report'
                ])
            }
        }
    }
}
```

## 📝 Mejores Prácticas

1. **Page Object Pattern**: Mantener selectores centralizados
2. **Data-Driven Testing**: Usar Examples en Cucumber
3. **Tags Strategy**: Organizar pruebas por categorías
4. **Explicit Waits**: Evitar Thread.sleep()
5. **Clean Code**: Nombres descriptivos y responsabilidad única
6. **Version Control**: Commit frecuentes con mensajes claros
7. **Test Independence**: Cada test debe ser autónomo
8. **Reporting**: Documentar fallos con screenshots
9. **Pipeline CI/CD**: Recuerda utilizar Azure DevOps, Jenkins.
10. **Escaneo SonarQube**: Siempre verifica que tu codigo siga las mejores practicas.
11. **Continuos Testing**: Entre mas se usen tus pruebas, mas rapido es el ROI (Retorno de inversión).
12. **Metricas**: Antes de codificar, piensa siempre en las metricas de exito o los KPI del proyecto.

## 🤝 Contribución

1. Fork el proyecto
2. Crea tu feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push al branch (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📚 Recursos Adicionales

- [Serenity BDD Documentation](https://serenity-bdd.github.io/docs/guide/user_guide_intro)
- [Cucumber Documentation](https://cucumber.io/docs)
- [Screenplay Pattern Guide](https://serenity-bdd.github.io/docs/screenplay/screenplay)
- [Selenium Grid Documentation](https://www.selenium.dev/documentation/grid/)

## 📧 Contacto

Para preguntas o sugerencias sobre este arquetipo, contactar al equipo de QA.

---

⚡ **Happy Testing!** ⚡