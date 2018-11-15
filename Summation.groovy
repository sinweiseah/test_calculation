def summation = 0

testSubformTwo.each{ aLoop ->
if (aLoop.numberTwo > 5)
{
summation = summation + aLoop.valueTwo
}
}

execution.setVariable("setNumber", summation)
return {"setNumber": summation}
