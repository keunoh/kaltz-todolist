const sentences = [
  {
    quote: "The way to get started is to quit talking and begin doing.",
    author: "Walt Disney",
  },
  {
    quote: "Life is what happens when you're busy making other plans.",
    author: "John Lennon",
  },
];

const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

const todaysSetence = sentences[Math.floor(Math.random() * sentences.length)];

quote.innerText = todaysSetence.quote;
author.innerText = todaysSetence.author;

export default sentences;
