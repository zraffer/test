Зачем нам типы
==============

http://i79.fastpic.ru/big/2016/0420/67/89479941bd74ddf32c6820bbdea0f667.gif

- виды функций http://juan-gandhi.livejournal.com/3565634.html?thread=59185986#t59185986

Эх, незамутнённое детство программирования на одном процессоре, когда всё так и было. Бац ей икс — хрясь тебе игрек!

В современном мире возможны варианты:

- бац тебе икс — хрясь тебе игрек, но потом (я дам вам знать);
- бац тебе икс — а вот хрен тебе, а не игрек!
- бац тебе икс — хрясь тебе игрек, и ещё игрек_один от предыдущего икса!
- бац тебе икс — а вот тебе пяток игреков просто так!
- бац тебе эн иксов — хрясь тебе эм игреков, где эм может быть и ноль, и один, и сколько хочешь.
- бац тебе икс — хрясь тебе БЕСКОНЕЧНОЕ МНОЖЕСТВО игреков! Что, съел? API хотел написать? На, давай, пиши API, выкуси!
- бац тебе икс — fatal error, core dumped

И вот с этим нужно как-то жить, и обеспечивать, чтобы игреки вычислялись когда нужно и записывались куда положено, или по крайней мере в случае провала о том было бы доложено начальству.

-------------------------------------------------------

Инженерный подход к управление сложностью = Разбиение кода на модули.
Модули. Интерфейс и реализация. Соединение модулей согласно интерфейсам.
Функция - минимальный модуль кода. Декларация функции, сигнатура метода.
Чистые функции, тотальные функции, эффекты, примеры эффектов. Упрощение рассуждений.
Размеры модуля. Классы, пакеты. Тайпклассы.
Ментальная репрезентация и формальная экспликация.
Экспликация действий, экспликация данных, экспликация ограничений, укспликация утверждений.
Инженерия требований.
Представление о возможных значениях данных при разных запусках кода. Типы.
Устойчивость кода к изменениям, maturity. Рефакторинг как оздоровление. Устойчивость к рефакорингу.
Контрактное программирование. Юнит-тесты, TDD, model-checking.
Пример из жизни: Perl.
Авторитеты индустрии: Facebook => typeful programming for PHP (Hack) and JS (Flow).

Рантайм. Динамический тип, теги. Рефлексия и реификация.
Уровни формального мира/языка: значения, типы, kinds. Намек на уровень 0.
Классы как тайпклассы. Примеры тайпклассов. Атомарность примитивов.

Скала. Кейк паттерн. Сравнение.
Примеры кейков. Моки в тестировании. Графы. Зависимые типы.

CPS. RxJava. Future, бенчмарки.

- expression problem; tagless interpreters; encodings;

- The Interpreter Pattern Revisited: https://youtu.be/hmX2s3pe_qk

-----------------------------------------------------------

- primitive types; assembler;
- simply typed; function types: purity, totality; referencial transp.;
- diagram search; contract programming (pre/post conditions);
- side-effects; immutability; closures as lambda; curring;
- generics as type functions; parametric polymorphism;
- higher order functions; higher kinded types;
- functors, monads, effects;
- co/contra-variance; Java arrays failure;
- inductive datatypes = algebraic + recursive; coinductive;
- existencial types; phantom types approach; GADT;
- typeclasses; OOP-classes as typeclasses ("theory of objects");
- expression problem; tagless interpreters; encodings;
- dependent types; propositions as types;
- identity types; HoTT; infinity-groupoids.

+ CPS-transform (Observable, Future, Rx***);
+ free theorems, "trampolines";
+ free monad; interpreter pattern; extensible/composable effects;
+ ScalaCakePattern vs. TheReaderMonad (and lazy singletons, and DI-containers);

в качестве языка я планирую использовать Scala и сравнивать, как "нечто делается" с продвинутыми типами и без оных. акцента на лямбда-исчислении и специфических для него вопросах *пока* не будет. ТК будет упоминаться, но абсолютно не будет рассматриваться.

для чтения
- The Interpreter Pattern Revisited: https://youtu.be/hmX2s3pe_qk
- CT in FP: http://comonad.com/reader/
- E.Kmett https://www.schoolofhaskell.com/user/edwardk
- Oleg Kiselyov (huge): http://okmij.org/ftp/
