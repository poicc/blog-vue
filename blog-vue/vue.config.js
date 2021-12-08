module.exports = {
    productionSourceMap: false,
    publicPath: './',
    outputDir: 'dist',
    assetsDir: 'assets',
    devServer: {
      port: 8090,
      host: 'localhost',
      https: false,
      open: true
    },
  }