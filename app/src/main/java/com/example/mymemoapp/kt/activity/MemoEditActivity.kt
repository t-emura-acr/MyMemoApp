package com.example.mymemoapp.kt.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mymemoapp.R
import com.example.mymemoapp.kt.fragment.MemoEdit

class MemoEditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.memo_edit)

        //初期化処理
        initView()

        //フラグメント処理
        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(R.id.layout_memoedit_frg, MemoEdit())

        transaction.addToBackStack(null)

        transaction.commit()

    }

    private fun initView(){

        //リスナ登録
        val MemoRegistBtn: View = findViewById(R.id.Save_Memo_btn)

        //押下時処理
        MemoRegistBtn.setOnClickListener{

            Log.i("保存","保存")

        }


    }
}