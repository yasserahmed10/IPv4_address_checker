Here is a `README.md` file for your repository:

```markdown
# IPv4 Validator

This project contains a simple Kotlin application to validate IPv4 addresses.

## Description

The application provides a function `validIPv4` that checks if a given string is a valid IPv4 address. It also includes a `main` function to test various IPv4 addresses.

## Getting Started

### Prerequisites

- Kotlin 1.5 or higher
- IntelliJ IDEA 2024.3.3 or any other Kotlin-compatible IDE

### Running the Application

1. Clone the repository:
    ```sh
    git clone https://github.com/yasserahmed10/ipv4-validator.git
    ```
2. Open the project in IntelliJ IDEA.
3. Navigate to `src/Main.kt`.
4. Run the `main` function to see the output of the IPv4 validation tests.

### Example Usage

The `validIPv4` function can be used as follows:

```kotlin
fun main() {
    println(validIPv4("192.168.0.1"))  // true
    println(validIPv4("0.0.0.0"))      // true
    println(validIPv4("255.255.255.255"))  // true
    println(validIPv4("192.168.1.01")) // false
    println(validIPv4("256.100.100.100")) // false
    println(validIPv4("192.168.1"))    // false
    println(validIPv4("192.168.1.a"))  // false
    println(validIPv4(""))             // false
    println(validIPv4("192.168.1.1.1")) // false
}
```

## Function Details

### `validIPv4`

This function takes a string `ip` and returns a boolean indicating whether the string is a valid IPv4 address.

#### Parameters

- `ip`: A string representing the IPv4 address to be validated.

#### Returns

- `true` if the string is a valid IPv4 address.
- `false` otherwise.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
```

This `README.md` file provides an overview of the project, instructions for running the application, example usage, and details about the `validIPv4` function.