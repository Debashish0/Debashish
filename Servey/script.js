function validateForm() {
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;
    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        return false;
    }

    var mobilePattern = /^\d{10}$/;
    if (!mobilePattern.test(mobile)) {
        alert("Please enter a valid 10-digit mobile number.");
        return false;
    }
    alert("Form submitted successfully!");

    document.getElementById("surveyForm").reset();

    return false;
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}
