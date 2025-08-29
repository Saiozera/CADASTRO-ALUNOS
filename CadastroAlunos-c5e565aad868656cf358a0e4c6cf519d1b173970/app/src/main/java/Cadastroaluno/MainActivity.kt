package Cadastroaluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import Cadastroaluno.models.Aluno
import br.saio.cadastroalunos.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.CadastroRA)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtNomeA = findViewById<EditText>(R.id.edt_nome_aluno)
        val btnContinuar = findViewById<Button>(R.id.btn_continuar)
        var aluno: Aluno = Aluno("", null)


        btnContinuar.setOnClickListener {
            val nome = edtNomeA.text.toString()
            aluno = Aluno(nome,null)

            val intent= Intent(this, CadastroRA::class.java)
            intent.putExtra("aluno", aluno.toString())
            startActivity(intent)



        }

    }
}