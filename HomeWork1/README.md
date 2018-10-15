Task :

Compile and run java app from console.
Write program, which will pass requirements:
- User enter the interval (for example: [1;100]);
- Program prints odd numbers from start to the end of interval and even from end to start;
Program prints the sum of odd and even numbers;
Program build Fibonacci numbers: F1 will be the biggest odd number and F2 – the biggest even number, user can enter the size of set (N)
;
Program prints percentage of odd and even Fibonacci numbers;
Object-Oriented analysis and design.

Additional rules :

Підключити до Maven наступні плагіни:
- плагін FindBugs який здійснює автоматичну перевірку якості коду і пошук потенційних помилок в коді
- плагін PMD
- плагін Checkstyle - перевіряє дотримання code convention
Після завершення роботи слід виконати команду mvn site і переглянути результати її виконання в папці target/site 
В коді слід виправити всі помилки, які виявлять плагіни FindBugs, PMD і Checkstyle (окрім помилок, повязаних з відстуністю коментарів)
