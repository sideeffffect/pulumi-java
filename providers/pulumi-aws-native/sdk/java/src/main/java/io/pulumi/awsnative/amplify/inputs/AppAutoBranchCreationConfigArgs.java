// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.inputs;

import io.pulumi.awsnative.amplify.enums.AppAutoBranchCreationConfigStage;
import io.pulumi.awsnative.amplify.inputs.AppBasicAuthConfigArgs;
import io.pulumi.awsnative.amplify.inputs.AppEnvironmentVariableArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppAutoBranchCreationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppAutoBranchCreationConfigArgs Empty = new AppAutoBranchCreationConfigArgs();

    @InputImport(name="autoBranchCreationPatterns")
      private final @Nullable Input<List<String>> autoBranchCreationPatterns;

    public Input<List<String>> getAutoBranchCreationPatterns() {
        return this.autoBranchCreationPatterns == null ? Input.empty() : this.autoBranchCreationPatterns;
    }

    @InputImport(name="basicAuthConfig")
      private final @Nullable Input<AppBasicAuthConfigArgs> basicAuthConfig;

    public Input<AppBasicAuthConfigArgs> getBasicAuthConfig() {
        return this.basicAuthConfig == null ? Input.empty() : this.basicAuthConfig;
    }

    @InputImport(name="buildSpec")
      private final @Nullable Input<String> buildSpec;

    public Input<String> getBuildSpec() {
        return this.buildSpec == null ? Input.empty() : this.buildSpec;
    }

    @InputImport(name="enableAutoBranchCreation")
      private final @Nullable Input<Boolean> enableAutoBranchCreation;

    public Input<Boolean> getEnableAutoBranchCreation() {
        return this.enableAutoBranchCreation == null ? Input.empty() : this.enableAutoBranchCreation;
    }

    @InputImport(name="enableAutoBuild")
      private final @Nullable Input<Boolean> enableAutoBuild;

    public Input<Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild == null ? Input.empty() : this.enableAutoBuild;
    }

    @InputImport(name="enablePerformanceMode")
      private final @Nullable Input<Boolean> enablePerformanceMode;

    public Input<Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode == null ? Input.empty() : this.enablePerformanceMode;
    }

    @InputImport(name="enablePullRequestPreview")
      private final @Nullable Input<Boolean> enablePullRequestPreview;

    public Input<Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Input.empty() : this.enablePullRequestPreview;
    }

    @InputImport(name="environmentVariables")
      private final @Nullable Input<List<AppEnvironmentVariableArgs>> environmentVariables;

    public Input<List<AppEnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    @InputImport(name="pullRequestEnvironmentName")
      private final @Nullable Input<String> pullRequestEnvironmentName;

    public Input<String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Input.empty() : this.pullRequestEnvironmentName;
    }

    @InputImport(name="stage")
      private final @Nullable Input<AppAutoBranchCreationConfigStage> stage;

    public Input<AppAutoBranchCreationConfigStage> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    public AppAutoBranchCreationConfigArgs(
        @Nullable Input<List<String>> autoBranchCreationPatterns,
        @Nullable Input<AppBasicAuthConfigArgs> basicAuthConfig,
        @Nullable Input<String> buildSpec,
        @Nullable Input<Boolean> enableAutoBranchCreation,
        @Nullable Input<Boolean> enableAutoBuild,
        @Nullable Input<Boolean> enablePerformanceMode,
        @Nullable Input<Boolean> enablePullRequestPreview,
        @Nullable Input<List<AppEnvironmentVariableArgs>> environmentVariables,
        @Nullable Input<String> pullRequestEnvironmentName,
        @Nullable Input<AppAutoBranchCreationConfigStage> stage) {
        this.autoBranchCreationPatterns = autoBranchCreationPatterns;
        this.basicAuthConfig = basicAuthConfig;
        this.buildSpec = buildSpec;
        this.enableAutoBranchCreation = enableAutoBranchCreation;
        this.enableAutoBuild = enableAutoBuild;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
    }

    private AppAutoBranchCreationConfigArgs() {
        this.autoBranchCreationPatterns = Input.empty();
        this.basicAuthConfig = Input.empty();
        this.buildSpec = Input.empty();
        this.enableAutoBranchCreation = Input.empty();
        this.enableAutoBuild = Input.empty();
        this.enablePerformanceMode = Input.empty();
        this.enablePullRequestPreview = Input.empty();
        this.environmentVariables = Input.empty();
        this.pullRequestEnvironmentName = Input.empty();
        this.stage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppAutoBranchCreationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> autoBranchCreationPatterns;
        private @Nullable Input<AppBasicAuthConfigArgs> basicAuthConfig;
        private @Nullable Input<String> buildSpec;
        private @Nullable Input<Boolean> enableAutoBranchCreation;
        private @Nullable Input<Boolean> enableAutoBuild;
        private @Nullable Input<Boolean> enablePerformanceMode;
        private @Nullable Input<Boolean> enablePullRequestPreview;
        private @Nullable Input<List<AppEnvironmentVariableArgs>> environmentVariables;
        private @Nullable Input<String> pullRequestEnvironmentName;
        private @Nullable Input<AppAutoBranchCreationConfigStage> stage;

        public Builder() {
    	      // Empty
        }

        public Builder(AppAutoBranchCreationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoBranchCreationPatterns = defaults.autoBranchCreationPatterns;
    	      this.basicAuthConfig = defaults.basicAuthConfig;
    	      this.buildSpec = defaults.buildSpec;
    	      this.enableAutoBranchCreation = defaults.enableAutoBranchCreation;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
        }

        public Builder autoBranchCreationPatterns(@Nullable Input<List<String>> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = autoBranchCreationPatterns;
            return this;
        }

        public Builder autoBranchCreationPatterns(@Nullable List<String> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = Input.ofNullable(autoBranchCreationPatterns);
            return this;
        }

        public Builder basicAuthConfig(@Nullable Input<AppBasicAuthConfigArgs> basicAuthConfig) {
            this.basicAuthConfig = basicAuthConfig;
            return this;
        }

        public Builder basicAuthConfig(@Nullable AppBasicAuthConfigArgs basicAuthConfig) {
            this.basicAuthConfig = Input.ofNullable(basicAuthConfig);
            return this;
        }

        public Builder buildSpec(@Nullable Input<String> buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }

        public Builder buildSpec(@Nullable String buildSpec) {
            this.buildSpec = Input.ofNullable(buildSpec);
            return this;
        }

        public Builder enableAutoBranchCreation(@Nullable Input<Boolean> enableAutoBranchCreation) {
            this.enableAutoBranchCreation = enableAutoBranchCreation;
            return this;
        }

        public Builder enableAutoBranchCreation(@Nullable Boolean enableAutoBranchCreation) {
            this.enableAutoBranchCreation = Input.ofNullable(enableAutoBranchCreation);
            return this;
        }

        public Builder enableAutoBuild(@Nullable Input<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder enableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Input.ofNullable(enableAutoBuild);
            return this;
        }

        public Builder enablePerformanceMode(@Nullable Input<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder enablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Input.ofNullable(enablePerformanceMode);
            return this;
        }

        public Builder enablePullRequestPreview(@Nullable Input<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder enablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Input.ofNullable(enablePullRequestPreview);
            return this;
        }

        public Builder environmentVariables(@Nullable Input<List<AppEnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(@Nullable List<AppEnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder pullRequestEnvironmentName(@Nullable Input<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder pullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Input.ofNullable(pullRequestEnvironmentName);
            return this;
        }

        public Builder stage(@Nullable Input<AppAutoBranchCreationConfigStage> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(@Nullable AppAutoBranchCreationConfigStage stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }
        public AppAutoBranchCreationConfigArgs build() {
            return new AppAutoBranchCreationConfigArgs(autoBranchCreationPatterns, basicAuthConfig, buildSpec, enableAutoBranchCreation, enableAutoBuild, enablePerformanceMode, enablePullRequestPreview, environmentVariables, pullRequestEnvironmentName, stage);
        }
    }
}
