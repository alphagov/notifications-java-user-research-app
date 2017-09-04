<#include "header.html">

<form method='POST'>
    <label for='name'>Name</label>
    <input type='text' name="name" id='name' value="${address.name}"/>
    <label for='streetAddress'>Street Address</label>
    <input type='text' name="streetAddress" id='streetAddress' value="${address.streetAddress}"/>
    <label for='town'>Town</label>
    <input type='text' name="town" id='town' value="${address.town}"/>
    <label for='county'>County</label>
    <input type='text' name="county" id='county' value="${address.county}"/>
    <label for='postcode'>Postcode</label>
    <input type='text' name="postcode" id='postcode' value="${address.postcode}"/>
    <button type='submit'>Send letter</button>
</form>

<#include "footer.html">
