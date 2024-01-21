package com.example.cleancodetest.domain.usecase

import com.example.cleancodetest.domain.models.SaveUserNameParam

class SaveUserNameUseCase {
    fun execute(param: SaveUserNameParam): Boolean {
        if (param.name.isEmpty()){
            return false
        } else {
            return true
        }
    }
}