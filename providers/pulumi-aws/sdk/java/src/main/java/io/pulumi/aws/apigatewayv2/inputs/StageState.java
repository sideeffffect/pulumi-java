// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsGetArgs;
import io.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsGetArgs;
import io.pulumi.aws.apigatewayv2.inputs.StageRouteSettingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StageState extends io.pulumi.resources.ResourceArgs {

    public static final StageState Empty = new StageState();

    /**
     * Settings for logging access in this stage.
     * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * 
     */
    @InputImport(name="accessLogSettings")
      private final @Nullable Input<StageAccessLogSettingsGetArgs> accessLogSettings;

    public Input<StageAccessLogSettingsGetArgs> getAccessLogSettings() {
        return this.accessLogSettings == null ? Input.empty() : this.accessLogSettings;
    }

    /**
     * The API identifier.
     * 
     */
    @InputImport(name="apiId")
      private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The ARN of the stage.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Whether updates to an API automatically trigger a new deployment. Defaults to `false`.
     * 
     */
    @InputImport(name="autoDeploy")
      private final @Nullable Input<Boolean> autoDeploy;

    public Input<Boolean> getAutoDeploy() {
        return this.autoDeploy == null ? Input.empty() : this.autoDeploy;
    }

    /**
     * The identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
     * Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="clientCertificateId")
      private final @Nullable Input<String> clientCertificateId;

    public Input<String> getClientCertificateId() {
        return this.clientCertificateId == null ? Input.empty() : this.clientCertificateId;
    }

    /**
     * The default route settings for the stage.
     * 
     */
    @InputImport(name="defaultRouteSettings")
      private final @Nullable Input<StageDefaultRouteSettingsGetArgs> defaultRouteSettings;

    public Input<StageDefaultRouteSettingsGetArgs> getDefaultRouteSettings() {
        return this.defaultRouteSettings == null ? Input.empty() : this.defaultRouteSettings;
    }

    /**
     * The deployment identifier of the stage. Use the `aws.apigatewayv2.Deployment` resource to configure a deployment.
     * 
     */
    @InputImport(name="deploymentId")
      private final @Nullable Input<String> deploymentId;

    public Input<String> getDeploymentId() {
        return this.deploymentId == null ? Input.empty() : this.deploymentId;
    }

    /**
     * The description for the stage. Must be less than or equal to 1024 characters in length.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ARN prefix to be used in an `aws.lambda.Permission` `source_arn` attribute.
     * For WebSocket APIs this attribute can additionally be used in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
     * 
     */
    @InputImport(name="executionArn")
      private final @Nullable Input<String> executionArn;

    public Input<String> getExecutionArn() {
        return this.executionArn == null ? Input.empty() : this.executionArn;
    }

    /**
     * The URL to invoke the API pointing to the stage,
     * e.g., `wss://z4675bid1j.execute-api.eu-west-2.amazonaws.com/example-stage`, or `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/`
     * 
     */
    @InputImport(name="invokeUrl")
      private final @Nullable Input<String> invokeUrl;

    public Input<String> getInvokeUrl() {
        return this.invokeUrl == null ? Input.empty() : this.invokeUrl;
    }

    /**
     * The name of the stage. Must be between 1 and 128 characters in length.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Route settings for the stage.
     * 
     */
    @InputImport(name="routeSettings")
      private final @Nullable Input<List<StageRouteSettingGetArgs>> routeSettings;

    public Input<List<StageRouteSettingGetArgs>> getRouteSettings() {
        return this.routeSettings == null ? Input.empty() : this.routeSettings;
    }

    /**
     * A map that defines the stage variables for the stage.
     * 
     */
    @InputImport(name="stageVariables")
      private final @Nullable Input<Map<String,String>> stageVariables;

    public Input<Map<String,String>> getStageVariables() {
        return this.stageVariables == null ? Input.empty() : this.stageVariables;
    }

    /**
     * A map of tags to assign to the stage. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public StageState(
        @Nullable Input<StageAccessLogSettingsGetArgs> accessLogSettings,
        @Nullable Input<String> apiId,
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> autoDeploy,
        @Nullable Input<String> clientCertificateId,
        @Nullable Input<StageDefaultRouteSettingsGetArgs> defaultRouteSettings,
        @Nullable Input<String> deploymentId,
        @Nullable Input<String> description,
        @Nullable Input<String> executionArn,
        @Nullable Input<String> invokeUrl,
        @Nullable Input<String> name,
        @Nullable Input<List<StageRouteSettingGetArgs>> routeSettings,
        @Nullable Input<Map<String,String>> stageVariables,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.accessLogSettings = accessLogSettings;
        this.apiId = apiId;
        this.arn = arn;
        this.autoDeploy = autoDeploy;
        this.clientCertificateId = clientCertificateId;
        this.defaultRouteSettings = defaultRouteSettings;
        this.deploymentId = deploymentId;
        this.description = description;
        this.executionArn = executionArn;
        this.invokeUrl = invokeUrl;
        this.name = name;
        this.routeSettings = routeSettings;
        this.stageVariables = stageVariables;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private StageState() {
        this.accessLogSettings = Input.empty();
        this.apiId = Input.empty();
        this.arn = Input.empty();
        this.autoDeploy = Input.empty();
        this.clientCertificateId = Input.empty();
        this.defaultRouteSettings = Input.empty();
        this.deploymentId = Input.empty();
        this.description = Input.empty();
        this.executionArn = Input.empty();
        this.invokeUrl = Input.empty();
        this.name = Input.empty();
        this.routeSettings = Input.empty();
        this.stageVariables = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StageAccessLogSettingsGetArgs> accessLogSettings;
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> autoDeploy;
        private @Nullable Input<String> clientCertificateId;
        private @Nullable Input<StageDefaultRouteSettingsGetArgs> defaultRouteSettings;
        private @Nullable Input<String> deploymentId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> executionArn;
        private @Nullable Input<String> invokeUrl;
        private @Nullable Input<String> name;
        private @Nullable Input<List<StageRouteSettingGetArgs>> routeSettings;
        private @Nullable Input<Map<String,String>> stageVariables;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(StageState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSettings = defaults.accessLogSettings;
    	      this.apiId = defaults.apiId;
    	      this.arn = defaults.arn;
    	      this.autoDeploy = defaults.autoDeploy;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.defaultRouteSettings = defaults.defaultRouteSettings;
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.executionArn = defaults.executionArn;
    	      this.invokeUrl = defaults.invokeUrl;
    	      this.name = defaults.name;
    	      this.routeSettings = defaults.routeSettings;
    	      this.stageVariables = defaults.stageVariables;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder accessLogSettings(@Nullable Input<StageAccessLogSettingsGetArgs> accessLogSettings) {
            this.accessLogSettings = accessLogSettings;
            return this;
        }

        public Builder accessLogSettings(@Nullable StageAccessLogSettingsGetArgs accessLogSettings) {
            this.accessLogSettings = Input.ofNullable(accessLogSettings);
            return this;
        }

        public Builder apiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder apiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder autoDeploy(@Nullable Input<Boolean> autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }

        public Builder autoDeploy(@Nullable Boolean autoDeploy) {
            this.autoDeploy = Input.ofNullable(autoDeploy);
            return this;
        }

        public Builder clientCertificateId(@Nullable Input<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }

        public Builder clientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Input.ofNullable(clientCertificateId);
            return this;
        }

        public Builder defaultRouteSettings(@Nullable Input<StageDefaultRouteSettingsGetArgs> defaultRouteSettings) {
            this.defaultRouteSettings = defaultRouteSettings;
            return this;
        }

        public Builder defaultRouteSettings(@Nullable StageDefaultRouteSettingsGetArgs defaultRouteSettings) {
            this.defaultRouteSettings = Input.ofNullable(defaultRouteSettings);
            return this;
        }

        public Builder deploymentId(@Nullable Input<String> deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        public Builder deploymentId(@Nullable String deploymentId) {
            this.deploymentId = Input.ofNullable(deploymentId);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder executionArn(@Nullable Input<String> executionArn) {
            this.executionArn = executionArn;
            return this;
        }

        public Builder executionArn(@Nullable String executionArn) {
            this.executionArn = Input.ofNullable(executionArn);
            return this;
        }

        public Builder invokeUrl(@Nullable Input<String> invokeUrl) {
            this.invokeUrl = invokeUrl;
            return this;
        }

        public Builder invokeUrl(@Nullable String invokeUrl) {
            this.invokeUrl = Input.ofNullable(invokeUrl);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder routeSettings(@Nullable Input<List<StageRouteSettingGetArgs>> routeSettings) {
            this.routeSettings = routeSettings;
            return this;
        }

        public Builder routeSettings(@Nullable List<StageRouteSettingGetArgs> routeSettings) {
            this.routeSettings = Input.ofNullable(routeSettings);
            return this;
        }

        public Builder stageVariables(@Nullable Input<Map<String,String>> stageVariables) {
            this.stageVariables = stageVariables;
            return this;
        }

        public Builder stageVariables(@Nullable Map<String,String> stageVariables) {
            this.stageVariables = Input.ofNullable(stageVariables);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public StageState build() {
            return new StageState(accessLogSettings, apiId, arn, autoDeploy, clientCertificateId, defaultRouteSettings, deploymentId, description, executionArn, invokeUrl, name, routeSettings, stageVariables, tags, tagsAll);
        }
    }
}
