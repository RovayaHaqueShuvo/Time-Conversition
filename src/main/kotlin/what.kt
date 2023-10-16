import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement

fun main() {
    // Database connection information
    val url = "jdbc:your_database_url_here"
    val user = "your_username"
    val password = "your_password"

    try {
        // Establish a database connection
        val connection: Connection = DriverManager.getConnection(url, user, password)

        // Create a SQL statement
        val statement: Statement = connection.createStatement()

        // Execute the SQL query to retrieve customer names from 'customers' table with state 'RS'
        val query = "SELECT name FROM customers WHERE state = 'RS'"
        val resultSet = statement.executeQuery(query)

        // Iterate through the results and print the names
        while (resultSet.next()) {
            val name = resultSet.getString("name")
            println(name)
        }

        // Close the resources
        resultSet.close()
        statement.close()
        connection.close()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
