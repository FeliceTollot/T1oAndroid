module.exports = {
    echo: function (message, onSuccess, onFail) {
        cordova.exec(onSuccess, onFail, "T1-LLI", "echo", [message]);
    }
}
