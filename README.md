# Atividade-SO-THREADS
  
## Programação Concorrente
   
Obs.: A não ser que seja explicitamente solicitado, nenhuma solução para nenhuma das questões abaixo deve exibir condições de corrida, entrar em deadlock, entrar em livelock ou fazer com que threads sofram de starvation.  
 
**QUESTÃO 1 (Número primo)**
   
Faça um programa em Java que dado um número N calcula se este número é primo. Um número primo tem apenas dois divisores: um e ele mesmo. O programa deve dividir o N pelos números de 2 a N, para descobrir a primalidade por força bruta. Faça também uma versão deste programa onde o cálculo deverá ser realizado paralelamente por várias threads. A realização do cálculo deverá ser dividida entre as threads criadas de modo que em um processador com X cores, o programa com X threads consiga ser mais rápido que o programa sequencial.
O número de threads criadas será um parâmetro X do programa. Observe e descreva, em um arquivo texto, o tempo de execução do programa sequencial e para X igual a 2, 100, 500, 1000, 10000. A partir de qual valor de X a execução do programa ficou mais lenta que a sequencial? Explique porque.  
  
**QUESTÃO 2 (Orcs e a presa)  **
  
 Orcs são criaturas estúpidas que só conseguem fazer duas coisas: morder ou gritar. Para um Orc conseguir comer sua presa, ele deve primeiro gritar até atordoar sua vítima, para depois então tentar morder. Um certo dia dois Orcs resolveram caçar juntos no pântano e eles fizeram um acordo: quando eles avistarem uma presa, primeiro eles tentarão gritar, quem conseguir gritar depois poderá tentar morder, se o outro não estiver mordendo, ele conseguirá morder com certeza. Mas claro, Orcs não são criaturas confiáveis, então mesmo que o primeiro Orc consiga gritar o outro ainda assim terá uma chance de 50% de tentar morder e roubar a presa. Implemente este problema dos Orcs usando locks explícitos. Considere que a cada segundo aparece uma presa nova. O programa deve parar quando  um  número  N  de  presas,  definido  no  início  da  execução,  forem atacadas. Cada Orc deve ser implementada como uma thread distinta.  
 
**QUESTÃO 3 (Macacos e as Bananas)  **
  
Três macacos estão numa floresta, morrendo de fome, até que eles encontram uma bananeira. Todos eles querem subir na bananeira para comer, mas só dois podem subir ao mesmo tempo. Caso haja espaço para subir, um macaco gasta 1 segundo para subir na bananeira, comer uma banana e depois descer. Cada macaco só pode comer uma banana por vez. Se o macaco tentar subir, mas já tiverem 2 macacos, ele deve esperar 2 segundos antes de tentar subir de novo. A bananeira possui inicialmente 50 bananas e se as bananas acabarem uma nova safra é produzida à uma taxa de 5 bananas por segundo, até atingir o máximo de 50 bananas, então para de produzir e espera acabar de novo. Um macaco só percebe que não há bananas prontas depois de subir, o que significa que ele também gasta 1 segundo para subir e descer. Se um macaco ficar 10 segundos sem comer, ele morre de fome, entretanto você não pode deixar nenhum macaco morrer de fome.
O programa deve parar a execução quando um número Ntotal de bananas, determinado no início da execução, for consumido por todos os macacos juntos [ex: N = 200 => macaco1: 70, macaco2: 50, macaco3: 80].
Para exibir no console:
Quando um macaco conseguir comer uma banana: "O macaco X comeu uma banana"
Quando um macaco subir e não tiver bananas: "Não havia bananas para o macaco X comer"
Quando um macaco não conseguir subir na bananeira: "O macaco X não conseguiu subir na bananeira".  
  
**QUESTÃO 4 (Produção de Games)  **
  
