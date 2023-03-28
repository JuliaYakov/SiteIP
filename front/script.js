'use strict'
async function calculate(){
    let num1 = document.getElementById("input1").value
    let num2 = document.getElementById("input2").value
    let operator = document.getElementById("operator").value
    let result = document.getElementById("result")
    let type = document.getElementById("Type").value


    let response = await fetch(`http://localhost:8080/${operator}?Type=${type}&value1=${num1}&value2=${num2}`)
    let res = await response.text()
    result.value = res
}

      

