# Вступительный контест Backend-разработка на Java 2023
### Задание 1

В одной компании решили создать свою модель машинного обучения. Обучение модели происходит на большом количестве наборов данных. Чтобы ускорить процесс было решено одновременно обучать модель на s серверах разной мощности с номерами от 1 до s. Мощность сервера равна его номеру и определяет то, сколько наборов данных он обрабатывает за один раз. Например, сервер с номером 1 имеет мощность 1 и обрабатывает 1 набор данных за единицу времени, а сервер с номером s обрабатывает s наборов данных. В силу устройства, ни один сервер не может за один раз обработать наборов меньше, чем его мощность. Сегодня сотрудникам необходимо обучить модель на n наборах данных. Было решено распределять данные между серверами циклически: начать с сервера с номером s, затем дать данные серверам с номерами s−1,s−2,...,2,1,s,s−1 и так далее. Раздача данных серверам останавливается в тот момент, когда данных становится меньше, чем мощность текущего сервера. Оставшиеся после такого распределения данные приходится обрабатывать вручную. Помогите сотрудникам компании и скажите, сколько наборов данных придется обработать вручную.

##### Формат входных данных

В первой строке содержатся число s(1≤s≤64) — количество серверов. Во второй строке содержится число n(1≤n≤10^5) — количество наборов данных, на которых необходимо обучить модель.

##### Формат выходных данных

В единственной строке выходных данных выведите одно число — ответ на вопрос задачи.

##### Замечание

Порядок распределения наборов данных в первом примере из тестов:

    Cервер 4: обработка четырех наборов данных, 14 − 4 = 10;
    Cервер 3: обработка трех наборов данных, 10 − 3 = 7;
    Cервер 2: обработка двух наборов данных, 7 − 2 = 5;
    Cервер 1: обработка одного наборов данных, 5 − 1 = 4;
    Cервер 4: обработка четырех наборов данных, 4 − 4 = 0.

##### Примеры данных
Пример 1
    
    Ввод:
    4
    14
    
    Вывод:
    0

Пример 2

    Ввод:
    3
    8

    Вывод:
    2

Пример 3
    
    Ввод:
    13
    100
    
    Вывод:
    9

### Задание 2
Паролем p будем называть строку из n символов, которая состоит из строчных латинских букв.

Георгий придумал особый метод для шифрования паролей на своем сайте. Для этого он берет исходный пароль, выбирает не более k позиций в строке и удаляет символы с этих позиций. Чтобы добавить однозначности своему шифрованию, он выбирает позиции так, чтобы в полученной строке было как можно меньше различных символов.

Пока что Георгий занят реализацией другого функционала для своего сайта, поэтому просит вас помочь реализовать описанный выше алгоритм шифрования и по заданному паролю p найти количество различных символов в пароле после шифрования.

##### Формат входных данных

В первой строке входных данных даны два числа n и k — длина исходного пароля и максимальное количество символов, которое можно удалить, (1 ≤ n ≤ 10^5; 0 ≤ k ≤ 10^5).

Во второй строке дан пароль p — строка из n символов, состоящая из строчных латинских букв.

##### Формат выходных данных

В первой и единственной строке выведите минимальное количество различных символов, которое останется в пароле после применения алгоритма шифрования.

##### Примеры данных

Пример 1

    Ввод:
    8 4
    password
    
    Вывод:
    3

Пример 2

    Ввод:
    7 4
    abacaba
    
    Вывод:
    1

Пример 3
    
    Ввод:
    6 7
    uvwxyz
    
    Вывод:
    0

### Задание 3
В мобильное приложение, которое разрабатывает Николай, встроен автоматический детектор сбоев. Когда в приложении возникает ошибка, детектор автоматически отправляет сообщение об этом на сервер.

Впервые за долгое время Коля решил проверить статистику работы своего приложение. Статистика представляет собой последовательность чисел a1, a2, ..., an, каждое из которых равно количеству сообщений об ошибках в соответствующий момент работы приложения.

Николай называет сбоем период работы приложения, когда количество ошибок сначала не убывало, а потом не возрастало. Например, период работы приложения с количеством ошибок [1, 2, 4, 3, 3] является сбоем, а [3, 1, 2] нет. 

Коля выбрал m периодов работы приложения и узнал, являются ли эти периоды сбоями в приложении. А сможете ли узнать это вы?

##### Формат входных данных

В первой строке ввода дано целое число n — количество моментов работы приложения, для которых записана статистика, (1≤n≤10^5).

Во второй строке дано n целых чисел a1,a2,…,an — количество ошибок в соответствующий момент работы приложения (1≤ai≤10^9).

В третьей строке дано целое число m — количество периодов, интересующих Колю (1≤m≤10^5).

В следующих m строках дано описание периодов, интересующих Колю. Описание каждого периода состоит из двух целых чисел xi и yi — номера первого и последнего моментов, входящих в период (1≤xi≤yi≤n).

