symptom(fever).
symptom(cough).
symptom(fatigue).
symptom(sneezing).
symptom(headache).
symptom(sorethroat).

symptom_duration(Duration,Risk):-(
                                 Duration<1 ->Risk='Verylow';
                                 Duration==1 ->Risk='Low';
                                 Duration>1,Duration<2-> Risk='Average';
                                 Duration>=2,Duration<3->Risk='High';
                                 Risk='Dangerouse').

message(Value,Message):-(Value=='Verylow'-> Message='You are having You are likely experiencing mild symptoms. It\'s advisable to rest and stay hydrated. If symptoms persist, consult a healthcare professional.Avoid consuming cool water and limit exposure to water, especially at night.';
                                 Value=='Low'-> Message='Your symptoms are mild. Consider taking over-the-counter medications and getting plenty of rest. If symptoms worsen, seek medical advice.Limit exposure to irritants such as smoke or strong odors. Avoid extreme temperatures, both hot and cold, as they can exacerbate symptoms.';
                                 Value=='Average'->Message= 'Your symptoms are moderate. It is recommended to monitor your condition closely and consider consulting a healthcare provider for further evaluation. Avoid activities that may strain your throat, such as prolonged speaking or singing. Also, try to avoid environments with poor air quality.';
                                 Value=='High'->Message='Your symptoms are severe. It\'s important to seek medical attention promptly for proper diagnosis and treatment.Avoid exposure to individuals who are sick, as well as crowded places where the risk of infection is higher. Rest as much as possible and avoid strenuous activities.';
                                 Value=='Dangerouse'->Message='Your symptoms are critical. Please seek immediate medical assistance.Do not delay seeking help.').

message1(Value,Message):-(Value == 'Verylow' -> Message = 'You have a mild fever. It\'s advisable to rest and stay hydrated. If the fever persists or worsens, consider consulting a healthcare professional.';
        Value == 'Low' -> Message = 'Your fever is low-grade. Get plenty of rest and consider taking over-the-counter medications to reduce fever. If the fever persists or becomes high, seek medical advice.';
        Value == 'Average' -> Message = 'Your fever is moderate. It\'s recommended to monitor your temperature closely and take appropriate measures to reduce it, such as using fever-reducing medications and cool compresses. If the fever persists or worsens, seek medical attention.';
        Value == 'High' -> Message = 'Your fever is high. It\'s important to take immediate steps to lower your temperature, such as using fever-reducing medications and applying cool compresses. If the fever persists or reaches dangerously high levels, seek urgent medical attention.';
        Value == 'Dangerous' -> Message = 'Your fever is dangerously high. Seek emergency medical assistance immediately. While waiting for help, try to cool down your body with cool compresses and remove excess clothing.';
        Value == 'Critical' -> Message = 'Your fever is at a critical level. Immediate medical attention is necessary. Do not delay seeking help.';
        Message = 'Your fever requires attention. Monitor your temperature closely and take appropriate measures to reduce it. If the fever persists or worsens, seek medical advice.').

alert(Symptom,Duration,Message):-looper1(Duration,Risk),looper2(Symptom,Risk,Message).

looper2([],_,_).
looper2([H|T],Risk,Message):-(H==cough->message(Risk,Message);
                             H==fever->message1(Risk,Message)),looper2(T,Risk,Message).

looper1([],_).
looper1([H|T],Risk):-symptom_duration(H,Risk),looper1(T,Risk).


disease(Symptoms, Result):-
    (   member(sorethroat, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms),
        member(sneezing, Symptoms)
    ),
    Result = cold.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms),
        member(sneezing, Symptoms)
    ),
    Result = flu.
disease(Symptoms, Result):-
    (   member(sorethroat, Symptoms),
        member(fever, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms)
    ),
    Result = covid.
disease(Symptoms, Result):-
    (   member(sneezing, Symptoms),
        member(sorethroat, Symptoms)
    ),
    Result = seasonal_allergies.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(fatigue, Symptoms),
        member(sorethroat, Symptoms)
    ),
    Result = mono.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(headache, Symptoms),
        member(sneezing, Symptoms)
    ),
    Result = sinusitis.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms)
    ),
    Result = pneumonia.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(sorethroat, Symptoms)
    ),
    Result = strep_throat.


