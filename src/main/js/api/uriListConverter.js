define(function () {
    'use strict';

    return {
        read: function (str /*, opts */) {
            return str.split('\n');
        },
        write: function (obj ) {
            if (obj instanceof Array) {
                return obj.map(resource => resource._links.self.href).join('\n');
            } else { // otherwise, just return the self URI
                return obj._links.self.href;
            }
        }
    };

});