##### Формат выходных данных

Выведите m строк, каждая из которых соответствует периоду, интересующему Николая. В строке с номером i выведите «Yes» (без кавычек), если указанный период является сбоем, или «No» (без кавычек) иначе.

##### Примеры данных

    Ввод:
    8
    2 4 1 1 3 6 5 1
    7
    1 3
    2 3
    2 4
    2 5
    8 8
    1 5
    5 8
    
    Вывод:
    Yes
    Yes
    Yes
    No
    Yes
    No
    Yes

### Задание 4
В компании, где работает Иван, активно применяют различные средства для контроля качества кода.

Перед тем, как использовать написанную программу, ее код проверяют при помощи n проверок. В качестве результата каждой из проверок дается некоторое целое число — опасность кода. Назовем общей опасностью кода произведение опасностей для каждой из проверок.

Ваня только что дописал свою программу и запустил все проверки. В результате проверок, он получил массив опасностей a1, a2, ..., an.

Иван хочет минимизировать общую опасность написанного кода, для этого он готов не более c раз внести изменения в свой код. За одно внесение изменений он может увеличить или уменьшить на d результат одной из проверок, результат остальных проверок при этом не поменяется.

Помогите Ивану и предложите значения результатов проверок, дающие минимальную общую опасность, которые он может получить, сделав не более c изменений.

##### Формат входных данных

В первой строке ввода дано три целых числа n, c, d — количество проверок, максимальное количество изменений, которое готов внести Иван, и число d (1≤n≤200000; 1≤c≤200000; 1≤d≤10^9).

Во второй строке ввода дано n целых чисел a1,a2,…,an — результаты проверок кода Ивана до всех изменений (−10^9≤ai≤10^9).

##### Формат выходных данных

В единственной строке выведите n значений результатов проверок кода после применения не более чем c исправлений. Произведение всех результатов проверок должно быть минимальным.

Если ответов несколько, вы можете вывести любой.

##### Примеры данных

Пример 1

    Ввод:
    5 3 1
    5 4 3 5 2
    Вывод:
    5 4 3 5 -1

Пример 2

    Ввод:
    5 3 1
    5 4 3 5 5
    Вывод:
    5 4 0 5 5 

Пример 3

    Ввод:
    5 3 1
    5 4 4 5 5
    Вывод:
    5 1 4 5 5 

Пример 4

    Ввод:
    3 2 7
    5 4 2
    
    Вывод:
    5 11 -5

### Задание 5

Виктор занимается проектированием локальной сети в новом офисе.

Новый офис представляет собой координатную плоскость. В офисе планируется разместить n компьютеров сотрудников и m серверов. Для каждого сервера и компьютера сотрудника известна координата, в которой они будут расположены.

В локальной сети могут быть подключения двух видов: от сервера к другому серверу или от сервера к компьютеру сотрудника. Подключений другого вида быть не может. Подключение в сети может быть только односторонним, поэтому если сервер a подключен к серверу b (то есть сервер a может отправлять данные серверу b), то сервер b не может быть подключен к серверу a (то есть сервер b не может отправлять данные серверу a). Длина провода, необходимого для подключения, равна квадрату декартового расстояния между точками, в которых находятся компьютер или сервер, которые соединяются подключением.

Виктор должен спроектировать такую сеть, чтобы любой сервер мог отправить информацию на компьютер любого сотрудника напрямую или через какие-то промежуточные сервера. При этом Витя хочет сэкономить, поэтому он хочет найти такой способ подключения серверов и компьютеров, чтобы в нем было минимальное количество подключений, а при равенстве количества, суммарная длина проводов в этих подключениях также была минимальной. Помогите Виктору спланировать сеть.

##### Формат входных данных

В первой строке входных данных через пробел даны два целых числа n и m — количество компьютеров сотрудников и серверов (1≤n≤10^4; 1≤m≤5⋅10^3).

В следующих n строках даны координаты расположения компьютеров сотрудников. Компьютер с номером i планируется расположить в точке xi и yi (−10^8≤xi,yi≤10^8).

Аналогично, в следующих m строках дано расположение серверов в офисе.

##### Формат выходных данных

В первой строке выведите два целых числа k и l — количество подключений и сумму квадратов длин всех подключений.

В следующих k строках выведите описание схему сети. В строке с номером i должно быть описание i-го подключения в формате «f i -> t i» (без кавычек), где fi и ti — обозначение устройства: ‘s’ и номер сервера (через пробел), если это сервер, и ‘c’ и номер компьютера, если это компьютер сотрудника.

##### Примеры данных

    Ввод:
    2 3
    4 8
    1 4
    2 6
    4 5
    4 2

    Вывод:
    4 27
    s 2 -> s 1
    s 3 -> s 2
    s 1 -> c 1
    s 1 -> c 2
