import React,{useState} from "react";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";
function App() {
  const [view, setView] = useState("books");
  return (
    <div style={{ padding: "20px" }}>
      <h1>Blogger App</h1>

      <div>
        <button onClick={() => setView("books")}>Show Books</button>
        <button onClick={() => setView("blogs")}>Show Blogs</button>
        <button onClick={() => setView("courses")}>Show Courses</button>
      </div>

      <hr />
         {/* Conditional rendering using if-else */}
      {view === "books" && <BookDetails />}

      {/* Conditional rendering using ternary operator */}
      {view === "blogs" && <BlogDetails />}

      {/* Conditional rendering using logical && */}
      {view === "courses" && <CourseDetails />}
      </div>
  );
}

export default App;
