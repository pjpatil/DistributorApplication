/**
 * 
 */
$(document).ready(function () {
    // Form validation
    $('#signInForm').on('submit', function (event) {
        event.preventDefault();
        validateForm();
    });
});

function validateForm() {
    let isValid = true;
    const username = $('#username');
    const password = $('#password');

    // Clear previous errors
    $('.invalid-feedback').hide();

    // Validate username
    if (username.val().trim() === '') {
        username.next('.invalid-feedback').show();
        isValid = false;
    }

    // Validate password
    if (password.val().trim() === '') {
        password.next('.invalid-feedback').show();
        isValid = false;
    }

    if (isValid) {
        alert('Form submitted successfully!');
        $('#signInModal').modal('hide');
    }
}
