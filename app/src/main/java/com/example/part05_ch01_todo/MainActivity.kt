package com.example.part05_ch01_todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


/*

 01. MVP, MVVM, 구글 아키텍쳐 함께 보기
ViewModel : 프래그먼트나 액티비티 같은 특정 UI 구성요소에 관한 데이터를 제공하고 모델과 커뮤니케이션하기 위한 데이터처리 비즈니스 로직을 포함
뷰모델은 UI 구성요소에 관해 알지 못하기때문에 구성 변경(예를 들어 기기 회전)에 대한 영향을 받지 않는다.




 02. DI소개 , Koin 사용하기
 03. 시나리오를 기반으로 TDD코드 작성하기
 04. Todo리스트, 상세화면 구현하기


 */