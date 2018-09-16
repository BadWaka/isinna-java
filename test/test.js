/*
 *
 * @type {string}
 */
app.config(function () {
    $stateProvider
        .state('route1', {
            url: '/url1',
            views: {
                '': {
                    templateUrl: 't11'
                },
                'name12': {
                    templateUrl: 't12'
                },
                'name13': {
                    templateUrl: 't13'
                }
            }
        })
        .state('route2', {
            url: '/url2',
            views: {
                '': {
                    templateUrl: 't21'
                },
                'name22': {
                    templateUrl: 't22'
                },
                'name23': {
                    templateUrl: 't23'
                }
            }
        })
});