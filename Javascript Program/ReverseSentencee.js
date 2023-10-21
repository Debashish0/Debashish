function reverseWordsInSentence(sentence) {
    const reversedSentence = [];
    let wordStart = 0;

    for (let i = 0; i <= sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length) {
            let word = sentence.slice(wordStart, i);
            let reversedWord = '';
            for (let j = word.length - 1; j >= 0; j--) {
                reversedWord += word[j];
            }
            reversedSentence.push(reversedWord);
            wordStart = i + 1;
        }
    }

    return reversedSentence.join(' ');
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
