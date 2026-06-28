// Validates the form when the Register button is clicked.
function validateForm() {

    // Reading values entered by the user
    const fullName = document.getElementById("name").value.trim();
    const age = document.getElementById("age").value;
    const country = document.getElementById("country").value;
    const phone = document.getElementById("phone").value.trim();
    const email = document.getElementById("email").value.trim();                // duplicate validation (Already handled by type="email")
    const password = document.getElementById("password").value;
    const termsAccepted = document.getElementById("terms").checked;             // duplicate validation (Already handled by 'required')

    // Regular Expressions
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const phoneRegex = /^[0-9]{10}$/;
    const passwordRegex = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$^&*-]).{8,}$/;

    // Full Name Validation
    if (fullName.length < 3) {
        showMessage("Full name must contain at least 3 characters.", "error");
        return false;
    }

    // Age Validation
    if (age < 18 || age > 60) {
        showMessage("Age must be between 18 and 60.", "error");
        return false;
    }

    // Country Validation
    if (country === "") {
        showMessage("Please select your country.", "error");
        return false;
    }

    // Phone Number Validation
    if (!phoneRegex.test(phone)) {
        showMessage("Phone number must contain exactly 10 digits.", "error");
        return false;
    }

    // Email Validation
    if (!emailRegex.test(email)) {
        showMessage("Please enter a valid email address.", "error");
        return false;
    }

    // Password Validation
    if (!passwordRegex.test(password)) {
        showMessage("Password must have at least 8 characters, one uppercase letter, one number and one special character.", "error");
        return false;
    }

    // Terms & Conditions Validation  
    if (!termsAccepted) {
        showMessage("Please accept the Terms and Conditions.", "error");
        return false;
    }

    // Success Message
    showMessage("Registration completed successfully!", "success");

    // Prevent actual form submission
    return false;
}


// Displays Success or Error Messages
function showMessage(message, type) {

    // Message box used to display validation messages
    const messageBox = document.getElementById("message");
    messageBox.style.display = "block";

    messageBox.textContent = message;
    messageBox.className = "message " + type;

}