package Cadastroaluno

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.saio.cadastroalunos.R
import kotlin.random.Random

class CadastroRA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro_ra)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.CadastroRA)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txvAlunoC = findViewById<TextView>(R.id.txv_aluno_cadastrado)
        val btnGerarRA = findViewById<Button>(R.id.btn_ra)
        val txvRA = findViewById<TextView>(R.id.txv_ra_gerado)

        val aluno = intent.getStringExtra("aluno")
        txvAlunoC.text = "Aluno cadastrado: $aluno"

        btnGerarRA.setOnClickListener {
            val RA = gerarRA()
            txvRA.text = "RA gerado: $RA"
        }



    }

    fun gerarRA(): Int {
        return Random.nextInt(0,999999)
    }

}