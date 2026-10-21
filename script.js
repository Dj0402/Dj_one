
document.addEventListener('DOMContentLoaded', () => {
    const burger = document.querySelector('.navbar-burger');
    const menu = document.querySelector('#navbarMenu');
    
    if (burger) {
        burger.addEventListener('click', () => {
            burger.classList.toggle('is-active');
            menu.classList.toggle('is-active');
        });
    }
    const tabs = document.querySelectorAll('.tabs li');
    const panels = document.querySelectorAll('.tab-panel');

    tabs.forEach(tab => {
        tab.addEventListener('click', () => {
            tabs.forEach(t => t.classList.remove('is-active'));
            tab.classList.add('is-active');

            panels.forEach(panel => panel.style.display = 'none');

            const tabId = tab.getAttribute('data-tab');
            document.querySelector(`[data-content="${tabId}"]`).style.display = 'block';
        });
    });

    const scrollTop = document.getElementById('scrollTop');
    
    window.addEventListener('scroll', () => {
        if (window.pageYOffset > 300) {
            scrollTop.classList.add('visible');
        } else {
            scrollTop.classList.remove('visible');
        }
    });

    scrollTop.addEventListener('click', () => {
        window.scrollTo({
            top: 0,
            behavior: 'smooth'
        });
    });


    const formulario = document.getElementById('miFormulario');
    if (formulario) {
        formulario.addEventListener('submit', (e) => {
            e.preventDefault();
            alert('Formulario enviado correctamente'); });
    }
});