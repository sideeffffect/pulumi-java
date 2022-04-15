// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionFixedResponse {
    private final String contentType;
    private final String messageBody;
    private final String statusCode;

    @CustomType.Constructor
    private GetListenerDefaultActionFixedResponse(
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("messageBody") String messageBody,
        @CustomType.Parameter("statusCode") String statusCode) {
        this.contentType = contentType;
        this.messageBody = messageBody;
        this.statusCode = statusCode;
    }

    public String contentType() {
        return this.contentType;
    }
    public String messageBody() {
        return this.messageBody;
    }
    public String statusCode() {
        return this.statusCode;
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
