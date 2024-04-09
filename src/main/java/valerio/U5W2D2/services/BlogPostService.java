package valerio.U5W2D2.services;

import org.springframework.stereotype.Service;
import valerio.U5W2D2.entities.BlogPost;
import valerio.U5W2D2.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {

    private List<BlogPost> blogPostList= new ArrayList<>();

    public BlogPost saveBlogPost(BlogPost blogPost){
        Random random = new Random();
        blogPost.setId(random.nextInt(0, 10000));
        blogPostList.add(blogPost);
                return blogPost;
    }
    public List<BlogPost> getBlogPostList(){
        return this.blogPostList;
    }

    public BlogPost getSingleBlogPost(int id){
        BlogPost found = null;
        for(BlogPost blogPost : this.blogPostList){
            if (blogPost.getId() == id ){
                found = blogPost;
            }
        }
        if (found == null){
            throw new NotFoundException(id);
        }else{
            return found;
        }
    }

    public BlogPost updateBlogPost(int id , BlogPost updateBlogPost){
        BlogPost found = null;
        for(BlogPost blogPost1 : this.blogPostList){
            if (blogPost1.getId() == id ){
                found = blogPost1;
                found.setCategoria(updateBlogPost.getCategoria());
                found.setTitolo(updateBlogPost.getTitolo());
                found.setCover(updateBlogPost.getCover());
                found.setContenuto(updateBlogPost.getContenuto());
                found.setTempoDiLettura(updateBlogPost.getTempoDiLettura());
                break;
            }
        }
        if (found == null){
            throw new NotFoundException(id);
        }else{
            return found;
        }
    }

public void deleteBlogPostById(int id){
    Iterator<BlogPost> iterator = this.blogPostList.iterator();

    while(iterator.hasNext()){
        BlogPost current = iterator.next();
        if(current.getId() == id){
            iterator.remove();
        }}
}

}




