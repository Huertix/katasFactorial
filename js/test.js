/*
 Factorial: https://en.wikipedia.org/wiki/Factorial
 Notation: n! = n * (n-1) * .. * 1
 Example: 5! = 5*4*3*2*1 = 120
*/

function factorial(n) {
	return n>1 ? factorial(n-1) * n : 1;
}
describe("Factorial test", function(){
	it("0! should be 1", function(){
		expect(factorial(0)).toBe(1);
	});

	it("1! should be 1", function(){
		expect(factorial(1)).toBe(1);
	});

	it("3! should be 6", function(){
		expect(factorial(3)).toBe(6);
	});

	it("15! should be 1.307.674.368.000", function(){
		expect(factorial(15)).toBe(1307674368000);
	});
    
});