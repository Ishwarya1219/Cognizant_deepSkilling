import React,{Component} from "react";
import Post from './Post';
import PostItem from "./PostItem";
class Posts extends Component{

    state={posts:[],hasError:false};

    constructor(props){
        super(props);
    }
    loadPosts=()=>{
       fetch('https://jsonplaceholder.typicode.com/posts')
       .then(res=>res.json())
       .then(json =>
        this.setState({
            posts:json.slice(0,10).map(p => new Post(p.id,p.title,p.body))

        })
       )
       .catch(err=>{
        console.error(err);
        this.setState({hasError:true});
       });
    };
    componentDidMount() {
  this.loadPosts();
}

    componentDidCatch(){
        alert('A rendering error occurred.');
        //console.error(error,info);

    }

    render(){
   const {posts} =this.state;
   return(
    <div>
        <h1>Blog Posts</h1>
        {posts.map(post =>(
            <PostItem key={post.id} post={post}/>
        ))}
    </div>
   );
    }
    
}
export default Posts;