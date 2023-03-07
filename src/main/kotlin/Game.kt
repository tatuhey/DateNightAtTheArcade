import kotlin.random.Random

class Game (var gameCredit: Int){

    fun play(usecard: Card) {
        if ((usecard.creditBalance) >= gameCredit) {
            usecard.creditBalance -= gameCredit
            usecard.ticketBalance += Random.nextInt(0, 20)
        }
        else{
            println("Insufficient credit balance.")
        }


    }

}