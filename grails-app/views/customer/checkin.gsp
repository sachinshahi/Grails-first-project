<!doctype html>
    <html>

    <head>
      <title>Kiosk</title>
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">
    </head>

    <body>
    <g:form url="[resource:customerInstance, action:'customerLookup']" >
      <g:render template="kiosForm"/>
    </g:form>
    </body>
    </html>