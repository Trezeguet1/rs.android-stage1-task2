package subtask4

class Pangram {

    // TODO: Complete the following function

    fun getResult(inputString: String): String {
        var search ='a'
        var isPangram = true
        while (search<='z'){
            if (!inputString.contains(search) && !inputString.contains(search.toUpperCase())){
                isPangram=false
                break
            }
            search++
        }
        var resultString=""
        if (isPangram){
            var numberOfWord=0
            var last=' '
            for (i in inputString) {
                if (!i.isWhitespace() && last.isWhitespace()) numberOfWord++
                last=i
            }
            val arr :Array<Pair<Int,String>> = Array(numberOfWord) {Pair(0,"")}
            val vowels: Array<Char> = arrayOf('a','e','i','o','u','y')
            var tempIndex=0
            while(tempIndex<inputString.length && inputString[tempIndex].isWhitespace()) tempIndex++
            var tempString: String
            var numberOfVowels: Int
            for (i in 0 until numberOfWord){
                numberOfVowels=0
                tempString=""
                while(tempIndex<inputString.length && !inputString[tempIndex].isWhitespace()){
                    if(vowels.contains(inputString[tempIndex].toLowerCase())) {
                        numberOfVowels++
                        tempString+=inputString[tempIndex].toUpperCase()
                    } else {tempString+=inputString[tempIndex]}
                    tempIndex++
                }
                while(tempIndex<inputString.length && inputString[tempIndex].isWhitespace()) tempIndex++
                arr[i]=Pair(numberOfVowels, tempString)
            }
            arr.sortBy { it.first }
            if (numberOfWord>0) resultString+=arr[0].first.toString()+arr[0].second
            for (i in 1 until numberOfWord) resultString+=" "+arr[i].first.toString()+arr[i].second
        } else{
            var numberOfWords=0
            var last=' '
            for (i in inputString) {
                if (!i.isWhitespace() && last.isWhitespace())
                    numberOfWords++
                last=i
            }
            val arr :Array<Pair<Int,String>> = Array(numberOfWords) {Pair(0,"")}
            val consonants: Array<Char> = arrayOf('B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z')
            var tempIndex=0
            while(tempIndex<inputString.length && inputString[tempIndex].isWhitespace()) tempIndex++
            var tempString: String
            var numberOfConsonants: Int
            for (i in 0 until numberOfWords){
                numberOfConsonants=0
                tempString=""
                while(tempIndex<inputString.length && !inputString[tempIndex].isWhitespace()){
                    if(consonants.contains(inputString[tempIndex].toUpperCase())) {
                        numberOfConsonants++
                        tempString+=inputString[tempIndex].toUpperCase()
                    } else {tempString+=inputString[tempIndex]}
                    tempIndex++
                }
                while(tempIndex<inputString.length && inputString[tempIndex].isWhitespace()) {tempIndex++}
                arr[i]=Pair(numberOfConsonants, tempString)
            }
            arr.sortBy { it.first }
            if (numberOfWords>0) resultString+=arr[0].first.toString()+arr[0].second
            for (i in 1 until numberOfWords) resultString+=" "+arr[i].first.toString()+arr[i].second
        }
        return resultString
    }
}
