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

:-dynamic bmi/4.
:-dynamic habbit/4.
:-dynamic table1/1.
:- dynamic table2/1.
:- dynamic details1/4.
:-dynamic details2/2.


bmiresult(Value,Age,Smoke,Alchohol,Previous,Count):-(Value<18.5->Result=underweight,Weight is 20;
                  Value>=18.5,Value=<25->Result=normal,Weight is 5;
                  Result=overweight,Weight is 30),assert(bmi(Age,Value,Result,Weight)),calculateweight1(Smoke,Alchohol,Previous,Count).

getValue(List1,List2):-  findall(Value1, table1(Value1), List1),findall(Value2, table2(Value2), List2).



getMarks(Predict,Result1,Result2) :-
    findall(Value1, table1(Value1), List1),
    findall(Value2, table2(Value2), List2),
    getLastElement2(List1, List2, Result1, Result2),
    Result is (Result1 + Result2) / 2,
    (   Result < 50.0 -> Predict = 'Very Good'
    ;   Result >= 50.0, Result < 75.0 -> Predict = 'Normal'
    ;   Predict = 'You are in danger'
    ).
getLastElement2([X1], [X2], X1, X2).
getLastElement2([_|T1], [_|T2], X1, X2) :-
    getLastElement2(T1, T2, X1, X2).


getbmi(H):-findall(Value,bmi(_,Value,_,_),List),getLastElement(List,H).
start(Head):- findall(Weight,bmi(_,_,_,Weight),List),getLastElement(List,Head).

totalWeight(Count,Weight,Head):-Count is Weight + Head,assert(table1(Count)).
totalWeight2(Count,W1,W2):-Count is W1+W2,assert(table2(Count)).

calculateweight1(Smoke,Alchohol,Previous,Count):-start(Head),habbits(Smoke,Alchohol,Previous,Weight),totalWeight(Count,Weight,Head).

habbits(Smoke,Alchohol,Previous,Weight):-(Smoke=yes->Weight1 is 40;
                                          Weight1 is 0),
                                         (Previous=yes->Weight2 is 20;
                                         Weight2 is 0),
                                         (Alchohol=0->Weight3 is 40;
                                         Alchohol=1->Weight3 is 30;
                                         Alchohol=2->Weight3 is 20;
                                         Alchohol=3->Weight3 is 10;
                                         Weight3 is 0),Weight is Weight1+Weight2+Weight3,assert(habbit(Smoke,Previous,Alchohol,Weight)).



getLastElement([X], X).
getLastElement([_|T], X) :- getLastElement(T, X).

bmi(Weight,Height,Age,Smoke,Alchohol,Previous,Count):-Value is Weight/((Height/100)*(Height/100)),bmiresult(Value,Age,Smoke,Alchohol,Previous,Count).

looper([],[],[]).
looper([H1|T1],[H2|T2],[H3|T3]):-symptom_duration(H2,Risk),(H1==cough->message(Risk,H3);
                                                            H1==fever->message1(Risk,H3)),looper(T1,T2,T3).

assist(Total,HDL,LDL,TRG,Pressure,Sugur,Count):-lipid(Total,HDL,LDL,TRG,Totalrisk1),others(Pressure,Sugur,Totalrisk2),totalWeight2(Count,Totalrisk1,Totalrisk2).

assist1(Total,HDL,LDL,TRG,Pressure,Sugur,List1,List2):-lipidoutput(Total,HDL,LDL,TRG),otheroutput(Sugur,Pressure),getmessages(List1,List2).


lipidoutput(Total,HDL,LDL,TRG):-(Total>=240.00->A=
'*Your total cholesterol levels are elevated. To manage this, it\'s important to reduce consumption of fatty and junk foods.Incorporating daily exercise is crucial.\n';
Total<240.00->A='*your total cholesterol levels are within the normal range, congratulations on maintaining a healthy balance!\n'),

(HDL<45.00->B='*Your HDL levels are low, it increases the risk of cardiovascular diseases such as heart attacks and strokes. To mitigate this risk, focus on lifestyle changes such as regular exercise\n';

HDL>=45.00->B='*HDL levels are normal, it signifies a reduced risk of cardiovascular diseases.\n'),

(LDL>=160.00->C='*Your LDL levels are concerning as they increase the risk of heart disease and stroke. It\'s important to take immediate action to lower your LDL levels. Start by making dietary changes\n';

LDL<160.00->C='*Having normal LDL levels is great news for your heart health! \n'),

(TRG>=150.00->D='*You have high triglyceride level. It can indicate an increased risk of heart disease and other health complications. It\'s important to take action to lower your triglycerides. Start by making dietary changes.\n';

TRG<150.00->D='*your triglyceride levels are within the normal range, it\'s a positive sign for your overall health.'),assert(details1(A,B,C,D)).

otheroutput(Sugur,Pressure):-
(Sugur>110.00->A='*Your sugar levels are high, it can significantly impact heart health. Elevated sugar levels over time contribute to inflammation, damage to blood vessels, and increase the risk of developing cardiovascular diseases \n';
Sugur<110.00,Sugur>=65.00->A='*Your sugar levels are within the normal range, it\'s a positive indicator \n'),

(Pressure>=120.00,Pressure<180.00->B='*Your blood pressure is elevated, but it\'s not yet in the dangerous range. It\'s essential to monitor it closely and take action to keep it in check. Consider making lifestyle changes \n';

Pressure>=90.00,Pressure<120.00->B='*Congratulations! Your blood pressure is within the optimal range. This is excellent\n';

B='*Your blood pressure is dangerously high and requires immediate attention. Elevated blood pressure puts you at risk for serious health complications, including heart attacks, strokes, and organ damage. \n'),assert(details2(A,B)).

