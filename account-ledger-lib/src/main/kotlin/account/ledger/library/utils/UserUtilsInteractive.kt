package account.ledger.library.utils

import account.ledger.library.models.UserCredentials
import common.utils.library.utils.ConsoleInputUtils

object UserUtilsInteractive {

    @JvmStatic
    fun getUserCredentials(): UserCredentials {

        val user = UserCredentials(username = "", passcode = "")
        print("Enter Your Username : ")
        user.username = ConsoleInputUtils.readlnOrNull().toString()
        print("Enter Your Password : ")
        user.passcode = ConsoleInputUtils.readlnOrNull().toString()
        return user
    }
}
