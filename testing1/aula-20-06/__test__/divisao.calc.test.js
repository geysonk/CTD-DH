const { divisao } = require('../calc.js');

describe ('Testes de divisão', () => {
    
    test('Divisão de dois numeros', () =>{
        expect(divisao(100,10)).toBe(10);
    })
})