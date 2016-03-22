# Computational mathematics
#### Files
* Input: `computational_mathematics/src/main/resources/input.txt`
* Input after build: `computational_mathematics/target/classes/input.txt`
* Tests folder: `computational_mathematics/src/test`

#### How to run
```bash
git clone https://github.com/vladislavoff1/computational_mathematics
cd computational_mathematics
mvn compile
java -cp target/classes main.JarvisMain
java -cp target/classes main.GrahamMain
```


#### Example

***`input.txt`***
```
2 6
5 5
0 4
1 1
4 1
2 0
1 4
3 2
4 4
3 5
```

***`result`***
```
(0, 4)
(1, 1)
(2, 0)
(4, 1)
(5, 5)
(2, 6)
```


