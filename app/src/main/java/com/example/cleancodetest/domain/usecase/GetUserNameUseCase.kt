package com.example.cleancodetest.domain.usecase

import com.example.cleancodetest.domain.models.UserName

class GetUserNameUseCase {
    fun execute(): UserName {
      return UserName(firstName = "Arthur", lastname = "Altynbaev")
    }
}
