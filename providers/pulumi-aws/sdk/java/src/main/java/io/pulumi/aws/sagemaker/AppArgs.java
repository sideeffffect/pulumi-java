// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.AppResourceSpecArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * The name of the app.
     * 
     */
    @InputImport(name="appName", required=true)
      private final Input<String> appName;

    public Input<String> getAppName() {
        return this.appName;
    }

    /**
     * The type of app. Valid values are `JupyterServer`, `KernelGateway` and `TensorBoard`.
     * 
     */
    @InputImport(name="appType", required=true)
      private final Input<String> appType;

    public Input<String> getAppType() {
        return this.appType;
    }

    /**
     * The domain ID.
     * 
     */
    @InputImport(name="domainId", required=true)
      private final Input<String> domainId;

    public Input<String> getDomainId() {
        return this.domainId;
    }

    /**
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
     * 
     */
    @InputImport(name="resourceSpec")
      private final @Nullable Input<AppResourceSpecArgs> resourceSpec;

    public Input<AppResourceSpecArgs> getResourceSpec() {
        return this.resourceSpec == null ? Input.empty() : this.resourceSpec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The user profile name.
     * 
     */
    @InputImport(name="userProfileName", required=true)
      private final Input<String> userProfileName;

    public Input<String> getUserProfileName() {
        return this.userProfileName;
    }

    public AppArgs(
        Input<String> appName,
        Input<String> appType,
        Input<String> domainId,
        @Nullable Input<AppResourceSpecArgs> resourceSpec,
        @Nullable Input<Map<String,String>> tags,
        Input<String> userProfileName) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.appType = Objects.requireNonNull(appType, "expected parameter 'appType' to be non-null");
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.resourceSpec = resourceSpec;
        this.tags = tags;
        this.userProfileName = Objects.requireNonNull(userProfileName, "expected parameter 'userProfileName' to be non-null");
    }

    private AppArgs() {
        this.appName = Input.empty();
        this.appType = Input.empty();
        this.domainId = Input.empty();
        this.resourceSpec = Input.empty();
        this.tags = Input.empty();
        this.userProfileName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appName;
        private Input<String> appType;
        private Input<String> domainId;
        private @Nullable Input<AppResourceSpecArgs> resourceSpec;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> userProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.appType = defaults.appType;
    	      this.domainId = defaults.domainId;
    	      this.resourceSpec = defaults.resourceSpec;
    	      this.tags = defaults.tags;
    	      this.userProfileName = defaults.userProfileName;
        }

        public Builder appName(Input<String> appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder appName(String appName) {
            this.appName = Input.of(Objects.requireNonNull(appName));
            return this;
        }

        public Builder appType(Input<String> appType) {
            this.appType = Objects.requireNonNull(appType);
            return this;
        }

        public Builder appType(String appType) {
            this.appType = Input.of(Objects.requireNonNull(appType));
            return this;
        }

        public Builder domainId(Input<String> domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder domainId(String domainId) {
            this.domainId = Input.of(Objects.requireNonNull(domainId));
            return this;
        }

        public Builder resourceSpec(@Nullable Input<AppResourceSpecArgs> resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }

        public Builder resourceSpec(@Nullable AppResourceSpecArgs resourceSpec) {
            this.resourceSpec = Input.ofNullable(resourceSpec);
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

        public Builder userProfileName(Input<String> userProfileName) {
            this.userProfileName = Objects.requireNonNull(userProfileName);
            return this;
        }

        public Builder userProfileName(String userProfileName) {
            this.userProfileName = Input.of(Objects.requireNonNull(userProfileName));
            return this;
        }
        public AppArgs build() {
            return new AppArgs(appName, appType, domainId, resourceSpec, tags, userProfileName);
        }
    }
}
