require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Здравствуйте! Спасибо что обратились в службу поддержки. Чем я могу вам помочь?

    state: Hello
        intent!: /привет
        a: Здравствуйте! Подскажите, какой у вас вопрос?

    state: pin
        intent!: /смена пина
        a: {{$context.intent.answer}}
        
    state: app
        intent!: /приложение
        a: {{$context.intent.answer}}    
        
            
    state: choice
        intent!: /выбор действия
        a:{{$context.intent.answer}}
        
        
    state: Match
        event!: match
        a: {{$context.intent.answer}}
        
    state: NoMatch
        event!: noMatch
        a: Извините, я вас не понял. Попробуйте переформулировать вопрос. Выберите, что именно планируете сделать: \n
            1) Поменять пароль для входа в приложение. \n
            2) Поменять PIN-код от карты. \n
            Пожалуйста, отправьте цифру, соответствующую вашему выбору. \n
            Если вам требуется получить ответ на другой вопрос, напишите мне слово "оператор" и я соединю вас с сотрудниками службы подежки.
            
            
            

        