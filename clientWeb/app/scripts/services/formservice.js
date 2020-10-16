'use strict';

/**
 * @ngdoc service
 * @name clientWebApp.formService
 * @description
 * # formService
 * Factory in the clientWebApp.
 */
angular.module('clientWebApp')
  .factory('formService', function () {
    // Service logic
    // ...

    var meaningOfLife = 42;

    // Public API here
    return {
      someMethod: function () {
        return meaningOfLife;
      }
    };
  });
