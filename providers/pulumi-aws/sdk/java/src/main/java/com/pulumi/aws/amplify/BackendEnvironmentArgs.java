// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendEnvironmentArgs Empty = new BackendEnvironmentArgs();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The name of deployment artifacts.
     * 
     */
    @Import(name="deploymentArtifacts")
    private @Nullable Output<String> deploymentArtifacts;

    public Optional<Output<String>> deploymentArtifacts() {
        return Optional.ofNullable(this.deploymentArtifacts);
    }

    /**
     * The name for the backend environment.
     * 
     */
    @Import(name="environmentName", required=true)
    private Output<String> environmentName;

    public Output<String> environmentName() {
        return this.environmentName;
    }

    /**
     * The AWS CloudFormation stack name of a backend environment.
     * 
     */
    @Import(name="stackName")
    private @Nullable Output<String> stackName;

    public Optional<Output<String>> stackName() {
        return Optional.ofNullable(this.stackName);
    }

    private BackendEnvironmentArgs() {}

    private BackendEnvironmentArgs(BackendEnvironmentArgs $) {
        this.appId = $.appId;
        this.deploymentArtifacts = $.deploymentArtifacts;
        this.environmentName = $.environmentName;
        this.stackName = $.stackName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendEnvironmentArgs $;

        public Builder() {
            $ = new BackendEnvironmentArgs();
        }

        public Builder(BackendEnvironmentArgs defaults) {
            $ = new BackendEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder deploymentArtifacts(@Nullable Output<String> deploymentArtifacts) {
            $.deploymentArtifacts = deploymentArtifacts;
            return this;
        }

        public Builder deploymentArtifacts(String deploymentArtifacts) {
            return deploymentArtifacts(Output.of(deploymentArtifacts));
        }

        public Builder environmentName(Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        public Builder stackName(@Nullable Output<String> stackName) {
            $.stackName = stackName;
            return this;
        }

        public Builder stackName(String stackName) {
            return stackName(Output.of(stackName));
        }

        public BackendEnvironmentArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            return $;
        }
    }

}
