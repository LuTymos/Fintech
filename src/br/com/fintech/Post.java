package br.com.fintech;

import java.io.Serializable;
import java.util.Calendar;

public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id_post;
    private String titulo;
    private String content;
    private Calendar publishDate;

    public Post() {
    }

    public Post(int id_post, String titulo, String content, Calendar publishDate) {
        this.id_post = id_post;
        this.titulo = titulo;
        this.content = content;
        this.publishDate = publishDate;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Calendar publishDate) {
        this.publishDate = publishDate;
    }
}
