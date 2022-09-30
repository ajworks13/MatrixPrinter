
fun main(){

    val charactersToDisplay = listOf("A","B","C","D","E","F","1","2","3","4","5","6","7","8","9","0","!","@","#","$","%","^","&","*")
    //Thread.sleep(2000)

    do{
        var randomNumber = (1..24).random()
        var randomNewLine = (1..50).random()
        var randomParagraph = (1..1000).random()

        if(randomNewLine == 10){ println() }
        if(randomParagraph == 100){ println("\n")}

        when(randomNumber){
            1 -> print(charactersToDisplay[0])
            2 -> print(charactersToDisplay[1])
            3 -> print(charactersToDisplay[2])
            4 -> print(charactersToDisplay[3])
            5 -> print(charactersToDisplay[4])
            6 -> print(charactersToDisplay[5])
            7 -> print(charactersToDisplay[6])
            8 -> print(charactersToDisplay[7])
            9 -> print(charactersToDisplay[8])
            10 -> print(charactersToDisplay[9])
            11 -> print(charactersToDisplay[10])
            12 -> print(charactersToDisplay[11])
            13 -> print(charactersToDisplay[12])
            14 -> print(charactersToDisplay[13])
            15 -> print(charactersToDisplay[14])
            16 -> print(charactersToDisplay[15])
            17 -> print(charactersToDisplay[16])
            18 -> print(charactersToDisplay[17])
            19 -> print(charactersToDisplay[18])
            20 -> print(charactersToDisplay[19])
            21 -> print(charactersToDisplay[20])
            22 -> print(charactersToDisplay[21])
            23 -> print(charactersToDisplay[22])
            24 -> print(charactersToDisplay[23])
        }
        Thread.sleep(50)
        
    }while(true)
}
