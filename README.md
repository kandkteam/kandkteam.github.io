Minimal example showing how shadow-cljs could be used together with next.js to create static sites in CLJS.

`site` is a directory used by `next`, all `.js` files will be generated by shadow-cljs. I nested the `site` directory in the `shadow-cljs` project but you can also nest the `shadow-cljs` directory in the next root instead. I do not recommend mixing though.

## Run shadow-cljs

```
npm install
npx shadow-cljs watch site
# or
npx shadow-cljs release site
```

## Run next separately

```
cd website
npm install
npx next
# or
npx next build && npx next start
```

## When done open in browser

```
open http://localhost:3000

next NODE_ENV=production
next build
NODE_ENV=production next start

Local test to get user information
User one openid=op0ndvkEZ42BuRoY0qqqotZRpMXg
This project tests api utils/const.cljs for configuration
For development and use, please change the address by yourself
```
