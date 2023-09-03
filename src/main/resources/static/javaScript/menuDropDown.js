document.addEventListener("DOMContentLoaded", function() {
    const dropdowns = document.querySelectorAll('.btn-group');
    dropdowns.forEach(function(dropdown) {
        dropdown.addEventListener('mouseover', function() {
            this.querySelector('.dropdown-toggle').click();
        });
        dropdown.addEventListener('mouseout', function() {
            this.querySelector('.dropdown-toggle').click();
        });
    });
});