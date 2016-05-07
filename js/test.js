/*
 Factorial: https://en.wikipedia.org/wiki/Factorial
 Notation: n! = n * (n-1) * .. * 1
 Example: 5! = 5*4*3*2*1 = 120
TODO
	Factorial(0) = 1;
	Factorial(1) = 1;
	Factorial(3) = 6;
	Factorial(15) = 1.307.674.368.000;
*/

function factorial(n) {
	return 1;
}
describe("Factorial test", function(){
	it("0! should be 1", function(){
		expect(factorial(0)).toBe(1);
	});
});