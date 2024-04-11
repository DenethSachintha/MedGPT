symptom(fever).
symptom(cough).
symptom(fatigue).
symptom(sneezing).
symptom(headache).

symptom_duration(Duration,Risk):-(Duration<1 ->Risk='Verylow';
                                 Duration==1 ->Risk='Low';
                                 Duration>1,Duration<2-> Risk='Average';
                                 Duration>=2,Duration<3->Risk='High';
                                 Risk='Dangerouse').
message(Symptom,Value,Message):- (Symptom ==cough->
    (Value=='Verylow'-> Message='You are having You are likely experiencing mild symptoms. It\'s advisable to rest and stay hydrated. If symptoms persist, consult a healthcare professional.Do not have any cool water and do not spend much time with water specialy at night!';
                                 Value=='Low'-> Message='Your symptoms are mild. Consider taking over-the-counter medications and getting plenty of rest. If symptoms worsen, seek medical advice.';
                                 Value=='Average'->Message= 'Your symptoms are moderate. It is recommended to monitor your condition closely and consider consulting a healthcare provider for further evaluation.';
                                 Value=='High'->Message='Your symptoms are severe. It\'s important to seek medical attention promptly for proper diagnosis and treatment.';
                                 Value=='Dangerouse'->Message='Your symptoms are critical. Please seek immediate medical assistance.Do not delay seeking help.')).


alert(Symptom,Duration,Message):-symptom_duration(Duration,Risk),message(Symptom,Risk,Message).


disease([],N,Result):-(N=<65->
                      Result =cold;
                      Result =flu).

disease([H|T],N,Result):-(H == fever-> N1 is N+25;
                  H == cough->N1 is N+30;
                  H == fatigue->N1 is N+40;
                  H == headache->N1 is N+35;
                  H == sneezing-> N1 is N+10;
                  H==soarthroat-> N1 is N+15),disease(T,N1,Result).

