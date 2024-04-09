 % Facts representing symptoms
symptom(fever).
symptom(cough).
symptom(fatigue).
% Add more symptoms as needed

% Facts representing diseases and their symptoms
disease(cold, [fever, cough, fatigue]).
disease(flu, [fever, cough, fatigue, sore_throat]).
% Add more diseases and their symptoms as needed

% Rule to predict disease based on symptoms
predict_disease(Symptoms, Disease) :-
    disease(Disease, DiseaseSymptoms),
    sublist(DiseaseSymptoms, Symptoms).

% Helper predicate to check if a list is a sublist of another list
sublist([], _).
sublist([H|T], List) :-
    member(H, List),
    sublist(T, List).
