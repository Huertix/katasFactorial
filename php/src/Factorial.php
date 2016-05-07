<?php
namespace KataFactorial;

class Factorial
{
    public function calculate($n)
    {
        return $n > 1 ? $n*$this->calculate($n) : 1;
    }
}
