'use strict';

/**
 * @ngdoc service
 * @name clientWebApp.uploadService
 * @description
 * # uploadService
 * Factory in the clientWebApp.
 */
angular.module('clientWebApp')
  .factory('uploadService', function () {
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
