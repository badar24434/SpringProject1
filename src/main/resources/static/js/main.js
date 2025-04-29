// Main JavaScript file for Spring Boot Web Demo

document.addEventListener('DOMContentLoaded', function() {
    console.log('Spring Boot Web Demo loaded successfully!');

    // Add animation to cards
    const cards = document.querySelectorAll('.card');
    cards.forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transition = 'all 0.3s ease';
            this.style.boxShadow = '0 8px 16px rgba(0, 0, 0, 0.1)';
        });

        card.addEventListener('mouseleave', function() {
            this.style.transition = 'all 0.3s ease';
            this.style.boxShadow = '0 2px 4px rgba(0, 0, 0, 0.05)';
        });
    });
});