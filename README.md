# gftmeal
Program that show Dishes for Each time of day.


## Build

Access the root directory of this application in a terminal and type:

```
mvn clean package
```


## Run the application:

After the build run the following command in a terminal:

```

java -jar target/gftmeal.jar
```

## Running Tests

Access the root directory of the project in a terminal and run the following command:

```
mvn test
```

##Requirements

```
JDK 8
Maven
```

## Dishes or each time of Day

```
+-------------+----------------+--------+
|  Dish Type  |    morning     | night  |
+-------------+----------------+--------+
| 1 (entrée)  | eggs           | steak  |
| 2 (side)    | Toast          | potato |
| 3 (drink)   | coffee         | wine   |
| 4 (dessert) | Not Applicable | cake   |
+-------------+----------------+--------+
```

## Sample Input and Output - Examples:

```
Input: morning, 1, 2, 3
Output: eggs, toast, coffee

Input: morning, 2, 1, 3
Output: eggs, toast, coffee

Input: morning, 1, 2, 3, 4
Output: eggs, toast, coffee, error

Input: morning, 1, 2, 3, 3, 3
Output: eggs, toast, coffee(x3)

Input: night, 1, 2, 3, 4
Output: steak, potato, wine, cake

Input: night, 1, 2, 2, 4
Output steak, potato(x2), cake
```