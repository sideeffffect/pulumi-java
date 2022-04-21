// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.apigateway.enums.MethodAuthorizationType;
import com.pulumi.awsnative.apigateway.inputs.MethodIntegrationArgs;
import com.pulumi.awsnative.apigateway.inputs.MethodResponseArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodArgs Empty = new MethodArgs();

    /**
     * Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    @Import(name="apiKeyRequired")
    private @Nullable Output<Boolean> apiKeyRequired;

    public Optional<Output<Boolean>> apiKeyRequired() {
        return Optional.ofNullable(this.apiKeyRequired);
    }

    /**
     * A list of authorization scopes configured on the method.
     * 
     */
    @Import(name="authorizationScopes")
    private @Nullable Output<List<String>> authorizationScopes;

    public Optional<Output<List<String>>> authorizationScopes() {
        return Optional.ofNullable(this.authorizationScopes);
    }

    /**
     * The method&#39;s authorization type.
     * 
     */
    @Import(name="authorizationType")
    private @Nullable Output<MethodAuthorizationType> authorizationType;

    public Optional<Output<MethodAuthorizationType>> authorizationType() {
        return Optional.ofNullable(this.authorizationType);
    }

    /**
     * The identifier of the authorizer to use on this method.
     * 
     */
    @Import(name="authorizerId")
    private @Nullable Output<String> authorizerId;

    public Optional<Output<String>> authorizerId() {
        return Optional.ofNullable(this.authorizerId);
    }

    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Import(name="httpMethod", required=true)
    private Output<String> httpMethod;

    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Import(name="integration")
    private @Nullable Output<MethodIntegrationArgs> integration;

    public Optional<Output<MethodIntegrationArgs>> integration() {
        return Optional.ofNullable(this.integration);
    }

    /**
     * The responses that can be sent to the client who calls the method.
     * 
     */
    @Import(name="methodResponses")
    private @Nullable Output<List<MethodResponseArgs>> methodResponses;

    public Optional<Output<List<MethodResponseArgs>>> methodResponses() {
        return Optional.ofNullable(this.methodResponses);
    }

    /**
     * A friendly operation name for the method.
     * 
     */
    @Import(name="operationName")
    private @Nullable Output<String> operationName;

    public Optional<Output<String>> operationName() {
        return Optional.ofNullable(this.operationName);
    }

    /**
     * The resources that are used for the request&#39;s content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    @Import(name="requestModels")
    private @Nullable Output<Object> requestModels;

    public Optional<Output<Object>> requestModels() {
        return Optional.ofNullable(this.requestModels);
    }

    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    @Import(name="requestParameters")
    private @Nullable Output<Object> requestParameters;

    public Optional<Output<Object>> requestParameters() {
        return Optional.ofNullable(this.requestParameters);
    }

    /**
     * The ID of the associated request validator.
     * 
     */
    @Import(name="requestValidatorId")
    private @Nullable Output<String> requestValidatorId;

    public Optional<Output<String>> requestValidatorId() {
        return Optional.ofNullable(this.requestValidatorId);
    }

    /**
     * The ID of an API Gateway resource.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    @Import(name="restApiId", required=true)
    private Output<String> restApiId;

    public Output<String> restApiId() {
        return this.restApiId;
    }

    private MethodArgs() {}

    private MethodArgs(MethodArgs $) {
        this.apiKeyRequired = $.apiKeyRequired;
        this.authorizationScopes = $.authorizationScopes;
        this.authorizationType = $.authorizationType;
        this.authorizerId = $.authorizerId;
        this.httpMethod = $.httpMethod;
        this.integration = $.integration;
        this.methodResponses = $.methodResponses;
        this.operationName = $.operationName;
        this.requestModels = $.requestModels;
        this.requestParameters = $.requestParameters;
        this.requestValidatorId = $.requestValidatorId;
        this.resourceId = $.resourceId;
        this.restApiId = $.restApiId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodArgs $;

        public Builder() {
            $ = new MethodArgs();
        }

        public Builder(MethodArgs defaults) {
            $ = new MethodArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiKeyRequired(@Nullable Output<Boolean> apiKeyRequired) {
            $.apiKeyRequired = apiKeyRequired;
            return this;
        }

        public Builder apiKeyRequired(Boolean apiKeyRequired) {
            return apiKeyRequired(Output.of(apiKeyRequired));
        }

        public Builder authorizationScopes(@Nullable Output<List<String>> authorizationScopes) {
            $.authorizationScopes = authorizationScopes;
            return this;
        }

        public Builder authorizationScopes(List<String> authorizationScopes) {
            return authorizationScopes(Output.of(authorizationScopes));
        }

        public Builder authorizationScopes(String... authorizationScopes) {
            return authorizationScopes(List.of(authorizationScopes));
        }

        public Builder authorizationType(@Nullable Output<MethodAuthorizationType> authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        public Builder authorizationType(MethodAuthorizationType authorizationType) {
            return authorizationType(Output.of(authorizationType));
        }

        public Builder authorizerId(@Nullable Output<String> authorizerId) {
            $.authorizerId = authorizerId;
            return this;
        }

        public Builder authorizerId(String authorizerId) {
            return authorizerId(Output.of(authorizerId));
        }

        public Builder httpMethod(Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        public Builder integration(@Nullable Output<MethodIntegrationArgs> integration) {
            $.integration = integration;
            return this;
        }

        public Builder integration(MethodIntegrationArgs integration) {
            return integration(Output.of(integration));
        }

        public Builder methodResponses(@Nullable Output<List<MethodResponseArgs>> methodResponses) {
            $.methodResponses = methodResponses;
            return this;
        }

        public Builder methodResponses(List<MethodResponseArgs> methodResponses) {
            return methodResponses(Output.of(methodResponses));
        }

        public Builder methodResponses(MethodResponseArgs... methodResponses) {
            return methodResponses(List.of(methodResponses));
        }

        public Builder operationName(@Nullable Output<String> operationName) {
            $.operationName = operationName;
            return this;
        }

        public Builder operationName(String operationName) {
            return operationName(Output.of(operationName));
        }

        public Builder requestModels(@Nullable Output<Object> requestModels) {
            $.requestModels = requestModels;
            return this;
        }

        public Builder requestModels(Object requestModels) {
            return requestModels(Output.of(requestModels));
        }

        public Builder requestParameters(@Nullable Output<Object> requestParameters) {
            $.requestParameters = requestParameters;
            return this;
        }

        public Builder requestParameters(Object requestParameters) {
            return requestParameters(Output.of(requestParameters));
        }

        public Builder requestValidatorId(@Nullable Output<String> requestValidatorId) {
            $.requestValidatorId = requestValidatorId;
            return this;
        }

        public Builder requestValidatorId(String requestValidatorId) {
            return requestValidatorId(Output.of(requestValidatorId));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder restApiId(Output<String> restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        public Builder restApiId(String restApiId) {
            return restApiId(Output.of(restApiId));
        }

        public MethodArgs build() {
            $.httpMethod = Objects.requireNonNull($.httpMethod, "expected parameter 'httpMethod' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            return $;
        }
    }

}
