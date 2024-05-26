function showPage(page) {
    var content = document.getElementById("content");
    
    switch (page) {
        case 'page1':
            content.innerHTML = "<h1>Welcome to Page 1</h1><p>This is the content for Page 1.</p>";
            break;
        case 'page2':
            content.innerHTML = "<h1>Welcome to Page 2</h1><p>This is the content for Page 2.</p>";
            break;
        case 'page3':
            content.innerHTML = "<h1>Welcome to Page 3</h1><p>This is the content for Page 3.</p>";
            break;
        default:
            break;
    }
}


