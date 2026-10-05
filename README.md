# Desarrollo de Sistemas Móviles — Tarea 1: Android Basics with Compose

## Descripción del Proyecto
Este repositorio contiene la resolución integral de las **Rutas 1 y 3** de la **Unidad 1 de Android Basics with Compose**, desarrollada en el entorno oficial de Google Developers y Android Studio.

El objetivo de la entrega es evidenciar el dominio de la sintaxis y buenas prácticas del lenguaje **Kotlin**, así como la creación de interfaces de usuario modernas y declarativas utilizando **Jetpack Compose**.

---

## Estructura del Repositorio

```text
├── ruta1-kotlin/
│   ├── Ejercicio1_Impresion.kt
│   ├── Ejercicio2_ErrorCompilacion.kt
│   ├── Ejercicio3_PlantillasDeCadenas.kt
│   ├── Ejercicio4_ConcatenacionCadenas.kt
│   ├── Ejercicio5_FormatoMensajes.kt
│   ├── Ejercicio6_OperacionesMatematicas.kt
│   ├── Ejercicio7_ParametrosPredeterminados.kt
│   ├── Ejercicio8_Podometro.kt
│   ├── Ejercicio9_ComparacionDosNumeros.kt
│   ├── Ejercicio10_CodigoDuplicado.kt
│   └── PracticaFundamentosKotlin.kt
│
├── ruta3-kotlin/
│   └── HappyBirthday/                 # Proyecto completo de Android Studio
│       ├── app/
│       │   └── src/main/java/com/example/happybirthday/
│       │       └── MainActivity.kt    # Implementación de Composables (Box, Column, Row)
│       ├── build.gradle.kts
│       └── settings.gradle.kts
│
└── README.md
```

---

## Contenido Desarrollado por Rutas

### Ruta 1: Fundamentos de Kotlin
Desarrollada y testeada en Kotlin Playground. Incluye la resolución de problemas enfocados en:
1. **Inmutabilidad y mutabilidad:** Manejo correcto de `val` vs. `var`.
2. **Inferencia de tipos y plantillas de cadenas:** Uso de string templates (`$variable`).
3. **Modularización de funciones:** Definición de funciones puras, tipos de retorno y parámetros.
4. **Parámetros predeterminados y argumentos con nombre:** Flexibilidad en la invocación de métodos.
5. **Buenas prácticas de nomenclatura:** Aplicación estricta de la convención `camelCase`.
6. **Eliminación de código duplicado:** Refactorización aplicando el principio DRY (*Don't Repeat Yourself*).

### Ruta 3: Interfaz de Usuario con Jetpack Compose
Desarrollada en Android Studio utilizando la plantilla `Empty Activity`:
1. **Funciones Componibles (`@Composable`):** Declaración de la jerarquía visual con `GreetingCard`.
2. **Layouts estándar:**
   * `Box`: Contenedor principal para superposición de capas y definición del fondo visual.
   * `Column`: Organización y centrado vertical del mensaje principal y subtítulo.
   * `Row`: Distribución horizontal de los créditos y código de estudiante en los extremos inferiores.
3. **Previsualización (`@Preview`):** Renderizado en tiempo de diseño utilizando `showSystemUi = true`.

