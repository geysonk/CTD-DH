const {generateText } = require('../util.js');

describe ('Validação de texto de saída', () =>{

    test ('Saída de nome e idade', () =>{
        const text = generateText  ('Geyson Kaio', 22);
        expect(text).toBe ('Geyson Kaio (22 anos)');
    })
})