class Terminal {
    var prizeArray = listOf(
        PrizeCategory("Candy", 1, 10),
        PrizeCategory("Hat", 5, 10),
        PrizeCategory("Glasses", 3, 10)
    )
    val error1 : String = "Insufficient ticket credit."
    val error2 : String = "Prize is not available."
    val error3 : String = "Prize does not exist."

fun addCredits (creditUp: Card, money: Int){
        creditUp.creditBalance += money * 2
        println("The credit of card ${creditUp.cardNumber} now is ${creditUp.creditBalance}")
    }

    fun transferCredits (transfer1: Card, transfer2: Card){
        transfer1.creditBalance += transfer2.creditBalance
        transfer1.creditBalance = 0
        println("Credit balance of card ${transfer1.cardNumber} has successfully been transferred to card ${transfer2.cardNumber}.")
        println("Credit balance of card ${transfer1.cardNumber} is ${transfer1.creditBalance}.")
        println("Credit balance of card ${transfer2.cardNumber} is ${transfer2.creditBalance}.")

    }

    fun transferTickets (transfer1: Card, transfer2: Card){
        transfer1.ticketBalance += transfer2.ticketBalance
        transfer1.ticketBalance = 0
        println("Ticket balance of card ${transfer1.cardNumber} has successfully been transferred to card ${transfer2.cardNumber}.")
        println("Ticket balance of card ${transfer1.cardNumber} is ${transfer1.ticketBalance}.")
        println("Ticket balance of card ${transfer2.cardNumber} is ${transfer2.ticketBalance}.")
    }

    fun requestPrize (prize: String, balance: Card){
        prizeArray.forEach {
            if (it.prizeName == prize)
                if (it.prizeTally > 0)
                    if (balance.ticketBalance >= it.prizeTicketCost) {
                        balance.ticketBalance -= it.prizeTicketCost
                        it.prizeTally -= 1
                        println("You have chosen ${it.prizeName}, which cost ${it.prizeTicketCost} tickets. Your balance now is ${balance.ticketBalance}.")
                    }
                    else{
                        println(error1)
                    }
                else{
                    println(error2)
                }

        }
    }
}