//$(document).ready(function() {
//    PrimeFaces.widget.Dialog.prototype.originalHide = PrimeFaces.widget.Dialog.prototype.hide; // keep a reference to the original hide()
//    PrimeFaces.widget.Dialog.prototype.hide = function() {
//        var ajaxResponseArgs = arguments.callee.caller.arguments[2]; // accesses oncomplete arguments
//        if (ajaxResponseArgs && ajaxResponseArgs.validationFailed) {
//            return;  // on validation error, prevent closing
//        }
//        this.originalHide();
//    };
//});

function handleRequest(xhr, status, args) {
//	alert(args);
	if (args != null) {
//		alert(args.validationFailed);
		if (!args.validationFailed) {
			PF('createEditWidget').hide();
		}
	}
}

function validarTexto(e, patron) {
    key = (document.all) ? e.keyCode : e.which;
    if ((key == null) || (key == 0) || (key == 8) || (key == 9) || (key == 27)) {
        return true;
    }

    te = String.fromCharCode(key);
    return patron.test(te);
}