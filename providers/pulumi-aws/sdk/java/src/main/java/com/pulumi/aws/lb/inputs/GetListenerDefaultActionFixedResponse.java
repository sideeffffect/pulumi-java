// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetListenerDefaultActionFixedResponse extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionFixedResponse Empty = new GetListenerDefaultActionFixedResponse();

    @Import(name="contentType", required=true)
      private final String contentType;

    public String contentType() {
        return this.contentType;
    }

    @Import(name="messageBody", required=true)
      private final String messageBody;

    public String messageBody() {
        return this.messageBody;
    }

    @Import(name="statusCode", required=true)
      private final String statusCode;

    public String statusCode() {
        return this.statusCode;
    }

    public GetListenerDefaultActionFixedResponse(
        String contentType,
        String messageBody,
        String statusCode) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.messageBody = Objects.requireNonNull(messageBody, "expected parameter 'messageBody' to be non-null");
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private GetListenerDefaultActionFixedResponse() {
        this.contentType = null;
        this.messageBody = null;
        this.statusCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionFixedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String messageBody;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionFixedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder messageBody(String messageBody) {
            this.messageBody = Objects.requireNonNull(messageBody);
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }        public GetListenerDefaultActionFixedResponse build() {
            return new GetListenerDefaultActionFixedResponse(contentType, messageBody, statusCode);
        }
    }
}
