package TemplateAndStrategy;

public abstract class Template {

    private boolean isDone=false;

    protected boolean isDone() {
        return isDone;
    }

    protected void setDone(boolean done) {
        isDone = done;
    }

    protected abstract void init();
    protected abstract void idle();
    protected abstract void cleanUp();

    public void run(){
        init();
        while(!isDone){
            idle();
        }
        cleanUp();
    }

}
