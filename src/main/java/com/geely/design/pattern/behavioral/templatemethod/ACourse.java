package com.geely.design.pattern.behavioral.templatemethod;

/**
 * Created by geely
 */
public abstract class ACourse {
    /**
     * 这里都是声明为final，防止子类来重写方法
     */
    private final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    /**
     * 这里也是申明为final，防止用户来重写
     */
    private final void makePPT(){
        System.out.println("制作PPT");
    }
    private final void makeVideo(){
        System.out.println("制作视频");
    }
    private final void writeArticle(){
        System.out.println("编写手记");
    }

    /**
     * 钩子方法
     * @return
     */
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();





}
