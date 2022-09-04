(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[608],{9361:function(a,b){"use strict";b.Z=function(a,b,c){return b in a?Object.defineProperty(a,b,{value:c,enumerable:!0,configurable:!0,writable:!0}):a[b]=c,a}},8461:function(a,b,c){"use strict";Object.defineProperty(b,"__esModule",{value:!0});var d=c(9361).Z,e=c(4941).Z,f=c(3929).Z;Object.defineProperty(b,"__esModule",{value:!0}),b.default=function(a){var b,c=a.src,h=a.sizes,i=a.unoptimized,o=void 0!==i&&i,p=a.priority,x=void 0!==p&&p,A=a.loading,B=a.className,C=a.quality,D=a.width,E=a.height,F=a.fill,G=a.style,H=a.onLoadingComplete,I=a.placeholder,J=void 0===I?"empty":I,K=a.blurDataURL,L=j(a,["src","sizes","unoptimized","priority","loading","className","quality","width","height","fill","style","onLoadingComplete","placeholder","blurDataURL"]);if(!q)throw Error('The "next/future/image" component is experimental and may be subject to breaking changes. To enable this experiment, please include `experimental: { images: { allowFutureImage: true } }` in your next.config.js file.');var M=k.useContext(n.ImageConfigContext),N=k.useMemo(function(){var a=s||M||m.imageConfigDefault,b=f(a.deviceSizes).concat(f(a.imageSizes)).sort(function(a,b){return a-b}),c=a.deviceSizes.sort(function(a,b){return a-b});return g({},a,{allSizes:b,deviceSizes:c})},[M]),O=L,P=z;if("loader"in O){if(O.loader){var Q,R=O.loader;P=function(a){a.config;var b=j(a,["config"]);return R(b)}}delete O.loader}var S="";if(u(c)){var T=t(c)?c.default:c;if(!T.src)throw Error("An object should only be passed to the image component src parameter if it comes from a static image import. It must include src. Received ".concat(JSON.stringify(T)));if(K=K||T.blurDataURL,S=T.src,E=E||T.height,D=D||T.width,!T.height||!T.width)throw Error("An object should only be passed to the image component src parameter if it comes from a static image import. It must include height and width. Received ".concat(JSON.stringify(T)))}c="string"==typeof c?c:S;var U=!x&&("lazy"===A|| void 0===A);(c.startsWith("data:")||c.startsWith("blob:"))&&(o=!0,U=!1),r&&(o=!0);var V=e(k.useState(!1),2),W=V[0],X=V[1],Y=e(k.useState(!1),2),Z=Y[0],$=Y[1],_=w(D),aa=w(E),ab=w(C),ac=Object.assign(F?{position:"absolute",height:"100%",width:"100%",left:0,top:0,right:0,bottom:0}:{},Z||"blur"===J?{}:{color:"transparent"},G),ad="url(\"data:image/svg+xml;charset=utf-8,%3Csvg xmlns='http%3A//www.w3.org/2000/svg' viewBox='0 0 ".concat(_," ").concat(aa,"'%3E%3Cfilter id='b' color-interpolation-filters='sRGB'%3E%3CfeGaussianBlur stdDeviation='50'/%3E%3C/filter%3E%3Cimage filter='url(%23b)' x='0' y='0' height='100%25' width='100%25' href='").concat(K,"'/%3E%3C/svg%3E\")"),ae="blur"!==J||W?{}:g({backgroundSize:ac.objectFit||"cover",backgroundPosition:ac.objectPosition||"0% 0%"},(null==K?void 0:K.startsWith("data:image"))?{backgroundImage:ad}:{filter:"blur(20px)",backgroundImage:'url("'.concat(K,'")')}),af=v({config:N,src:c,unoptimized:o,width:_,quality:ab,sizes:h,loader:P}),ag=c,ah="imagesrcset",ai="imagesizes";ai="imageSizes";var aj=(d(b={},"imageSrcSet",af.srcSet),d(b,ai,af.sizes),b),ak=k.useRef(H);k.useEffect(function(){ak.current=H},[H]);var al=g({isLazy:U,imgAttributes:af,heightInt:aa,widthInt:_,qualityInt:ab,className:B,imgStyle:ac,blurStyle:ae,loading:A,config:N,fill:F,unoptimized:o,placeholder:J,loader:P,srcString:ag,onLoadingCompleteRef:ak,setBlurComplete:X,setShowAltText:$,noscriptSizes:h},O);return k.default.createElement(k.default.Fragment,null,k.default.createElement(y,Object.assign({},al)),x?k.default.createElement(l.default,null,k.default.createElement("link",Object.assign({key:"__nimg-"+af.src+af.srcSet+af.sizes,rel:"preload",as:"image",href:af.srcSet?void 0:af.src},aj))):null)};var g=c(6495).Z,h=c(2648).Z,i=c(1598).Z,j=c(7273).Z,k=i(c(7294)),l=h(c(5443)),m=c(9309),n=c(9977);c(3794);var o={deviceSizes:[640,750,828,1080,1200,1920,2048,3840],imageSizes:[16,32,48,64,96,128,256,384],path:"/_next/image",loader:"default",dangerouslyAllowSVG:!1,experimentalUnoptimized:!0,experimentalFuture:!0},p=o.experimentalFuture,q=void 0!==p&&p,r=(o.experimentalRemotePatterns,o.experimentalUnoptimized),s={deviceSizes:[640,750,828,1080,1200,1920,2048,3840],imageSizes:[16,32,48,64,96,128,256,384],path:"/_next/image",loader:"default",dangerouslyAllowSVG:!1,experimentalUnoptimized:!0,experimentalFuture:!0};function t(a){return void 0!==a.default}function u(a){var b;return"object"==typeof a&&(t(a)|| void 0!==(b=a).src)}function v(a){var b=a.config,c=a.src,d=a.unoptimized,e=a.width,g=a.quality,h=a.sizes,i=a.loader;if(d)return{src:c,srcSet:void 0,sizes:void 0};var j=function(a,b,c){var d=a.deviceSizes,e=a.allSizes;if(c){for(var g=/(^|\s)(1?\d?\d)vw/g,h=[];i=g.exec(c);i)h.push(parseInt(i[2]));if(h.length){var i,j,k=.01*(j=Math).min.apply(j,f(h));return{widths:e.filter(function(a){return a>=d[0]*k}),kind:"w"}}return{widths:e,kind:"w"}}return"number"!=typeof b?{widths:d,kind:"w"}:{widths:f(new Set([b,2*b].map(function(a){return e.find(function(b){return b>=a})||e[e.length-1]}))),kind:"x"}}(b,e,h),k=j.widths,l=j.kind,m=k.length-1;return{sizes:h||"w"!==l?h:"100vw",srcSet:k.map(function(a,d){return"".concat(i({config:b,src:c,quality:g,width:a})," ").concat("w"===l?a:d+1).concat(l)}).join(", "),src:i({config:b,src:c,quality:g,width:k[m]})}}function w(a){return"number"==typeof a|| void 0===a?a:"string"==typeof a&&/^[0-9]+$/.test(a)?parseInt(a,10):NaN}function x(a,b,c,d,e){a&&a["data-loaded-src"]!==b&&(a["data-loaded-src"]=b,("decode"in a?a.decode():Promise.resolve()).catch(function(){}).then(function(){if(a.parentNode&&("blur"===c&&e(!0),null==d?void 0:d.current)){var b=a.naturalWidth,f=a.naturalHeight;d.current({naturalWidth:b,naturalHeight:f})}}))}var y=function(a){var b=a.imgAttributes,c=a.heightInt,d=a.widthInt,e=a.qualityInt,f=a.className,h=a.imgStyle,i=a.blurStyle,l=a.isLazy,m=a.fill,n=a.placeholder,o=a.loading,p=a.srcString,q=a.config,r=a.unoptimized,s=a.loader,t=a.onLoadingCompleteRef,u=a.setBlurComplete,w=a.setShowAltText,y=a.onLoad,z=a.onError,A=a.noscriptSizes,B=j(a,["imgAttributes","heightInt","widthInt","qualityInt","className","imgStyle","blurStyle","isLazy","fill","placeholder","loading","srcString","config","unoptimized","loader","onLoadingCompleteRef","setBlurComplete","setShowAltText","onLoad","onError","noscriptSizes"]);return o=l?"lazy":o,k.default.createElement(k.default.Fragment,null,k.default.createElement("img",Object.assign({},B,b,{width:d,height:c,decoding:"async","data-nimg":"future".concat(m?"-fill":""),className:f,loading:o,style:g({},h,i),ref:k.useCallback(function(a){(null==a?void 0:a.complete)&&x(a,p,n,t,u)},[p,n,t,u]),onLoad:function(a){x(a.currentTarget,p,n,t,u),y&&y(a)},onError:function(a){w(!0),"blur"===n&&u(!0),z&&z(a)}})),"blur"===n&&k.default.createElement("noscript",null,k.default.createElement("img",Object.assign({},B,v({config:q,src:p,unoptimized:r,width:d,quality:e,sizes:A,loader:s}),{width:d,height:c,decoding:"async","data-nimg":"future".concat(m?"-fill":""),style:h,className:f,loading:o}))))};function z(a){var b=a.config,c=a.src,d=a.width,e=a.quality;return c.endsWith(".svg")&&!b.dangerouslyAllowSVG?c:"".concat(b.path,"?url=").concat(encodeURIComponent(c),"&w=").concat(d,"&q=").concat(e||75)}("function"==typeof b.default||"object"==typeof b.default&&null!==b.default)&& void 0===b.default.__esModule&&(Object.defineProperty(b.default,"__esModule",{value:!0}),Object.assign(b.default,b),a.exports=b.default)},1608:function(a,b,c){a.exports=c(8461)}}])