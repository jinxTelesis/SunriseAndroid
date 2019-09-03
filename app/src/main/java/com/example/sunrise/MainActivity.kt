package com.example.sunrise

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.widget.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var token: String? = null
    private var authenticateButton: Button? = null
    private var questionsSpinner: Spinner? = null
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val controller = Controller()
        controller.start()
        val rssController:RSSController = RSSController()
        rssController.start()

        questionsSpinner = findViewById<View>(R.id.questions_spinner) as Spinner
        questionsSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, "Spinner item selected", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }

        val question:List<Question> = FakeDataProvider.getQuestions();
        var arrayAdapter:ArrayAdapter<Question> = ArrayAdapter<Question>(this,
            android.R.layout.simple_spinner_dropdown_item, question)



        authenticateButton = findViewById<View>(R.id.authenticate_button) as Button

        recyclerView = findViewById<View>(R.id.list) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = LinearLayoutManager(this@MainActivity)

        val answer:List<Answer> = FakeDataProvider.getAnswers()
        var adapter:RecyclerViewAdapter = RecyclerViewAdapter(answer)

        recyclerView!!.setAdapter(adapter) //todo check



    }


    override fun onResume() {
        super.onResume()
        if (token != null) {
            authenticateButton!!.isEnabled = false
        }
    }


    override fun onClick(v: View) {
        when (v.id) {
            android.R.id.text1 -> if (token != null) {
                // TODO
            } else {
                Toast.makeText(this, "You need to authenticate first", Toast.LENGTH_LONG).show()
            }
            R.id.authenticate_button -> {
            }
        }// TODO
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK && requestCode == 1) {
            token = data!!.getStringExtra("token")
        }
    }



}
