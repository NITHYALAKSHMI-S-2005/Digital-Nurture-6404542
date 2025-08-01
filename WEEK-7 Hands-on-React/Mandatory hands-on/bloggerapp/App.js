import React, { useState } from "react";
import CourseDetails from "./CourseDetails";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";

function App() {
  const [showContent, setShowContent] = useState(true);

  return (
    <div style={{ display: "flex", justifyContent: "space-around", padding: "20px", fontFamily: "Arial" }}>
      {showContent && <CourseDetails />}
      {showContent && <BookDetails />}
      {showContent && <BlogDetails />}
    </div>
  );
}

export default App;