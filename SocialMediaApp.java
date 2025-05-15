// This code defines a simple social media application with different types of posts.
// It demonstrates the use of interfaces and polymorphism in Java.
interface Post {
    void displayContent();
    void likePost();
}

class TextPost implements Post {
    private String text;

    public TextPost(String text) {
        this.text = text;
    }

    @Override
    public void displayContent() {
        System.out.println("Text Post: " + text);
    }

    @Override
    public void likePost() {
        System.out.println("Liked text post: " + text);
    }
}

class ImagePost implements Post {
    private String imageUrl;

    public ImagePost(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void displayContent() {
        System.out.println("Image Post: " + imageUrl);
    }

    @Override
    public void likePost() {
        System.out.println("Liked image post: " + imageUrl);
    }
}

class VideoPost implements Post {
    private String videoUrl;

    public VideoPost(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public void displayContent() {
        System.out.println("Video Post: " + videoUrl);
    }

    @Override
    public void likePost() {
        System.out.println("Liked video post: " + videoUrl);
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        TextPost textPost = new TextPost("Hello, world!");
        ImagePost imagePost = new ImagePost("image.jpg");
        VideoPost videoPost = new VideoPost("video.mp4");

        Post[] posts = new Post[]{textPost, imagePost, videoPost};

        for (Post post : posts) {
            post.displayContent();
            post.likePost();
            System.out.println();
        }
    }
}