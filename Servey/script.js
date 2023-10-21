function validateForm() {
    // Add validation logic here
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;

    // Validate email using a regular expression
    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        return false;
    }

    // Validate mobile number (assuming 10-digit format)
    var mobilePattern = /^\d{10}$/;
    if (!mobilePattern.test(mobile)) {
        alert("Please enter a valid 10-digit mobile number.");
        return false;
    }

    // Show success message
    alert("Form submitted successfully!");

    // Reset the form
    document.getElementById("surveyForm").reset();

    return false; // Prevent actual form submission
}

function resetForm() {
    // Reset the form
    document.getElementById("surveyForm").reset();
}