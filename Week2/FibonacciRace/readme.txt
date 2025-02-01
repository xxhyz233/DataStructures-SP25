# Time Spent
I spent around 3 hours completing the project, with roughly the same time for each of the three different functions, and around half of the time figuring out how to get the maxTime thing working.

# Notes
1. I couldn't figure out how to do the maxTime thing so I had to rewrite a lot of things then delete them and in the end I didn't even use it anywhere in my code.
2. For the Closed Formula function I directly copied the formula from the pdf, tested it in command line and the result was wrong. Then I searched the formula on Google and realized that the original formula calls for (1-GoldenRatio)^n instead of (-GoldenRatio)^n, so I fixed it.
3. I noticed that the Dynamic and Formula method are significantly faster than the Recursive method, and initially I thought it was an error with my timer as the console prints 0ms for these two methods so I used a more precise nanoTime() to test my hypothesis. However, it turns out that I set my timer correctly and the Dynamic and Formula methods are probably just much more efficient than the Recursive one. 
4. I didn't use the FibonacciRaceTest.java to test my result as the print format wasn't an exact match, but I did Google the Fibonacci sequence for each of the index that I tested (n=10, f(n) = 55; n=42, f(n) = 267914296) and all three of them were correct for every index.
5. I tried throwing exceptions but none of them seems to work.
6. I tried exporting the output.txt with arguments 60 2000 but the maxInput is way too large and never finished running, so instead I just exported another file with arguments 40 1000.

# Resources and Acknowledgements
1. I wasn't familiar with Recursion in Java, so I looked up w3schools, applied similar logic and successfully set up the Fibonacci sequence by myself. 
2. My girlfriend, Mumu Li, who also happens to be on the waitlist for the same class, helped me solve an issue with the dynamic programming function where instead of using an long array to store the previous two values and the result, I just used a bunch of long which was a lot more painful to work with and did not work at all. 
3. As I mentioned earlier I wasn't sure if my timer setup was incorrect or not, so I asked ChatGPT if there's any ways to debug the timer, and it told me to use nanoTime() to evaluate a much more precise timing. I didn't use it to generate any of my code, I only used it for inquiry. 
4. I looked up w3schools, again, to learn how to throw exceptions in Java, then debugged with ChatGPT on why it doesn't throw any exceptions.