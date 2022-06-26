const {createText } = require('../util.js');

describe ('Validação de texto de saída', () =>{


    test('Criação de uma classe', () =>{
        expect(outputText).toBe (22);
    })
})




// "jest":{
//     "testEnvironment": "jsdom"
// },
// describe('Validate Create element',() => {
//     test('Create new element with data', () => {
//         const element = createElement('li', "exampleElement", 'user-item');
//         expect(element.textContent).toMatch(/exampleElement/);
//     });
//    /*  test('Create new element without data', () => {
//         const element = createElement(null);
//         expect(element.textContent).toBe("");
//     }); */
// })
