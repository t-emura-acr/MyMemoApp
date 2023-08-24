package com.example.mymemoapp.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymemoapp.R
import com.example.mymemoapp.activity.fragment.MemoEdit


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        初期化処理
        initView()

        setRecyclerView()

    }

    private fun initView(){

//        新規作成ボタン
        val createNewMemo: View = findViewById(R.id.Create_Memo_btn)

//        押下時処理
        createNewMemo.setOnClickListener{
            Log.i("新規作成","新規作成")

//            トランザクション機能
            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id.layout_memoedit_frg, MemoEdit())

            transaction.addToBackStack(null)

            transaction.commit()
        }
    }

    private fun setRecyclerView(){
        val memoList = ""

        val recyclerView: RecyclerView = findViewById(R.id.memoList)

//        val adapter = WordlistAdapter(memoList)
//        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

}