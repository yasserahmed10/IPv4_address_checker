fun validIPv4(ip: String): Boolean {
    if (ip.isEmpty()) return false
    if (!ip.contains(".")) return false
    val parts = ip.split('.')
    if (parts.size != 4) return false
    for (p in parts) {
        if (p.isEmpty()) return false
        if (p.toIntOrNull() == null) return false
        val num = p.toInt()
        if (num < 0 || num > 255) return false
        if (p.length > 1 && p.startsWith("0")) return false
    }
    return true
}

fun main() {
    println(validIPv4("192.168.0.1")) 
    println(validIPv4("0.0.0.0")) 
    println(validIPv4("255.255.255.255"))
    println(validIPv4("192.168.1.01"))
    println(validIPv4("256.100.100.100"))
    println(validIPv4("192.168.1"))
    println(validIPv4("192.168.1.a"))
    println(validIPv4("")) 
    println(validIPv4("192.168.1.1.1"))
}
