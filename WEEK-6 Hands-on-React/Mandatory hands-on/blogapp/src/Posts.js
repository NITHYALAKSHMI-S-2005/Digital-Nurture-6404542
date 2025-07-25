import React from 'react';
import Post from './Post';
import './Posts.css';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = { posts: [] };
  }

  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const data = await response.json();
      const postList = data.slice(0, 5).map(p => new Post(p.id, p.title, p.body));
      this.setState({ posts: postList });
    } catch (error) {
      console.error("Failed to load posts", error);
    }
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred while rendering posts.");
  }

  render() {
    return (
      <div className="container">
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} className="post">
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
