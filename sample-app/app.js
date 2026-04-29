document.querySelector('#status-button').addEventListener('click', () => {
  document.querySelector('#status').textContent = `Bundle checked at ${new Date().toLocaleTimeString()}.`;
});
