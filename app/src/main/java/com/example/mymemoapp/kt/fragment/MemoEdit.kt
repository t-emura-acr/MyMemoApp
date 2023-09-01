package com.example.mymemoapp.kt.fragment

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mymemoapp.R

class MemoEdit : Fragment() {

    //フラグメントと関連付けられたとき
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach: called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView called")
        return inflater.inflate(R.layout.layout_memoedit_frg, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated called")
        val saveMemoBtn: View = view.findViewById(R.id.Save_Memo_btn)

        saveMemoBtn.setOnClickListener{
            Log.d(TAG, "save!")
        }
    }

//    フラグメントが切り離されたとき
    override fun onDetach(){
        super.onDetach()

    }
}
