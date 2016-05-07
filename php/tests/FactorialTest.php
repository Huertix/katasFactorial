<?php

class FactorialTest extends PHPUnit_Framework_TestCase
{
    private $factorial;

    public function setUp()
    {
        $this->factorial = new KataFactorial\Factorial;
    }

    /**
     * @test
     */
    public function shouldReturnOneWhenZero()
    {
        $this->assertEquals(1, $this->factorial->calculate(0));
    }

    /**
     * @test
     */
    public function shouldReturnOneWhenOne()
    {
        $this->assertEquals(1, $this->factorial->calculate(1));
    }

    /**
     * @test
     */
    public function shouldReturnSixWhenThree()
    {
        $this->assertEquals(6, $this->factorial->calculate(3));
    }
}
