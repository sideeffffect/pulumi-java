// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild.v1beta1.inputs.NetworkConfigArgs;
import com.pulumi.googlenative.cloudbuild.v1beta1.inputs.WorkerConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Network configuration for the `WorkerPool`.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<NetworkConfigArgs> networkConfig;

    /**
     * @return Network configuration for the `WorkerPool`.
     * 
     */
    public Optional<Output<NetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Worker configuration for the `WorkerPool`.
     * 
     */
    @Import(name="workerConfig")
    private @Nullable Output<WorkerConfigArgs> workerConfig;

    /**
     * @return Worker configuration for the `WorkerPool`.
     * 
     */
    public Optional<Output<WorkerConfigArgs>> workerConfig() {
        return Optional.ofNullable(this.workerConfig);
    }

    /**
     * Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
     * 
     */
    @Import(name="workerPoolId", required=true)
    private Output<String> workerPoolId;

    /**
     * @return Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
     * 
     */
    public Output<String> workerPoolId() {
        return this.workerPoolId;
    }

    private WorkerPoolArgs() {}

    private WorkerPoolArgs(WorkerPoolArgs $) {
        this.annotations = $.annotations;
        this.displayName = $.displayName;
        this.location = $.location;
        this.networkConfig = $.networkConfig;
        this.project = $.project;
        this.workerConfig = $.workerConfig;
        this.workerPoolId = $.workerPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerPoolArgs $;

        public Builder() {
            $ = new WorkerPoolArgs();
        }

        public Builder(WorkerPoolArgs defaults) {
            $ = new WorkerPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param displayName A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param networkConfig Network configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<NetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Network configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(NetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param workerConfig Worker configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder workerConfig(@Nullable Output<WorkerConfigArgs> workerConfig) {
            $.workerConfig = workerConfig;
            return this;
        }

        /**
         * @param workerConfig Worker configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder workerConfig(WorkerConfigArgs workerConfig) {
            return workerConfig(Output.of(workerConfig));
        }

        /**
         * @param workerPoolId Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
         * 
         * @return builder
         * 
         */
        public Builder workerPoolId(Output<String> workerPoolId) {
            $.workerPoolId = workerPoolId;
            return this;
        }

        /**
         * @param workerPoolId Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
         * 
         * @return builder
         * 
         */
        public Builder workerPoolId(String workerPoolId) {
            return workerPoolId(Output.of(workerPoolId));
        }

        public WorkerPoolArgs build() {
            $.workerPoolId = Objects.requireNonNull($.workerPoolId, "expected parameter 'workerPoolId' to be non-null");
            return $;
        }
    }

}
