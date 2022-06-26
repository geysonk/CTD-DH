const { subtracao } = require('../calc.js');

describe ('Testes de subtração', () => {
    
    test('Subtração de dois numeros', () =>{
        expect(subtracao(5,3)).toBe(2);
    })

    test('Subtração de dois zeros', () =>{
        expect(subtracao(0,0)).toBe(0);
    })

    test ('Subtração de strings', () =>{
        expect(subtracao(-5,5)).toBe(-10);
    })

    test ('Subtração de numeros positivos', () =>{
        expect (subtracao(5,0)).toBe(5);
    })

    test ('Subtração de numeros negativos', () =>{
        expect (subtracao(-5,-5)).toBe(0);
    })
})