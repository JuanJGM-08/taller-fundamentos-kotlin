package ejercicios

object Constants {
    const val VELOCIDAD_LUZ = 299792458
}

fun ejecutarBloque1() {
    println("\n=== BLOQUE 1: VARIABLES ===")

    // 1. Aca se vera el perfil del usuario
    val nombre = "Juan Jose"
    var ciudad = "Bello"
    println("1. Nombre: $nombre, Ciudad inicial: $ciudad")
    ciudad = "Medellín"
    println("   Ciudad cambiada a: $ciudad")

    // 2. Se hara la calculacion de los años
    val anioNacimiento = 2008
    val anioActual = 2026
    val edad = anioActual - anioNacimiento
    println("2. Año nacimiento: $anioNacimiento, Edad aproximada: $edad")

    // 3. Se veran los tipos explicitos
    val precioCoche: Double = 25000.50
    val pesoNaranja: Float = 0.25f
    val poblacionMundial: Long = 8000000000L
    println("3. Coche: $$precioCoche, Naranja: ${pesoNaranja}kg, Población: $poblacionMundial")

    // 4. Aca saldran los datos de inferencia
    val estaLloviendo = false
    println("4. ¿Está lloviendo? $estaLloviendo (Tipo inferido: ${estaLloviendo::class.simpleName})")

    // 5. Y las contantes reales
    println("5. Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
}