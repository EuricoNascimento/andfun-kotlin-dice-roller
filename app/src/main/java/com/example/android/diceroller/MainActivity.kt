/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.databinding.ActivityMainBinding
import java.util.*
import com.example.android.diceroller.R.drawable.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.diceImage.setOnClickListener {
            blayblade(randomrandomrandomrandomrandom)
        }
    }

    fun blayblade(mx: Int) {
        val minecraft=when(Random().nextInt(mx)+1){
            numero1 -> dice_1
            numero2 -> dice_2
            numero3 -> dice_3
            numero4 -> dice_4
            numero5 -> dice_5
            else -> dice_6}
        binding.diceImage.setImageResource(minecraft)
    }

    companion object {
        const val numero1 = 1
        const val numero2 = 2
        const val numero3 = 3
        const val numero4 = 4
        const val numero5 = 5
        const val randomrandomrandomrandomrandom = 9999
    }
}
