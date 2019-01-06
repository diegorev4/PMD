![alt text](https://pmd.github.io/img/pmd_logo.png)
# 1. PMD

PMD es un analizador de código fuente estático. El analizador utliza reglas que pueden ser configuradas por el progrmador. Existe un conjunto de reglas básico y es posible implementar nuevas reglas adpatadas a las necesidadesde cada proyecto, es posible indicar la prioridad de cada regla. PMD es capaz de analizar código desde la ejecución y detectar posibles bugs, código muerto, código duplicado, ifs innecesarios, código poco óptimo y otros fallos. Está integrado con los principales IDEs como JDeveloper, Eclipse, jEdit, JBuilder, BlueJ, CodeGuide, NetBeans / Sun Java Studio Enterprise / Creador e IntelliJ IDEA, entre otros. La herramienta contemplamultitud de reglas, pudiéndose crear nuevas reglas.

## 2. Instalación

PMD se encuentra disponible en un gran número de IDEs, en esta guia se muestran los pasos para instalar el plugin en Eclipse y Android Studio (IDEA). Tambien es posible utilizar PMD mediante linea de comandos. En la pagina web oficial de PMD se encuentran más tutoriales para otros entornos. https://pmd.github.io/ 

### 2.1 Eclipse 

La descripción para instalar el plugin de PMD en eclipse se detalla a continuación:

1. Abrir Eclipse.
2. Seleccionar la pestaña "Help", dentro de la pestaña hay dos formas de instalar el plugin. 

Primera Opción. 

1. Seleccionar "Install Software".
2. En la ventana abierta pulsar el botón "Add..."
3. En los campos introducir: Name: "PMD"  Location: https://dl.bintray.com/pmd/pmd-eclipse-plugin/updates/
4. Seleccionar PMD for Eclipse y pulsar "Next".
5. Pulsar "Next" de nuevo.
6. Aceptar los términos y condiciones.


Segunda Opción.

1. Seleccionar "Eclipse MarketPlace".
2. Poner "pmd" en el buscador.
3. Seleccionar "pmd-eclipse-plugin 4.0.18".
4. Aceptar los términos y condiciones.

Al finalizar la instalación se recomienda reiniciar Eclipse para evitar posibles problemas.
### 2.2 Android Studio (IntelliJ IDEA)

Para la instalación del plugin en Android Studio se utilizará el plugin QAPlug, este plugin se encuentra en los IDEs de Intellij IDEA para controlar la calidad del código desarrollado, este plugin integra, además de PMD, Checkstyle, Findbugs y Hammurapi. Estas herramientas se pueden instalar todas o por separado, en este taller se instalará solamente la herramienta PMD.

1. Abrir Android Studio.
2. Seleccionar "File" en la barra superior, dentro del desplegable seleccionar "Settings".
3. Se abrirá una nueva ventana, en ella ir a "Plugins", dentro seleccionar "Browse repositories...", se encuentra en la parte inferior.
4. En la ventana desplegada introducir "QAPlug" en el buscador.
5. Seleccionar "QAPlug" y pulsar "Install".
6. Seleccionar "QAPlug - PMD" y pulsar "Install"
7. Reiniciar el IDE.

## 3. Uso del Software sobre Android Studio

El uso del software es similar en ambos IDEs pero la parte del taller de analizar el código en busca de fallos se desarrollará sobre Android Studio, además el código que se va a analizar es el desarrollado durante el proyecto integrado.

En el taller se analizará el código de todo el proyecto, se solucionara algún error surgido, posteriormente se revisaran las reglas y se añadirán o eliminara algunas y se volverá a analizar solo algún fichero concreto en busca de fallos.

### 3.1 Análisis

Vamos a analizar el código generado durante el proyecto, sin contar los test. Para ello seguiremos este guión.

1. Sobre la carpeta "com.unican.proyectobase", la cual contiene las carpetas "model", "presenter" y "views".
2. Botón derecho y seleccionamos "Analyze" y "Analyze code..."
3. En la ventana generada se puede seleccionar el modulo "app" (todo el proyecto) o el directorio desde el que hemos clickado. La opción "Whole Project" revisa clases generadas en el build que no son "editables", por lo que nos dará mas errores de los que podemos tratar.
4. Elegimos el perfil por defecto y pulsamos "OK"


### 3.2 Solucionar errores

Tras seleccionar un error se muestra una pequeña descripción de cual es el problema con este trozo de código, si pulsamos dos veces encima del error nos lleva a la linea de que ha producido el error y podríamos solucionarlo.

Una vez solucionados los errores que se pretende solucionar es necesario volver a ejecutar el análisis (no se ejecuta automáticamente al guardar), en la parte izquierda de la ventana que contiene los errores hay un botón que nos permite ejecutar de nuevo el análisis.

### 3.3 Modificar reglas y creación de perfil

Vamos a crear un perfil nuevo unas reglas distintas al perfil por defecto.

1. Entrar en "File" > "Settings" > "Other Settings" > "QAPlug" > "Coding Rules"
2. Seleccionar el "+" superior para añadir un nuevo perfil o seleccionar el perfil por defecto para modificarlo ("Project profiles" > "Project default".
3. Click "Project profile" para crear un perfil solo para el proyecto abierto o "IDE profile" para que sea utilizado en cualquier proyecto.
4. Introducir un nombre que haga referencia al perfil.
5. En la lista de reglas seleccionar aquellas que más interesen.


### 3.4 Analisis de un fichero con un perfil personalizado

1. Botón derecho sobre un archivo .java del proyecto android.
2. Seleccionar "Analyze" > "Analayze Code..." .
3. En la parte inferior seleccionamos el perfil creado y pulsamos "OK".

## 4. Uso del Copy Paste Detector en Eclipse

Es necesario tener instalado el plugin de PMD para eclipse, se puede ver los pasos a seguir en el punto 2.1.

Para la realización de esta parte es necesario bajarse el código de ejemplo que se encuentra en este repositorio. No es necesario importar el proyecto a eclipse.

1. En el IDE ir a "Window" > "Preferences" > "PMD" > "CPD Preferences".
2. Seleccionar "Launch CPD".
3. Seleccionar "Browse" y buscar el directorio donde se encuentra el código a comprobar.
4. Seleccionar en "Lenguage" el lenguaje de programación del código (Java en este caso).

## Autor
Diego Revuelta Hoz
