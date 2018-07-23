блок 1
------

> *pre-typeful*  
> *взгляд из императивного*  


Инженерный подход к управление сложностью = Разбиение кода на модули.
Модули. Интерфейс и реализация. Соединение модулей согласно интерфейсам.
Функция - минимальный модуль кода. Декларация функции, сигнатура метода.

- primitive types; assembler;
- simply typed; function types: purity, totality; referencial transp.;
Чистые функции, тотальные функции, эффекты, примеры эффектов. Упрощение рассуждений.
- diagram search;
Размеры модуля. Классы, пакеты. Тайпклассы. Интерфейсы OOP. Inheritance vs. composition.
Ментальная репрезентация и формальная экспликация.
Экспликация действий, экспликация данных, экспликация ограничений, экспликация утверждений.
Инженерия требований. Процессы.
Языки описания данных.
Представление о возможных значениях данных при разных запусках кода. Типы.
Устойчивость кода к изменениям, maturity. Рефакторинг как оздоровление. Устойчивость к рефакорингу.
Контрактное программирование.
- contract programming (pre/post conditions);
Юнит-тесты, TDD, model-checking.

Немного простой мотивации.
Пример из жизни: Perl.
Авторитеты индустрии:
- Microsoft
  - JS: https://github.com/Microsoft/TypeScript 
- Facebook => static typing for 
  - PHP: https://github.com/facebook/hhvm
  - JS: https://github.com/facebook/flow
  - OCaml: https://github.com/facebook/reason
- Instagram => 
  - Python: https://github.com/Instagram/MonkeyType
Умные IDE (auto-completion, auto-typecheck) выводят тип идентификаторов и используют его.

Рантайм. Динамический тип = теги. Рефлексия и реификация.
Уровни формального мира/языка: значения, типы, kinds. Намек на уровень 0.

- generics as type functions; parametric polymorphism; erasure;
- co/contra-variance; Java arrays failure;
Классы ООП как тайпклассы. Примеры тайпклассов. Атомарность примитивов.
Наследование. Интерфейсы. vs. composition. ООП без наследования. Плоские иерархии.

Скала. Кейк паттерн. Сравнение.
+ ScalaCakePattern vs. TheReaderMonad (and lazy singletons, and DI-containers);
Примеры кейков. Моки в тестировании. Графы. Зависимые типы в Скале.

- expression problem; tagless interpreters; encodings;
https://oleksandrmanzyuk.wordpress.com/2014/06/18/from-object-algebras-to-finally-tagless-interpreters-2/

- The Interpreter Pattern Revisited: https://youtu.be/hmX2s3pe_qk
- inductive datatypes = shallow hierarchy.

-----------------------------------------------------------
