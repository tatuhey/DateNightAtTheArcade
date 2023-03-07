class Card {

    var creditBalance: Int
    var ticketBalance: Int
    var cardNumber: Int

    constructor(){
        creditBalance = 0
        ticketBalance = 0
        cardNumber = incrementID()
    }

    companion object {
        var cardID: Int = 0

        fun incrementID(): Int {
            cardID ++
            return cardID
        }
    }





}