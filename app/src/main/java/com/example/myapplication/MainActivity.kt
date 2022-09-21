package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var List = mutableListOf<String>()  //Создал изменяемую коллекцию

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = Grass()   //переменаая соответствующая классу травоядных
        val b = Meat()    //переменаая соответствующая классу плотоядных
            List.add(a.Cow)       //добавление элементов из классов в коллекцию(список)
            List.add(a.Giraffe)
            List.add(b.Tiger)
            List.add(b.Lion)



        val Print = findViewById<TextView>(R.id.TvText)  //назначаем переменной элемент вывода текста на экран
            Print.text = "$List"  //выводим текст на экран смартфона

            println(List)  //проверка в консоли


    }

    class Grass{                      //класс травоядных
        val Cow:String = "Корова"
        val Giraffe:String = "Жираф"
    }

    class Meat{                       //класс плотоядных
        val Lion:String = "Лев"
        val Tiger:String = "Тигр"
    }


}





