function reverseWord(sentence) {
    
    let words = sentence.split(" ");

    
    function reverseWord(word) {
        let reversed = "";
        for (let i = word.length - 1; i >= 0; i--) {
            reversed += word[i];
        }
        return reversed;
    }

   
    for (let i = 0; i < words.length; i++) {
        words[i] = reverseWord(words[i]);
    }

   
    let reversedSentence = words.join(" ");
    
    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversed = reverseWord(inputSentence);

console.log("Reversed Sentence:", reversed);
