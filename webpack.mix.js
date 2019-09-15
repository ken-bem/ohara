let mix = require("laravel-mix");

mix
    .version()
    .js("src/main/webapp/**.js", "src/main/resources/static/js")
    // .sass("", "")
    .setPublicPath("src/main/resources/static");
