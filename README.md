# Maquina_De_Lavar_POO

Atividade em dupla do terceiro semestre da faculdade de Engenharia de Software

Descrição da atividade: 

Modele uma classe MaquinaDeLavar que represente uma máquina de lavar roupas.

A máquina possui diferentes estados de funcionamento e deve controlar quais operações podem ser realizadas de acordo com seu estado atual.

A máquina deve possuir, no mínimo, os seguintes comportamentos:

ligar a máquina;
desligar a máquina;
iniciar a lavagem;
pausar a lavagem;
retomar a lavagem;
iniciar a centrifugação;
abrir a tampa;
fechar a tampa.
A classe deve respeitar as seguintes regras:


Uma máquina desligada não pode iniciar uma lavagem.
A lavagem só pode ser iniciada com a tampa fechada.
A tampa não pode ser aberta enquanto a máquina estiver lavando ou centrifugando.
Uma máquina desligada não pode ser pausada.
Uma lavagem pausada pode ser retomada.
A centrifugação só pode ser iniciada depois que a lavagem estiver concluída.
A máquina não pode ser desligada enquanto estiver lavando ou centrifugando.
Depois de concluída a centrifugação, a máquina pode ser desligada.
Uma máquina que já está ligada não deve ser ligada novamente.
Uma máquina que já está desligada não deve ser desligada novamente.
 

Crie um objeto da classe MaquinaDeLavar e faça a utilização dos métodos, apresentando o ciclo completo e restrições de estados.

Apresente o diagrama de classe da UML da classe desenvolvida.
