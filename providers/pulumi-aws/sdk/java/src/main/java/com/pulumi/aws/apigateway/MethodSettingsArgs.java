// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MethodSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodSettingsArgs Empty = new MethodSettingsArgs();

    /**
     * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*{@literal /}*` for overriding all methods in the stage. Ensure to trim any leading forward slashes in the path (e.g., `trimprefix(aws_api_gateway_resource.example.path, &#34;/&#34;)`).
     * 
     */
    @Import(name="methodPath", required=true)
    private Output<String> methodPath;

    public Output<String> methodPath() {
        return this.methodPath;
    }

    /**
     * The ID of the REST API
     * 
     */
    @Import(name="restApi", required=true)
    private Output<String> restApi;

    public Output<String> restApi() {
        return this.restApi;
    }

    /**
     * The settings block, see below.
     * 
     */
    @Import(name="settings", required=true)
    private Output<MethodSettingsSettingsArgs> settings;

    public Output<MethodSettingsSettingsArgs> settings() {
        return this.settings;
    }

    /**
     * The name of the stage
     * 
     */
    @Import(name="stageName", required=true)
    private Output<String> stageName;

    public Output<String> stageName() {
        return this.stageName;
    }

    private MethodSettingsArgs() {}

    private MethodSettingsArgs(MethodSettingsArgs $) {
        this.methodPath = $.methodPath;
        this.restApi = $.restApi;
        this.settings = $.settings;
        this.stageName = $.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodSettingsArgs $;

        public Builder() {
            $ = new MethodSettingsArgs();
        }

        public Builder(MethodSettingsArgs defaults) {
            $ = new MethodSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder methodPath(Output<String> methodPath) {
            $.methodPath = methodPath;
            return this;
        }

        public Builder methodPath(String methodPath) {
            return methodPath(Output.of(methodPath));
        }

        public Builder restApi(Output<String> restApi) {
            $.restApi = restApi;
            return this;
        }

        public Builder restApi(String restApi) {
            return restApi(Output.of(restApi));
        }

        public Builder settings(Output<MethodSettingsSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        public Builder settings(MethodSettingsSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        public Builder stageName(Output<String> stageName) {
            $.stageName = stageName;
            return this;
        }

        public Builder stageName(String stageName) {
            return stageName(Output.of(stageName));
        }

        public MethodSettingsArgs build() {
            $.methodPath = Objects.requireNonNull($.methodPath, "expected parameter 'methodPath' to be non-null");
            $.restApi = Objects.requireNonNull($.restApi, "expected parameter 'restApi' to be non-null");
            $.settings = Objects.requireNonNull($.settings, "expected parameter 'settings' to be non-null");
            $.stageName = Objects.requireNonNull($.stageName, "expected parameter 'stageName' to be non-null");
            return $;
        }
    }

}
