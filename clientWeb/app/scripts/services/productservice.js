'use strict';

/**
 * @ngdoc service
 * @name clientWebApp.ProductService
 * @description
 * # ProductService
 * Factory in the clientWebApp.
 */
angular.module('clientWebApp')
  .factory('ProductService', function ($resource) {
    return {
     productResource: $resource('api/product/:id'),
     get: function(param, callback){
        return this.productResource.get(param, callback);
     },
     query: function () {
        return this.productResource.query();
     }
      }
    });
