function validateLoginForm() {

    const email = document.forms[0]["email"].value.trim();
    const password = document.forms[0]["password"].value.trim();

    if (email === "" || password === "") {
        alert("Email and Password are required.");
        return false;
    }

    return true;
}

function validateRegisterForm() {

    const name = document.forms[0]["name"].value.trim();
    const email = document.forms[0]["email"].value.trim();
    const password = document.forms[0]["password"].value.trim();

    if (name === "" || email === "" || password === "") {
        alert("All fields are required.");
        return false;
    }

    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        return false;
    }

    if (password.length < 6) {
        alert("Password must contain at least 6 characters.");
        return false;
    }

    return true;
}


