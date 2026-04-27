package ejercicios

fun ejecutarBloque2() {
    println("\n=== BLOQUE 2: NULL SAFETY ===")

    // 6. el valor Opcional
    val apodo: String? = null
    println("6. Apodo: $apodo")

    // 7. se maneja el Operador "Juan"
    val resultadoApodo = apodo ?: "Sin apodo"
    println("7. Juan dice: $resultadoApodo")

    // 8. aca haremos Llamada Segura
    println("8. Longitud del apodo (segura): ${apodo?.length}")

    // 9. se hace uso de Let
    val correo: String? = "ejemplo@correo.com"
    print("9. ")
    correo?.let {
        println("Correo enviado a $it")
    } ?: println("No hay correo para enviar")

    // 10. Haremos una aserción No Nula
    val valorNoNulo: String? = "Kotlin"
    println("10. Longitud con !!: ${valorNoNulo!!.length}")
}