// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationResponseArgs Empty = new IntegrationResponseArgs();

    /**
     * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
     * 
     */
    @Import(name="contentHandling")
      private final @Nullable Output<String> contentHandling;

    public Output<String> contentHandling() {
        return this.contentHandling == null ? Codegen.empty() : this.contentHandling;
    }

    /**
     * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @Import(name="httpMethod", required=true)
      private final Output<String> httpMethod;

    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * The API resource ID
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * A map of response parameters that can be read from the backend response.
     * For example: `response_parameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
     * 
     */
    @Import(name="responseParameters")
      private final @Nullable Output<Map<String,String>> responseParameters;

    public Output<Map<String,String>> responseParameters() {
        return this.responseParameters == null ? Codegen.empty() : this.responseParameters;
    }

    /**
     * A map specifying the templates used to transform the integration response body
     * 
     */
    @Import(name="responseTemplates")
      private final @Nullable Output<Map<String,String>> responseTemplates;

    public Output<Map<String,String>> responseTemplates() {
        return this.responseTemplates == null ? Codegen.empty() : this.responseTemplates;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi", required=true)
      private final Output<String> restApi;

    public Output<String> restApi() {
        return this.restApi;
    }

    /**
     * Specifies the regular expression pattern used to choose
     * an integration response based on the response from the backend. Omit configuring this to make the integration the default one.
     * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
     * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
     * 
     */
    @Import(name="selectionPattern")
      private final @Nullable Output<String> selectionPattern;

    public Output<String> selectionPattern() {
        return this.selectionPattern == null ? Codegen.empty() : this.selectionPattern;
    }

    /**
     * The HTTP status code
     * 
     */
    @Import(name="statusCode", required=true)
      private final Output<String> statusCode;

    public Output<String> statusCode() {
        return this.statusCode;
    }

    public IntegrationResponseArgs(
        @Nullable Output<String> contentHandling,
        Output<String> httpMethod,
        Output<String> resourceId,
        @Nullable Output<Map<String,String>> responseParameters,
        @Nullable Output<Map<String,String>> responseTemplates,
        Output<String> restApi,
        @Nullable Output<String> selectionPattern,
        Output<String> statusCode) {
        this.contentHandling = contentHandling;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.responseParameters = responseParameters;
        this.responseTemplates = responseTemplates;
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
        this.selectionPattern = selectionPattern;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private IntegrationResponseArgs() {
        this.contentHandling = Codegen.empty();
        this.httpMethod = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.responseParameters = Codegen.empty();
        this.responseTemplates = Codegen.empty();
        this.restApi = Codegen.empty();
        this.selectionPattern = Codegen.empty();
        this.statusCode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contentHandling;
        private Output<String> httpMethod;
        private Output<String> resourceId;
        private @Nullable Output<Map<String,String>> responseParameters;
        private @Nullable Output<Map<String,String>> responseTemplates;
        private Output<String> restApi;
        private @Nullable Output<String> selectionPattern;
        private Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHandling = defaults.contentHandling;
    	      this.httpMethod = defaults.httpMethod;
    	      this.resourceId = defaults.resourceId;
    	      this.responseParameters = defaults.responseParameters;
    	      this.responseTemplates = defaults.responseTemplates;
    	      this.restApi = defaults.restApi;
    	      this.selectionPattern = defaults.selectionPattern;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentHandling(@Nullable Output<String> contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }
        public Builder contentHandling(@Nullable String contentHandling) {
            this.contentHandling = Codegen.ofNullable(contentHandling);
            return this;
        }
        public Builder httpMethod(Output<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = Output.of(Objects.requireNonNull(httpMethod));
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder responseParameters(@Nullable Output<Map<String,String>> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }
        public Builder responseParameters(@Nullable Map<String,String> responseParameters) {
            this.responseParameters = Codegen.ofNullable(responseParameters);
            return this;
        }
        public Builder responseTemplates(@Nullable Output<Map<String,String>> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }
        public Builder responseTemplates(@Nullable Map<String,String> responseTemplates) {
            this.responseTemplates = Codegen.ofNullable(responseTemplates);
            return this;
        }
        public Builder restApi(Output<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }
        public Builder selectionPattern(@Nullable Output<String> selectionPattern) {
            this.selectionPattern = selectionPattern;
            return this;
        }
        public Builder selectionPattern(@Nullable String selectionPattern) {
            this.selectionPattern = Codegen.ofNullable(selectionPattern);
            return this;
        }
        public Builder statusCode(Output<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Output.of(Objects.requireNonNull(statusCode));
            return this;
        }        public IntegrationResponseArgs build() {
            return new IntegrationResponseArgs(contentHandling, httpMethod, resourceId, responseParameters, responseTemplates, restApi, selectionPattern, statusCode);
        }
    }
}
