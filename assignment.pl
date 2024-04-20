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

message(Value, Message):-
    (Value == 'Verylow' -> Message = '\n=> You are having cough and You are likely experiencing mild symptoms.\n=> It\'s advisable to rest and stay hydrated.\n=> If symptoms persist, consult a healthcare professional.\n=> Avoid consuming cool water and limit exposure to water, especially at night.';
     Value == 'Low' -> Message = '\n=> Your cough is mild.\n=> Consider taking over-the-counter medications and getting plenty of rest.\n=> If symptoms worsen, seek medical advice.\n=> Limit exposure to irritants such as smoke or strong odors.\n=> Avoid extreme temperatures, both hot and cold, as they can exacerbate symptoms.';
     Value == 'Average' -> Message = '\n=> Your cough is moderate.\n=> It is recommended to monitor your condition closely and consider consulting a healthcare provider for further evaluation.\n=> Avoid activities that may strain your throat, such as prolonged speaking or singing.\n=> Also, try to avoid environments with poor air quality.';
     Value == 'High' -> Message = '\n=> Your cough is severe.\n=> It\'s important to seek medical attention promptly for proper diagnosis and treatment.\n=> Avoid exposure to individuals who are sick, as well as crowded places where the risk of infection is higher.\n=> Rest as much as possible and avoid strenuous activities.';
     Value == 'Dangerouse' -> Message = '\n=> Your cough is critical.\n=> Please seek immediate medical assistance.\n=> Do not delay seeking help.').

message1(Value, Message):-
    (Value == 'Verylow' -> Message = '\n=> You have a mild fever.\n=> It\'s advisable to rest and stay hydrated.\n=> If the fever persists or worsens, consider consulting a healthcare professional.';
     Value == 'Low' -> Message = '\n=> Your fever is low-grade.\n=> Get plenty of rest and consider taking over-the-counter medications to reduce fever.\n=> If the fever persists or becomes high, seek medical advice.';
     Value == 'Average' -> Message = '\n=> Your fever is moderate. It\'s recommended to monitor your temperature closely and take appropriate measures to reduce it, such as using fever-reducing medications and cool compresses.\n=> If the fever persists or worsens, seek medical attention.';
     Value == 'High' -> Message = '\n=> Your fever is high.\n=> It\'s important to take immediate steps to lower your temperature, such as using fever-reducing medications and applying cool compresses.\n=> If the fever persists or reaches dangerously high levels, seek urgent medical attention.';
     Value == 'Dangerous' -> Message = '\n=> Your fever is dangerously high.\n=> Seek emergency medical assistance immediately.\n=> While waiting for help, try to cool down your body with cool compresses and remove excess clothing.';
     Value == 'Critical' -> Message = '\n=> Your fever is at a critical level.\n=> Immediate medical attention is necessary.\n=> Do not delay seeking help.';
     Message = '\n=> Your fever requires attention.\n=> Monitor your temperature closely and take appropriate measures to reduce it. If the fever persists or worsens, seek medical advice.').

alert(Symptom,Duration,Message):-looper(Symptom,Duration,Message).


looper([],[],[]).
looper([H1|T1],[H2|T2],[H3|T3]):-symptom_duration(H2,Risk),(H1==cough->message(Risk,H3);
                                                            H1==fever->message1(Risk,H3)),looper(T1,T2,T3).

disease(Symptoms, Result):-
    (   member(sorethroat, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms),
        member(sneezing, Symptoms)
    ),
    Result = 'Common Cold'.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms),
        member(sneezing, Symptoms)
    ),
    Result = 'Influenza (Flu)'.
disease(Symptoms, Result):-
    (   member(sorethroat, Symptoms),
        member(fever, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms)
    ),
    Result = 'COVID-19 (Coronavirus)'.
disease(Symptoms, Result):-
    (   member(sneezing, Symptoms),
        member(sorethroat, Symptoms)
    ),
    Result = 'Seasonal Allergies'.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(fatigue, Symptoms),
        member(sorethroat, Symptoms)
    ),
    Result = 'Mononucleosis (Mono)'.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(headache, Symptoms),
        member(sneezing, Symptoms)
    ),
    Result = 'Sinusitis'.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms)
    ),
    Result = 'Pneumonia'.
disease(Symptoms, Result):-
    (   member(fever, Symptoms),
        member(sorethroat, Symptoms)
    ),
    Result = 'Strep Throat'.



