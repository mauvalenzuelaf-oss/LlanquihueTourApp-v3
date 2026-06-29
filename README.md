![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Semana 6 - Evaluación Formativa N° 4 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Mauricio Francisco Valenzuela Fuentes
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la **Evaluación Formativa Nº 4** de la asignatura *Desarrollo Orientado a Objetos I*.

Se trata de una nueva ampliación de **LlanquihueTourApp**, en la cual se representan diferentes servicios turísticos ofrecidos por la empresa **Llanquihue Tour**.

En esta versión se aplican los siguientes conceptos de programación orientada a objetos:

- Encapsulamiento.
- Herencia simple.
- Uso de constructores mediante `super`.
- Sobrescritura de métodos.
- Polimorfismo.

El sistema se construye a partir de una clase general llamada `ServicioTuristico`, que contiene los atributos compartidos por todos los servicios:

```plaintext
nombre
duracionHoras
```

A partir de esta clase se crean tres subclases especializadas:

1. `RutaGastronomica`
2. `PaseoLacustre`
3. `ExcursionCultural`

Cada subclase hereda los atributos comunes de `ServicioTuristico` e incorpora un atributo específico relacionado con su tipo de actividad.

La clase `GestorServicios` crea dos objetos de cada subclase. Posteriormente, la clase `Main` almacena estos objetos en variables declaradas como `ServicioTuristico` y muestra su información en la consola, demostrando el uso de polimorfismo.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 LlanquihueTourApp-v3/
│
├── 📁 LlanquihueTourApp/
│   │
│   ├── 📄 LlanquihueTourApp.iml
│   │
│   └── 📁 src/
│       │
│       ├── 📁 data/
│       │   └── GestorServicios.java
│       │
│       ├── 📁 model/
│       │   ├── ServicioTuristico.java
│       │   ├── RutaGastronomica.java
│       │   ├── PaseoLacustre.java
│       │   └── ExcursionCultural.java
│       │
│       └── 📁 ui/
│           └── Main.java
│
├── 📄 .gitignore
│
└── 📄 README.md

```
Aclaración:

La carpeta `LlanquihueTourApp-v3` corresponde a la raíz del repositorio de GitHub.

La carpeta interior `LlanquihueTourApp` corresponde al proyecto que debe abrirse en IntelliJ IDEA. El código fuente está ubicado en `LlanquihueTourApp/src` y la clase principal se encuentra en `LlanquihueTourApp/src/ui/Main.java`.

---

## 🧩 Organización por paquetes

### 1. model

Contiene las clases que representan los servicios turísticos del sistema y su jerarquía de herencia.

```plaintext
ServicioTuristico.java:
Superclase que contiene los atributos comunes nombre y duracionHoras.

RutaGastronomica.java:
Subclase que representa una actividad gastronómica e incorpora el atributo numeroDeParadas.

PaseoLacustre.java:
Subclase que representa una actividad de navegación e incorpora el atributo tipoEmbarcacion.

ExcursionCultural.java:
Subclase que representa una actividad cultural e incorpora el atributo lugarHistorico.
```

### 2. data

Contiene la clase encargada de crear los objetos utilizados para probar el sistema.

```plaintext
GestorServicios.java:
Crea dos rutas gastronómicas, dos paseos lacustres y dos excursiones culturales.
```

Los métodos de esta clase devuelven objetos declarados como `ServicioTuristico`, aunque internamente crean instancias de las distintas subclases.

### 3. ui

Contiene la clase principal del programa.

```plaintext
Main.java:
Ejecuta el sistema, solicita al gestor la creación de los servicios turísticos y muestra sus datos en consola.
```
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```plaintext
git clone https://github.com/mauvalenzuelaf-oss/LlanquihueTourApp-v3.git
```

2. Abre la carpeta descargada:

```plaintext
LlanquihueTourApp-v3
```

3. Dentro de ella encontrarás otra carpeta llamada:

```plaintext
LlanquihueTourApp
```

4. Abre IntelliJ IDEA.

5. Selecciona la opción `Open`.

6. Busca y selecciona la carpeta interior:

```plaintext
LlanquihueTourApp-v3/LlanquihueTourApp
```

7. Verifica que el código fuente se encuentre en la carpeta:

```plaintext
src
```

8. Confirma que dentro de `src` se encuentren los paquetes:

```plaintext
data
model
ui
```

9. Ejecuta el archivo:

```plaintext
src/ui/Main.java
```
---

## 🖥️ Ejemplo abreviado de salida esperada por consola

```plaintext
=== SERVICIOS TURÍSTICOS LLANQUIHUE TOUR ===

--- RUTAS GASTRONÓMICAS ---
Nombre: En búsqueda del kuchen más grande del mundo | Duración: 4 horas | Número de paradas: 5
Nombre: Sabores del Lago Llanquihue | Duración: 3 horas | Número de paradas: 4

--- PASEOS LACUSTRES ---
Nombre: Paseo Lacustre en Pijamas | Duración: 2 horas | Tipo de embarcación: Catamarán
Nombre: Navegación por el Lago Todos los Santos | Duración: 5 horas | Tipo de embarcación: Lancha

--- EXCURSIONES CULTURALES ---
Nombre: Ruta de los colones alemanes | Duración: 2 horas | Lugar histórico: Museo Colonial Alemán de Frutillar
Nombre: Ruta patrimonial diurna | Duración: 3 horas | Lugar histórico: Iglesia del Sagrado Corazón
```
---
**Repositorio GitHub:** https://github.com/mauvalenzuelaf-oss/LlanquihueTourApp-v3

**Fecha de entrega:** 29/06/2026
