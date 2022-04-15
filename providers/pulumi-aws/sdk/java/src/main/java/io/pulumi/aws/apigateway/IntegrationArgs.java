// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationArgs Empty = new IntegrationArgs();

    /**
     * A list of cache key parameters for the integration.
     * 
     */
    @Import(name="cacheKeyParameters")
      private final @Nullable Output<List<String>> cacheKeyParameters;

    public Output<List<String>> cacheKeyParameters() {
        return this.cacheKeyParameters == null ? Codegen.empty() : this.cacheKeyParameters;
    }

    /**
     * The integration's cache namespace.
     * 
     */
    @Import(name="cacheNamespace")
      private final @Nullable Output<String> cacheNamespace;

    public Output<String> cacheNamespace() {
        return this.cacheNamespace == null ? Codegen.empty() : this.cacheNamespace;
    }

    /**
     * The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
     * 
     */
    @Import(name="connectionId")
      private final @Nullable Output<String> connectionId;

    public Output<String> connectionId() {
        return this.connectionId == null ? Codegen.empty() : this.connectionId;
    }

    /**
     * The integration input's [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
     * 
     */
    @Import(name="connectionType")
      private final @Nullable Output<String> connectionType;

    public Output<String> connectionType() {
        return this.connectionType == null ? Codegen.empty() : this.connectionType;
    }

    /**
     * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
     * 
     */
    @Import(name="contentHandling")
      private final @Nullable Output<String> contentHandling;

    public Output<String> contentHandling() {
        return this.contentHandling == null ? Codegen.empty() : this.contentHandling;
    }

    /**
     * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role's ARN. To require that the caller's identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<String> credentials;

    public Output<String> credentials() {
        return this.credentials == null ? Codegen.empty() : this.credentials;
    }

    /**
     * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
     * when calling the associated resource.
     * 
     */
    @Import(name="httpMethod", required=true)
      private final Output<String> httpMethod;

    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * The integration HTTP method
     * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
     * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * Not all methods are compatible with all `AWS` integrations.
     * e.g., Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
     * 
     */
    @Import(name="integrationHttpMethod")
      private final @Nullable Output<String> integrationHttpMethod;

    public Output<String> integrationHttpMethod() {
        return this.integrationHttpMethod == null ? Codegen.empty() : this.integrationHttpMethod;
    }

    /**
     * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
     * 
     */
    @Import(name="passthroughBehavior")
      private final @Nullable Output<String> passthroughBehavior;

    public Output<String> passthroughBehavior() {
        return this.passthroughBehavior == null ? Codegen.empty() : this.passthroughBehavior;
    }

    /**
     * A map of request query string parameters and headers that should be passed to the backend responder.
     * For example: `request_parameters = { "integration.request.header.X-Some-Other-Header" = "method.request.header.X-Some-Header" }`
     * 
     */
    @Import(name="requestParameters")
      private final @Nullable Output<Map<String,String>> requestParameters;

    public Output<Map<String,String>> requestParameters() {
        return this.requestParameters == null ? Codegen.empty() : this.requestParameters;
    }

    /**
     * A map of the integration's request templates.
     * 
     */
    @Import(name="requestTemplates")
      private final @Nullable Output<Map<String,String>> requestTemplates;

    public Output<Map<String,String>> requestTemplates() {
        return this.requestTemplates == null ? Codegen.empty() : this.requestTemplates;
    }

    /**
     * The API resource ID.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the associated REST API.
     * 
     */
    @Import(name="restApi", required=true)
      private final Output<String> restApi;

    public Output<String> restApi() {
        return this.restApi;
    }

    /**
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
     * 
     */
    @Import(name="timeoutMilliseconds")
      private final @Nullable Output<Integer> timeoutMilliseconds;

    public Output<Integer> timeoutMilliseconds() {
        return this.timeoutMilliseconds == null ? Codegen.empty() : this.timeoutMilliseconds;
    }

    /**
     * Configuration block specifying the TLS configuration for an integration. Defined below.
     * 
     */
    @Import(name="tlsConfig")
      private final @Nullable Output<IntegrationTlsConfigArgs> tlsConfig;

    public Output<IntegrationTlsConfigArgs> tlsConfig() {
        return this.tlsConfig == null ? Codegen.empty() : this.tlsConfig;
    }

    /**
     * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The input's URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
     * e.g., `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> uri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public IntegrationArgs(
        @Nullable Output<List<String>> cacheKeyParameters,
        @Nullable Output<String> cacheNamespace,
        @Nullable Output<String> connectionId,
        @Nullable Output<String> connectionType,
        @Nullable Output<String> contentHandling,
        @Nullable Output<String> credentials,
        Output<String> httpMethod,
        @Nullable Output<String> integrationHttpMethod,
        @Nullable Output<String> passthroughBehavior,
        @Nullable Output<Map<String,String>> requestParameters,
        @Nullable Output<Map<String,String>> requestTemplates,
        Output<String> resourceId,
        Output<String> restApi,
        @Nullable Output<Integer> timeoutMilliseconds,
        @Nullable Output<IntegrationTlsConfigArgs> tlsConfig,
        Output<String> type,
        @Nullable Output<String> uri) {
        this.cacheKeyParameters = cacheKeyParameters;
        this.cacheNamespace = cacheNamespace;
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.contentHandling = contentHandling;
        this.credentials = credentials;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.integrationHttpMethod = integrationHttpMethod;
        this.passthroughBehavior = passthroughBehavior;
        this.requestParameters = requestParameters;
        this.requestTemplates = requestTemplates;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
        this.timeoutMilliseconds = timeoutMilliseconds;
        this.tlsConfig = tlsConfig;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.uri = uri;
    }

    private IntegrationArgs() {
        this.cacheKeyParameters = Codegen.empty();
        this.cacheNamespace = Codegen.empty();
        this.connectionId = Codegen.empty();
        this.connectionType = Codegen.empty();
        this.contentHandling = Codegen.empty();
        this.credentials = Codegen.empty();
        this.httpMethod = Codegen.empty();
        this.integrationHttpMethod = Codegen.empty();
        this.passthroughBehavior = Codegen.empty();
        this.requestParameters = Codegen.empty();
        this.requestTemplates = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.restApi = Codegen.empty();
        this.timeoutMilliseconds = Codegen.empty();
        this.tlsConfig = Codegen.empty();
        this.type = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cacheKeyParameters;
        private @Nullable Output<String> cacheNamespace;
        private @Nullable Output<String> connectionId;
        private @Nullable Output<String> connectionType;
        private @Nullable Output<String> contentHandling;
        private @Nullable Output<String> credentials;
        private Output<String> httpMethod;
        private @Nullable Output<String> integrationHttpMethod;
        private @Nullable Output<String> passthroughBehavior;
        private @Nullable Output<Map<String,String>> requestParameters;
        private @Nullable Output<Map<String,String>> requestTemplates;
        private Output<String> resourceId;
        private Output<String> restApi;
        private @Nullable Output<Integer> timeoutMilliseconds;
        private @Nullable Output<IntegrationTlsConfigArgs> tlsConfig;
        private Output<String> type;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyParameters = defaults.cacheKeyParameters;
    	      this.cacheNamespace = defaults.cacheNamespace;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.contentHandling = defaults.contentHandling;
    	      this.credentials = defaults.credentials;
    	      this.httpMethod = defaults.httpMethod;
    	      this.integrationHttpMethod = defaults.integrationHttpMethod;
    	      this.passthroughBehavior = defaults.passthroughBehavior;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestTemplates = defaults.requestTemplates;
    	      this.resourceId = defaults.resourceId;
    	      this.restApi = defaults.restApi;
    	      this.timeoutMilliseconds = defaults.timeoutMilliseconds;
    	      this.tlsConfig = defaults.tlsConfig;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder cacheKeyParameters(@Nullable Output<List<String>> cacheKeyParameters) {
            this.cacheKeyParameters = cacheKeyParameters;
            return this;
        }
        public Builder cacheKeyParameters(@Nullable List<String> cacheKeyParameters) {
            this.cacheKeyParameters = Codegen.ofNullable(cacheKeyParameters);
            return this;
        }
        public Builder cacheKeyParameters(String... cacheKeyParameters) {
            return cacheKeyParameters(List.of(cacheKeyParameters));
        }
        public Builder cacheNamespace(@Nullable Output<String> cacheNamespace) {
            this.cacheNamespace = cacheNamespace;
            return this;
        }
        public Builder cacheNamespace(@Nullable String cacheNamespace) {
            this.cacheNamespace = Codegen.ofNullable(cacheNamespace);
            return this;
        }
        public Builder connectionId(@Nullable Output<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = Codegen.ofNullable(connectionId);
            return this;
        }
        public Builder connectionType(@Nullable Output<String> connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = Codegen.ofNullable(connectionType);
            return this;
        }
        public Builder contentHandling(@Nullable Output<String> contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }
        public Builder contentHandling(@Nullable String contentHandling) {
            this.contentHandling = Codegen.ofNullable(contentHandling);
            return this;
        }
        public Builder credentials(@Nullable Output<String> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable String credentials) {
            this.credentials = Codegen.ofNullable(credentials);
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
        public Builder integrationHttpMethod(@Nullable Output<String> integrationHttpMethod) {
            this.integrationHttpMethod = integrationHttpMethod;
            return this;
        }
        public Builder integrationHttpMethod(@Nullable String integrationHttpMethod) {
            this.integrationHttpMethod = Codegen.ofNullable(integrationHttpMethod);
            return this;
        }
        public Builder passthroughBehavior(@Nullable Output<String> passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }
        public Builder passthroughBehavior(@Nullable String passthroughBehavior) {
            this.passthroughBehavior = Codegen.ofNullable(passthroughBehavior);
            return this;
        }
        public Builder requestParameters(@Nullable Output<Map<String,String>> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }
        public Builder requestParameters(@Nullable Map<String,String> requestParameters) {
            this.requestParameters = Codegen.ofNullable(requestParameters);
            return this;
        }
        public Builder requestTemplates(@Nullable Output<Map<String,String>> requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }
        public Builder requestTemplates(@Nullable Map<String,String> requestTemplates) {
            this.requestTemplates = Codegen.ofNullable(requestTemplates);
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
        public Builder restApi(Output<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }
        public Builder timeoutMilliseconds(@Nullable Output<Integer> timeoutMilliseconds) {
            this.timeoutMilliseconds = timeoutMilliseconds;
            return this;
        }
        public Builder timeoutMilliseconds(@Nullable Integer timeoutMilliseconds) {
            this.timeoutMilliseconds = Codegen.ofNullable(timeoutMilliseconds);
            return this;
        }
        public Builder tlsConfig(@Nullable Output<IntegrationTlsConfigArgs> tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }
        public Builder tlsConfig(@Nullable IntegrationTlsConfigArgs tlsConfig) {
            this.tlsConfig = Codegen.ofNullable(tlsConfig);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public IntegrationArgs build() {
            return new IntegrationArgs(cacheKeyParameters, cacheNamespace, connectionId, connectionType, contentHandling, credentials, httpMethod, integrationHttpMethod, passthroughBehavior, requestParameters, requestTemplates, resourceId, restApi, timeoutMilliseconds, tlsConfig, type, uri);
        }
    }
}
