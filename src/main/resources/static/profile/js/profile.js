// Get references to the input and buttons
const adresseInput = document.getElementById("adresseInput");
const telePersoInput = document.getElementById("telePersoInput");
const teleProInput = document.getElementById("teleProInput");
const emailPersoInput = document.getElementById("emailPersoInput");
const emailProInput = document.getElementById("emailProInput");
const modifierButton = document.getElementById("modifierButton");
const enregistrerButton = document.getElementById("enregistrerButton");

// Add event listener to the modifier button
modifierButton.addEventListener("click", function() {
    // Make the input field modifiable
    telePersoInput.removeAttribute("readonly");
    adresseInput.removeAttribute("readonly");
    teleProInput.removeAttribute("readonly");
    emailPersoInput.removeAttribute("readonly");
    emailProInput.removeAttribute("readonly");
    // Hide the modifier button
    modifierButton.style.display = "none";

    // Show the enregistrer button
    enregistrerButton.style.display = "inline-block";
});

enregistrerButton.addEventListener("click", function(){
    telePersoInput.setAttribute("readonly", "");
    adresseInput.setAttribute("readonly", "");
    teleProInput.setAttribute("readonly", "");
    emailPersoInput.setAttribute("readonly", "");
    emailProInput.setAttribute("readonly", "");
    modifierButton.style.display = "inline-block";
    enregistrerButton.style.display = "none";
});