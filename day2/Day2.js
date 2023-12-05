console.time('Time');
const fs = require('fs');
const allContents = fs.readFileSync('data.txt', 'utf-8');

const gameList = [];

//config game
var red = 12;
var green = 13;
var blue = 14;


allContents.split(/\r?\n/).forEach((line) => {
    gameList.push(line.split(': ').pop().split('; '));
});
//console.log(gameList);
var result = 0;
gameList.forEach((games, index) => {
    var error = 0;
    games.forEach((game) => {
        var set = game.split(", ");
        set.forEach((bal) => {
            if(bal.split(' ').pop() == "red"){
                if(bal.split(' ')[0] > red){
                    error++;
                }
            }
            if(bal.split(' ').pop() == "green"){
                if(bal.split(' ')[0] > green){
                    error++;
                }
            }
            if(bal.split(' ').pop() == "blue"){
                if(bal.split(' ')[0] > blue){
                    error++;
                }
            }
        });
    });

        if (error == 0){
            console.log('Game ' + (index + 1 ) + 'is possible');
            console.log(games);
            result += (index + 1);
            }
    });
console.log('totale value game ids: ', result);
console.timeEnd('Time');