Está acontecendo uma competição mundial de desenvolvimento ninja de jogos, onde 5 equipes devem produzir vários games em pouquíssimos segundos. Assuma que o processo de criação de um jogo passa por duas etapas: concepção (game design) e desenvolvimento. Considere as seguintes informações:
* Cada equipe possui um nome, um game designer e um desenvolvedor
* Cada equipe deve produzir 10 jogos
* Um game designer leva um tempo entre 500ms e 1000ms para preparar o documento de game design (GDD)
* Um desenvolvedor, com o GDD em mãos, finaliza o jogo especificado num tempo entre 500ms e 2000ms
* Não podem existir mais do que dois GDDs pendentes
* O desenvolvedor só pode trabalhar em um jogo por vez
Utilizando os conceitos de programação concorrente e do problema Produtor/Consumidor, desenvolva uma solução para executar a competição. Assim que uma equipe terminar de produzir 10 jogos, a competição será interrompida. Imprima o ranking das equipes ordenado pelo número de jogos que cada uma produziu.  
  
**QUESTÃO 5 (Café e banheiro)  **
   
Nesta questão você deve implementar a simulação de uma cafeteria como descrito a seguir. Em uma cafeteria, os consumidores competem pelos N banheiros disponíveis. Existe um quadro onde são colocadas as N chaves, uma para cada banheiro. Quando um consumidor chega na frente do quadro, ele pode pegar uma chave e usar o respectivo banheiro, e em seguida colocar a chave no quadro novamente. Se não houver nenhuma chave no quadro, o consumidor precisa esperar até um dos banheiros seja desocupado e a chave esteja disponível no quadro. Os consumidores executam baseados no pseudocódigo a seguir:  

print("Consumidor %d entrou na cafeteria.\n", id);  

 for (int i=0; i < K; i++) {  
 
       bebe café  
       
       pega um chave  
       
       usa o banheiro  
       
       coloca a chave de volta  
         
 }  
  
print("Consumidor %d deixa a cafeteria.\n", id);  
  
As operações "bebe café" e "usa o banheiro" apenas imprimem uma mensagem como "Consumidor X está tomando café" e em seguida faz a thread consumidor dormir entre 2 e 10 segundos. A simulação deve receber como entrada X (o número de consumidores), N (o número de banheiros/chaves disponíveis) e K (o mesmo do loop mostrado no pseudocódigo). Você deve garantir que todos os consumidores consigam realizar suas operações e que nenhum dos consumidores use o mesmo banheiro ao mesmo tempo. Para cada consumidor deve existir uma thread no programa. Sua solução não deve usar métodos synchronized nem travas explícitas e deve, ainda assim, garantir que condições de corrida, deadlocks, livelocks, etc não aconteçam.   
   
**QUESTÃO 6 (Cartas)  **
   
Implemente um jogo de baralho que tem uma pilha de cartas embaralhadas com o número de baralhos igual ao número de jogadores (baralhos de 52 cartas). Em cada rodada os jogadores puxam 3 cartas de qualquer lugar da pilha, escolhem a carta mais alta para disputar uma batalha com os outros jogadores e devolvem as outras cartas para pilha também em posições randômicas. Quem tiver a carta mais alta fica com todas as cartas usadas na disputa naquela rodada (utilize a sequência de valor 2‐10, J, Q, K, As) e no caso de ocorrer um empate é feita uma nova rodada só para os jogadores empatados. O jogo acaba quando a pilha de cartas da mesa acabar e ganha o(s) jogador(es) que tiver(em) mais cartas. O seu programa deve tratar cada jogador como uma thread diferente e usar classes da biblioteca java.util.concurrent para criar, gerenciar as threads e fazer o controle de concorrência. O seu programa também deve imprimir cada disputa entre os jogadores e dizer o resultado por rodada (não precisar dizer todas as cartas puxadas, só as disputadas e dizer quem ganhou ou os que empataram), no final informar com quantas cartas terminou cada jogador e quem foram os vencedores.

