package id.codefun.common.model;

public abstract interface MessageTransformer<input, ouput> {
  
    public abstract ouput transform(input input);

}