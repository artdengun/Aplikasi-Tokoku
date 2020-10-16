'use strict';

/**
 * @ngdoc function
 * @name clientWebApp.controller:ProductCtrl
 * @description
 * # ProductCtrl
 * Controller of the clientWebApp
 */
angular.module('clientWebApp')
  .controller('ProductCtrl', function ($scope, ProductService) {
      $scope.products = ProductService.query();
  });
