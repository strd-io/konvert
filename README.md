# Konvert

Essa é uma biblioteca de modelo utilizada para demontrar como criar e publicar uma lib no GitHub Packages utilizando o fluxo de trabalho no GitHub Actions para automatizar o processo de teste e release.

## 🚀 Sobre

O Konvert possui duas funções:

Uma que converte a *string* para snake case e outra para camel case.

## ⚙️ Configurando

Você pode configurar as credenciais no arquivo ou no gradle.properties.

Arquivo: build.gradle.kts

```gradle
repositories {
    // ...
    maven {
        url = uri("https://maven.pkg.github.com/Wechoo/konvert")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
        }
    }
}

dependencies {
    // ...
    implementation("io.wechoo:konvert:1.0.0")
    // ...
}
```

### 🖥️ Utilizando

```kotlin
import io.wechoo.Konvert

fun main() {
    val scenario = Konvert().toSnakeCase("KonVert")
    println(scenario)
    // result: kon_vert
}
```
