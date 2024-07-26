package io.wechoo

/**
 * Convert a camel case string into snake case format
 * @return snake case string
 */
class Konvert {
    fun toSnakeCase(value: String): String {
        val pattern = "(?<=.)[A-Z]".toRegex()
        return value.replace(pattern, "_$0").lowercase()
    }

    fun toCamelCase(value: String): String {
        val pattern = "_[a-z]".toRegex()
        return value.replace(pattern) { it.value.last().uppercase() }
    }
}
