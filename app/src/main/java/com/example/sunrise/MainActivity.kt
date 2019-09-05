package com.example.sunrise

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.support.v7.widget.RecyclerView
//import android.view.View
//import android.content.Intent
//import android.support.v7.widget.LinearLayoutManager
//import android.widget.*
//import retrofit2.converter.gson.GsonConverterFactory
//import retrofit2.Retrofit
//import com.google.gson.GsonBuilder
//import okhttp3.ResponseBody
//import android.widget.Toast
//import android.util.Log
//import android.widget.ArrayAdapter
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response

// account password is sunrise

class MainActivity : AppCompatActivity() {


//    private var stackoverflowAPI :StackOverflowAPI? = null
//    private var token: String? = null
//    private var authenticateButton: Button? = null
//    private var questionsSpinner: Spinner? = null
//    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val controller = Controller()
//        controller.start()
//        val rssController:RSSController = RSSController()
//        rssController.start()
//
//        questionsSpinner = findViewById<View>(R.id.questions_spinner) as Spinner
//        questionsSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//                Toast.makeText(this@MainActivity, "Spinner item selected", Toast.LENGTH_LONG).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {
//
//            }
//        }
//
//        val question:List<Question> = FakeDataProvider.getQuestions();
//        var arrayAdapter:ArrayAdapter<Question> = ArrayAdapter<Question>(this,
//            android.R.layout.simple_spinner_dropdown_item, question)
//
//
//
//        authenticateButton = findViewById<View>(R.id.authenticate_button) as Button
//
//        recyclerView = findViewById<View>(R.id.list) as RecyclerView
//        recyclerView!!.setHasFixedSize(true)
//        recyclerView!!.layoutManager = LinearLayoutManager(this@MainActivity)
//
//        val answer:List<Answer> = FakeDataProvider.getAnswers()
//        val adapter:RecyclerViewAdapter = RecyclerViewAdapter(answer)
//
//        recyclerView!!.setAdapter(adapter) //todo check



    }


//    override fun onResume() {
//        super.onResume()
//        if (token != null) {
//            authenticateButton!!.isEnabled = false
//        }
//    }
//
//    override fun onClick(v: View?) {
//        when (v!!.getId()) {
//            android.R.id.text1 -> if (token != null) {
//                //TODO
//            } else {
//                Toast.makeText(this, "You need to authenticate first", Toast.LENGTH_LONG).show()
//            }
//            R.id.authenticate_button -> {
//            }
//        }// TODO
//    }
//
//    private fun createStackoverflowAPI() {
//        val gson = GsonBuilder()
//            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
//            .create()
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl(StackOverflowAPI.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .build()
//
//        stackoverflowAPI = retrofit.create(StackOverflowAPI::class.java)
//    }
//
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        if (resultCode == Activity.RESULT_OK && requestCode == 1) {
//            token = data!!.getStringExtra("token")
//        }
//    }
//
//    var questionsCallback: Callback<ListWrapper<Question>> = object : Callback<ListWrapper<Question>> {
//        override fun onResponse(call: Call<ListWrapper<Question>>, response: Response<ListWrapper<Question>>) {
//            if (response.isSuccessful()) {
//                val questions = response.body()
//                val arrayAdapter = ArrayAdapter<Question>(
//                    this@MainActivity,
//                    android.R.layout.simple_spinner_dropdown_item,
//                    questions.items
//                )
//                questionsSpinner!!.setAdapter(arrayAdapter)
//            } else {
//                Log.d("QuestionsCallback", "Code: " + response.code() + " Message: " + response.message())
//            }
//        }
//
//        override fun onFailure(call: Call<ListWrapper<Question>>, t: Throwable) {
//            t.printStackTrace()
//        }
//    }
//
//    var answersCallback: Callback<ListWrapper<Answer>> = object : Callback<ListWrapper<Answer>> {
//        override fun onResponse(call: Call<ListWrapper<Answer>>, response: Response<ListWrapper<Answer>>) {
//            if (response.isSuccessful()) {
//                val data:MutableList<Answer>? = null //this ListWrapper or just answer
//                data!!.addAll(response.body().items)
//                recyclerView!!.setAdapter(RecyclerViewAdapter(data))
//            } else {
//                Log.d("QuestionsCallback", "Code: " + response.code() + " Message: " + response.message())
//            }
//        }
//
//        override fun onFailure(call: Call<ListWrapper<Answer>>, t: Throwable) {
//            t.printStackTrace()
//        }
//    }
//
//    var upvoteCallback: Callback<ResponseBody> = object : Callback<ResponseBody> {
//        override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
//            if (response.isSuccessful()) {
//                Toast.makeText(this@MainActivity, "Upvote successful", Toast.LENGTH_LONG).show()
//            } else {
//                Log.d("QuestionsCallback", "Code: " + response.code() + " Message: " + response.message())
//                Toast.makeText(this@MainActivity, "You already upvoted this answer", Toast.LENGTH_LONG).show()
//            }
//        }
//
//        override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//            t.printStackTrace()
//        }
//    }



}
