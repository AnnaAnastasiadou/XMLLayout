package com.example.xmllayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.xmllayout.adapter.UserAdapter
import com.example.xmllayout.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userList = listOf(
            User("John Doe", "john@example.com"),
            User("Jane Smith", "jane@example.com"),
            User("Robert Brown", "robert@example.com"),
            User("Emily Johnson", "emily@example.com"),
            User("Michael Lee", "michael@example.com"),
            User("Sarah Wilson", "sarah@example.com"),
            User("David Miller", "david@example.com"),
            User("Laura Adams", "laura@example.com")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewUsers)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = UserAdapter(userList)
        recyclerView.adapter = adapter
    }
}