lipid(Total,HDL,LDL,TRG,Totalrisk):-(Total<200.00->Risk1=5;
                                     Total>=200.00,Total<240.00->Risk1=15;
                                     Total>=240.00->Risk1=25),(HDL>=45.00->Risk2=5;HDL>35.00,HDL<45.00->Risk2=15;
                                                 HDL<35.00->Risk2=25),(LDL<130.00->Risk=5;LDL>=130.00,LDL<160.00->Risk=15;LDL>=160.00->Risk=25),(TRG<100.00->Risk3=5;TRG>=100.00,TRG<150.00->Risk3=15;TRG>=150.00->Risk3=25),lipidoutput(Total,HDL,LDL,TRG),Totalrisk is Risk1+Risk2+Risk+Risk3.



others(Pressure,Sugur,Totalrisk):-(Sugur<65.00->Risk=30;Sugur>=65.00,Sugur<110.00->Risk=10;Sugur>=100.00->Risk=50),(Pressure<90.00->Risk1=20;Pressure>=90.00,Pressure<120.00->Risk1=10;Pressure>=120.00,Pressure<180.00->Risk1=40;Pressure>=180.00->Risk1=50),Totalrisk is Risk+Risk1.

getmessages(List1,List2):-setof([A, B, C, D],details1(A,B,C,D),List1),setof([P,Q],details2(P,Q),List2).

clear_details1 :-
    retractall(details1(_, _, _, _)).
clear_details2 :-
    retractall(details2(_, _)).
clear_table1:-retractall(table1(_)).
clear_table2:-retractall(table2(_)).

disease2(Symptoms, Result):-
    (member(fever, Symptoms))->
    Result =['Mononucleosis (Mono)', 'Pneumonia','COVID-19 (Coronavirus)', 'Influenza (Flu)', 'Strep Throat'];
    (member(sneezing, Symptoms))->
    Result =['Common Cold', 'Seasonal Allergies (Allergic Rhinitis)', 'Influenza (Flu)', 'COVID-19 (Coronavirus)', 'Sinusitis'];
    (member(cough, Symptoms))->
    Result =['Common Cold','Influenza (Flu)', 'COVID-19 (Coronavirus)', 'Pneumonia', 'Strep Throat', 'Sinusitis','Seasonal Allergies (Allergic Rhinitis)'];
    (member(headche, Symptoms))->
    Result =['Common Cold', 'Influenza (Flu)', 'COVID-19 (Coronavirus)','Mononucleosis (Mono)',  'Strep Throat', 'Pneumonia', 'Sinusitis'];
    (member(fatigue, Symptoms))->
    Result =[ 'Influenza (Flu)', 'COVID-19 (Coronavirus)', 'Pneumonia', 'Mononucleosis (Mono)', 'Strep Throat', 'Sinusitis'];
    (member(sorethroat, Symptoms))->
    Result =['Common Cold', 'Influenza (Flu)', 'COVID-19 (Coronavirus)', 'Mononucleosis (Mono)', 'Strep Throat', 'Sinusitis'].

disease1(Symptoms, Result) :-
    (   \+ member(fever, Symptoms) ->
        Result = ['Common Cold', 'Seasonal Allergies (Allergic Rhinitis)', 'Strep Throat', 'Sinusitis']
    ;   \+ member(sneezing, Symptoms) ->
        Result = ['Mononucleosis (Mono)', 'Pneumonia', 'Strep Throat', 'Sinusitis']
    ;   \+ member(cough, Symptoms) ->
        Result = ['Seasonal Allergies (Allergic Rhinitis)', 'Mononucleosis (Mono)', 'Strep Throat', 'Sinusitis']
    ;   \+ member(headache, Symptoms) ->
        Result = ['Common Cold', 'Seasonal Allergies (Allergic Rhinitis)', 'Mononucleosis (Mono)', 'Strep Throat', 'Sinusitis']
    ;   \+ member(fatigue, Symptoms) ->
        Result = ['Common Cold', 'Influenza (Flu)', 'COVID-19 (Coronavirus)', 'Seasonal Allergies (Allergic Rhinitis)', 'Strep Throat', 'Sinusitis']
    ;   \+ member(sorethroat, Symptoms) ->
        Result = ['Common Cold', 'Influenza (Flu)', 'COVID-19 (Coronavirus)', 'Seasonal Allergies (Allergic Rhinitis)', 'Pneumonia', 'Sinusitis']
    ).
intersection([], _, []).
intersection([H|T], L2, [H|Res]) :- member(H, L2),intersection(T, L2, Res).
intersection([_|T], L2, Res) :- intersection(T, L2, Res).

get_similar_diseases(Symptoms, SimilarDiseases) :-
    (   member(fever, Symptoms),
        member(sneezing, Symptoms),
        member(cough, Symptoms),
        member(fatigue, Symptoms),
        member(headache, Symptoms),
        member(sorethroat, Symptoms)
    ),SimilarDiseases = ['Common Cold', 'Influenza (Flu)', 'COVID-19 (Coronavirus)',  'Strep Throat', 'Sinusitis'].

get_similar_diseases(Symptoms, SimilarDiseases) :-
    disease1(Symptoms, Result1),
    disease2(Symptoms, Result2),
    intersection(Result1, Result2, SimilarDiseases).
