Зачем нам типы
==============

присказка

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
Авторитеты индустрии: Facebook => typeful programming for PHP (Hack) and JS (Flow) (both written in OCaml(Reason)! ).
Умные IDE (auto-completion, auto-typecheck).

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

блок 2
------

*current mainstream typeful*
*взгляд из функционального*

> 'avoid success at all costs'

+ CPS. RxJava. Future, бенчмарки в блоге.

- side-effects; immutability; closures as lambda; curring;
- generics as type functions; parametric polymorphism;
- higher order functions; higher kinded types;
- functors, monads, effects;
- inductive datatypes = algebraic + recursive; coinductive (infinite lists, etc);
- existencial types; phantom types approach; GADT;
- typeclasses; OOP-classes as typeclasses ("theory of objects");
- expression problem; tagless interpreters; encodings;

+ free theorems, "trampolines";
+ free monad; interpreter pattern; extensible/composable effects;

для чтения
- CT in FP: http://comonad.com/reader/
- E.Kmett https://www.schoolofhaskell.com/user/edwardk
- Oleg Kiselyov (huge): http://okmij.org/ftp/

-----------------------------------------------------------

блок 3
------

*post-typeful*
*взгляд из логики (верификация)*

- formal logics on its own: propositions, operations, predicates, quantifiers.
- dependent types; universes; erasure;
- propositions as types; Curty-Howard correspondence; universe of propositions;
- pre|post conditions again; invariants;
- structures and "axioms"; models; encodings again;
- identity types; HoTT; types as spaces; spaces as infinity-groupoids;

+ Haskell 'type-in-type'
+ Scala 'DOT' 
