(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "foodform"]
  (include-css "/stylesheets/foodform.css")
  (include-js "/javascript/foodform.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]
