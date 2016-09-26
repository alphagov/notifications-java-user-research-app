<#include "header.html">

<form method='POST'>
    <label for='phoneNumber'>Phone number</label>
    <input type='text' name="phoneNumber" id='phoneNumber' value="${phoneNumber.phoneNumber}"/>
    <button type='submit'>Send</button>
</form>

<#include "footer.html">