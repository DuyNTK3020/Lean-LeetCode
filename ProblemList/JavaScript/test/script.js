const args = [{},null,42]
const createHelloWorld = () => (...args) => "Hello World" 


const f = createHelloWorld();

console.log(`${f(args)}`);