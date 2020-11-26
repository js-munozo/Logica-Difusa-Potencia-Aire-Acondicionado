[System]
Name='Control_Potencia'
Type='mamdani'
Version=2.0
NumInputs=3
NumOutputs=1
NumRules=8
AndMethod='min'
OrMethod='max'
ImpMethod='min'
AggMethod='max'
DefuzzMethod='centroid'

[Input1]
Name='medida_cuarto'
Range=[0 50]
NumMFs=3
MF1='pequena':'zmf',[5.778 20]
MF2='mediana':'trimf',[15 25 35]
MF3='grande':'smf',[30 40.06]

[Input2]
Name='personas'
Range=[0 15]
NumMFs=3
MF1='pocas':'trimf',[0 0 4]
MF2='algunas':'trimf',[3 6 10]
MF3='muchas':'sigmf',[5 10]

[Input3]
Name='temperatura'
Range=[0 40]
NumMFs=3
MF1='frio':'zmf',[0 20]
MF2='templado':'trapmf',[18 20 24 28]
MF3='caliente':'smf',[26 30]

[Output1]
Name='potencia'
Range=[0 50]
NumMFs=3
MF1='baja':'trimf',[-0.05417 6.196 12.45]
MF2='media':'trimf',[8.75 18.75 28.75]
MF3='alta':'trimf',[25 31.25 37.5]

[Rules]
1 1 1, 1 (1) : 1
1 2 3, 2 (1) : 1
2 1 2, 1 (1) : 1
2 3 2, 2 (1) : 1
2 1 3, 2 (1) : 1
2 2 3, 2 (1) : 1
2 3 3, 3 (1) : 1
3 3 3, 3 (1) : 1
