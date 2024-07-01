console.log("admin User");

document.querySelector("#image_file_input").addEventListener('change', function (event) {

    let file = new event.target.files[o];
    let reader = new FileReader();
    reader.onload = function () {
        document.getElementById("upload_image_preview").src = reader.result;
    };
    reader.readAsDataURL(file);

})