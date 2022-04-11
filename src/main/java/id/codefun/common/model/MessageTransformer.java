package id.codefun.common.model;

public abstract interface MessageTransformer<I, O> {
  
    public abstract O transform(I input);

}