/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function cifrarInformacion(event) {
    event.preventDefault();
    //recuperamos los datos
    var camposFormulario = [
        document.getElementById("formRegistro:inputNombre").value,
        document.getElementById("formRegistro:inputApePat").value,
        document.getElementById("formRegistro:inputApeMat").value,
        document.getElementById("formRegistro:inputCorreoElectronico").value,
        document.getElementById("formRegistro:inputEdad").value,
        document.getElementById("formRegistro:codigoPostal").value,
        document.getElementById("formRegistro:direccion").value,
        document.getElementById("formRegistro:password").value,
        document.getElementById("formRegistro:confirmacionPassword").value
    ];

    var posNombre = 0, posApePat = 1, posApeMat = 2, posCorreoElectronico = 3, posEdad = 4, posCodigoPostal = 5, posDireccion = 6, posPassword = 7, posConfirmacionPassword = 8;
    //validamos que todos los campos sean llenados
    if (hayCamposVacios(camposFormulario)) {
        alert("Todos los campos son obligatorios");
        return false;
    } else {
        if (String(camposFormulario[posPassword]).trim() === String(camposFormulario[posConfirmacionPassword]).trim()) {
            var regexPassword = /^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/;
            if (regexPassword.test(String(camposFormulario[posPassword]))){
                //validamos que la información cumpla con los regex
                if (validaEstructuraCampos(camposFormulario)) {
                    //ciframos y enviamos el formulario
                    document.getElementById("formRegistro:inputNombre").value = btoa(camposFormulario[posNombre].toString().toUpperCase());
                    document.getElementById("formRegistro:inputApePat").value = btoa(camposFormulario[posApePat].toString().toUpperCase());
                    document.getElementById("formRegistro:inputApeMat").value = btoa(camposFormulario[posApeMat].toString().toUpperCase());
                    document.getElementById("formRegistro:inputCorreoElectronico").value = btoa(camposFormulario[posCorreoElectronico]);
                    document.getElementById("formRegistro:inputEdad").value = camposFormulario[posEdad];
                    document.getElementById("formRegistro:codigoPostal").value = camposFormulario[posCodigoPostal];
                    document.getElementById("formRegistro:password").value = btoa(camposFormulario[posPassword]);
                    document.getElementById("formRegistro:confirmacionPassword").value = btoa(camposFormulario[posConfirmacionPassword]);
                    document.getElementById("formRegistro:direccion").value = btoa(camposFormulario[posDireccion].toString().toUpperCase());
                    document.getElementById("formRegistro").submit();
                } else {
                    alert("Hay campos que no cumplen con la estructura adecuada, favor de validar");
                }
            }else{
                alert("La contraseña debe de tener minimo 8 caracteres, máximo 16, al menos una letra mayúscula, al menos una letra minúscula, al menos un número, sin espacios en blanco  y al menos un caracter especial")
            }
        } else {
            alert("Las contraseñas no coinciden");
            return false;
        }
    }

    function hayCamposVacios(campos) {
        for (var i = 0; i < 9; i++) {
            if (String(campos[0]).trim() === "") {
                return true;
            }
        }
        return false;
    }

    function validaEstructuraCampos(camposFormulario) {
        var regexFormulario = [
            /[A-Za-zÁÉÍÓÚÜÑáéíóúüñ' ]/, //regex nombre
            /[A-Za-zÁÉÍÓÚÜÑáéíóúüñ' ]/, //regexApellidoPaterno
            /[A-Za-zÁÉÍÓÚÜÑáéíóúüñ' ]/, //regexApellidoMaterno
            /[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}/, //regexCorreoElectronico
            /[0-9]/, //regexEdad
            /[0-9]/, //regexCodigoPostal
            /[.A-Za-zÁÉÍÓÚÜÑáéíóúüñ' 0-9]/
        ];
        for (var i = 0; i < regexFormulario.length; i++) {
            if (!regexFormulario[i].test(String(camposFormulario[i]))) {
//            if (!String(camposFormulario[i]).test(regexFormulario[i])) {
                return false;
            }
        }
        return true;
    }

}