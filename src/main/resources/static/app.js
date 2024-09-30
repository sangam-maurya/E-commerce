const cart = [];

// Function to add product to cart
function addToCart(id, name, price, image) {
    const product = { id, name, price, image };
    cart.push(product);
    alert(`${name} added to cart!`);
    updateCart();
}

// Update cart items in modal
function updateCart() {
    const cartItemsContainer = document.getElementById('cart-items');
    cartItemsContainer.innerHTML = ''; // Clear previous items

    cart.forEach((item, index) => {
        const cartItem = `
            <div class="cart-item">
                <img src="${item.image}" alt="${item.name}" width="50">
                <p>${item.name} - $${item.price}</p>
                <button class="btn btn-danger btn-sm" onclick="removeFromCart(${index})">Remove</button>
            </div>
        `;
        cartItemsContainer.innerHTML += cartItem;
    });
}

// Function to remove product from cart
function removeFromCart(index) {
    cart.splice(index, 1);
    updateCart();
}

// Event listeners for Add to Cart buttons
document.querySelectorAll('.add-to-cart-btn').forEach(button => {
    button.addEventListener('click', () => {
        const id = button.getAttribute('data-id');
        const name = button.getAttribute('data-name');
        const price = button.getAttribute('data-price');
        const image = button.getAttribute('data-image');
        addToCart(id, name, price, image);
    });
});
